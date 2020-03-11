USE [SAV_CJ]
GO

Create Procedure [dbo].[CtaCte_ChqA$Cheque_Act]
----------------------------------------------------------------------------
-- Procedimiento: CJ_CtaCte$Cheque_Act
-- Basado en Sav_CJ_MatencionCtaCte
--
-- Autor:    Miguel Brignardello
--
-- Objetivo: Actualizacion de documentos antiguos en tabla 
--           Sav_Cj_DocumentosBancarios y modifica tablas en base de datos 
--           INTRA.
--
-- Modificado por: Náyade Muñoz Rivera - NX3 INGENIERIA S.A.
-- Fecha Mod.:     Septiembre - 2019  
----------------------------------------------------------------------------
      @Cod_Entidad       varchar(13) --Nuevo
	, @Cod_Sucursal	     char(3)
	, @Cod_EntidadA      varchar(13) --Anterior
	, @Cod_SucursalA     char(3)
	, @Cuenta            char(11)
	, @Cod_Banco         char(3)
	, @Cod_SucBanco      char(4)
	, @Usuario           nvarchar(20)
	, @Estacion          nvarchar(20)
As
Begin
    Declare @Error_Message  nvarchar(4000),
			@Error_Severity	int,
			@Error_State	int,
			@Status			int
 
	Set NoCount On
	Set XAct_Abort On

    Update SAV.dbo.CLI_CuentasCorrientes
    Set Cod_Entidad = @Cod_Entidad
        ,Cod_Sucursal = @Cod_Sucursal
    Where Cuenta = @Cuenta
    And   Cod_Banco = @Cod_Banco

	If(@@ERROR > 0)
	Begin
		Select   
            @Error_Message = error_message(),  
            @Error_Severity = error_severity(),  
            @Error_State = error_state();  
		Raiserror (@Error_Message, @Error_Severity, @Error_State);
		Return
	End

    Update SAV_CJ.dbo.SAV_CJ_DocumentosBancarios WITH(RowLock)
    Set Cod_EntidadCuenta = @Cod_Entidad
		,Cod_SucursalCuenta = @Cod_Sucursal
    Where Cuenta = @Cuenta
	And   Cod_Banco = @Cod_Banco
	And   Sucursal = @Cod_SucBanco

	If(@@ERROR > 0)
	Begin
		Select   
            @Error_Message = error_message(),  
            @Error_Severity = error_severity(),  
            @Error_State = error_state();  
		Raiserror (@Error_Message, @Error_Severity, @Error_State);
		Return
	End
	
    Execute @Status = INTRA.dbo.Sav_CJ_MatencionCtaCte_INTRA
							@Cod_EntidadA
							, @Cuenta
							, @Cod_Banco
							, @Cod_SucBanco
							, @Cod_Entidad
							, @Usuario
							, @Estacion
							, @Error_Message  Out

    If(@@ERROR > 0)
	Begin
		Select   
            @Error_Message = error_message(),  
            @Error_Severity = error_severity(),  
            @Error_State = error_state();  
		Raiserror (@Error_Message, @Error_Severity, @Error_State);
		Return
	End  
	Return
End

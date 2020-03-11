USE [SAV]
GO

ALTER Procedure [dbo].[zCliente$Busca_Lista]
(
      @Filtro	    as nvarchar(50)
	, @Tipo_Filtro	as int
	, @Reg_Ini		as int
	, @Row_Count	as int


--#BEGIN-DOC    , @Regs_Total   as int output
-- Autora           : Náyade Muñoz Rivera - NX3 INGENIERIA S.A.
-- Fecha creación   : Septiembre-2019
-- Objetivo         : Basado en sav_cj_busquedapersonas.
--                    entrega lista de clientes según filtro sea
--                    rut (1), cod_entidad (2) o nombre (3).
--#END-DOC
)

As
Begin
    Set NoCount On

    --#RESULTSET @CLIENTE_DB CLIENTES_DB
    --#COLUMN RUT		         NVARCHAR
    --#COLUMN DV		         NVARCHAR
    --#COLUMN COD_ENTIDAD        NVARCHAR
    --#COLUMN COD_SUCURSAL       NVARCHAR
    --#COLUMN NOMBRE             NVARCHAR
    --#COLUMN NUMERO             INTEGER             
    --#ENDRESULTSET

	-- Búsqueda por rut
	If @Tipo_Filtro = 1
    Begin
        Select	top(@Row_Count)
              cm.rut_cliente		as Rut
            , cm.dv_cliente			as Dv
            , rtrim(cm.cod_entidad)	as Cod_Entidad
            , cm.cod_sucursal		as Cod_Sucursal
            , rtrim(cm.cliente)		as Nombre
            , cm.nro_cliente		as Numero
        From	sav.dbo.cli_maestro cm with(nolock)
        Where 	cm.rut_cliente like @filtro
		And		cm.nro_cliente > @reg_ini
		Order By cm.nro_cliente,
				 cm.rut_cliente,
				 cm.cod_entidad,
				 cm.cod_sucursal
    End
	
	-- búsqueda por cod_entidad
    If @tipo_filtro = 2
    Begin
        Select	top (@Row_Count)
              cm.rut_cliente		as Rut
            , cm.dv_cliente			as Dv
            , rtrim(cm.cod_entidad)	as Cod_Entidad
            , cm.cod_sucursal		as Cod_Sucursal
            , rtrim(cm.cliente)		as Nombre
            , cm.nro_cliente		as Numero
        From	sav.dbo.cli_maestro cm with(nolock)
        Where 	cm.cod_entidad	like @filtro
		And		cm.nro_cliente > @reg_ini
        Order By cm.nro_cliente,
				 cm.cod_entidad,
				 cm.rut_cliente,
				 cm.cod_sucursal
    End

	-- Búsqueda por razón social
	If @Tipo_Filtro = 3
	Begin
        Select	top (@Row_Count)
              cm.rut_cliente		as Rut
            , cm.dv_cliente			as Dv
            , rtrim(cm.cod_entidad)	as Cod_Entidad
            , cm.cod_sucursal		as Cod_Sucursal
            , rtrim(cm.cliente)		as Nombre
            , cm.nro_cliente		as Numero
        From	sav.dbo.cli_maestro cm with(nolock)
        Where	cm.cliente	like @filtro
		And		cm.nro_cliente > @reg_ini
        Order By cm.nro_cliente,
				 cm.cliente,
				 cm.rut_cliente,
				 cm.cod_entidad,
				 cm.cod_sucursal
	End
End
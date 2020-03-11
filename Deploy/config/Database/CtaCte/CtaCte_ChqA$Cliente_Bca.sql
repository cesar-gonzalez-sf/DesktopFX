USE [SAV_CJ]
GO

Create Procedure [dbo].[CtaCte_ChqA$Cliente_Bca]
(
      @Rut	    as nvarchar(50)
	, @Regs		as int			Output

--#BEGIN-DOC
-- AUTOR            : NAYADE MUNOZ RIVERA - NX3 INGENIERIA S.A.
-- FECHA CREACIÓN   : OCTUBRE-2019
-- OBJETIVO         : ENTREGA LOS DATOS DE UN CLIENTE, DADO EL RUT.
--					  Y SI HAY MÁS DE UN REGISTRO.
--#END-DOC
)

As
Begin
	Declare @Filtro as nvarchar(15)

    Set NoCount on

    --#RESULTSET @CLIENTE_DB CLIENTES_DB
    --#COLUMN RUT           NVARCHAR
    --#COLUMN DV            NVARCHAR
    --#COLUMN COD_ENTIDAD   NVARCHAR
    --#COLUMN COD_SUCURSAL  NVARCHAR
    --#COLUMN NOMBRE        NVARCHAR
    --#ENDRESULTSET

	Set @Filtro = '%' + @Rut + '%'

	-- Búsqueda por rut
	Exec Sav.dbo.zCliente$Busca_Regs @Filtro, '1', @Regs OUT

	-- Si hay más de un registro, se obtiene lista en otra llamada
	If @Regs = 1
		Exec SAV.dbo.zCliente$Busca_Lista @Filtro, 1, 0, 1
End
Create Procedure [dbo].[zCliente$Busca_Regs]
(
      @Filtro	    as nvarchar(50)
	, @Tipo_Filtro	as int
	, @Regs			as int			Output
------------------------------------------------------------------------------
--
-- Autora           : Nayade Munoz rivera - NX3 INGENIERIA S.A.
-- Fecha Creación   : Septiembre-2019
-- Objetivo         : Entrega el número de registros de clientes según filtro 
--                    sea rut (1), cod_entidad (2) o nombre (3).
------------------------------------------------------------------------------
)
As
Begin
    Set nocount on

	-- búsqueda por rut
	If @Tipo_Filtro = 1
    Begin
        Select @regs = isNull(count(*),0)
        From	SAV.dbo.Cli_Maestro cm with(nolock)
        Where 	cm.rut_cliente like @filtro
    End
	
	-- Búsqueda por cod_entidad
    If @Tipo_Filtro  = 2
    Begin
        Select @regs = isNull(count(*),0)
        From	SAV.dbo.Cli_Maestro cm with(nolock)
        Where 	cm.cod_entidad	like @filtro
    End

	-- Búsqueda por razón social
	If @Tipo_Filtro  = 3
	Begin
        Select @regs = isNull(count(*),0)
        From	SAV.dbo.Cli_Maestro cm with(nolock)
        Where	cm.cliente	like @filtro
	End
End
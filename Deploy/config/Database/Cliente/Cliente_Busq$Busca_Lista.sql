If Object_Id(N'dbo.Cliente_Busq$Busca_Lista', N'P') Is Not Null 
    Drop Procedure dbo.Cliente_Busq$Busca_Lista;
Go

Create Procedure dbo.Cliente_Busq$Busca_Lista
--------------------------------------------------------------------------------
-- Náyade Muñoz Rivera, 2019-Sep: Entrega lista de clientes según tipo de filtro
-- es  rut (1), cod_entidad (2) o nombre (3). El criterio indica si se considera
-- sólo el filtro o el filtro es la parte inicial o está contenido,  en  lo  que
-- hay que buscar.
--------------------------------------------------------------------------------
      @Filtro       As Nvarchar(50)
    , @Tipo_Filtro  As Integer
    , @Criterio     As Integer
    , @Reg_Ini      As Integer
    , @Cant_Regs    As Integer
    , @Total_Regs   As Integer  Out
As
Begin
    Declare @FiltroCriterio as Nvarchar(52);

    -- No Count + Trx Rollback
    Set NOCOUNT, XACT_ABORT On;

    -- Definimos filtro para el criterio especificado
    If (@Criterio = 2) Begin
        Set @FiltroCriterio = @Filtro + '%';
    End Else If (@Criterio = 3) Begin
        Set @FiltroCriterio = '%' + @Filtro + '%';
    End Else Begin
        Set @FiltroCriterio = @Filtro;
    End;

    -- Obtenemos el número total de registros sólo la primera vez
    -- #ResultSet @CLIENTE_DB CLIENTES_DB
    --    #Column RUT            NVARCHAR
    --    #Column DV             NVARCHAR
    --    #Column COD_ENTIDAD    NVARCHAR
    --    #Column COD_SUCURSAL   NVARCHAR
    --    #Column NOMBRE         NVARCHAR
    --    #Column NUMERO         INTEGER
    -- #EndResultSet
    If (@Reg_Ini = 0) Begin
        Exec Sav.dbo.zCliente$Busca_Regs @FiltroCriterio, @Tipo_Filtro, @Total_Regs Out;
    End Else Begin
        Set @Total_Regs = 0;
        SELECT ''           AS RUT,
               ''           AS DV,
               ''           AS COD_ENTIDAD,
               ''           AS COD_SUCURSAL,
               ''           AS NOMBRE,
               1            AS NUMERO
        WHERE TRUE = FALSE;
    End;

    Exec zCliente$Busca_Lista @FiltroCriterio, @Tipo_Filtro, @Reg_Ini, @Cant_Regs;
End;

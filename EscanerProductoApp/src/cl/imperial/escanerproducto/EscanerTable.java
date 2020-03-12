/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.escanerproducto;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


/**
 * Tabla que muestra una lista de Productos
 *
 * @author Cesar Gonzalez
 */
public class EscanerTable extends TableView<ProductosList>
{

    public final ObservableList<ProductosList> ProductosList;

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    EscanerTable()
   {
        // Initializa propiedades de tabla de productosLists
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Se crea y se inicializa la columna "Codigo"
        final TableColumn<ProductosList,String> cCodigo = new TableColumn<>("Codigo");
        cCodigo.setCellValueFactory(f -> f.getValue().COD_RAPIDOProperty());
        cCodigo.setMinWidth(100);
        getColumns().add(cCodigo);

        // Se crea y se inicializa la columna "Descripción"
        final TableColumn<ProductosList,String> cDescripción = new TableColumn<>("Descripción");
        cDescripción.setCellValueFactory(f -> f.getValue().DESCRIPCIONProperty());
        cDescripción.setMinWidth(400);
        getColumns().add(cDescripción);

        // Se crea y se inicializa la columna "UM"
        final TableColumn<ProductosList,String> cUM = new TableColumn<>("UM");
        cUM.setCellValueFactory(f -> f.getValue().COD_UNIMEDProperty());
        cUM.setMinWidth(100);
        getColumns().add(cUM);

        // Se crea y se inicializa la columna "Cantidad"
        final TableColumn<ProductosList,String> cCantidad = new TableColumn<>("Cantidad");
        cCantidad.setCellValueFactory(f -> f.getValue().CANTIDADProperty());
        cCantidad.setMinWidth(100);
        getColumns().add(cCantidad);

        // Se crea y se inicializa la columna "Precio"
        final TableColumn<ProductosList,String> cPrecio = new TableColumn<>("Precio");
        cPrecio.setCellValueFactory(f -> f.getValue().PRECIO_BRUTOProperty());
        cPrecio.setMinWidth(100);
        getColumns().add(cPrecio);

        // Se crea y se inicializa la columna "Descuento"
        final TableColumn<ProductosList,String> cDescuento = new TableColumn<>("Descuento");
        cDescuento.setCellValueFactory(f -> f.getValue().DESCUENTOProperty());
        cDescuento.setMinWidth(100);
        getColumns().add(cDescuento);

        // Se crea y se inicializa la columna "Total Linea"
        final TableColumn<ProductosList,String> cTotalLinea = new TableColumn<>("Total Linea");
        cTotalLinea.setCellValueFactory(f -> f.getValue().TOTALProperty());
        cTotalLinea.setMinWidth(100);
        getColumns().add(cTotalLinea);

        // Creamos la lista de clientes de la tabla
        ProductosList = FXCollections.observableArrayList();
        setItems(ProductosList);
   }

    //--------------------------------------------------------------------------
    //-- ClienteTable ----------------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Borra la lista de productos de esta tabla.
     */
    void clear()
    {
        ProductosList.clear();
    }


    ObservableList<cl.imperial.escanerproducto.ProductosList> getProductosList()
    {
        return ProductosList;
    }

    /**
     * Agrega la lista de productos suministrado a esta tabla.
     *
     * @param  productos lista de productos que se mostrarán.
     * @throws NullPointerException si {@code productos} es {@code null}.
     */
    void add(final ProductosList productos)
    {
        if (productos == null)
            throw new NullPointerException("productos es null");
        ProductosList.add(productos);
    }
}

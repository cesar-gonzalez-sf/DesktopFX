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


import java.util.List;
import cl.imperial.escanerproducto.ws.EscanerProductoWeb;
import cl.imperial.escanerproducto.ws.EscanerProductoWebException;
import cl.imperial.escanerproducto.ws.EscanerProductoWebService;
import cl.imperial.escanerproducto.ws.GrabavaletranstorioResult;
import cl.imperial.escanerproducto.ws.TraelecturascanProducto;
import cl.imperial.escanerproducto.ws.TraelecturascanResult;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.jfx.Dialog;
import cl.obcom.desktopfx.jfx.DialogType;

/**
 * @author Cesar Gonzalez
 */
public class WebService
{
    private final EscanerProductoWeb webPort;

    WebService(final DesktopTask task)
        throws Exception
        {
           final EscanerProductoWebService service = new EscanerProductoWebService();
           webPort = service.getEscanerProductoWebPort();
           task.initWebServicePort(webPort, service, task.getCodeBase());
        }


    /**
     * @param codigo
     * @param tipo
     * @param table
     * @param cod_Lista
     * @param cod_Credito
     * @throws EscanerProductoWebException
     */
    public void buscaProducto( final String codigo, final String tipo, final EscanerTable table, final String cod_Lista, final String cod_Credito) throws EscanerProductoWebException //, final String cod_Lista, final String cod_Credito
    {
        try {
            final TraelecturascanResult result = webPort.traelecturascan(codigo, tipo, cod_Lista, cod_Credito, cod_Credito, cod_Credito, cod_Credito);
            IngresarProductos(result, table);
        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
        return;
    }


    /**
     * @param result
     * @param table
     */
    @SuppressWarnings("unlikely-arg-type")
    public void IngresarProductos(final TraelecturascanResult result, final EscanerTable table)
    {
        Integer cantidadcon = 1;
        Integer existe      = 0;
        Integer Total       = 0;
        Integer Dcto        = 0;
        Integer TotalDcto   = 0;
        Integer TotalPagar  = 0;

        if (!result.getProductos().isEmpty()) {
            final List<TraelecturascanProducto> vResult = result.getProductos();
            for (final TraelecturascanProducto resultProducto:vResult) {
                if (table.getProductosList().isEmpty()){
                    final ProductosList producto = new ProductosList();
                    producto.setCANTIDAD            (resultProducto.getCantidad());
                    producto.setCANTIDAD_EMBALAJE   (resultProducto.getCantidadEmbalaje());
                    producto.setCOD_PRODUCTO        (resultProducto.getCodProducto());
                    producto.setCOD_RAPIDO          (resultProducto.getCodRapido());
                    producto.setCOD_UNIMED          (resultProducto.getCodUnimed());
                    producto.setDESCRIPCION         (resultProducto.getDescripcion());
                    producto.setDESCUENTO           (Dcto.toString());
                    producto.setPRECIO_BRUTO        (resultProducto.getPrecioBruto());
                    producto.setTIPO                (resultProducto.getTipo());
                    producto.setCODE                (resultProducto.getCode());
                    TotalPagar = Integer.parseInt(resultProducto.getCantidad()) * Integer.parseInt(resultProducto.getPrecioBruto());
                    producto.setTOTAL               (TotalPagar.toString());
                    table.add(producto);
                    existe = 1;
                } else {
                    if (resultProducto.getTipo().equals("V")) {
                        for ( final ProductosList producList:table.getItems()) {
                          if (resultProducto.getTipo().equals("V") && resultProducto.getCode().equals(0)) {
                          Dialog.showMessage(this, "Vale no corresponde a Tipo de Venta o Cliente");
                          }
                            if (producList.getTIPO().trim().equals(resultProducto.getTipo().trim())) {
                                Dialog.showMessage(this, "Codigo Existente", "Escaner de Producto", DialogType.WARNING);
                                existe = 1;
                            }
                        }
                    } else {
                        for (final ProductosList productosLista:table.getItems()) {
                            if (productosLista.getCOD_RAPIDO().trim().equals(resultProducto.getCodRapido().trim())) {
                                cantidadcon = Integer.parseInt(productosLista.getCANTIDAD()) + Integer.parseInt(resultProducto.getCantidad());
                                productosLista.setCANTIDAD(cantidadcon.toString());
                                existe = 1;
                            }
                        }
                    }
                    if (resultProducto.getTipo().equals("P")) {
                        Total       = cantidadcon * Integer.parseInt(resultProducto.getPrecioBruto());
                        Dcto        = Integer.parseInt(resultProducto.getCantidadEmbalaje()) % Integer.parseInt(resultProducto.getCantidad());
                        TotalDcto   = Integer.parseInt(resultProducto.getCantidad()) * Integer.parseInt(resultProducto.getDescuento());
                        TotalPagar  = Total - (Dcto * TotalDcto);
                    } else if (resultProducto.getTipo().equals("V")) {
                        Total       = Integer.parseInt(resultProducto.getCantidad()) * Integer.parseInt(resultProducto.getPrecioBruto());
                        Dcto        = 0;
                        TotalDcto   = 0;
                        TotalPagar  = Total;
                    }
                    for (final ProductosList productosLista:table.getItems()) {
                        if (productosLista.getCOD_RAPIDO().trim().equals(resultProducto.getCodRapido().trim())) {
                            productosLista.setTOTAL(TotalPagar.toString());
                        }
                    }
                }

            if (existe == 0) {
                final ProductosList producto = new ProductosList();
                producto.setCANTIDAD            (resultProducto.getCantidad());
                producto.setCANTIDAD_EMBALAJE   (resultProducto.getCantidadEmbalaje());
                producto.setCOD_PRODUCTO        (resultProducto.getCodProducto());
                producto.setCOD_RAPIDO          (resultProducto.getCodRapido());
                producto.setCOD_UNIMED          (resultProducto.getCodUnimed());
                producto.setDESCRIPCION         (resultProducto.getDescripcion());
                producto.setDESCUENTO           (TotalDcto.toString());
                producto.setPRECIO_BRUTO        (resultProducto.getPrecioBruto());
                producto.setTIPO                (resultProducto.getTipo());
                producto.setTOTAL               (TotalPagar.toString());
                table.add(producto);
                }
            }
        }
        EscanerMain.ActializarMonto(table);
    }

    /**
     * @param codigo
     * @param tipo
     * @param tableScaner
     * @param cod_Lista
     * @param cod_Credito
     */
    public void buscaProductoEliminar(final String codigo, final String tipo, final EscanerTable tableScaner, final String cod_Lista, final String cod_Credito)
    {
        try {
            final TraelecturascanResult result = webPort.traelecturascan(codigo, tipo, cod_Lista, cod_Credito, cod_Credito, cod_Credito, cod_Credito);
            EliminarProductos(result, tipo, tableScaner); //.getProductos().get(0)
        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
        return;
    }


    /**
     * @param result
     * @param tableScaner
     */
    private void EliminarProductos(final TraelecturascanResult result, final String tipo, final EscanerTable tableScaner) throws EscanerProductoWebException
    {
        Integer cantidadcon = 0;
        Integer TotalPagar  = 0;

        final Integer index = 0;


        if(!result.getProductos().isEmpty()) {
            final List<TraelecturascanProducto> vResult = result.getProductos();
            for (final TraelecturascanProducto resultProducto:vResult) {
                if (resultProducto.getTipo().equals("V")) {
                    for ( final ProductosList producList:tableScaner.getItems()) {
                        if (producList.getTIPO().trim().equals(resultProducto.getTipo().trim())) {
                            tableScaner.ProductosList.remove(producList);
                            Dialog.showMessage(this, "Voleta Eliminada", "Eliminar Producto", DialogType.WARNING);
                            return;
                        }
                    }
                } else {
                    for (final ProductosList productosLista:tableScaner.getItems()) {
                        if (productosLista.getCOD_RAPIDO().trim().equals(resultProducto.getCodRapido().trim())) {
                            cantidadcon = Integer.parseInt(productosLista.getCANTIDAD()) - Integer.parseInt(resultProducto.getCantidad());
                            TotalPagar  = cantidadcon * Integer.parseInt(resultProducto.getPrecioBruto());
                            if (cantidadcon > 0) {
                                productosLista.setCANTIDAD(cantidadcon.toString());
                                productosLista.setTOTAL(TotalPagar.toString());
                            } else {
                                tableScaner.ProductosList.remove(productosLista);
                                Dialog.showMessage(this, "Producto Eliminado", "Eliminar Producto", DialogType.WARNING);
                                return;
                            }
                        }
                    }
                }
            }
        }
        EscanerMain.ActializarMonto(tableScaner);
    }


    /**
     * @param tableScaner
     * @param cod_Lista
     * @param xmlProdutos
     * @param xmlProdutos
     * @param xmlProdutos
     */
    public void grabarProducto(final EscanerTable tableScaner, final String cod_Lista, final String xmlProdutos)
    {
        final String vcodEmp          = "N";
        final String vusuario         = "test";
        final String vcodEntidad      = "test";
        final String vcodSucursal     = "test";
        final String vestacion        = "test";
        final String vtipodoc         = "test";

        try {
            final GrabavaletranstorioResult graba = webPort.grabavaletranstorio(xmlProdutos, vcodEmp, vusuario, vtipodoc, vcodEntidad, vcodSucursal, cod_Lista, vestacion);
        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
        return;
    }

  }


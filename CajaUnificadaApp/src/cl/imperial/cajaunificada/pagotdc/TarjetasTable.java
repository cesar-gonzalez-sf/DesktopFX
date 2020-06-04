/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada.pagotdc;

import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * @author Cesar Gonzalez
 */
public class TarjetasTable extends TableView
{

    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    TarjetasTable()
    {
        // Initializa propiedades de tabla de productosLists
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Create and initialize "Codigo" column
        final TableColumn cCodigo = new TableColumn<>("Codigo");
        {

        }
        getColumns().add(cCodigo);

        // Create and initialize "Tarjeta" column
        final TableColumn cTarjeta = new TableColumn<>("Tarjeta");
        {

        }
        getColumns().add(cTarjeta);

        // Create and initialize "Número" column
        final TableColumn cNumero = new TableColumn<>("Número");
        {

        }
        getColumns().add(cNumero);

        // Create and initialize "Monto" column
        final TableColumn cMonto = new TableColumn<>("Monto");
        {

        }
        getColumns().add(cMonto);

        // Create and initialize "Cuotas" column
        final TableColumn cCuotas = new TableColumn<>("Cuotas");
        {

        }
        getColumns().add(cCuotas);

        // Create and initialize "Autorizacion" column
        final TableColumn cAutorizacion = new TableColumn<>("Autorización");
        {

        }
        getColumns().add(cAutorizacion);

        // Create and initialize "Rut Cliente" column
        final TableColumn cRutCliente = new TableColumn<>("RutCliente");
        {

        }
        getColumns().add(cRutCliente);

        // Create and initialize "Digito" column
        final TableColumn cDigito = new TableColumn<>("Digito");
        {

        }
        getColumns().add(cDigito);

        // Create and initialize "Tipo Pago" column
        final TableColumn cTipoPago = new TableColumn<>("TipoPago");
        {

        }
        getColumns().add(cTipoPago);

        // Create and initialize "Codigo Con" column
        final TableColumn cCodigoCon = new TableColumn<>("CodigoCon");
        {

        }
        getColumns().add(cCodigoCon);

        // Create and initialize "MontoAbo" column
        final TableColumn cMontoAbo = new TableColumn<>("MontoAbo");
        {

        }
        getColumns().add(cMontoAbo);

        // Create and initialize "NumeroCh" column
        final TableColumn cNumeroCh = new TableColumn<>("NumeroCh");
        {

        }
        getColumns().add(cNumeroCh);

        // Create and initialize "CtaCte" column
        final TableColumn cCtaCte = new TableColumn<>("CtaCte");
        {

        }
        getColumns().add(cCtaCte);

        // Create and initialize "Banco" column
        final TableColumn cBanco = new TableColumn<>("Banco");
        {

        }
        getColumns().add(cBanco);

        // Create and initialize "CodBanco" column
        final TableColumn cCodBanco = new TableColumn<>("CodBanco");
        {

        }
        getColumns().add(cCodBanco);

        // Create and initialize "N_Plazo" column
        final TableColumn cN_Plazo = new TableColumn<>("N_Plazo");
        {

        }
        getColumns().add(cN_Plazo);

        // Create and initialize "Rut_Titular" column
        final TableColumn cRut_Titular = new TableColumn<>("Rut_Titular");
        {

        }
        getColumns().add(cRut_Titular);

        // Create and initialize "Entidad" column
        final TableColumn cEntidad = new TableColumn<>("Entidad");
        {

        }
        getColumns().add(cEntidad);

        // Create and initialize "Sucursal" column
        final TableColumn cSucursal = new TableColumn<>("Sucursal");
        {

        }
        getColumns().add(cSucursal);

        // Create and initialize "Bandeja_Tarj" column
        final TableColumn cBandeja_Tarj = new TableColumn<>("Bandeja_Tarj");
        {

        }
        getColumns().add(cBandeja_Tarj);

        // Create and initialize "Nro_Tarjeta" column
        final TableColumn cNro_Tarjeta = new TableColumn<>("Nro_Tarjeta");
        {

        }
        getColumns().add(cNro_Tarjeta);

        // Create and initialize "Voucher Comercio" column
        final TableColumn cVoucherComercio = new TableColumn<>("Voucher Comercio");
        {

        }
        getColumns().add(cVoucherComercio);

        // Create and initialize "Voucher Cliente" column
        final TableColumn cVoucherCliente = new TableColumn<>("Voucher Cliente");
        {

        }
        getColumns().add(cVoucherCliente);

        // Create and initialize "Voucher" column
        final TableColumn cVoucher = new TableColumn<>("Voucher");
        {

        }
        getColumns().add(cVoucher);
    }
}

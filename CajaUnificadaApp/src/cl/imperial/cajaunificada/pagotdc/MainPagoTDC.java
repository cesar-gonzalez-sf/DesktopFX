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

import cl.obcom.desktopfx.core.DesktopTask;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


/**
 * @author Cesar Gonzalez
 */
public class MainPagoTDC extends BorderPane
{
    private final DesktopTask task;

    // Se declara TarjetasTable
    private final TarjetasTable TarjetasTable;

    // Se crea Label
    final Label Tarjetalbl              = new Label("Tarjeta");
    final Label Montolbl                = new Label("Monto");
    final Label Cuotaslbl               = new Label("Cuotas");
    final Label Numerolbl               = new Label("Número");
    final Label Autorizacionlbl         = new Label("Autorización");
    final Label RutClientelbl           = new Label("Rut Cliente");
    final Label TipoPagolbl             = new Label("Tipo de Pago");
    final Label MontoAbonolbl           = new Label("Monto Abono");
    final Label CodigoConveniolbl       = new Label("Código Convenio");
    final Label Textolbl                = new Label("Recibir cheque a nombre de\n      IMPERIAL S.A. al día");
    final Label NumeroChequelbl         = new Label("Número Cheque");
    final Label N_CuentaCorrientelbl    = new Label("Nº Cuenta Corriente");
    final Label Bancolbl                = new Label("Banco");
    final Label Sucursallbl             = new Label("Sucursal");
    final Label NumeroPlazalbl          = new Label("Nº Plaza");
    final Label RutTitularlbl           = new Label("Rut Titular");
    final Label ClienteRSTlbl           = new Label("Cliente - Razon Social Titular");
    final Label TotalTarjetaslbl        = new Label("Total Tarjetas");

    // Se crea TextField
    final TextField MontoText               = new TextField();
    final TextField CuotasText              = new TextField();
    final TextField NumeroText              = new TextField();
    final TextField AutorizacionText        = new TextField();
    final TextField RutClienteText          = new TextField();
    final TextField RutClienteDVText        = new TextField();
    final TextField MontoAbonoText          = new TextField();
    final TextField CodigoConvenioText      = new TextField();
    final TextField NumeroChequeText        = new TextField();
    final TextField N_CuenteCorrienteText   = new TextField();
    final TextField BancoText               = new TextField();
    final TextField sucursalText            = new TextField();
    final TextField NumeroPlazaText         = new TextField();
    final TextField RutTitularText          = new TextField();
    final TextField ClienteRSTText          = new TextField();
    final TextField TotalTarjetasText       = new TextField();

    //Se crea ComboBox
    final ComboBox TarjetaComboBox      = new ComboBox<>();
    final ComboBox TipoPagoComboBox     = new ComboBox<>();

    //Se crea Botones
    final Button Command1Btn            = new Button("command1");
    final Button OperarTarjetaBtn       = new Button("Operar Tarjeta");
    final Button PuntosBtn              = new Button("...");
    final Button IniciaDiaBtn           = new Button("Inicia Día");
    final Button CierresDiaBtn          = new Button("Cierre Día");
    final Button ImprimirVoucherBtn     = new Button("Imprimir Voucher");
    final Button AnularBtn              = new Button("Anular");
    final Button AceptarBtn             = new Button("Aceptar");

    public MainPagoTDC(final DesktopTask task)
    {
        // Save Desktop Task
        this.task = task;

        // Inicializamos Properties
        setPadding(new Insets(5));
        setPrefWidth(600);

        //Se crea panel Top
        final VBox TopVBox = new VBox(3);
        {
            // Se inicializa TopVBox
            TopVBox.setPadding(new Insets(0, 0, 5, 0));

            //Se crea panel Top1VBox
            final VBox Top1VBox = new VBox(3);
            {
                // Se inicializa Top1VBox
                Top1VBox.setPadding(new Insets(5, 5, 5, 5));
                Top1VBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");

                // Se crea LabelTxtHBox
                final HBox LabelTxtHBox = new HBox(3);
                {
                    // Se inicializa LabelTxtHBox
                    LabelTxtHBox.setPadding(new Insets(5, 5, 5, 5));
                    HBox.setHgrow(LabelTxtHBox, Priority.ALWAYS);

                    // Se crea TarjetaVBox
                    final VBox TarjetaVBox = new VBox();
                    {
                        // Se inicializa Tarjetalbl
                        TarjetaVBox.getChildren().add(Tarjetalbl);

                        // Se inicualiza TarjetaComboBox
                        TarjetaComboBox.setPrefWidth(200);
                        TarjetaVBox.getChildren().add(TarjetaComboBox);
                    }
                    LabelTxtHBox.getChildren().add(TarjetaVBox);

                    // Se crea MontoVBox
                    final VBox MontoVBox = new VBox();
                    {
                        // Se inicializa MontoVBox
                        HBox.setHgrow(MontoVBox, Priority.ALWAYS);

                        // Se inicializa Montolbl
                        MontoVBox.getChildren().add(Montolbl);

                        // Se inicializa MontoText
                        MontoVBox.setMinWidth(100);
                        MontoVBox.getChildren().add(MontoText);
                    }
                    LabelTxtHBox.getChildren().add(MontoVBox);

                    // Se crea CuotasVBox
                    final VBox CuotasVBox = new VBox();
                    {
                        // Se inicializa Cuotaslbl
                        CuotasVBox.getChildren().add(Cuotaslbl);

                        // Se inicializa CuotasText
                        CuotasText.setMinWidth(70);
                        CuotasText.setMaxWidth(70);
                        CuotasVBox.getChildren().add(CuotasText);
                    }
                    LabelTxtHBox.getChildren().add(CuotasVBox);

                    // Se crea NumeroVBox
                    final VBox NumeroVBox = new VBox();
                    {
                        // Se inicializa NumeroVBox
                        HBox.setHgrow(NumeroVBox, Priority.ALWAYS);

                        // Se inicializa Numerolbl
                        NumeroVBox.getChildren().add(Numerolbl);

                        // Se inicializa NumeroText
                        NumeroText.setMinWidth(100);
                        NumeroVBox.getChildren().add(NumeroText);
                    }
                    LabelTxtHBox.getChildren().add(NumeroVBox);

                    // Se crea AutorizacionVBox
                    final VBox AutorizacionVBox = new VBox();
                    {
                        // Se inicializa AutorizacionVBox
                        HBox.setHgrow(AutorizacionVBox, Priority.ALWAYS);

                        // Se inicializa Autorizacionlbl
                        AutorizacionVBox.getChildren().add(Autorizacionlbl);

                        // Se inicializa AutorizacionText
                        AutorizacionText.setMinWidth(100);
                        AutorizacionVBox.getChildren().add(AutorizacionText);
                    }
                    LabelTxtHBox.getChildren().add(AutorizacionVBox);
                }
                Top1VBox.getChildren().add(LabelTxtHBox);

                // Se crea BotonTopHBox
                final HBox BotonTopHBox = new HBox();
                {
                    // Se inicializa BotonTopHBox
                    BotonTopHBox.setPadding(new Insets(3,5,3,5));
                    HBox.setHgrow(BotonTopHBox, Priority.ALWAYS);

                    //Se crea CenterHBox
                    final HBox CenterHBox = new HBox(3);
                    {
                        //Se inicializa leftHBox
                        CenterHBox.setAlignment(Pos.BOTTOM_CENTER);
                        CenterHBox.setPadding(new Insets(0, 0, 0, 5));
                        HBox.setHgrow(CenterHBox, Priority.ALWAYS);

                        // Se inicializa Command1Btn
                        CenterHBox.getChildren().add(Command1Btn);
                    }
                    BotonTopHBox.getChildren().add(CenterHBox);

                    // Se crea rightHBox
                    final HBox rightHBox = new HBox(3);
                    {
                        //Se inicializa rightHBox
                        rightHBox.setAlignment(Pos.BOTTOM_RIGHT);
                        rightHBox.setPadding(new Insets(0, 5, 0, 0));

                        // Se inicializa OperarTarjetaBtn
                        OperarTarjetaBtn.setPrefSize(170, 30);
                        OperarTarjetaBtn.setStyle("-fx-font-weight: bold; -fx-font-size: 150%;");
                        BotonTopHBox.getChildren().add(OperarTarjetaBtn);
                    }
                    BotonTopHBox.getChildren().add(rightHBox);

                }
                Top1VBox.getChildren().add(BotonTopHBox);
            }
            TopVBox.getChildren().add(Top1VBox);
        }
        setTop(TopVBox);

        //Se crea panel Center
        final VBox CenterVBox = new VBox(3);
        {
            // Se inicializa CenterVBox
            CenterVBox.setPadding(new Insets(0, 0, 5, 0));

            //Se crea panel CenterInternoHBox
            final VBox CenterInternoHBox = new VBox(3);
            {
                // Se inicializa CenterInternoHBox
                CenterInternoHBox.setPadding(new Insets(5, 5, 5, 5));
                CenterInternoHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");

                // Se crea Center1HBox
                final HBox Center1HBox = new HBox(3);
                {
                    // Se inicializa Center1HBox
                    Center1HBox.setPadding(new Insets(5, 5, 5, 5));
                    HBox.setHgrow(Center1HBox, Priority.ALWAYS);

                    // Se crea RutClienteVBox
                    final VBox RutClienteVBox = new VBox();
                    {
                        // Se inicializa RutClientelbl
                        RutClienteVBox.getChildren().add(RutClientelbl);

                        // Se inicializa RutClienteText
                        RutClienteText.setPrefWidth(150);
                        RutClienteVBox.getChildren().add(RutClienteText);
                    }
                    Center1HBox.getChildren().add(RutClienteVBox);

                    // Se cre DvVBox
                    final HBox DvBHox = new HBox();
                    {
                        // Se inicializa CenterVBox
                        DvBHox.setPadding(new Insets(17, 0, 0, 0));

                        // Se inicializa RutClienteDVText
                        RutClienteDVText.setPrefWidth(50);
                        DvBHox.getChildren().add(RutClienteDVText);
                    }
                    Center1HBox.getChildren().add(DvBHox);

                    // Se crea TipoPagoVBox
                    final VBox TipoPagoVBox = new VBox();
                    {
                        // Se inicializa TipoPagoVBox
                        TipoPagoVBox.setPadding(new Insets(0, 0, 0, 10));
                        HBox.setHgrow(TipoPagoVBox, Priority.ALWAYS);
                        TipoPagoVBox.setPrefWidth(250);

                        // Se inicializa RutClientelbl
                        TipoPagoVBox.getChildren().add(TipoPagolbl);

                        // Se inicializa RutClienteText
                        TipoPagoComboBox.setPrefWidth(350);
                        TipoPagoVBox.getChildren().add(TipoPagoComboBox);
                    }
                    Center1HBox.getChildren().add(TipoPagoVBox);
                }
                CenterInternoHBox.getChildren().add(Center1HBox);

                // Se crea Center2HBox
                final HBox Center2HBox = new HBox(3);
                {
                    // Se inicializa Center2HBox
                    Center2HBox.setPadding(new Insets(0, 5, 5, 5));
                    HBox.setHgrow(Center2HBox, Priority.ALWAYS);

                    // Se crea MontoAbonoVBox
                    final VBox MontoAbonoVBox = new VBox();
                    {
                        // Se inicializa RutClientelbl
                        MontoAbonoVBox.getChildren().add(MontoAbonolbl);

                        // Se inicializa RutClienteText
                        MontoAbonoVBox.getChildren().add(MontoAbonoText);
                    }
                    Center2HBox.getChildren().add(MontoAbonoVBox);

                    // Se crea CodigoconvenioVBox
                    final VBox CodigoconvenioVBox = new VBox();
                    {
                        // Se inicializa RutClientelbl
                        CodigoconvenioVBox.getChildren().add(CodigoConveniolbl);

                        // Se inicializa RutClienteText
                        CodigoconvenioVBox.getChildren().add(CodigoConvenioText);
                    }
                    Center2HBox.getChildren().add(CodigoconvenioVBox);

                    // Se crea rightextHBox
                    final HBox rightextHBox = new HBox(3);
                    {
                        //Se inicializa rightextHBox
                        rightextHBox.setAlignment(Pos.CENTER);
                        rightextHBox.setPadding(new Insets(5, 0, 0, 0));
                        HBox.setHgrow(rightextHBox, Priority.ALWAYS);
                        rightextHBox.setPrefWidth(160);

                        // Se inicializa Textolbl
                        Textolbl.setStyle("-fx-font-weight: bold; -fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");
                        Textolbl.setPadding(new Insets(0, 5, 0, 5));
                        rightextHBox.getChildren().add(Textolbl);
                    }
                    Center2HBox.getChildren().add(rightextHBox);
                }
                CenterInternoHBox.getChildren().add(Center2HBox);

                // Se crea Center3HBox
                final HBox Center3HBox = new HBox(3);
                {
                    // Se inicializa Center3HBox
                    Center3HBox.setPadding(new Insets(0, 5, 5, 5));
                    HBox.setHgrow(Center3HBox, Priority.ALWAYS);

                    // Se crea NumeroChequeVBox
                    final VBox NumeroChequeVBox = new VBox();
                    {
                        // Se inicializa NumeroChequelbl
                        NumeroChequeVBox.getChildren().add(NumeroChequelbl);

                        // Se inicializa NumeroChequeText
                        NumeroChequeText.setMinWidth(180);
                        NumeroChequeVBox.getChildren().add(NumeroChequeText);
                    }
                    Center3HBox.getChildren().add(NumeroChequeVBox);

                    // Se crea N_CuentaCorrienteVBox
                    final VBox N_CuentaCorrienteVBox = new VBox();
                    {
                        // Se inicializa N_CuentaCorrientelbl
                        N_CuentaCorrienteVBox.getChildren().add(N_CuentaCorrientelbl);

                        // Se inicializa N_CuenteCorrienteText
                        N_CuenteCorrienteText.setMinWidth(180);
                        N_CuentaCorrienteVBox.getChildren().add(N_CuenteCorrienteText);
                    }
                    Center3HBox.getChildren().add(N_CuentaCorrienteVBox);

                    // Se crea BancoVBox
                    final VBox BancoVBox = new VBox();
                    {
                        // Se inicializa N_CuentaCorrientelbl
                        BancoVBox.getChildren().add(Bancolbl);

                        // Se inicializa N_CuenteCorrienteText
                        BancoText.setPrefWidth(70);
                        BancoVBox.getChildren().add(BancoText);
                    }
                    Center3HBox.getChildren().add(BancoVBox);

                    // Se crea SucursalVBox
                    final VBox SucursalVBox = new VBox();
                    {
                        // Se inicializa Sucursallbl
                        SucursalVBox.getChildren().add(Sucursallbl);

                        // Se inicializa sucursalText
                        sucursalText.setPrefWidth(70);
                        SucursalVBox.getChildren().add(sucursalText);
                    }
                    Center3HBox.getChildren().add(SucursalVBox);

                    // Se crea N_PlazaVBox
                    final VBox N_PlazaVBox = new VBox();
                    {
                        // Se inicializa Numerolbl
                        N_PlazaVBox.getChildren().add(NumeroPlazalbl);

                        // Se inicializa NumeroPlazaText
                        NumeroPlazaText.setPrefWidth(70);
                        N_PlazaVBox.getChildren().add(NumeroPlazaText);
                    }
                    Center3HBox.getChildren().add(N_PlazaVBox);
                }
                CenterInternoHBox.getChildren().add(Center3HBox);

                // Se crea Center4HBox
                final HBox Center4HBox = new HBox(3);
                {
                    // Se inicializa Center4HBox
                    Center4HBox.setPadding(new Insets(0, 5, 5, 5));
                    HBox.setHgrow(Center4HBox, Priority.ALWAYS);

                    // Se crea RutTitularVBox
                    final VBox RutTitularVBox = new VBox();
                    {
                        // Se inicializa RutTitularlbl
                        RutTitularVBox.getChildren().add(RutTitularlbl);

                        // Se inicializa RutTitularText
                        RutTitularVBox.getChildren().add(RutTitularText);
                    }
                    Center4HBox.getChildren().add(RutTitularVBox);

                    // Se crea BotonPuntosVBox
                    final VBox BotonPuntosVBox = new VBox();
                    {
                        // Se inicializa BotonPuntosVBox
                        BotonPuntosVBox.setPadding(new Insets(16, 0, 0, 0));

                        // Se inicializa PuntosBtn
                        PuntosBtn.setPrefWidth(40);
                        PuntosBtn.setStyle("-fx-font-weight: bold;");
                        BotonPuntosVBox.getChildren().add(PuntosBtn);
                    }
                    Center4HBox.getChildren().add(BotonPuntosVBox);

                    // Se crea ClienteRSTVBox
                    final VBox ClienteRSTVBox = new VBox();
                    {
                        // Se inicializa ClienteRSTVBox
                        ClienteRSTVBox.setPadding(new Insets(0, 5, 5, 5));
                        HBox.setHgrow(ClienteRSTVBox, Priority.ALWAYS);

                        // Se inicializa ClienteRSTlbl
                        ClienteRSTVBox.getChildren().add(ClienteRSTlbl);

                        // Se inicializa ClienteRSTText
                        ClienteRSTText.setStyle("-fx-background-color: #f5e6e6;");
                        ClienteRSTVBox.getChildren().add(ClienteRSTText);
                    }
                    Center4HBox.getChildren().add(ClienteRSTVBox);
                }
                CenterInternoHBox.getChildren().add(Center4HBox);

                // Se crea e inicializa TarjetasTable
                TarjetasTable = new TarjetasTable();
                TarjetasTable.setPrefHeight(160);
                final ScrollPane scroll = new ScrollPane();
                scroll.setContent(TarjetasTable);
                scroll.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
                scroll.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
                scroll.setHmax(2);
                scroll.setPrefHeight(180);
                CenterInternoHBox.getChildren().add(scroll);

                // Se crea Center5HBox
                final HBox Center5HBox = new HBox();
                {
                    // Se inicializa Center5HBox
                    Center5HBox.setPadding(new Insets(3,5,3,5));
                    HBox.setHgrow(Center5HBox, Priority.ALWAYS);

                    // Se crea LeftHBox
                    final HBox LeftHBox = new HBox(10);
                    {
                        //Se inicializa leftHBox
                        LeftHBox.setAlignment(Pos.BOTTOM_LEFT);
                        LeftHBox.setPadding(new Insets(0, 0, 0, 5));
                        HBox.setHgrow(LeftHBox, Priority.ALWAYS);

                        // Se inicializa IniciaDiaBtn
                        LeftHBox.getChildren().add(IniciaDiaBtn);

                        // Se inicializa IniciaDiaBtn
                        LeftHBox.getChildren().add(CierresDiaBtn);
                    }
                    Center5HBox.getChildren().add(LeftHBox);

                    // Se crea rightHBox
                    final HBox rightHBox = new HBox(3);
                    {
                        //Se inicializa rightHBox
                        rightHBox.setAlignment(Pos.BOTTOM_RIGHT);
                        rightHBox.setPadding(new Insets(0, 0, 0, 0));

                        // Se inicializa ImprimirVoucherBtn
                        ImprimirVoucherBtn.setPrefSize(170, 30);
                        ImprimirVoucherBtn.setStyle("-fx-font-size: 150%;");
                        rightHBox.getChildren().add(ImprimirVoucherBtn);

                        // Se inicializa AnularBtn
                        AnularBtn.setPrefSize(100, 30);
                        AnularBtn.setStyle("-fx-font-size: 150%;");
                        rightHBox.getChildren().add(AnularBtn);
                    }
                    Center5HBox.getChildren().add(rightHBox);
                }
                CenterInternoHBox.getChildren().add(Center5HBox);
            }
            CenterVBox.getChildren().add(CenterInternoHBox);
        }
        setCenter(CenterVBox);

        // Se crea Bottom
        final HBox BottomHBox = new HBox(3);
        {
            // Se inicializa BottomHBox
            BottomHBox.setPadding(new Insets(2, 5, 2, 5));
            BottomHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");

            // Se crea LeftHBox
            final HBox LeftHBox = new HBox(10);
            {
                //Se inicializa leftHBox
                LeftHBox.setAlignment(Pos.BOTTOM_LEFT);
                LeftHBox.setPadding(new Insets(0, 0, 0, 5));
                HBox.setHgrow(LeftHBox, Priority.ALWAYS);

                // Se inicializa TotalTarjetaslbl
                TotalTarjetaslbl.setPadding(new Insets(0, 0, 7, 0));
                TotalTarjetaslbl.setStyle("-fx-font-weight: bold;");
                LeftHBox.getChildren().add(TotalTarjetaslbl);

                // Se inicializa TotalTarjetasText
                TotalTarjetasText.setPrefHeight(30);
                LeftHBox.getChildren().add(TotalTarjetasText);
            }
            BottomHBox.getChildren().add(LeftHBox);

            // Se crea rightHBox
            final HBox rightHBox = new HBox(3);
            {
                //Se inicializa rightHBox
                rightHBox.setAlignment(Pos.BOTTOM_RIGHT);
                rightHBox.setPadding(new Insets(0, 10, 0, 0));

                // Se inicializa AceptarBtn
                AceptarBtn.setPrefSize(100, 30);
                AceptarBtn.setStyle("-fx-font-size: 150%;");
                BottomHBox.getChildren().add(AceptarBtn);
            }
            BottomHBox.getChildren().add(rightHBox);
        }
        setBottom(BottomHBox);
    }
}

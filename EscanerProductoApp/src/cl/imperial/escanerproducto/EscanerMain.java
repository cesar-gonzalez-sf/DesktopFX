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


import java.awt.Event;
import java.text.DecimalFormat;
import cl.imperial.escanerproducto.ws.EscanerProductoWebException;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.jfx.Dialog;
import cl.obcom.desktopfx.jfx.DialogType;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Cesar Gonzalez
 */
public final class EscanerMain extends BorderPane
{
    @SuppressWarnings("unused")
    private final DesktopTask task;

    private final EscanerTable tableScaner;
    private final WebService webService;
    @SuppressWarnings("unused")
    private final String Rut;

    //Se crean Label
    final Label Escanerlbl          = new Label("Escanear Producto o Ingresar Código");
    final Label Observacioneslbl    = new Label("Observaciones");
    final Label Totallbl            = new Label("TOTAL");

    //Se crean TextFild
    final TextField EscanerText = new TextField();
    final TextField CreditoText = new TextField();
    final static TextField TotalText = new TextField();

    //Se crea Botton
    final Button codigoRapidoButton = new Button("Código Rapido");
    final Button eliminarProButton  = new Button ("Eliminar Producto");
    final Button GrabarButton       = new Button("Grabar");
    final Button salirButton        = new Button("Salir");

    final Stage stage = new Stage();

    //Se crea formateador
    static DecimalFormat formateador = new DecimalFormat("###,###.##");

    // Se crean variables
    private final String rut;
    private final String entidad;

    /**
     * Constructs a new {@code Main} instance.
     *
     * @throws Exception if an unexpected error occurs.
     */
    public EscanerMain(final DesktopTask task)
        throws Exception
    {

        // Save Desktop Task
        this.task = task;

        // Inicializar variables
        webService = new WebService(task);
        Rut = "";

        // Obtenemos datos envíados de Tipo de Documento
       final TipoDctoDate tipoDcto = task.getArgument(TipoDctoDate.class);
       rut = tipoDcto != null ? tipoDcto.getRut() : " ";
       entidad = tipoDcto != null ? tipoDcto.getCodEntidad():"";


        // Inicializa BorderPane
        setPadding(new Insets(5, 5, 5, 5));

        //Se crea panel Top
        final VBox topVBox = new VBox(5);
        {
            //Se inicializa topVBox
            topVBox.setPadding(new Insets(10, 10, 10, 10));
            VBox.setVgrow(topVBox, Priority.ALWAYS);
            topVBox.setStyle("-fx-background-color: #f5f5f5; -fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");

            //Se crea Escaner de Producto
            final HBox escanerHBox = new HBox(10);
            {
                //Se inicializa
                escanerHBox.setPadding(new Insets(5, 5, 5, 5));
                escanerHBox.setAlignment(Pos.CENTER_LEFT);
                HBox.setHgrow(escanerHBox, Priority.ALWAYS);
                VBox.setVgrow(escanerHBox, Priority.ALWAYS);

                //Se crea Escaneo de Producto
                final VBox escanerVBox = new VBox();
                {
                    //Se inicializa Escanerlbl
                    HBox.setHgrow(Escanerlbl, Priority.ALWAYS);
                    escanerVBox.getChildren().add(Escanerlbl);

                    //Se inicializa EscanerText
                    EscanerText.setMinHeight(32);
                    HBox.setHgrow(EscanerText, Priority.ALWAYS);
                    EscanerText.setOnAction(e -> escanerProducto());
                    escanerVBox.getChildren().add(EscanerText);
                }
                escanerHBox.getChildren().add(escanerVBox);

                //Se inicializa codigoRapidoButton
                codigoRapidoButton.setPrefSize(100, 50);
                codigoRapidoButton.setStyle("-fx-font-weight: bold; -fx-font-size: 100%;");
                codigoRapidoButton.setAlignment(Pos.CENTER_LEFT);
                codigoRapidoButton.setOnAction(e -> {
                    try {
                        CodigoRapido(this);
                    } catch (final Exception e1) {
                        Dialog.showError(this, e1);
                    }
                });
                escanerHBox.getChildren().add(codigoRapidoButton);

                //Se inicializa Observacioneslbl
                Observacioneslbl.setPadding(new Insets(10, 0, 0, 0));
                Observacioneslbl.setStyle("-fx-font-weight: bold; -fx-font-size: 180%;");
                Observacioneslbl.setAlignment(Pos.CENTER_LEFT);
                escanerHBox.getChildren().add(Observacioneslbl);
            }
            topVBox.getChildren().add(escanerHBox);
        }
        setTop(topVBox);

        // Crea e inicializa tabla de clientes
        tableScaner = new EscanerTable();
        tableScaner.setPrefHeight(285);
        setCenter(tableScaner);

        //Se crea panel BottomVBox
        final VBox BottomVBox = new VBox(5);
        {
            // Se crea Bottontop
            final HBox BottonTopHBox = new HBox();
            {
                //Se inicializa totalHBox
                BottonTopHBox.setStyle("-fx-background-color: #f5f5f5; -fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");
                HBox.setHgrow(BottonTopHBox, Priority.ALWAYS);

                //Se crea leftHBox
                final HBox leftHBox = new HBox(3);
                {
                    //Se inicializa leftHBox
                    leftHBox.setAlignment(Pos.BOTTOM_LEFT);
                    leftHBox.setPadding(new Insets(0, 0, 0, 15));
                    leftHBox.setStyle("-fx-font-weight: bold;");
                    leftHBox.setPrefHeight(10);
                    HBox.setHgrow(leftHBox, Priority.ALWAYS);

                    //Se inicializa CreditoText
                    CreditoText.setStyle("-fx-background-color: #f5f5f5; -fx-font-size: 300%;");
//                    CreditoText.setText("Cliente Credito");
                    leftHBox.getChildren().add(CreditoText);
                }
                BottonTopHBox.getChildren().add(leftHBox);

                // Se crea rightHBox
                final HBox rightHBox = new HBox(10);
                {
                  //Se inicializa totalHBox
                    rightHBox.setAlignment(Pos.BOTTOM_RIGHT);

                    //Se inicializa Totallbl
                    Totallbl.setStyle("-fx-font-weight: bold; -fx-font-size: 300%;");
                    rightHBox.getChildren().add(Totallbl);

                    //Se inicializa EscanerText
                    TotalText.setStyle("-fx-background-color: #f5f5f5; -fx-font-size: 300%;");
                    TotalText.setText("0");
                    TotalText.setMaxWidth(200);
                    TotalText.setAlignment(Pos.BASELINE_RIGHT);
                    rightHBox.getChildren().add(TotalText);
                }
                BottonTopHBox.getChildren().add(rightHBox);
            }
            BottomVBox.getChildren().add(BottonTopHBox);

            //Se crea panel de botones
            final HBox bottomHBox = new HBox(500);
            {
                //Se inicializa bottomHBox
                bottomHBox.setPadding(new Insets(10, 10, 10, 10));
                HBox.setHgrow(bottomHBox, Priority.ALWAYS);
                bottomHBox.setStyle("-fx-background-color: #f5f5f5; -fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");

                //Se crea panel de botones iniciales
                final HBox inicialesHBox = new HBox(5);
                {
                    //Se inicializa inicialesHBox
                    inicialesHBox.setAlignment(Pos.BOTTOM_LEFT);
                    HBox.setHgrow(inicialesHBox, Priority.ALWAYS);

                    //Se inicializa eliminarProButton
                    eliminarProButton.setPrefSize(120, 50);
                    eliminarProButton.setStyle("-fx-font-weight: bold; -fx-font-size: 100%;");
                    eliminarProButton.setOnAction(e -> {
                        try {
                            onEliminarProducto();
                        } catch (final EscanerProductoWebException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    });
                    inicialesHBox.getChildren().add(eliminarProButton);

                    //Se inicializa GrabarButton
                    GrabarButton.setPrefSize(100, 50);
                    GrabarButton.setStyle("-fx-font-weight: bold; -fx-font-size: 100%;");
                    GrabarButton.setOnAction(e -> onGrabar());
                    inicialesHBox.getChildren().add(GrabarButton);

                }
                bottomHBox.getChildren().add(inicialesHBox);

                //Se crea panel de boton de Salir
                final HBox SalirHBox = new HBox();
                {
                    //Se inicializa SalirHBox
                    HBox.setHgrow(SalirHBox, Priority.ALWAYS);
                    SalirHBox.setAlignment(Pos.BOTTOM_RIGHT);

                    //Se inicializa salirButton
                    salirButton.setPrefSize(100, 50);
                    salirButton.setStyle("-fx-font-weight: bold; -fx-font-size: 100%;");
                    salirButton.setOnAction(e -> task.terminate(false));
                    SalirHBox.getChildren().add(salirButton);
                }
                bottomHBox.getChildren().add(SalirHBox);
            }
            BottomVBox.getChildren().add(bottomHBox);
        }
        setBottom(BottomVBox);

        //Se crea metodo automatico de apertura de plugin
//        onLoad_Session_Initialize();
    }


    //--------------------------------------------------------------------------
    //-- Credito Property Methods -------------------------------------------
    //--------------------------------------------------------------------------
    /**
     * Se reciben parametros de Plugins TipoDocumentos
     * @param task2
     */
//    private void onLoad_Session_Initialize()
//    {
//        if (credito.equals("S")) {
//            CreditoText.setText("Cliente Credito");
//        } else {
//            CreditoText.setText(" ");
//        }
//    }



    /**
     * @param e
     * @throws Exception
     */
    private void CodigoRapido(final EscanerMain escanerMain) throws Exception
    {
        final CodigoRapidoTemp ScanerCodigo = new CodigoRapidoTemp(escanerMain);

        //create root node of scene, i.e. group
        final Group rootGroup = new Group();
        //create scene with set width, height and color
        final Scene scene = new Scene(rootGroup);
        //set scene to stage
        stage.setScene(scene);
        //set title to stage
        stage.setTitle(" ");
        //center stage on screen
        stage.centerOnScreen();
        stage.setResizable(false);
        rootGroup.getChildren().add(ScanerCodigo);
        stage.show();

    }

    /**
     * @return
     */
    public void escanerProducto()
    {
        EscanerText.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)) {
                if(EscanerText.getText().length() == 14) {
                    try {
                        IngresaProducto(EscanerText.getText(), "DUN14");
                    } catch (final EscanerProductoWebException e) {
                        Dialog.showError(this, e);
                    }
                } else if(EscanerText.getText().length() == 13) {
                    if (EscanerText.getText().substring(0, 3).equals("BLV") || EscanerText.getText().substring(0, 3).equals("FCV") ) {
                        try {
                            IngresaProducto(EscanerText.getText().substring(3, 13), "VALTR");
                        } catch (final EscanerProductoWebException e) {
                            Dialog.showError(this, e);
                        }
                    } else {
                        try {
                            IngresaProducto(EscanerText.getText(), "EAN13");
                        } catch (final EscanerProductoWebException e) {
                            Dialog.showError(this, e);
                        }
                    }
                } else {
                    Dialog.showMessage(this, "Codigo incorrecto", "Escaner de Producto", DialogType.WARNING);
                }
            }
        });
    }

    /**
     * @param codigo
     * @param tipo
     * @throws EscanerProductoWebException
     *
     */
    public void IngresaProducto(final String codigo, final String tipo) throws EscanerProductoWebException
    {
        final String Cod_Lista = "01P";
        final String Cod_Credito = "N";
        webService.buscaProducto( codigo, tipo, tableScaner, Cod_Lista, Cod_Credito);
        stage.close();
        EscanerText.setText("");
        EscanerText.requestFocus();
    }


    /**
     * @throws EscanerProductoWebException
     */
    private void onEliminarProducto() throws EscanerProductoWebException
    {
        final int click;
        click = Event.ACTION_EVENT;
        EscanerText.setText("");
        EscanerText.requestFocus();
        if (click == 1001) {
            EscanerText.setOnKeyPressed(event -> {
                if(event.getCode().equals(KeyCode.ENTER)) {
                    if(EscanerText.getText().length() == 14) {
                        IngresaProductoEliminar(EscanerText.getText(), "DUN14");
                    } else if(EscanerText.getText().length() == 13) {
                        if (EscanerText.getText().substring(0, 3).equals("BLV") || EscanerText.getText().substring(0, 3).equals("FCV") ) {
                            IngresaProductoEliminar(EscanerText.getText().substring(3, 13), "VALTR");
                        } else {
                            IngresaProductoEliminar(EscanerText.getText(), "EAN13");
                        }
                    } else {
                        Dialog.showMessage(this, "Codigo incorrecto", "Escaner de Producto", DialogType.WARNING);
                    }
                }
            });
        }
    }


    /**
     * @param codigo
     * @param tipo
     */
    private void IngresaProductoEliminar(final String codigo, final String tipo)
    {
        final String Cod_Lista = "01P";
        final String Cod_Credito = "N";
        webService.buscaProductoEliminar( codigo, tipo, tableScaner, Cod_Lista, Cod_Credito);

        stage.close();
        EscanerText.setText("");
        EscanerText.requestFocus();
    }

    /**
     * @return
     */
    private void onGrabar()
    {
        final String Cod_Lista = "01P";
        final String xmlProdutos = xmlProductos();
        webService.grabarProducto(tableScaner, Cod_Lista, xmlProdutos);
    }



    /**
     * @return
     */
    String xmlProductos()
    {
        final StringBuilder productostXML = new StringBuilder();
        productostXML.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
        productostXML.append("<ValeTransitorio>");
            for (final ProductosList producto:tableScaner.ProductosList) {
                if (producto.getTIPO().equals("P")) {
                    productostXML.append("<Detalle>");
                    productostXML.append("<CodigoRapido>"+ producto.getCOD_RAPIDO().toString() +"</CodigoRapido>");
                    productostXML.append("<Producto>"+producto.getCOD_PRODUCTO().toString()+"</Producto>");
                    productostXML.append("<Descripcion>"+producto.getDESCRIPCION().toString()+"</Descripcion>");
                    productostXML.append("<PrecioBruto>"+producto.getPRECIO_BRUTO().toString()+"</PrecioBruto>");
                    productostXML.append("<Descuento>"+producto.getDESCUENTO().toString()+"</Descuento>");
                    productostXML.append("<CantidadEmbalaje>"+producto.getCANTIDAD_EMBALAJE().toString()+"</CantidadEmbalaje>");
                    productostXML.append("<CodUnimed>"+producto.getCOD_UNIMED().toString()+"</CodUnimed>");
                    productostXML.append("<Cantidad>"+producto.getCANTIDAD().toString()+"</Cantidad>");
                    productostXML.append("<Tipo>"+producto.getTIPO().toString()+"</Tipo>");
                    productostXML.append("</Detalle>");
                }
            }
            productostXML.append("</ValeTransitorio>");
        return productostXML.toString();
    }



    /**
     * @param table
     */
    static void ActializarMonto(final EscanerTable table)
    {
        Integer monto = 0;
        for (final ProductosList suma:table.getItems())
        {
            monto = monto + Integer.parseInt(suma.getTOTAL().replace(".", ""));
        }
        TotalText.setText(formateador.format(monto));
    }

}

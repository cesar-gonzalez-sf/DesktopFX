/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.cajaunificada;

import java.util.Optional;
import cl.imperial.cajaunificada.utils.CajaUnificadaException;
import cl.imperial.tipodocumento.MainTipoDocumento;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.ModalEvent;
import cl.obcom.desktopfx.core.TaskEvent;
import cl.obcom.desktopfx.core.TaskPage;
import cl.obcom.desktopfx.jfx.Dialog;
import cl.obcom.desktopfx.jfx.DialogAction;
import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

/**
 * @author Cesar Gonzalez
 */
public final class Main extends BorderPane
{
    //--------------------------------------------------------------------------
    //-- Constructor Methods ---------------------------------------------------
    //--------------------------------------------------------------------------

    private final DesktopTask task;
    private TableView Table;
    private final WebClient webClient;
    private final StartupParams startupParams;
    //private final TipoDocumento Tipodocumento;

    final Stage stage = new Stage();

    // Se crea Label
    final Label nroDocumentolbl     = new Label("Nro. Documento");
    final Label Cargoslbl           = new Label("Cargos");
    final Label CargosCMRlbl        = new Label("Cargos CMR");
    final Label Descuentoslbl       = new Label("Descuentos");
    final Label TotalPaglbl         = new Label("Total a Pagar");
    final Label Pagoslbl            = new Label("Pagos");
    final Label Porcobrarlbl        = new Label("Por Cobrar");
    final Label Vueltolbl           = new Label("Vuelto");
    final Label SaldoAcreedorlbl    = new Label("Saldo Acreedor");
    final Label Efectivolbl         = new Label("Efectivo");
    final Label Chequeslbl          = new Label("Cheques");
    final Label Tarjetalbl          = new Label("Tarjetas");
    final Label NotaCreditolbl      = new Label("Nota Credito");
    final Label Transferencialbl    = new Label("Transferencia");
    final Label SaldoAcreedor2lbl   = new Label("Saldo Acreedor");
    final Label CheckLabel          = new Label("Vuelto a Saldo");
    final Label InteresesCheqlbl    = new Label("Intereses Cheq.");
    final Label Sucursalbl          = new Label("Sucursal:");
    final Label Usuariolbl          = new Label("Usuario:");
    final Label NomEstacionlbl      = new Label("Nombre Estación:");
    final Label Bandejalbl          = new Label("Bandeja:");
    final Label EstBandejalbl       = new Label("Estado Bandeja:");

    // Se crea TextField
    final TextField NroDocumentoText    = new TextField();
    final TextField CargosText          = new TextField();
    final TextField CargosCMRText       = new TextField();
    final TextField DescuentosText      = new TextField();
    final TextField TotalPagoText       = new TextField();
    final TextField PagosText           = new TextField();
    final TextField PorCobrarText       = new TextField();
    final TextField VueltoText          = new TextField();
    final TextField SaldoAcreedorText   = new TextField();
    final TextField EfectivoTxt         = new TextField();
    final TextField EfectivoMiniTxt     = new TextField();
    final TextField ChequesTxt          = new TextField();
    final TextField TarjetasTxt         = new TextField();
    final TextField NotaCreditoTxt      = new TextField();
    final TextField TransferenciaTxt    = new TextField();
    final TextField SaldoAcreedor2Txt   = new TextField();
    final TextField InteresesCheqTxt    = new TextField();

    final Label SucursalTxt         = new Label();
    final Label UsuarioTxt          = new Label();
    final Label NomEstacionTxt      = new Label();
    final Label BandejaTxt          = new Label();
    final Label EstBandejaTxt       = new Label();

    //Se crea CheckBox
    final CheckBox checkBoxClave = new CheckBox("");

    //Se crea boton de Envio de Balin con Imagen
    final Image ENVIO = new Image(getClass().getResourceAsStream("imagen/envio.jpg"));
    final ImageView envio = new ImageView(ENVIO);
    final Button envioButton = new Button("",envio);
    final FadeTransition ft = new FadeTransition(Duration.millis(1000), envioButton);

    //Se crea botoon de Escaner con Imagen
    final Image ESCANER = new Image(getClass().getResourceAsStream("imagen/escaner.jpg"));
    final ImageView escaner = new ImageView(ESCANER);
    final Button escanerButton = new Button("",escaner);

    //Se crea Boton Ficha registro con Imagen
    final Image FICHAREGISTRO = new Image(getClass().getResourceAsStream("imagen/ficha_registro.jpg"));
    final ImageView ficharegistro = new ImageView(FICHAREGISTRO);
    final Button ficharegistroButton = new Button("",ficharegistro);

    //Se crea boton con iamgen de ingreso de tarjeta
    final Image INGTARJETA = new Image(getClass().getResourceAsStream("imagen/tarjeta.jpg"));
    final ImageView ingtarjeta = new ImageView(INGTARJETA);
    final Button ingtarjetaButton = new Button("", ingtarjeta);

    //Se crea boton con imagen de CMR
    final Image FALABELLA = new Image(getClass().getResourceAsStream("imagen/cmr.png"));
    final ImageView falabella = new ImageView(FALABELLA);
    final Button falabellaButton = new Button("", falabella);

    //Se crea boton con imagen de consulta de tarjeta
    final Image CONSTARJETA = new Image(getClass().getResourceAsStream("imagen/consultatarjeta.jpg"));
    final ImageView consultatarjeta = new ImageView(CONSTARJETA);
    final Button consultatarjetaButton = new Button("", consultatarjeta);

    //Se crea boton con imagen de Pagar
    final Image GURDAR = new Image(getClass().getResourceAsStream("imagen/pagar.jpg"));
    final ImageView guardar = new ImageView(GURDAR);
    final Button guardarButton = new Button("", guardar);

    final Image CREDITO = new Image(getClass().getResourceAsStream("imagen/credito.png"));
    final ImageView credito = new ImageView(CREDITO);
    final Button creditoButton = new Button("", credito);

    //Se crea  Boton reimprimirButton con Imagen
    final Image REIMPRIMIR = new Image(getClass().getResourceAsStream("imagen/reimprime.jpg"));
    final ImageView reimprimir = new ImageView(REIMPRIMIR);
    final Button reimprimirButton = new Button("",reimprimir);

    //Se crea boton con imagen de limpiar
    final Image LIMPIAR = new Image(getClass().getResourceAsStream("imagen/limpiar.jpg"));
    final ImageView limpiar = new ImageView(LIMPIAR);
    final Button limpiarButton = new Button("", limpiar);

    //Se crea boton con imagen de configuracion
    final Image CONFIGURAR = new Image(getClass().getResourceAsStream("imagen/configuracion.jpg"));
    final ImageView configurar = new ImageView(CONFIGURAR);
    final Button configurarButton = new Button("", configurar);

    /**
     * Constructs a new {@code Main} instance.
     *
     * @param  task a reference to the Desktop Task.
     * @throws Exception if an unexpected error occurs.
     */
    public Main(final DesktopTask task)
        throws Exception
    {
        final Boolean bandeja = false;
        // Save Desktop Task
        this.task = task;

        // Initialize task properties
        final TaskPage page = task.getWindow().getPage();
        setPrefSize(page.getWidth() -25, page.getHeight() - 40);

        // Create WebClient online or offline (for debug)
        final String envName = task.getServerEnvironName();
        final boolean offline = !"IMPERIAL-SERVER".equals(envName);
        webClient = new WebClient(this, task, offline);

        task.addEventHandler(TaskEvent.TASK_STATE_REQUEST, e -> onTaskStateRequest(e));

        // Call WebService and obtain startup parameters
        startupParams = webClient.startup(task);

        //Inicializamos variablescaja
        //Tipodocumento   = new TipoDocumento(task);

        this.Table = new TableView();

        // Inicializa BorderPane
        setPadding(new Insets(5));

        // Initialize plugin page title
        final String version = getImplementationVersion();
        task.getWindow().setTitle("Caja Unificada " + version);

        // Se crea Panel ingresoTotalHBox
        final HBox ingresoTotalHBox = new HBox(3);
        {
            // Inicializa ingresoTotalHBox
            ingresoTotalHBox.setAlignment(Pos.CENTER_LEFT);
            HBox.setHgrow(ingresoTotalHBox, Priority.ALWAYS);

            // Se crea panel con titulo Ingreso de documentos
            final TitledPane ingreseDocTitled = new TitledPane();
            {
                // Inicializamos ingreseDocTitled
                ingreseDocTitled.setText("Ingreso de Documentos");
                ingreseDocTitled.setStyle("-fx-font-weight: bold;");
                ingreseDocTitled.setCollapsible(false);
                ingreseDocTitled.setExpanded(true);

                //Se crea e inicializa ingresoDocHBox
                final HBox ingresoDocHBox = new HBox(3);
                {
                    // Inicializa ingresoDocHBox
                    ingresoDocHBox.setAlignment(Pos.CENTER_LEFT);

                    //Se crea e inicializa documentoVBox
                    final VBox documentoVBox = new VBox(5);
                    {
                        //Se inicializa docuemntoVBox
                        documentoVBox.setPrefHeight(112);
                        // Se inicializa "Nro. Documento"
                        nroDocumentolbl.setStyle("-fx-font-weight: bold; -fx-font-size: 150%;");
                        nroDocumentolbl.setAlignment(Pos.BASELINE_CENTER);
                        nroDocumentolbl.setMaxWidth(Double.MAX_VALUE);
                        documentoVBox.getChildren().add(nroDocumentolbl);

                        // Se inicializa NroDocumentoTxt
                        NroDocumentoText.setStyle("-fx-font-weight: bold; -fx-font-size: 200%;");
                        NroDocumentoText.setMinHeight(72);
                        NroDocumentoText.setOnAction(e -> onLoad_Session_Initialize(task));
                        documentoVBox.getChildren().add(NroDocumentoText);
                    }
                    ingresoDocHBox.getChildren().add(documentoVBox);

                    //Se crea panel de Escaner de Producto
                    final VBox escanerVBox = new VBox();
                    {
                        //Se inicializa Escaner de Producto
                        escanerVBox.setPadding(new Insets(40, 0, 0, 0));

                        //Se inicializa Boton Escaner Producto
                        escaner.setStyle("-fx-padding-top: 10px;");
                        escaner.setFitHeight(40);
                        escaner.setFitWidth(40);
                        escanerButton.setOnAction(e -> {
                            try {
                                EscanerProducto(e);
                            } catch (final Exception e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                            }
                        });
                        escanerVBox.getChildren().add(escanerButton);
                    }
                    ingresoDocHBox.getChildren().add(escanerVBox);
                }
                ingreseDocTitled.setContent(ingresoDocHBox);
            }

            //Se crea panel con titulo totales
            final TitledPane totalesTitled = new TitledPane();
            {
                // Inicializamos totales
                totalesTitled.setText("Totales");
                totalesTitled.setStyle("-fx-font-weight: bold;");
                totalesTitled.setCollapsible(false);
                totalesTitled.setExpanded(true);
                HBox.setHgrow(totalesTitled, Priority.ALWAYS);

                // Se crea panel totales
                final VBox TotalesVBox = new VBox();
                {
                    // Inicializa TotalesVBox
                    TotalesVBox.setAlignment(Pos.CENTER_LEFT);

                    // Se cre panel totalesHBox
                    final HBox totalesHBox = new HBox(5);
                    {
                        // Se crea panel cargosVBox
                        final VBox cargosVBox = new VBox(3);
                        {
                            //Se inicializa cargosVBox
                            HBox.setHgrow(cargosVBox, Priority.ALWAYS);

                            //Se inicializa "Cargos"
                            Cargoslbl.setStyle("-fx-font-size: 130%;");
                            Cargoslbl.setAlignment(Pos.BASELINE_CENTER);
                            Cargoslbl.setMaxWidth(Double.MAX_VALUE);
                            cargosVBox.getChildren().add(Cargoslbl);

                            //Se inicializa CargosTxt
                            CargosText.setPrefWidth(100);
                            cargosVBox.getChildren().add(CargosText);
                        }
                        totalesHBox.getChildren().add(cargosVBox);

                        // Se crea panel cargosCMRVBox
                        final VBox cargosCMRVBox = new VBox(3);
                        {
                            //Se inicializa cargosCMRVBox
                            HBox.setHgrow(cargosCMRVBox, Priority.ALWAYS);

                            //Se inicializa "CargosCMRlbl"
                            CargosCMRlbl.setStyle("-fx-font-size: 130%;");
                            CargosCMRlbl.setAlignment(Pos.BASELINE_CENTER);
                            CargosCMRlbl.setMaxWidth(Double.MAX_VALUE);
                            cargosCMRVBox.getChildren().add(CargosCMRlbl);

                            //Se inicializa CargosCMRTxt
                            CargosCMRText.setPrefWidth(100);
                            cargosCMRVBox.getChildren().add(CargosCMRText);
                        }
                        totalesHBox.getChildren().add(cargosCMRVBox);

                        // Se crea panel desceuntoVueltoVBox
                        final VBox descuentosVBox = new VBox(3);
                        {
                            //Se inicializa descuentosVBox
                            HBox.setHgrow(descuentosVBox, Priority.ALWAYS);

                            //Se inicializa "Descuento"
                            Descuentoslbl.setStyle("-fx-font-size: 130%;");
                            Descuentoslbl.setAlignment(Pos.BASELINE_CENTER);
                            Descuentoslbl.setMaxWidth(Double.MAX_VALUE);
                            descuentosVBox.getChildren().add(Descuentoslbl);

                            //Se inicializa DescuentosText
                            DescuentosText.setPrefWidth(100);
                            descuentosVBox.getChildren().add(DescuentosText);
                        }
                        totalesHBox.getChildren().add(descuentosVBox);

                        //Se crea panel totalPagarVBox
                        final VBox totalPagarVBox = new VBox(3);
                        {
                            //Se inicializa totalPagarVBox
                            HBox.setHgrow(totalPagarVBox, Priority.ALWAYS);

                            //Se crea e inicializa "Total a Pagar"
                            TotalPaglbl.setStyle("-fx-font-size: 130%;");
                            TotalPaglbl.setAlignment(Pos.BASELINE_CENTER);
                            TotalPaglbl.setMaxWidth(Double.MAX_VALUE);
                            totalPagarVBox.getChildren().add(TotalPaglbl);

                            //Se unicializa TotalPagoText
                            TotalPagoText.setPrefWidth(100);
                            totalPagarVBox.getChildren().add(TotalPagoText);
                        }
                        totalesHBox.getChildren().add(totalPagarVBox);
                    }
                    TotalesVBox.getChildren().add(totalesHBox);

                    //Se crea panel totalesInfHBox
                    final HBox totalesInfHBox = new HBox(5);
                    {
                        //Se inicializa totalesInfHBox
                        totalesInfHBox.setPadding(new Insets(10,0,0,0));

                        // Se crea panel pagosVBox
                        final VBox pagosVBox = new VBox(3);
                        {
                            //Se inicializa pagosVBox
                            HBox.setHgrow(pagosVBox, Priority.ALWAYS);

                            //Se crea e inicializa "Pagos"
                            Pagoslbl.setStyle("-fx-font-size: 130%;");
                            Pagoslbl.setAlignment(Pos.BASELINE_CENTER);
                            Pagoslbl.setMaxWidth(Double.MAX_VALUE);
                            pagosVBox.getChildren().add(Pagoslbl);

                            //Se crea e inicializa CargosText
                            PagosText.setPrefWidth(100);
                            pagosVBox.getChildren().add(PagosText);
                        }
                        totalesInfHBox.getChildren().add(pagosVBox);

                        // Se crea panel porCobrarVBox
                        final VBox porCobrarVBox = new VBox(3);
                        {
                            //Se inicializa porCobrarVBox
                            HBox.setHgrow(porCobrarVBox, Priority.ALWAYS);

                            //Se inicializa "Por Cobrar"
                            Porcobrarlbl.setStyle("-fx-font-size: 130%;");
                            Porcobrarlbl.setAlignment(Pos.BASELINE_CENTER);
                            Porcobrarlbl.setMaxWidth(Double.MAX_VALUE);
                            porCobrarVBox.getChildren().add(Porcobrarlbl);

                            //Se inicialza PorCobrarTxt
                            PorCobrarText.setPrefWidth(100);
                            porCobrarVBox.getChildren().add(PorCobrarText);
                        }
                        totalesInfHBox.getChildren().add(porCobrarVBox);

                        // Se crea panel vueltoVBox
                        final VBox vueltoVBox = new VBox(3);
                        {
                            //Se inicializa vueltoVBox
                            HBox.setHgrow(vueltoVBox, Priority.ALWAYS);

                            //Se inicializa "Vuelto"
                            Vueltolbl.setStyle("-fx-font-size: 130%;");
                            Vueltolbl.setAlignment(Pos.BASELINE_CENTER);
                            Vueltolbl.setMaxWidth(Double.MAX_VALUE);
                            vueltoVBox.getChildren().add(Vueltolbl);

                            //Se inicializa VueltoTxt
                            VueltoText.setPrefWidth(100);
                            vueltoVBox.getChildren().add(VueltoText);
                        }
                        totalesInfHBox.getChildren().add(vueltoVBox);

                        // Se crea panel saldoAcreedorVBox
                        final VBox saldoAcreedorVBox = new VBox(3);
                        {
                            //Se inicializa vueltoVBox
                            HBox.setHgrow(saldoAcreedorVBox, Priority.ALWAYS);

                            //Se inicializa "Saldo Acreedor"
                            SaldoAcreedorlbl.setStyle("-fx-font-size: 130%;");
                            SaldoAcreedorlbl.setAlignment(Pos.BASELINE_CENTER);
                            SaldoAcreedorlbl.setMaxWidth(Double.MAX_VALUE);
                            saldoAcreedorVBox.getChildren().add(SaldoAcreedorlbl);

                            //Se inicializa SaldoAcreedorText
                            SaldoAcreedorText.setPrefWidth(100);
                            saldoAcreedorVBox.getChildren().add(SaldoAcreedorText);
                        }

                        totalesInfHBox.getChildren().add(saldoAcreedorVBox);
                    }
                    TotalesVBox.getChildren().add(totalesInfHBox);
                }
                totalesTitled.setContent(TotalesVBox);
            }
            ingresoTotalHBox.getChildren().addAll(ingreseDocTitled,totalesTitled);
        }
        setTop(ingresoTotalHBox);

        // Se crea Panel Docuemntos Table
      final HBox documentosHBox = new HBox(5);
      {
          // Inicializa documentosHBox
          documentosHBox.setAlignment(Pos.CENTER_LEFT);
          documentosHBox.setPadding(new Insets(5,0,0,0));

          // Se crea pable tableViewVBox
          final VBox tableViewVBox = new VBox();
          {
              // Inicializa tableViewVBox
              HBox.setHgrow(tableViewVBox, Priority.ALWAYS);

              // Se crea panel con titulo Documentos
              final TitledPane documentos = new TitledPane();
              {
                  // Inicializamos documentos
                  documentos.setText("Documentos");
                  documentos.setStyle("-fx-font-weight: bold;");
                  documentos.setCollapsible(false);
                  documentos.setMinHeight(278);
                  HBox.setHgrow(documentos, Priority.ALWAYS);
                  VBox.setVgrow(documentos, Priority.ALWAYS);

                  // Se crea y se inicializa tabla de Docuemntos
                  Table = new TableView<>();
                  {
                      // Inicializamos Tabla de Documentos
                      Table.setEditable(true);
                      HBox.setHgrow(Table, Priority.ALWAYS);
                      Table.setMaxHeight(285);
                      Table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                      Table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

                      // Se crea y se inicializa la columna "Empresa" ////////
                      final TableColumn cEmpresa = new TableColumn<>("Empresa");
                      {

                      }

                      // Se crea y se inicializa la columna "Sucursal" ///////
                      final TableColumn cSucursal = new TableColumn<>("Sucursal");
                      {

                      }

                      // Se crea y se inicializa la columna "Tipo" ///////////
                      final TableColumn cTipo = new TableColumn<>("Tipo");
                      {

                      }

                      // Se crea y se inicializa la columna "Numero" /////////
                      final TableColumn cNumero = new TableColumn<>("Número");
                      {

                      }

                      // Se crea y se inicializa la columna "Entidad" /////////
                      final TableColumn cEntidad = new TableColumn<>("Entidad");
                      {

                      }

                      Table.getColumns().addAll(cEmpresa,cSucursal,cTipo,cNumero,cEntidad);
                  }
                  getChildren().addAll(Table);

                  documentos.setContent(Table);
              }
              tableViewVBox.getChildren().add(documentos);
          }

          // Se crea pable mediosPagosVBox
          final VBox mediosPagosVBox = new VBox();
          {
              // Inicializa mediosPagosVBox
              mediosPagosVBox.setPadding(new Insets(0, 0, 5, 0));

              // Se crea panel con titulo Medios de Pagos
              final TitledPane mediosPagos = new TitledPane();
              {
                  // Inicializamos mediosPagos
                  mediosPagos.setText("Metodos de Pagos");
                  mediosPagos.setStyle("-fx-font-weight: bold;");
                  mediosPagos.setCollapsible(false);

                  // Se crea panel de Medios de Pagos
                  final VBox medioPagoVBox = new VBox();
                  {
                      // Se crea panel de Efectivo
                      final HBox efectivoHBox = new HBox(5);
                      {
                          // Inicializamos efectivoHBox
                          efectivoHBox.setPrefHeight(33);
                          efectivoHBox.setPadding(new Insets(0, 0, 3, 0));
//                          efectivoHBox.setStyle("-fx-background-color: black;");

                          // Inicializamos Efectivolbl
                          Efectivolbl.setPadding(new Insets(5, 0, 0, 0));
                          Efectivolbl.setPrefWidth(120);
                          Efectivolbl.setStyle("-fx-font-size: 130%;");
                          efectivoHBox.getChildren().add(Efectivolbl);

                          // Inicializamos EfectivoTxt
                          EfectivoTxt.setPrefSize(120, 60);
                          efectivoHBox.getChildren().add(EfectivoTxt);

                          // Inicializamos EfectivoMiniTxt
                          EfectivoMiniTxt.setPrefSize(35, 60);
                          efectivoHBox.getChildren().add(EfectivoMiniTxt);
                      }
                      medioPagoVBox.getChildren().add(efectivoHBox);

                      // Se crea panel de Cheques
                      final HBox chequesHBox = new HBox(5);
                      {
                          // Inicializamos chequesHBox
                          chequesHBox.setPrefHeight(33);
                          chequesHBox.setPadding(new Insets(0, 0, 3, 0));

                          // Se inicializa Chequeslbl
                          Chequeslbl.setPadding(new Insets(3,0,0,0));
                          Chequeslbl.setPrefWidth(120);
                          Chequeslbl.setStyle("-fx-font-size: 130%;");
                          chequesHBox.getChildren().addAll(Chequeslbl);

                          //Se inicializa ChequesTxt
                          ChequesTxt.setPrefSize(160, 60);
                          chequesHBox.getChildren().add(ChequesTxt);
                      }
                      medioPagoVBox.getChildren().add(chequesHBox);

                      // Se crea panel de Tarjetas
                      final HBox tarjetasHBox = new HBox(5);
                      {
                          // Inicializamos tarjetasHBox
                          tarjetasHBox.setPrefHeight(33);
                          tarjetasHBox.setPadding(new Insets(0, 0, 3, 0));

                          //Se crea e inicializa Tarjetalbl
                          Tarjetalbl.setPadding(new Insets(3,0,0,0));
                          Tarjetalbl.setPrefWidth(120);
                          Tarjetalbl.setStyle("-fx-font-size: 130%;");
                          tarjetasHBox.getChildren().addAll(Tarjetalbl);

                          // Inicializamos TarjetasTxt
                          TarjetasTxt.setPrefSize(160, 60);
                          tarjetasHBox.getChildren().add(TarjetasTxt);
                      }
                      medioPagoVBox.getChildren().add(tarjetasHBox);

                      // Se crea panel de Nota de Credito
                      final HBox notaCreditoHBox = new HBox(5);
                      {
                          // Inicializamos notaCreditoHBox
                          notaCreditoHBox.setPrefHeight(33);
                          notaCreditoHBox.setPadding(new Insets(0, 0, 3, 0));

                          //Se inicializa NotaCreditolbl
                          NotaCreditolbl.setPadding(new Insets(3,0,0,0));
                          NotaCreditolbl.setPrefWidth(120);
                          NotaCreditolbl.setStyle("-fx-font-size: 130%;");
                          notaCreditoHBox.getChildren().add(NotaCreditolbl);

                          //Se inicializa NotaCreditoTxt
                          NotaCreditoTxt.setPrefSize(160, 60);
                          notaCreditoHBox.getChildren().add(NotaCreditoTxt);
                      }
                      medioPagoVBox.getChildren().add(notaCreditoHBox);


                      // Se crea panel de Transferencia //////////////////////
                      final HBox transferenciaHBox = new HBox(5);
                      {
                          // Inicializamos transferenciaHBox
                          transferenciaHBox.setPrefHeight(33);
                          transferenciaHBox.setPadding(new Insets(0, 0, 3, 0));

                          //Se inicializa Transferencialbl
                          Transferencialbl.setPadding(new Insets(3,0,0,0));
                          Transferencialbl.setPrefWidth(120);
                          Transferencialbl.setStyle("-fx-font-size: 130%;");
                          transferenciaHBox.getChildren().add(Transferencialbl);

                          //Se inicializa TransferenciaTxt
                          TransferenciaTxt.setPrefSize(160, 60);
                          transferenciaHBox.getChildren().add(TransferenciaTxt);
                      }
                      medioPagoVBox.getChildren().add(transferenciaHBox);

                      // Se crea panel de Saldo Acreedor /////////////////////
                      final HBox saldoAcreedorHBox = new HBox(5);
                      {
                          // Inicializamos saldoAcreedorHBox
                          saldoAcreedorHBox.setPrefHeight(33);
                          saldoAcreedorHBox.setPadding(new Insets(0,0,3,0));

                          //Se inicializa SaldoAcreedor2lbl
                          SaldoAcreedor2lbl.setPadding(new Insets(3,0,0,0));
                          SaldoAcreedor2lbl.setPrefWidth(120);
                          SaldoAcreedor2lbl.setStyle("-fx-font-size: 130%;");
                          saldoAcreedorHBox.getChildren().add(SaldoAcreedor2lbl);

                          //Se inicializa TransferenciaTxt
                          SaldoAcreedor2Txt.setPrefSize(160, 110);
                          saldoAcreedorHBox.getChildren().add(SaldoAcreedor2Txt);
                      }
                      medioPagoVBox.getChildren().add(saldoAcreedorHBox);

                      //Se crea panel de Check
                      final HBox checkHBox = new HBox(50);
                      {
                          // Inicializamos checkHBox
                          checkHBox.setPrefHeight(33);
                          checkHBox.setPadding(new Insets(0, 0, 5, 0));

                          //Se inicializa CheckLabel
                          CheckLabel.setStyle("-fx-font-size: 130%;");
                          checkHBox.getChildren().add(CheckLabel);

                          //Se inicializa checkBoxClave
                          checkHBox.getChildren().add(checkBoxClave);
                      }
                      medioPagoVBox.getChildren().add(checkHBox);

                      //Se crea e inicializa Linea de separación
                      final Line line = new Line();
                      line.setStartX(0.0f);
                      line.setStartY(350f);
                      line.setEndX(300.0f);
                      line.setEndY(350.0f);
                      line.setStroke(Color.GREY);
                      medioPagoVBox.getChildren().add(line);

                      // Se crea panel de Intereses Cheques
                      final HBox interesesChequesHBox = new HBox(5);
                      {
                          // Inicializamos interesesChequesHBox
                          interesesChequesHBox.setPrefHeight(33);
                          interesesChequesHBox.setPadding(new Insets(5,0,0,0));

                          //Se inicializa InteresesCheqlbl
                          InteresesCheqlbl.setPadding(new Insets(3,0,0,0));
                          InteresesCheqlbl.setPrefWidth(120);
                          InteresesCheqlbl.setStyle("-fx-font-size: 130%;");
                          interesesChequesHBox.getChildren().add(InteresesCheqlbl);

                          //Se inicializa InteresesCheqTxt
                          InteresesCheqTxt.setPrefSize(160, 100);
                          interesesChequesHBox.getChildren().add(InteresesCheqTxt);
                      }
                      medioPagoVBox.getChildren().add(interesesChequesHBox);
                  }
                  mediosPagos.setContent(medioPagoVBox);
              }
              mediosPagosVBox.getChildren().add(mediosPagos);
          }
          mediosPagosVBox.getChildren();

          documentosHBox.getChildren().addAll(tableViewVBox,mediosPagosVBox);
      }
      setCenter(documentosHBox);

      //Se crea panel Botones y Footer
      final VBox botonesVBox = new VBox(5);
      {
          //Se crea panel de Botones
          final HBox botonesHBox = new HBox();
          {
              // Inicializamos botonesHBox
              botonesHBox.setPadding(new Insets(3,5,3,5));
              botonesHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");
              HBox.setHgrow(botonesHBox, Priority.ALWAYS);

              //Se crea panel de botones left
              final HBox leftHBox = new HBox(3);
              {
                  leftHBox.setAlignment(Pos.BOTTOM_LEFT);
                  leftHBox.setPadding(new Insets(0, 0, 10, 0));
                  HBox.setHgrow(leftHBox, Priority.ALWAYS);

                  //Se inicializa  Boton envio de balin con Imagen
                  envio.setFitHeight(40);
                  envio.setFitWidth(40);
                  envioButton.setOnAction(e -> EnvioBalin());
                  envioButton.setStyle("-fx-background-color: red");
                  ft.setFromValue(1.0);
                  ft.setToValue(0.1);
                  ft.setCycleCount(Animation.INDEFINITE);
                  ft.setAutoReverse(true);
                  ft.play();
                  leftHBox.getChildren().add(envioButton);

                  //Se inicializa  Boton reimprimirButton con Imagen
                  reimprimir.setFitHeight(40);
                  reimprimir.setFitWidth(40);
                  leftHBox.getChildren().add(reimprimirButton);

                  //Se inicializa boton con imagen de limpiar
                  limpiar.setFitHeight(40);
                  limpiar.setFitWidth(40);
                  leftHBox.getChildren().add(limpiarButton);

                  //Se inicializa boton con imagen de configuracion
                  configurar.setFitHeight(40);
                  configurar.setFitWidth(40);
                  leftHBox.getChildren().add(configurarButton);
              }
              botonesHBox.getChildren().add(leftHBox);

              // Se crea panel de botones center
              final HBox centerHBox = new HBox(3);
              {
                  centerHBox.setAlignment(Pos.BOTTOM_CENTER);
                  HBox.setHgrow(centerHBox, Priority.ALWAYS);

                  //Se inicializa boton con imagen de Pagar
                  guardar.setFitHeight(60);
                  guardar.setFitWidth(80);
                  centerHBox.getChildren().add(guardarButton);

                  //Se inicializa boton con imagen de Pagar
                  credito.setFitHeight(60);
                  credito.setFitWidth(80);
                  centerHBox.getChildren().add(creditoButton);
                  creditoButton.setDisable(true);
              }
              botonesHBox.getChildren().add(centerHBox);

              // Se crea panel de botones right
              final HBox rightHBox = new HBox(3);
              {
                  //Se inicializa leftHBox
                  rightHBox.setAlignment(Pos.BOTTOM_RIGHT);
                  rightHBox.setPadding(new Insets(0,0,10,0));
                  HBox.setHgrow(rightHBox, Priority.ALWAYS);

                  //Se inicializa  Boton Ficha registro con Imagen
                  ficharegistro.setFitHeight(40);
                  ficharegistro.setFitWidth(40);
                  rightHBox.getChildren().add(ficharegistroButton);

                  //Se inicializa boton con iamgen de ingreso de tarjeta
                  ingtarjeta.setFitHeight(40);
                  ingtarjeta.setFitWidth(40);
                  rightHBox.getChildren().add(ingtarjetaButton);

                  //Se inicializa boton con imagen de CMR
                  falabella.setFitHeight(40);
                  falabella.setFitWidth(40);
                  rightHBox.getChildren().add(falabellaButton);

                  //Se inicializa boton con imagen de consulta de tarjeta
                  consultatarjeta.setFitHeight(40);
                  consultatarjeta.setFitWidth(40);
                  rightHBox.getChildren().add(consultatarjetaButton);

              }
              botonesHBox.getChildren().add(rightHBox);
          }

          //Se crea panel Footer
          final HBox FooterHBox = new HBox();
          {
              //Se inicializa FooterHBox
              FooterHBox.setPadding(new Insets(3,5,3,5));
              FooterHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");
              HBox.setHgrow(FooterHBox, Priority.ALWAYS);

              //Se crea panel footer
              final HBox footerHBox = new HBox();
              {
                  HBox.setHgrow(footerHBox, Priority.ALWAYS);

                  //Se inicializa Sucursalbl
                  Sucursalbl.setPadding(new Insets(2,0,0,0));
                  footerHBox.getChildren().add(Sucursalbl);

                  //Se inicializa SucursalTxt
                  SucursalTxt.setPrefWidth(160);
                  SucursalTxt.setPadding(new Insets(2,0,0,3));
                  SucursalTxt.setStyle("-fx-background-color: #f5f5f5");
                  SucursalTxt.setText(startupParams.getSucursal());
                  HBox.setHgrow(SucursalTxt, Priority.ALWAYS);
                  footerHBox.getChildren().add(SucursalTxt);

                  //Se inicializa Usuariolbl
                  Usuariolbl.setPadding(new Insets(2,0,0,0));
                  footerHBox.getChildren().add(Usuariolbl);

                  //Se inicializa UsuarioTxt
                  UsuarioTxt.setPrefWidth(160);
                  UsuarioTxt.setPadding(new Insets(2,0,0,3));
                  UsuarioTxt.setStyle("-fx-background-color: #f5f5f5");
                  UsuarioTxt.setText(task.getUser().getCode());
                  HBox.setHgrow(UsuarioTxt, Priority.ALWAYS);
                  footerHBox.getChildren().add(UsuarioTxt);

                  //Se inicializa NomEstacionlbl
                  NomEstacionlbl.setPadding(new Insets(2,0,0,0));
                  footerHBox.getChildren().add(NomEstacionlbl);

                  //Se inicializa NomEstacionTxt
                  NomEstacionTxt.setPrefWidth(160);
                  NomEstacionTxt.setPadding(new Insets(2,0,0,3));
                  NomEstacionTxt.setStyle("-fx-background-color: #f5f5f5");
                  NomEstacionTxt.setText(task.getStation().getName());
                  HBox.setHgrow(NomEstacionTxt, Priority.ALWAYS);
                  footerHBox.getChildren().add(NomEstacionTxt);

                  //Se inicializa Bandejalbl
                  Bandejalbl.setPadding(new Insets(2,0,0,0));
                  footerHBox.getChildren().add(Bandejalbl);

                  //Se inicializa BandejaTxt
                  BandejaTxt.setPrefWidth(160);
                  BandejaTxt.setPadding(new Insets(2,0,0,3));
                  BandejaTxt.setStyle("-fx-background-color: #f5f5f5");
                  BandejaTxt.setText(startupParams.getNombreBandeja());
                  HBox.setHgrow(BandejaTxt, Priority.ALWAYS);
                  footerHBox.getChildren().add(BandejaTxt);

                  //Se inicializa EstBandejalbl
                  //EstBandejalbl.setPadding(new Insets(3,0,0,0));
                  //footerHBox.getChildren().add(EstBandejalbl);

                  //Se inicializa EstBandejaTxt
                  //EstBandejaTxt.setPrefWidth(160);
                  //EstBandejaTxt.setStyle("-fx-background-color: #f5f5f5");
                  //HBox.setHgrow(EstBandejaTxt, Priority.ALWAYS);
                  //footerHBox.getChildren().add(EstBandejaTxt);
              }
              FooterHBox.getChildren().add(footerHBox);
          }
          botonesVBox.getChildren().addAll(botonesHBox,FooterHBox);
      }
      setBottom(botonesVBox);

      //Se crea metodo automatico de apertura de plugin
      onLoad_Session_Initialize(task);

      if (bandeja){
          task.terminate(false);
      }
    }


    //Se cre metodo de Inicializacion de sesion
    private void onLoad_Session_Initialize(final DesktopTask task)
    {
        //Se aplican validaciones de parametros de entrada.
        if (startupParams.getIdBandejaPos().equals("")){
            Platform.runLater(() -> onPostConstruct());
        }
        NroDocumentoText.requestFocus();
    }

    /**
     *
     */
    private void onPostConstruct()
    {
//        try {
//            task.terminate(false);
//       } catch (final Throwable thrown) {
//           Dialog.showError(this, thrown);
//       }
    }


    /**
     * @param ValidarValesConORC
     * @return
     * @throws Exception
     */
    private void EscanerProducto(final ActionEvent event)
    {
       try {

           // Preguntamos al usuario si realmente desea procesar
           final DialogAction action = Dialog.showConfirm(this,
               "¿Estas seguro de escanear producto?",
               task.getWindow().getTitle());
           if (action != DialogAction.NO)
           {
             //Inicializamos y mostramos Panel Main de Tipo Producto
             final MainTipoDocumento Tipodoc = new MainTipoDocumento(task);
             task.createTask("tipodocumento",                              //Task plugin
                             "cl.imperial.tipodocumento.MainTipoDocumento",    //Task class
                             "Selección Tipo Documento",                   //Task title
                             Tipodoc,                                      //Task argument
                             e -> onTipoDoc(e));                           // Task handler
           }
        if(ValidarValesConORC())
        {
            Dialog.showMessage(this, "No puede ingresar más productos o vales transitorios ya que hay cargada venta con credito", "Caja");
            NroDocumentoText.setText("");
            NroDocumentoText.requestFocus();
        }
       } catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
              }

    }

    /**
     * @param e
     * @return
     */
    private void onTipoDoc(final ModalEvent event)
    {
        try {
          } catch (final Throwable thrown) {
              Dialog.showError(this, thrown);
          }
    }

    //Se crea metodo para validar vales ORC
    //Si hay vales de ORC, no pueden haber vales de ningun otro tipo
    //Si hay vales de cualquier tipo <> ORC, no pueden haber vales de ORC
    public boolean ValidarValesConORC()
    {
        final Integer contInteger;
        return false;

    }

    /**
     * @return
     */
    public void EnvioBalin()
    {
        // TODO Auto-generated method stub
        ft.stop();
    }

    private static String getImplementationVersion()
    {
        final Package pack = Main.class.getPackage();
        final String version = pack.getImplementationVersion();
        return (version == null) ? "1.1.19601220.093037" : version;
    }

    //--------------------------------------------------------------------------
    //-- Custom Dialog Methods -------------------------------------------------
    //--------------------------------------------------------------------------

    /**
     * Display an exception generated while processing an event.
     *
     * @param node the node displaying the dialog (can be null).
     * @param thrown the exception that was thrown (can be null).
     * @param title the title to be displayed in dialog (can be null).
     */
    public void displayError(final Node node, final Throwable thrown, final String title)
    {
        final String message;
        if (thrown instanceof CajaUnificadaException) {
            final String msg = thrown.getMessage();
            message = msg == null || msg.isEmpty() ? thrown.toString() : msg;
            //logger.log(Level.WARNING, message);
        } else if (thrown != null) {
            final String msg = thrown.getMessage();
            message = msg == null || msg.isEmpty() ? thrown.toString() : msg;
            //logger.log(Level.SEVERE, message, thrown);
        } else {
            message = "Se produjo un error inesperado";
            //logger.log(Level.SEVERE, message, new Exception(message));
        }
        displayMessage(node, message, title);
    }

    /**
     * Displays a modal information dialog showing the supplied message.
     *
     * @param node the node displaying the dialog (can be null).
     * @param message the message of the dialog (can be null).
     * @param title the title to be displayed in dialog (can be null).
     */
    public void displayMessage(final Node node, final String message, String title)
    {
        // Use default title if none provided
        if (title == null || title.isEmpty())
            title = "Sistema de Auto Atención de IMPERIAL";

        // Create and initialize the required dialog
        final Alert dialog = new Alert(AlertType.INFORMATION);
        dialog.initOwner(getDialogOwner(node));
        dialog.setContentText(message);
        dialog.setHeaderText(null);
        dialog.setTitle(title);

        // Load the customized dialog styles file
        final DialogPane dialogPane = dialog.getDialogPane();
        //dialogPane.getStylesheets().add(getMainResource("dialog.css"));

        // Display dialog and wait for close/hide
        dialog.showAndWait();
    }

    /**
     * Displays a modal confirmation dialog showing the supplied question.
     *
     * @param  node the node displaying the dialog (can be null).
     * @param  question the question of the dialog (can be null).
     * @param  title the title to be displayed in dialog (can be null).
     * @return {@code true} if the YES button was clicked.
     */
    public boolean displayConfirmation(final Node node, final String question, String title)
    {
        // Use default title if none provided
        if (title == null || title.isEmpty())
            title = "Sistema de Auto Atención de IMPERIAL";

        // Create and initialize the required dialog
        final Alert dialog = new Alert(AlertType.CONFIRMATION);
        dialog.initOwner(getDialogOwner(node));
        dialog.setContentText(question);
        dialog.setHeaderText(null);
        dialog.setTitle(title);

        // Define YES and NO buttons, and make NO de default
        dialog.getButtonTypes().setAll(ButtonType.YES, ButtonType.NO);
        final Button yesButton = (Button) dialog.getDialogPane().lookupButton(ButtonType.YES);
        yesButton.setDefaultButton(false);
        final Button noButton = (Button) dialog.getDialogPane().lookupButton(ButtonType.NO);
        noButton.setDefaultButton(true);

        // Load the customized dialog styles file
        final DialogPane dialogPane = dialog.getDialogPane();
        //dialogPane.getStylesheets().add(getMainResource("dialog.css"));

        // Display dialog and return TRUE if YES was clicked
        return dialog.showAndWait().get() == ButtonType.YES;
    }

    /**
     * Returns the window of the supplied node or Primary Stage.
     *
     * @param  node the node displaying the dialog (can be null).
     * @return the window of the supplied node or Primary Stage.
     */
    private Window getDialogOwner(final Node node)
    {
        if (node != null) {
            final Scene scene = node.getScene();
            if (scene != null) {
                final Window window = scene.getWindow();
                if (window != null) return window;
            }
        }
        return task.getPrimaryStage();
    }

    /**
     * Displays a modal input dialog showing the supplied question.
     *
     * @param  node the node displaying the dialog (can be null).
     * @param  question the question of the dialog.
     * @param  title the title to be displayed in dialog (can be null).
     * @return the input string or {@code null} if cancelled.
     */
    public String displayInput(final Node node, final String question, String title)
    {
        // Use default title if none provided
        if (question == null || question.isEmpty())
            throw new NullPointerException("question is null");
        if (title == null || title.isEmpty())
            title = "Sistema de Auto Atención de IMPERIAL";

        // Create and initialize the required dialog
        final TextInputDialog dialog = new TextInputDialog();
        dialog.initOwner(getDialogOwner(node));
        dialog.setContentText(null);
        dialog.setHeaderText(question);
        dialog.setTitle(title);

        // Load the customized dialog styles file
        final DialogPane dialogPane = dialog.getDialogPane();
        //dialogPane.getStylesheets().add(getMainResource("dialog.css"));

        // Display dialog and return answer or null
        final Optional<String> result = dialog.showAndWait();
        return result.isPresent() ? result.get() : null;
    }


    /**
     * Called when the state of the task is required.
     */
    private void onTaskStateRequest(final TaskEvent event)
    {
        event.setTaskState(task.getSettings());
    }



}
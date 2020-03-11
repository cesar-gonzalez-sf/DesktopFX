/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.sencillosolicitud;


import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import cl.imperial.sencillosolicitud.ws.BuscabanusutieBcaBandeja;
import cl.imperial.sencillosolicitud.ws.BuscabanusutieBcaResult;
import cl.imperial.sencillosolicitud.ws.BuscaempresaxestacionBcaResult;
import cl.imperial.sencillosolicitud.ws.BuscaempresaxestacionBcaSolicitud;
import cl.imperial.sencillosolicitud.ws.BuscaultimovoucherBcaResult;
import cl.imperial.sencillosolicitud.ws.BuscaultimovoucherBcaVoucher;
import cl.imperial.sencillosolicitud.ws.BuscausuariosvaBcaResult;
import cl.imperial.sencillosolicitud.ws.BuscausuariosvaBcaSolicitud;
import cl.imperial.sencillosolicitud.ws.GrabaenviobanInsResult;
import cl.imperial.sencillosolicitud.ws.MantusuariosearchBcaResult;
import cl.imperial.sencillosolicitud.ws.MantusuariosearchBcaSolicitud;
import cl.imperial.sencillosolicitud.ws.SencilloSolicitudWeb;
import cl.imperial.sencillosolicitud.ws.SencilloSolicitudWebException;
import cl.imperial.sencillosolicitud.ws.SencilloSolicitudWebService;
import cl.imperial.sencillosolicitud.ws.TraedenmonBcaResult;
import cl.imperial.sencillosolicitud.ws.TraedenmonBcaSolicitud;
import cl.imperial.sencillosolicitud.ws.TraesolicitudcjBcaEfectivo;
import cl.imperial.sencillosolicitud.ws.TraesolicitudcjBcaResult;
import cl.imperial.sencillosolicitud.ws.TraesolicitudcjBcaVoucher;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.TaskEvent;
import cl.obcom.desktopfx.jfx.Dialog;
import cl.obcom.desktopfx.jfx.DialogAction;
import cl.obcom.desktopfx.util.Settings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.print.PrinterJob;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

/**
 * @author Cesar Gonzalez
 */
public final class Main extends VBox
{
    private final DesktopTask task;
    private final SencilloSolicitudWeb port;

  //Se crea TextField
    final TextField CajeroText      = new TextField();
    final TextField TesoreroText    = new TextField();
    final TextField BandejaText     = new TextField();
    final TextField BandejaText2    = new TextField();
    final TextField VoucherText     = new TextField();
    final TextField HoraText        = new TextField();
    final TextField MontoText       = new TextField();
    final TextField DineroTxt       = new TextField();
    final TextField SencilloText    = new TextField();
    final TextField FechaText       = new TextField();
    final TextField TiendaText      = new TextField();

    //Se crea Label
    final Label Cajerolbl       = new Label("Cajero(a)");
    final Label Tiendalbl       = new Label("Tienda");
    final Label Tesorerolbl     = new Label("Tesorero(a)");
    final Label Bandejalbl      = new Label("Bandeja Pos");
    final Label Voucherlbl      = new Label("Voucher");
    final Label Horalbl         = new Label("Hora");
    final Label Montolbl        = new Label("Monto Avance");
    final Label Tipolbl         = new Label("Tipo Solicitud");
    final Label DineroTotlbl    = new Label("Total a Cambiar");
    final Label SencilloTotlbl  = new Label("Total Solicitado");
    final Label Fechalbl        = new Label("Fecha");

    //Se crea ComboBox
    final ComboBox TipoComboBox   = new ComboBox<>();

    //Se crea formateador
    DecimalFormat formateador = new DecimalFormat("###,###.##");

    //Se crea Table
    final TableView<SencilloList>TableSencillo;
    final TableView<CambiosList>TableDinero;
    public ObservableList<SencilloList> SencilloList;
    public ObservableList<CambiosList> CambiosList;

  //Se crea Botones
    final Button UltiVaBtn      = new Button("Ultimo Voucher");
    final Button LimpiarBtn     = new Button("Limpiar");
    final Button GrabarBtn      = new Button("Grabar");
    final Button ImprimirBtn    = new Button("Imprimir");
    final Button salirBtn       = new Button("Salir");

    public Main(final DesktopTask task)
        throws Exception
    {
        this.task = task;

        // Inicializamos Properties
        setPadding(new Insets(5, 5, 5, 5));
        setSpacing(3);

        // Creamos Label de Solicitar Sencillo y Avance CMR
        final TitledPane solsenTitled = new TitledPane();
        {
            // Inicializa solsenTitled
            solsenTitled.setText("Solicitar Sencillo y Avance CMR");
            solsenTitled.setStyle("-fx-font-weight: bold;");
            solsenTitled.setCollapsible(false);
            solsenTitled.setExpanded(true);
            VBox.setVgrow(solsenTitled, Priority.ALWAYS);

            //creamos panel Solicitar Sencillo y Avance CMR
            final HBox solicitudHBox = new HBox(10);
            {
                //Inicializamos solicitudHBox

                //Creamos panel sencillo
                final VBox sencilloVBox = new VBox(10);
               {
                   // Inicializa sencilloVBox
                   sencilloVBox.setAlignment(Pos.CENTER_LEFT);
                   HBox.setHgrow(sencilloVBox, Priority.ALWAYS);

                   // Creamos panel de cajero
                   final HBox cajeroHBox = new HBox();
                   {
                       //Se inicializa cajeroHBox
                       Cajerolbl.setPrefWidth(83);
                       Cajerolbl.setStyle("-fx-font-weight: bold");
                       Cajerolbl.setPadding(new Insets(5));
                       cajeroHBox.getChildren().add(Cajerolbl);

                       //Se inicializa CajeroText
                       CajeroText.setMinWidth(230);
                       HBox.setHgrow(CajeroText, Priority.ALWAYS);
                       cajeroHBox.getChildren().add(CajeroText);
                   }
                   sencilloVBox.getChildren().add(cajeroHBox);

                   // Creamos panel de Tienda
                   final HBox tiendaHBox = new HBox();
                   {
                     /// Inicializamos tiendaHBox

                       //Se inicaliza Tiendalbl
                       Tiendalbl.setPrefWidth(83);
                       Tiendalbl.setStyle("-fx-font-weight: bold");
                       Tiendalbl.setPadding(new Insets(5));
                       tiendaHBox.getChildren().add(Tiendalbl);

                       //Se inicializa TiendaText
                       TiendaText.setMinWidth(230);
                       HBox.setHgrow(TiendaText, Priority.ALWAYS);
                       tiendaHBox.getChildren().add(TiendaText);
                   }
                   sencilloVBox.getChildren().add(tiendaHBox);

                   // Creamos panel de Tesoreria
                   final HBox tesoreroHBox = new HBox();
                   {
                     /// Inicializamos tesoreroHBox

                       //Se inicializa Tesorerolbl
                       Tesorerolbl.setPrefWidth(83);
                       Tesorerolbl.setStyle("-fx-font-weight: bold");
                       Tesorerolbl.setPadding(new Insets(5));
                       tesoreroHBox.getChildren().add(Tesorerolbl);

                       //Se inicializa TesoreroText
                       TesoreroText.setMinWidth(230);
                       HBox.setHgrow(TesoreroText, Priority.ALWAYS);
                       tesoreroHBox.getChildren().add(TesoreroText);
                   }
                   sencilloVBox.getChildren().add(tesoreroHBox);

                   //Se Creamos panel de Bandeja
                   final HBox bandejaHBox = new HBox(3);
                   {
                     /// Inicializamos bandejaHBox

                       //Se inicializa Bandejalbl
                       Bandejalbl.setPrefWidth(80);
                       Bandejalbl.setStyle("-fx-font-weight: bold");
                       Bandejalbl.setPadding(new Insets(5));
                       bandejaHBox.getChildren().add(Bandejalbl);

                       //Se inicializa BandejaTxt
                       BandejaText.setPrefWidth(175);
                       HBox.setHgrow(BandejaText, Priority.ALWAYS);
                       bandejaHBox.getChildren().add(BandejaText);

                       //Se inicializa BandejaText2
                       BandejaText2.setMaxWidth(70);
                       bandejaHBox.getChildren().add(BandejaText2);
                   }
                   sencilloVBox.getChildren().add(bandejaHBox);
               }
               solicitudHBox.getChildren().add(sencilloVBox);

               //Creamos panel Avance
               final VBox avanceVBox = new VBox(10);
               {
                   // Inicializa sencilloVBox
                   avanceVBox.setAlignment(Pos.CENTER_LEFT);
                   HBox.setHgrow(avanceVBox, Priority.ALWAYS);

                   // Creamos panel de Voucher
                   final HBox voucherHBox = new HBox();
                   {
                     /// Inicializamos voucherHBox

                       //Se inicializa Voucherlbl
                       Voucherlbl.setPrefWidth(100);
                       Voucherlbl.setStyle("-fx-font-weight: bold");
                       Voucherlbl.setPadding(new Insets(5));
                       voucherHBox.getChildren().add(Voucherlbl);

                       //Se inicializa VoucherTxt
                       VoucherText.setMinWidth(230);
                       HBox.setHgrow(VoucherText, Priority.ALWAYS);
                       voucherHBox.getChildren().add(VoucherText);
                   }
                   avanceVBox.getChildren().add(voucherHBox);

                   // Creamos panel de Hora
                   final HBox horaHBox = new HBox();
                   {
                     /// Inicializamos horaHBox

                       //Se inicializa Horalbl
                       Horalbl.setPrefWidth(100);
                       Horalbl.setStyle("-fx-font-weight: bold");
                       Horalbl.setPadding(new Insets(5));
                       horaHBox.getChildren().add(Horalbl);

                       //Se inicializa horaTxt
                       HoraText.setMinWidth(230);
                       HBox.setHgrow(HoraText, Priority.ALWAYS);
                       horaHBox.getChildren().add(HoraText);
                   }
                   avanceVBox.getChildren().add(horaHBox);

                   // Creamos panel de Monto Avance
                   final HBox montoHBox = new HBox();
                   {
                     /// Inicializamos montoHBox

                       //Se inicializa Montolbl
                       Montolbl.setPrefWidth(100);
                       Montolbl.setStyle("-fx-font-weight: bold");
                       Montolbl.setPadding(new Insets(5));
                       montoHBox.getChildren().add(Montolbl);

                       //Se inicializa MontoTxt
                       MontoText.setMinWidth(230);
                       HBox.setHgrow(MontoText, Priority.ALWAYS);
                       montoHBox.getChildren().add(MontoText);
                   }
                   avanceVBox.getChildren().add(montoHBox);

                   // Creamos panel de Tipo Solicitud
                   final HBox tipoHBox = new HBox();
                   {
                     /// Inicializamos tipoHBox

                       //Se inicializa Tipolbl
                       Tipolbl.setPrefWidth(100);
                       Tipolbl.setStyle("-fx-font-weight: bold");
                       Tipolbl.setPadding(new Insets(5));
                       tipoHBox.getChildren().add(Tipolbl);

                       //Se iniciliza TipoComboBox
                       TipoComboBox.setMinWidth(230);
                       HBox.setHgrow(TipoComboBox, Priority.ALWAYS);
                       tipoHBox.getChildren().add(TipoComboBox);
                   }
                   avanceVBox.getChildren().add(tipoHBox);
               }
               solicitudHBox.getChildren().add(avanceVBox);
            }
            solsenTitled.setContent(solicitudHBox);
        }
        getChildren().add(solsenTitled);

        // Creamos panel de Tablas
        final HBox tablasHBox = new HBox(5);
        {
            // Inicializa tablasHBox
            tablasHBox.setAlignment(Pos.CENTER_LEFT);
            HBox.setHgrow(tablasHBox, Priority.ALWAYS);

            // Se crea panel con titulo Dinero a Cambiar
            final TitledPane dineroTitled = new TitledPane();
            {
                // Inicializamos dineroTitled
                dineroTitled.setText("Dinero a Cambiar");
                dineroTitled.setStyle("-fx-font-weight: bold;");
                dineroTitled.setCollapsible(false);
                dineroTitled.setExpanded(true);
                HBox.setHgrow(dineroTitled, Priority.ALWAYS);

                //Se crea caja verticar de Dinero a Cambiar
                final VBox dineroVBox = new VBox();
                {
                    //Se initialize Dinero a Cambiar
                    TableDinero = new TableView<>();
                   {
                       // Inicializamos tabla empsTable
                       TableDinero.setEditable(true);
                       VBox.setVgrow(TableDinero, Priority.ALWAYS);
                       TableDinero.setMaxHeight(290);
                       TableDinero.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                       TableDinero.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

                       TableDinero.setRowFactory( tv -> {
                           final TableRow<CambiosList> row = new TableRow<>();
                           row.setOnMouseClicked(event -> {
                               if (event.getClickCount() == 1 && (! row.isEmpty()) ) {

                               }
                           });
                           return row ;
                       });

                       // Create and initialize "Denominación" column
                       final TableColumn<CambiosList, String> cDenominacion = new TableColumn<>("Denominación");
                       {
                           cDenominacion.setCellValueFactory(f -> f.getValue().valorProperty());
                           cDenominacion.setVisible(true);
                           cDenominacion.setStyle( "-fx-alignment: CENTER-RIGHT;");
                       }
                       TableDinero.getColumns().add(cDenominacion);

                       // Create and initialize "Cantidad" column
                       final TableColumn<CambiosList, String> cCantidad = new TableColumn<>("Cantidad");
                       {
                           cCantidad.setVisible(true);
                           cCantidad.setStyle( "-fx-alignment: CENTER-RIGHT;");
                           cCantidad.setCellFactory(TextFieldTableCell.forTableColumn());
                           cCantidad.setCellValueFactory(f -> f.getValue().cantidadProperty());
                           cCantidad.setOnEditCommit(event -> {
                               final CambiosList variable = event.getRowValue();
                                   CalculaDenCam(variable,event.getNewValue());
                           });
                       }
                       TableDinero.getColumns().add(cCantidad);

                       // Create and initialize "Valor" column
                       final TableColumn<CambiosList, String> cValor = new TableColumn<>("Valor");
                       {
                           cValor.setCellValueFactory(f -> f.getValue().valorTProperty());
                           cValor.setVisible(true);
                           cValor.setStyle( "-fx-alignment: CENTER-RIGHT;");
                       }
                       TableDinero.getColumns().add(cValor);

                       CambiosList = FXCollections.observableArrayList();
                       TableDinero.setItems(CambiosList);
                   }
                   dineroVBox.getChildren().add(TableDinero);
                }
                dineroTitled.setContent(dineroVBox);

                // Creamos panel de Total a Cambiar
                final HBox TotalCambioHBox = new HBox();
                {
                  /// Inicializamos TotalCambioHBox
                    TotalCambioHBox.setPrefWidth(350);
                    TotalCambioHBox.setPadding(new Insets(5, 0, 0, 120));

                    //Se inicializa DineroTotlbl
                    DineroTotlbl.setPrefWidth(100);
                    DineroTotlbl.setStyle("-fx-font-weight: bold");
                    TotalCambioHBox.getChildren().add(DineroTotlbl);

                    //Se inicializa DineroTxt
                    DineroTxt.setPrefWidth(100);
                    DineroTxt.setEditable(false);
                    TotalCambioHBox.getChildren().add(DineroTxt);
                }
                dineroVBox.getChildren().add(TotalCambioHBox);
            }
            tablasHBox.getChildren().add(dineroTitled);

            // Se crea panel con titulo Sencillo Solicitado
            final TitledPane sencilloTitled = new TitledPane();
            {
                // Inicializamos sencilloTitled
                sencilloTitled.setText("Sencillo Solicitado");
                sencilloTitled.setStyle("-fx-font-weight: bold;");
                sencilloTitled.setCollapsible(false);
                sencilloTitled.setExpanded(true);
                HBox.setHgrow(sencilloTitled, Priority.ALWAYS);

                //Se crea caja Sencillo Solicitado
                final VBox sencilloVBox = new VBox();
                {
                    //Se initialize TableView
                    TableSencillo = new TableView<>();
                   {
                       // Inicializamos tabla  TableSencillo
                       TableSencillo.setEditable(true);
                       VBox.setVgrow(TableSencillo, Priority.ALWAYS);
                       TableSencillo.setMaxHeight(290);
                       TableSencillo.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                       TableSencillo.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

                       TableSencillo.setRowFactory( tv -> {
                           final TableRow<SencilloList> row = new TableRow<>();
                           row.setOnMouseClicked(event -> {
                               if (event.getClickCount() == 1 && (! row.isEmpty()) ) {
                               }
                           });
                           return row ;
                       });

                       // Create and initialize "Denominación" column
                       final TableColumn<SencilloList, String> cDenominacion = new TableColumn<>("Denominación");
                       {
                           cDenominacion.setCellValueFactory(f -> f.getValue().valorProperty());
                           cDenominacion.setVisible(true);
                           cDenominacion.setStyle( "-fx-alignment: CENTER-RIGHT;");
                       }
                       TableSencillo.getColumns().add(cDenominacion);

                       // Create and initialize "Cantidad" column
                       final TableColumn<SencilloList, String>  cCantidad = new TableColumn<>("Cantidad");
                       {
                           cCantidad.setVisible(true);
                           cCantidad.setStyle( "-fx-alignment: CENTER-RIGHT;");
                           cCantidad.setCellFactory(TextFieldTableCell.forTableColumn());
                           cCantidad.setCellValueFactory(f -> f.getValue().cantidadProperty());
                           cCantidad.setOnEditCommit(event -> {
                               final SencilloList variable = event.getRowValue();
                                   CalculaDenSen(variable,event.getNewValue());
                           });
                       }
                       TableSencillo.getColumns().add(cCantidad);

                       // Create and initialize "Valor" column
                       final TableColumn<SencilloList, String>  cValor = new TableColumn<>("Valor");
                       {
                           cValor.setCellValueFactory(f -> f.getValue().valorTProperty());
                           cValor.setVisible(true);
                           cValor.setStyle( "-fx-alignment: CENTER-RIGHT;");
                       }
                       TableSencillo.getColumns().add(cValor);

                       SencilloList = FXCollections.observableArrayList();
                       TableSencillo.setItems(SencilloList);
                   }
                   sencilloVBox.getChildren().add(TableSencillo);


                   // Creamos panel de Total a Cambiar
                   final HBox TotalSencilloHBox = new HBox();
                   {
                     /// Inicializamos TotalCambioHBox
                       TotalSencilloHBox.setPrefWidth(350);
                       TotalSencilloHBox.setPadding(new Insets(5, 0, 0, 120));

                       //Se inicializa Sencillolbl
                       SencilloTotlbl.setPrefWidth(100);
                       SencilloTotlbl.setStyle("-fx-font-weight: bold");
                       TotalSencilloHBox.getChildren().add(SencilloTotlbl);

                       //Se inicializa SencilloText
                       SencilloText.setPrefWidth(100);
                       SencilloText.setEditable(false);
                       TotalSencilloHBox.getChildren().add(SencilloText);
                   }
                   sencilloVBox.getChildren().add(TotalSencilloHBox);
                }
                sencilloTitled.setContent(sencilloVBox);
            }
            tablasHBox.getChildren().add(sencilloTitled);
        }
        getChildren().add(tablasHBox);

        // Creamos panel de Botones
        final HBox botonesHBox = new HBox(10);
        {
            /// Inicializamos botonesHBox
            botonesHBox.setPadding(new Insets(10, 10, 10, 50));
            botonesHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");
            HBox.setHgrow(botonesHBox, Priority.ALWAYS);

            //Se inicializa Boton Ultimo Voucher
            UltiVaBtn.setPrefSize(100, 30);
            UltiVaBtn.setOnAction(e -> onUltimoVoucher());
            botonesHBox.getChildren().add(UltiVaBtn);

            //Se inicializa Fechalbl
            Fechalbl.setPrefWidth(50);
            Fechalbl.setStyle("-fx-font-weight: bold");
            Fechalbl.setPadding(new Insets(5));
            botonesHBox.getChildren().add(Fechalbl);

            //Se inicializa FechaText
            FechaText.setPrefSize(80, 30);
            botonesHBox.getChildren().add(FechaText);

            //Se inicializa Boton Limpiar
            LimpiarBtn.setPrefSize(80, 30);
            LimpiarBtn.setOnAction(e -> onClearAll());
            botonesHBox.getChildren().add(LimpiarBtn);

            //Se inicializa Boton Guardar
            GrabarBtn.setPrefSize(80, 30);
            GrabarBtn.setOnAction(e -> {
                try {
                    onGrabarClick();
                } catch (final SencilloSolicitudWebException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            });
            botonesHBox.getChildren().add(GrabarBtn);

            //Se inicializa Boton Imprimir
            ImprimirBtn.setPrefSize(80, 30);
            ImprimirBtn.setOnAction(e -> Proc_Imprimir_Grilla());
            botonesHBox.getChildren().add(ImprimirBtn);

            //Se inicializa Boton Salir
            salirBtn.setOnAction(e -> task.terminate(false));
            salirBtn.setCancelButton(true);
            salirBtn.setPrefSize(80, 30);
            botonesHBox.getChildren().add(salirBtn);

        }
        getChildren().add(botonesHBox);

        //create and initialize WebService Port and task Request
        final SencilloSolicitudWebService service = new SencilloSolicitudWebService();
        port = service.getSencilloSolicitudWebPort();
        //task.initWebServicePort(port);
        task.initWebServicePort(port, service, task.getCodeBase());
        task.addEventHandler(TaskEvent.TASK_STATE_REQUEST, e -> onTaskStateRequest(e));

        //Se crea metodo automatico de apertura de plugin
        onLoad_Session_Initialize(task);
    }


    /**
    * @param e
    * @return
    */
   /**
    * Called when the state of the task is required.
    */
   private void onTaskStateRequest(final TaskEvent event)
   {
       event.setTaskState(task.getSettings());
   }

   public final String cTEnvioSencillo = "SS";
   public final String dTEnvioSencillo = "Solicitud Sencillo";
   public final String cTEnvioAvanceCMR = "SA";
   public final String dTEnvioAvanceCMR = "Solicitud Avance CMR";
   public String hostnameOri;
   public String pUsuNom = "";
   public String cod_emp = "";
   public String NombreTeso = "";
   String MyTipoGen = "";
   String MyMontoSol = "";
   String UsuCodigoTeso = "";
   String Id_bandeja;


       //Se cre metodo de Inicializacion de sesion
       private void onLoad_Session_Initialize(final DesktopTask task2) throws SencilloSolicitudWebException, UnknownHostException
       {
           hostnameOri = InetAddress.getLocalHost().toString();

           final String[] parts = hostnameOri.split("/");
           hostnameOri = parts[0];

           //Se Busca empresa por estacion
           final BuscaempresaxestacionBcaResult resultBcaEmp = port.buscaempresaxestacionBca(hostnameOri);
               if(resultBcaEmp.getSolicitudes().isEmpty())
               {
                   Dialog.showMessage(this, "Estacion No esta Configurada dentro del Sistema");
                   task.terminate(false);
                   return;
               } else {
                  for (final BuscaempresaxestacionBcaSolicitud estacion : resultBcaEmp.getSolicitudes())
                  {
                      TiendaText.setText(estacion.getRazonsocialSii());
                      cod_emp = estacion.getCodEmp();
                  }
               }

            //Se Busca Tesorero
            final BuscausuariosvaBcaResult resultBcaTes = port.buscausuariosvaBca(cod_emp, "PARTES10");
                   if(resultBcaTes.getSolicitudes().isEmpty())
                   {
                       Dialog.showMessage(this, "Tienda no tiene configurado Tesorero(a)");
                       task.terminate(false);
                   } else {
                       for(final BuscausuariosvaBcaSolicitud tesorero : resultBcaTes.getSolicitudes())
                       {
                           UsuCodigoTeso = tesorero.getUsuCodigo();
                       }
                   }

                   //Obtenemos el nombre del tesorero
                   NombreTeso = UsuarioDatos(UsuCodigoTeso);
                   TesoreroText.setText(NombreTeso);

                   onClearAll();

                   //Obtenemos el nombre del cajero
                   pUsuNom = UsuarioDatos(task.getUser().getCode().toString());
                   CajeroText.setText(pUsuNom);

                   //PROC_TRAE_DENMON();

                   final Settings myProps = task.getSettings();

                   MyTipoGen = myProps.getString("Tipo", "");
                   MyMontoSol = myProps.getString("Monto", "0");

                   if (MyTipoGen.equals("AUT"))
                   {
                       MontoText.setText(formateador.format(MyMontoSol));
                       CajeroText.setDisable(true);
                       TiendaText.setDisable(true);
                       TesoreroText.setDisable(true);
                       BandejaText.setDisable(true);
                       BandejaText2.setDisable(true);
                       VoucherText.setDisable(true);
                       HoraText.setDisable(true);
                       MontoText.setDisable(true);
                       TipoComboBox.setDisable(true);
                       TableSencillo.requestFocus();
                       return;
                   }
                   TipoComboBox.setDisable(true);

                   //Se busca bandeja
                   String Estado;
                   final BuscabanusutieBcaResult resultBcaBan = port.buscabanusutieBca(cod_emp, task.getUser().getCode().toString());
                   if(resultBcaBan.getBandejas().isEmpty())
                   {
                       Dialog.showMessage(this, "Cajero No Tiene Bandeja Asignada en la Tienda");
                       return;
                   } else {
                       for(final BuscabanusutieBcaBandeja bandeja : resultBcaBan.getBandejas())
                       {
                           BandejaText.setText(bandeja.getIdentificador() + " - " + bandeja.getDescripcion());
                           Id_bandeja = bandeja.getIdBandejapos();
                           BandejaText2.setText(bandeja.getDesestado());
                           Estado = bandeja.getEstado();
                           if (Estado != "A")
                           {
                               Dialog.showMessage(this, "Bandeja del Cajero se encuentra en Uso");
                               return;
                           } else {
                               Dialog.showMessage(this, "Cajero No Tiene Bandeja Asignada en la Tienda");
                               return;
                           }
                       }
                   }
        }

       //Se crea metodo para obtener datos de usuario
       String UsuarioDatos(final String CodUsu) throws SencilloSolicitudWebException
       {
           String NomUsu = "";
           final MantusuariosearchBcaResult resulBcaUsu = port.mantusuariosearchBca("",CodUsu);
           if(resulBcaUsu.getSolicitudes().isEmpty())
           {
               Dialog.showMessage(this, "Problema con informacion del usuario");
               task.terminate(false);
               return NomUsu;
           } else {
               for(final MantusuariosearchBcaSolicitud usuario : resulBcaUsu.getSolicitudes())
               {
                   NomUsu = usuario.getUsuario().trim();
               }
           }
           return NomUsu;
       }


       //Se crea metodo de Limpiar campos
       private void onClearAll()
       {
           //Se desabilita Table,Label,Button
           TableSencillo.setDisable(false);
           TableDinero.setDisable(false);
           GrabarBtn.setDisable(false);

           //Se habilitan Table,Label,Button
           ImprimirBtn.setDisable(true);

           //Se procede a limpiar ambas listas
           CambiosList.clear();
           SencilloList.clear();
           PROC_TRAE_DENMON();

           //Se dejan en blanco los Text
           SencilloText.setText("0");
           DineroTxt.setText("0");
           HoraText.setText("");
           MontoText.setText("0");
           VoucherText.setText("");

           //Se agrega foco a la tabla
           TableDinero.requestFocus();

           //Selimpiar combo
           TipoComboBox.getItems().clear();

           //Se le agrega valores al combo
           final ObservableList<String> options = FXCollections.observableArrayList(dTEnvioSencillo, dTEnvioAvanceCMR);
           TipoComboBox.getItems().addAll(options);


       }

       //Se crea metodo de denominacion
       private void PROC_TRAE_DENMON()
       {
           try {

               CambiosList.clear();
               SencilloList.clear();
               final TraedenmonBcaResult result = port.traedenmonBca("1");
               //DenominacionList.clear();
               if (result.getSolicitudes().isEmpty())
               {
                   Dialog.showMessage(this, "No se han encontrado resultados.");
               } else {
                   for (final TraedenmonBcaSolicitud denominacion : result.getSolicitudes())
                   {
                       final CambiosList Cam = new CambiosList();
                       Cam.setcodigo(denominacion.getCodigo());
                       Cam.setvalor(formateador.format(Integer.parseInt(denominacion.getValor())));
                       Cam.setcantidad(formateador.format(Integer.parseInt("0")));
                       Cam.setvalorT(formateador.format(Integer.parseInt("0")));
                       CambiosList.add(Cam);

                       final SencilloList Sen = new SencilloList();
                       Sen.setcodigo(denominacion.getCodigo());
                       Sen.setvalor(formateador.format(Integer.parseInt(denominacion.getValor())));
                       Sen.setcantidad(formateador.format(Integer.parseInt("0")));
                       Sen.setvalorT(formateador.format(Integer.parseInt("0")));
                       SencilloList.add(Sen);
                   }
           }
           }catch (final Throwable thrown) {
               Dialog.showError(this, thrown);
           }
       }

       /**
        * @return
        */
       private void onUltimoVoucher()
       {
           try {
               if (Integer.parseInt(DineroTxt.getText().replace(".", "")) > 0 || Integer.parseInt(SencilloText.getText().replace(".", "")) > 0)
               {
                   final DialogAction action = Dialog.showConfirm(this,
                       "Existen valores en pantalla, estos se limpiaran, ¿Seguro(a) de continuar?",
                       task.getWindow().getTitle());
                   if (action != DialogAction.NO)
                   {
                       onClearAll();
                       procesaUltVoucher();
                   } else {
                       return;
                   }
               } else {
                   onClearAll();
                   procesaUltVoucher();
               }
           }catch (final Throwable thrown) {
               Dialog.showError(this, thrown);
           }
       }

    /**
     *
     */
    private void procesaUltVoucher()
    {
         Integer numeroVoucher = 0;

        try {
            final BuscaultimovoucherBcaResult resultUltV = port.buscaultimovoucherBca("SencilloCJ", cod_emp, "PMEREJON"); //"SencilloCJ", cod_emp, task.getUser().getCode().toString();
            if (resultUltV.getVouchers().isEmpty())
            {
                Dialog.showMessage(this, "No encuentra ultimo voucher generado");
                return;
            } else {
                for (final BuscaultimovoucherBcaVoucher voucher : resultUltV.getVouchers())
                {
                    numeroVoucher = Integer.parseInt(voucher.getNroInterno());
                }
            }

            final TraesolicitudcjBcaResult resultSoli = port.traesolicitudcjBca(numeroVoucher); //cambiar a NumVoucher
            if (resultSoli.getVouchers().isEmpty())
            {
                Dialog.showMessage(this, "Voucher no existe");
                return;
            } else {
                for (final TraesolicitudcjBcaVoucher voucher2 : resultSoli.getVouchers())
                {
                    VoucherText.setText(voucher2.getNroInterno().trim().toString() );
                    HoraText.setText(voucher2.getFecha().trim().toString());
                }

                Integer valorT = 0;
                Integer totalefec = 0;

                Integer valorTSencillo = 0;
                Integer efectivoTSencillo = 0;

                for (final TraesolicitudcjBcaEfectivo efectivos : resultSoli.getEfectivos())
                {
                    if (efectivos.getTipoTransaccion().equals("SencilloCJ"))
                    {
                        for (final CambiosList Den : CambiosList)
                        {
                             if (Den.getcodigo().equals(efectivos.getCodigoDen()))
                             {
                                 Den.setcantidad(efectivos.getCantidadDen());
                                 valorT = Integer.parseInt(Den.getvalor().replace(".", "")) * Integer.parseInt(efectivos.getCantidadDen());
                                 Den.setvalorT(formateador.format(valorT));
                             }
                        }
                    }

                    if (efectivos.getTipoTransaccion().equals("DetSencilloCJ"))
                    {
                        for (final SencilloList Den2 : SencilloList)
                        {
                             if (Den2.getcodigo().equals(efectivos.getCodigoDen()))
                             {
                                 Den2.setcantidad(efectivos.getCantidadDen());
                                 valorTSencillo = Integer.parseInt(Den2.getvalor().replace(".", "")) * Integer.parseInt(efectivos.getCantidadDen());
                                 Den2.setvalorT(formateador.format(valorTSencillo));
                             }
                        }
                    }
                }

                for (final CambiosList Deno : CambiosList)
                {
                    totalefec = totalefec + Integer.parseInt(Deno.getvalorT().replace(".", ""));
                }
                DineroTxt.setText(formateador.format(totalefec));

                for (final SencilloList Deno2 : SencilloList)
                {
                    efectivoTSencillo = efectivoTSencillo + Integer.parseInt(Deno2.getvalorT().replace(".", ""));
                }
                SencilloText.setText(formateador.format(efectivoTSencillo));
            }

            //Se desabilita Table,Label,Button
            GrabarBtn.setDisable(true);
            ImprimirBtn.setDisable(false);
            TableDinero.setEditable(false);
            TableSencillo.setEditable(false);

        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
    }


    /**
     * @return
     * @throws SencilloSolicitudWebException
     */
    @SuppressWarnings("unlikely-arg-type")
    private void onGrabarClick() throws SencilloSolicitudWebException
    {
        final Integer Nro_interno = 0;
        double efectivoCambio = 0;
        final double efectivoSencillo = 0;

        efectivoCambio = Integer.parseInt(DineroTxt.getText().replace(".", ""));

        if (MyTipoGen.equals("AUT"))
        {
            if (Integer.parseInt(MontoText.getText().replace(".", "")) < Integer.parseInt(SencilloText.getText().replace(".", "")))
            {
                Dialog.showMessage(this, "El monto de la solicitud no puede superar el valor del avance \n" + "Por favor corregir monto solicitud");
                return;
            }
        }

        if (UsuCodigoTeso.equals(""))
        {
            Dialog.showMessage(this, "Tienda sin tesorero por favor asignar");
            return;
        }

        if (TipoComboBox.equals(cTEnvioSencillo))
        {
            if (Integer.parseInt(DineroTxt.getText().replace(".", "")) != Integer.parseInt(SencilloText.getText().replace(".", "")))
            {
                Dialog.showMessage(this, "Cambio indicado no es igual sencillo solicitado");
                return;
            }

            if (Integer.parseInt(DineroTxt.getText().replace(".", "")) == 0 || Integer.parseInt(SencilloText.getText().replace(".", "")) == 0)
            {
                Dialog.showMessage(this, "Dede ingresar valores a sencillar");
                return;
            }
        }

        if (BandejaText.equals(" "))
        {
            Dialog.showMessage(this, "Cajero debe tener bandeja asignada");
            return;
        }

        if (!BandejaText2.equals("U"))
        {
            Dialog.showMessage(this, "Bandeja de cajero no esta en Uso");
            return;
        }

        // Preguntamos al usuario si desea grabar
        final DialogAction action = Dialog.showConfirm(this,
            "¿Seguro de grabar de solicitud sencillo?",
            task.getWindow().getTitle());
        if (action != DialogAction.NO)
        {
            final GrabaenviobanInsResult grabaenvio = port.grabaenviobanIns(
                  "SencilloCJ"
                , BigDecimal.valueOf(efectivoCambio)
                , BigDecimal.valueOf(0)
                , cod_emp
                , xmlDetalle()
                , ""
                , xmlSencillo()
                , task.getUser().getCode().toString()
                , hostnameOri
                , ""
                , "N"
                , TipoComboBox.getSelectionModel().getSelectedItem().toString()
                , Id_bandeja);
        }
    }

    /**
     * @return
     */
    private String xmlDetalle()
    {
        final StringBuilder vEfectXML = new StringBuilder();
        vEfectXML.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
        vEfectXML.append("<Datos>");
            for (  final CambiosList den : CambiosList )
            {
                vEfectXML.append("<Detalle>");
                vEfectXML.append("<Codigo>"+ den.getcodigo().toString() +"</Codigo>");
                vEfectXML.append("<Cantidad>"+ den.getcantidad().toString() +"</Cantidad>");
                vEfectXML.append("</Detalle>");
            }
        vEfectXML.append("</Datos>");
        return vEfectXML.toString();
    }

    /**
     * @return
     */
    private String xmlSencillo()
    {
        final StringBuilder vEfectXML = new StringBuilder();
        vEfectXML.append("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>");
        vEfectXML.append("<Datos>");
            for (  final SencilloList den : SencilloList )
            {
                vEfectXML.append("<Detalle>");
                vEfectXML.append("<Codigo>"+ den.getcodigo().toString() +"</Codigo>");
                vEfectXML.append("<Cantidad>"+ den.getcantidad().toString() +"</Cantidad>");
                vEfectXML.append("</Detalle>");
            }
        vEfectXML.append("</Datos>");
        return vEfectXML.toString();
    }


    private void CalculaDenCam(final CambiosList rowData, final String NuevoValCan)
    {
        rowData.setcantidad(NuevoValCan);
        if (!rowData.getcantidad().matches("[0-9]*"))
            {
                rowData.setcantidad("0");
                return;
            }

        Integer monto;
        Integer totalefe = 0;
        monto = Integer.parseInt(rowData.getvalor().replace(".", "")) * Integer.parseInt(rowData.getcantidad().replace(".", ""));
        rowData.setvalorT(formateador.format(monto));
        for (final CambiosList deno : CambiosList )
        {
            totalefe = totalefe + Integer.parseInt(deno.getvalorT().replace(".", ""));
        }
        DineroTxt.setText(formateador.format(totalefe));
    }

    private void CalculaDenSen(final SencilloList rowData, final String NuevoValCan)
    {
        rowData.setcantidad(NuevoValCan);
        if (!rowData.getcantidad().matches("[0-9]*"))
            {
                rowData.setcantidad("0");
                return;
            }

        Integer monto;
        Integer totalefe = 0;
        monto = Integer.parseInt(rowData.getvalor().replace(".", "")) * Integer.parseInt(rowData.getcantidad().replace(".", ""));
        rowData.setvalorT(formateador.format(monto));
        for (final SencilloList deno : SencilloList )
        {
            totalefe = totalefe + Integer.parseInt(deno.getvalorT().replace(".", ""));
        }
        SencilloText.setText(formateador.format(totalefe));
    }

    private void Proc_Imprimir_Grilla()
    {

        //final String cImpresora;
        //final String MyImpresora;
        //final Boolean lImpresora;
        final String cNroImp;
        final String cTipoEnvio;

        cNroImp = String.format("%010d", Integer.parseInt(VoucherText.getText().trim()));


        //Imprimir.main(null);

        //deben ir las sentencias para elegir la impresora, por ahora imprime por la predeterminada

        try
        {
            final VBox PnodoCompleto = new VBox();
            {

                final Text FechaHora = new Text();
                FechaHora.setFont(new Font(10));
                FechaHora.setWrappingWidth(200);
                //t.setTextAlignment(TextAlignment.JUSTIFY);
                FechaHora.setText(HoraText.getText().replace("/", "-")+"\n");

                final Text TES = new Text();
                TES.setFont(new Font(20));
                TES.setWrappingWidth(250);
                TES.setTextAlignment(TextAlignment.CENTER);
                TES.setText("TES" + cNroImp + "");

                final Text TipEnv = new Text();
                TipEnv.setFont(new Font(10));
                TipEnv.setWrappingWidth(250);
                TipEnv.setTextAlignment(TextAlignment.CENTER);
                TipEnv.setText("* " + "Solicitud Sencillo" + " *\n");

                final Text TESN = new Text();
                TESN.setFont(new Font(15));
                TESN.setWrappingWidth(250);
                TESN.setTextAlignment(TextAlignment.CENTER);
                TESN.setText("TES-" + cNroImp + "\n");
                TESN.setStyle("-fx-font-weight: Bold");

                final HBox BoxTienda = new HBox();
                {
                    final Text Tienda = new Text();
                    Tienda.setFont(new Font(10));
                    Tienda.setWrappingWidth(75);
                    Tienda.setText("Tienda");
                    Tienda.setStyle("-fx-font-weight: Bold");

                    final Text TiendaResul = new Text();
                    TiendaResul.setFont(new Font(10));
                    TiendaResul.setWrappingWidth(500);
                    TiendaResul.setText(cod_emp);
                    TiendaResul.setStyle("-fx-font-weight:");

                    BoxTienda.getChildren().addAll(Tienda, TiendaResul);
                }

                final HBox BoxCajero = new HBox();
                {

                    final Text Cajero = new Text();
                    Cajero.setFont(new Font(10));
                    Cajero.setWrappingWidth(75);
                    Cajero.setText("Cajero(a)");
                    Cajero.setStyle("-fx-font-weight: Bold");

                    final Text CajeroResult = new Text();
                    CajeroResult.setFont(new Font(10));
                    CajeroResult.setWrappingWidth(500);
                    CajeroResult.setText(pUsuNom);
                    CajeroResult.setStyle("-fx-font-weight:");

                    BoxCajero.getChildren().addAll(Cajero, CajeroResult);

                }

                final HBox BoxTesorero = new HBox();
                {
                    final Text Tesorero = new Text();
                    Tesorero.setFont(new Font(10));
                    Tesorero.setWrappingWidth(75);
                    Tesorero.setText("Tesorero(a)");
                    Tesorero.setStyle("-fx-font-weight: Bold");

                    final Text TesoreroResul = new Text();
                    TesoreroResul.setFont(new Font(10));
                    TesoreroResul.setWrappingWidth(500);
                    TesoreroResul.setText(NombreTeso);
                    TesoreroResul.setStyle("-fx-font-weight:");

                    BoxTesorero.getChildren().addAll(Tesorero, TesoreroResul);
                }

                final HBox BoxCaja = new HBox();
                {

                    final Text Caja = new Text();
                    Caja.setFont(new Font(10));
                    Caja.setWrappingWidth(75);
                    Caja.setText("Caja");
                    Caja.setStyle("-fx-font-weight: Bold");

                    final Text CajaResult = new Text();
                    CajaResult.setFont(new Font(10));
                    CajaResult.setWrappingWidth(500);
                    CajaResult.setText(hostnameOri);
                    CajaResult.setStyle("-fx-font-weight:");

                    BoxCaja.getChildren().addAll(Caja, CajaResult);

                }

                PnodoCompleto.getChildren().addAll(FechaHora, TES, TipEnv, TESN, BoxTienda, BoxCajero, BoxTesorero, BoxCaja);

            }


            final PrinterJob job = PrinterJob.createPrinterJob();
            if (job != null) {
               final boolean success = job.printPage(PnodoCompleto);
               if (success) {
                   job.endJob();
               }
            }

        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
    }

}


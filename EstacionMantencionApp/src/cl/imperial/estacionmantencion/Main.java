/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.estacionmantencion;

import java.awt.event.ActionEvent;
import java.net.InetAddress;
import java.util.List;
import cl.imperial.estacionmantencion.ws.BuscaempBcaEstacion;
import cl.imperial.estacionmantencion.ws.BuscaempBcaResult;
import cl.imperial.estacionmantencion.ws.BuscaestBcaEstacion;
import cl.imperial.estacionmantencion.ws.BuscaestBcaResult;
import cl.imperial.estacionmantencion.ws.EliminaestEliResult;
import cl.imperial.estacionmantencion.ws.EstacionMantencionWeb;
import cl.imperial.estacionmantencion.ws.EstacionMantencionWebService;
import cl.imperial.estacionmantencion.ws.IngresaestInsRegistro;
import cl.imperial.estacionmantencion.ws.IngresaestInsResult;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.TaskEvent;
import cl.obcom.desktopfx.jfx.Dialog;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author Cesar Gonzalez
 */
public final class Main extends VBox
{


    private final EstacionMantencionWeb port;
    private final DesktopTask task;
    private final TableView<EstacionesList>Table;
    public ObservableList<EstacionesList>EstacionesList;

    Label lblLabel = new Label();
    Label lblLabelB = new Label();

    public TextField EstacionTxt                = new TextField();
    public TextField NombEstacionTxt            = new TextField();
    public TextField SucursalTxtRandom          = new TextField();
    public TextField tipo_estacionTxt           = new TextField();
    public TextField EstacionRandomTxt          = new TextField();
    public TextField DescripcionTxt             = new TextField();

    final  ComboBox<EmpresasList.empresa> EmpresaComboBox   = new ComboBox<>();

    public Button    BuscarBtn              = new Button("Buscar");
    public Button    EstacionBtn            = new Button("Estación");
    public Button    eliminarBtn            = new Button("Eliminar");
    public Button    grabarBtn              = new Button(" Grabar ");
    public Button    salirBtn               = new Button(" Salir ");

    public Main(final DesktopTask task)
        throws Exception
    {

        this.task = task;

        // Inicializamos Properties
        setPadding(new Insets(10, 10, 10, 10));
        setPrefHeight(600);
        setPrefWidth(600);
        setSpacing(8);

        //creamos panel principal Busqueda de Estación
        final HBox busquedaHBox = new HBox();
        {
            /// Inicializamos busquedaHBox
            busquedaHBox.setPrefHeight(100);
            busquedaHBox.setPrefWidth(600);
            busquedaHBox.setPadding(new Insets(5, 10, 10, 10));
            busquedaHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");

            // Creamos panel nomestacionVBox
            final VBox nomestacionVBox = new VBox();
            {
                // Iniciamos nomestacionVBox
                nomestacionVBox.setSpacing(10);
                nomestacionVBox.setPrefHeight(100);
                nomestacionVBox.setPrefWidth(400);
                nomestacionVBox.setPadding(new Insets(0, 0, 0, 0));

                // Iniciamos lblLabelB
                lblLabelB = new Label("Búsqueda");
                lblLabelB.setStyle("-fx-font-weight: bold");

            // Creamos panel EstacionBuscarHBox
            final HBox EstacionBuscarHBox = new HBox();
            {
                /// Inicializamos EstacionBuscarHBox
                EstacionBuscarHBox.setSpacing(0);
                EstacionBuscarHBox.setPrefSize(600, 100);
                EstacionBuscarHBox.setPadding(new Insets(0, 0, 0, 20));

                // Iniciamos lblLabel
                lblLabel = new Label("Estación");
                lblLabel.setPrefWidth(80);
                lblLabel.setStyle("-fx-font-weight: bold");

                // Iniciamos lblLabel
                EstacionTxt.setPrefWidth(300);

                EstacionBuscarHBox.getChildren().addAll(lblLabel, EstacionTxt);
            }

            nomestacionVBox.getChildren().addAll(lblLabelB, EstacionBuscarHBox);
            }

            // Creamos panel botonesVBox
            final VBox botonesVBox = new VBox();
            {
                // Iniciamos Label de Estación
                botonesVBox.setSpacing(10);
                botonesVBox.setPrefHeight(100);
                botonesVBox.setPrefWidth(200);
                botonesVBox.setPadding(new Insets(10, 0, 0, 20));

                // Iniciamos BuscarBtn
                BuscarBtn.setPrefSize(60, 30);
                BuscarBtn.setOnAction(e -> buscarEstButtonSearch());

                // Iniciamos EstacionBtn
                EstacionBtn.setPrefSize(60, 30);
                EstacionBtn.setOnAction(e -> EstacionButtonSearch());

            botonesVBox.getChildren().addAll(BuscarBtn,EstacionBtn);
            }
            botonesVBox.getChildren();

            busquedaHBox.getChildren().addAll(nomestacionVBox, botonesVBox);

        }
        getChildren().addAll(busquedaHBox);

        //create and initialize estacionesTable
         Table = new TableView<>();
        {
            // Inicializamos tabla Table
            Table.setEditable(true);
            VBox.setVgrow(Table, Priority.ALWAYS);
            Table.setMaxHeight(200);
            Table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
            Table.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
            Table.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");

            Table.setRowFactory( tv -> {
                final TableRow<EstacionesList> row = new TableRow<>();
                row.setOnMouseClicked(event -> {
                    if (event.getClickCount() == 1 && (! row.isEmpty()) ) {
                        final EstacionesList rowData = row.getItem();
                        buscarDatEstButtonSearch(rowData);
                        onCargaCbo(EmpresaComboBox);
                        //final String emp = row.getItem().Cod_EmpProperty().toString();
                    }
                });
                return row ;
            });

//            final Callback<TableColumn<EstacionesList, String>, TableCell<EstacionesList, String>> cellFactory
//            = param -> {
//        final TableCell<EstacionesList, String> cell = new TableCell<EstacionesList, String>() {
//
////            final Button btn = new Button("Eliminar");
//
//            @Override
//            public void updateItem(final String item, final boolean empty) {
//                super.updateItem(item, empty);
//                if (empty) {
//                    setGraphic(null);
//                    setText(null);
//                } else {
//                    cell.setOnMouseClicked(event -> {
//                        final EstacionesList p = getTableView().getItems().get(getIndex());
//                        //EstacionesList.remove(p);
//
//                        //aqui hay que hacer un metodo y pasarle el index para fijar el valor de la tienda
//                    });
//                    setGraphic(null);
//                    setText(null);
//                }
//            }
//        };
//        return cell;
//    };

            // Create and initialize "Estacion" column
            final TableColumn<EstacionesList,String> cEstacion = new TableColumn<>("Estación");
            {
                cEstacion.setCellValueFactory(f -> f.getValue().EstacionesProperty());
                cEstacion.setVisible(true);
            }
            Table.getColumns().add(cEstacion);

            // Create and initialize "Empresa" column
            final TableColumn<EstacionesList,String> cEmpresa = new TableColumn<>("Empresa");
            {
                cEmpresa.setCellValueFactory(f -> f.getValue().Cod_EmpProperty());
                cEmpresa.setVisible(true);
            }
            Table.getColumns().add(cEmpresa);

            // Create and initialize "Tipo Estación" column
            final TableColumn<EstacionesList,String> ctipo_estacion = new TableColumn<>("Tipo de Estación");
            {
                ctipo_estacion.setCellValueFactory(f -> f.getValue().TipoEstacionesProperty());
                ctipo_estacion.setVisible(true);
            }
            Table.getColumns().add(ctipo_estacion);

        }
        getChildren().addAll(Table);

        EstacionesList = FXCollections.observableArrayList();
        Table.setItems(EstacionesList);

        //creamos panel Datos de Estación
        final VBox DatosEmpresaComboBoxVBox = new VBox();
        {
            /// Inicializamos DatosEmpresaComboBoxVBox
            DatosEmpresaComboBoxVBox.setSpacing(10);
            DatosEmpresaComboBoxVBox.setPrefHeight(250);
            DatosEmpresaComboBoxVBox.setPrefWidth(300);
            DatosEmpresaComboBoxVBox.setPadding(new Insets(10, 10, 10, 10));
            DatosEmpresaComboBoxVBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-color: Gray;");

            // Creamos Label de Estación
            lblLabel = new Label("Estación");
            lblLabel.setStyle("-fx-font-weight: bold");
            DatosEmpresaComboBoxVBox.getChildren().addAll(lblLabel);

            //creamos panel Datos de EmpresaComboBox
            final VBox DatosEmpresaComboBoxHBox = new VBox();
            {
                /// Inicializamos DatosEmpresaComboBoxHBox
                DatosEmpresaComboBoxHBox.setSpacing(0);

                // Iniciamos lblLabel
                lblLabel = new Label("Nombre de Estación");
                lblLabel.setPrefWidth(200);
                lblLabel.setStyle("-fx-font-weight: bold");
                lblLabel.setPadding(new Insets(0, 0, 0, 8));

                // Iniciamos NombEstacionTxt
                NombEstacionTxt.setPrefWidth(200);

                DatosEmpresaComboBoxHBox.getChildren().addAll(lblLabel, NombEstacionTxt);
            }

            // Creamos panel Datos de Empresa
            final HBox EmpresaComboBoxsucursalHBox = new HBox();
            {
                /// Inicializamos EmpresaComboBoxsucursalHBox
                EmpresaComboBoxsucursalHBox.setPrefWidth(600);
                EmpresaComboBoxsucursalHBox.setSpacing(10);

                //creamos Label y Combo de EmpresaComboBox
                final VBox EmpresaComboBoxVBox = new VBox();
                {
                    /// Inicializamos lblLabel
                    lblLabel = new Label("Empresa");
                    lblLabel.setPrefWidth(300);
                    lblLabel.setStyle("-fx-font-weight: bold");
                    lblLabel.setPadding(new Insets(0, 0, 0, 8));

                    // Iniciamos EmpresaComboBox
                    EmpresaComboBox.setPrefWidth(300);

                    EmpresaComboBoxVBox.getChildren().addAll(lblLabel, EmpresaComboBox);
                }

                // Creamos Label y Txt de Sucursal
                final VBox sucursalVBox = new VBox();
                {
                    /// Inicializamos lblLabel
                    lblLabel = new Label("Sucursal de Random");
                    lblLabel.setPrefWidth(300);
                    lblLabel.setStyle("-fx-font-weight: bold");
                    lblLabel.setPadding(new Insets(0, 0, 0, 8));

                    // Iniciamos SucursalTxtRandom
                    SucursalTxtRandom.setPrefWidth(200);

                    sucursalVBox.getChildren().addAll(lblLabel, SucursalTxtRandom);
                }

                EmpresaComboBoxsucursalHBox.getChildren().addAll(EmpresaComboBoxVBox, sucursalVBox);
            }

            // Creamos panel Datos de Estación
            final HBox EstacionesHBox = new HBox();
            {
                /// Inicializamos EstacionesHBox
                EstacionesHBox.setPrefWidth(600);
                EstacionesHBox.setSpacing(10);

                //Inicializamos tipo_estacionTxtVBox
                final VBox tipo_estacionTxtVBox = new VBox();
                {
                    /// Inicializamos lblLabel
                    lblLabel = new Label("Tipo de estación");
                    lblLabel.setPrefWidth(300);
                    lblLabel.setStyle("-fx-font-weight: bold");
                    lblLabel.setPadding(new Insets(0, 0, 0, 8));

                    //Iniciamos tipo_estacionTxt
                    tipo_estacionTxt.setPrefWidth(300);

                    tipo_estacionTxtVBox.getChildren().addAll(lblLabel, tipo_estacionTxt);
                }

                //Inicializamos EstacionRandomTxtVBox
                final VBox EstacionRandomTxtVBox = new VBox();
                {
                    /// Inicializamos lblLabel
                    lblLabel = new Label("Estación de Random");
                    lblLabel.setPrefWidth(300);
                    lblLabel.setStyle("-fx-font-weight: bold");
                    lblLabel.setPadding(new Insets(0, 0, 0, 8));

                    //Iniciamos EstacionRandomTxt
                    EstacionRandomTxt.setPrefWidth(200);

                    EstacionRandomTxtVBox.getChildren().addAll(lblLabel, EstacionRandomTxt);
                }

                EstacionesHBox.getChildren().addAll(tipo_estacionTxtVBox, EstacionRandomTxtVBox);
            }

            // Creamos panel de Descripción
            final VBox DescripcionHBox = new VBox();
            {
                /// Inicializamos DescripcionHBox
                DescripcionHBox.setSpacing(0);
                DescripcionHBox.setPrefHeight(80);

                // Iniciamos lblLabel
                lblLabel = new Label("Descripción");
                lblLabel.setStyle("-fx-font-weight: bold");
                lblLabel.setPadding(new Insets(0, 0, 0, 8));

                // Iniciamos DescripcionTxt
                DescripcionTxt.setPrefHeight(60);
            }
            DescripcionHBox.getChildren().addAll(lblLabel, DescripcionTxt);


            DatosEmpresaComboBoxVBox.getChildren().addAll(DatosEmpresaComboBoxHBox, EmpresaComboBoxsucursalHBox, EstacionesHBox, DescripcionHBox);
        }
        getChildren().add(DatosEmpresaComboBoxVBox);

        // Creamos panel Datos de Estación
        final HBox BotoneraHBox = new HBox();
        {
            /// Inicializamos BotoneraHBox
            BotoneraHBox.setSpacing(10);
            BotoneraHBox.setPrefHeight(50);
            BotoneraHBox.setPrefWidth(300);
            BotoneraHBox.setPadding(new Insets(6, 0, 0, 160));

            // Iniciamos Boton Eliminar
            eliminarBtn.setPrefSize(80, 30);
            eliminarBtn.setOnAction(e -> onEliminarEst());

            // Iniciamos Boton Guardar
            grabarBtn.setPrefSize(80, 30);
            grabarBtn.setOnAction(e -> onGrabarClick(null));

            //  Iniciamos Boton Salir
            salirBtn.setOnAction(e -> task.terminate(false));
            salirBtn.setCancelButton(true);
            salirBtn.setPrefSize(80, 30);

            BotoneraHBox.getChildren().addAll(eliminarBtn,grabarBtn,salirBtn);
        }
        getChildren().add(BotoneraHBox);

     //create and initialize WebService Port and task Request
        final EstacionMantencionWebService service = new EstacionMantencionWebService();
        port = service.getEstacionMantencionWebPort();
        //task.initWebServicePort(port);
        task.initWebServicePort(port, service, task.getCodeBase());
        task.addEventHandler(TaskEvent.TASK_STATE_REQUEST, e -> onTaskStateRequest(e));
        onCargaCbo(EmpresaComboBox);

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

    /**
     * @author Cesar Gonzalez
     * Funciones de procesos
     */

    /**
     * Se llama cuando se hace click en botón "Buscar".
     *
     * @param event describes the click event.
     */
   private void buscarEstButtonSearch()
    {
       if(EstacionTxt.getText().isEmpty())
       {

       } else {
           try {
               EstacionesList.clear();
                   final BuscaestBcaResult resultestaciones = port.buscaestBca("%"+EstacionTxt.getText()+"%");
                   EstacionesList.clear();
                   if(resultestaciones.getEstaciones().isEmpty())
                   {
                     Dialog.showMessage(this, "Estación no configurada dentro del sistema");
                   } else {
                       for (final BuscaestBcaEstacion estaciones:resultestaciones.getEstaciones())
                       {
                           final EstacionesList estacion = new EstacionesList();
                           estacion.setEstaciones(estaciones.getEstacion());
                           estacion.setCod_Emp(estaciones.getCodEmp());
                           estacion.setTipoEstaciones(estaciones.getTipoestacion());
                           EstacionesList.add(estacion);
                       }
                   }
               }catch (final Throwable thrown) {
                   Dialog.showError(this, thrown);
               }
               return;
       }
    }

   /**
    * Se llama cuando se hace click en botón "Estación".
    *
    * @param event describes the click event.
    */
   private void EstacionButtonSearch()
   {
       String hostnameOri = "";
       try {
           hostnameOri = InetAddress.getLocalHost().toString();

           final String[] parts = hostnameOri.split("/");
           hostnameOri = parts[0];
           final BuscaestBcaResult resultestaciones = port.buscaestBca(hostnameOri);
           EstacionesList.clear();
           if(resultestaciones.getEstaciones().isEmpty())
           {
             Dialog.showMessage(this, "Estación no configurada dentro del sistema");
           } else {
               for (final BuscaestBcaEstacion estaciones:resultestaciones.getEstaciones())
               {
                   final EstacionesList estacion = new EstacionesList();
                   estacion.setEstaciones(estaciones.getEstacion());
                   estacion.setCod_Emp(estaciones.getCodEmp());
                   estacion.setTipoEstaciones(estaciones.getTipoestacion());
                   EstacionesList.add(estacion);
               }
           }
       }catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
       }
       return;
   }

   /**
    * Se llama cuando se hace click en celda de tabla.
    *
    * @param event describes the click event.
    */
   private void buscarDatEstButtonSearch(final EstacionesList rowData)
   {
       try {
               final BuscaestBcaResult resultestaciones = port.buscaestBca(rowData.getEstaciones().toString());
               if (resultestaciones.getEstaciones().isEmpty())
               {
                   Dialog.showMessage(this, "Error en la Consulta");
               }else
                   {
                      for (final BuscaestBcaEstacion estaciones:resultestaciones.getEstaciones())
                      {
                          NombEstacionTxt.clear();
                          NombEstacionTxt.setText(estaciones.getEstacion());
                          EmpresaComboBox.getSelectionModel().clearSelection();
//                          EmpresaComboBox.getSelectionModel().getSelectedItem(cEmp);
                          SucursalTxtRandom.clear();
                          SucursalTxtRandom.setText(estaciones.getSucursalRandom());
                          tipo_estacionTxt.clear();
                          tipo_estacionTxt.setText(estaciones.getTipoestacion());
                          EstacionRandomTxt.clear();
                          EstacionRandomTxt.setText(estaciones.getEstacionRandom());
                          DescripcionTxt.clear();
                          DescripcionTxt.setText(estaciones.getDescripcion());
                          }
                   }
           }catch (final Throwable thrown) {
               Dialog.showError(this, thrown);
           }
       return;
   }

   /**
    * Se llama cuando inicia el Plagin y al precionar el boton Buscar.
    *
    * @param event describes the click event.
    */
   private void onCargaCbo(final ComboBox<EmpresasList.empresa> cbo)
   {
       try {
           final BuscaempBcaResult result = port.buscaempBca();
           final List<BuscaempBcaEstacion> vResult = result.getEstaciones();
           for (final BuscaempBcaEstacion cCombo : vResult) {
               final EmpresasList.empresa p = new EmpresasList.empresa(cCombo.getCodEmp(),cCombo.getNomEmp());
               cbo.getItems().add(p);
           }
           cbo.getSelectionModel().selectFirst();

       } catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
       }
   }

   /**
    * Se llama cuando se hace click en botón "Grabar".
    *
    * @param event describes the click event.
    */
   private void onGrabarClick(final ActionEvent event)
   {
       if (NombEstacionTxt.getText().length() == 0) {
               Dialog.showMessage(this, "Debe Ingresar Nombre de la Estacion.");
               return;
           }

 /*      if (EmpresaComboBox.getSelectionModel() == 0) {
           Dialog.showMessage(this, "Debe Ingresar Descripcion de la Estacion.");
           return;
       }*/

       if (SucursalTxtRandom.getText().length() == 0) {
           Dialog.showMessage(this, "Debe Ingresar Sucursal Random.");
           return;
       }

       if (tipo_estacionTxt.getText().length() == 0) {
           Dialog.showMessage(this, "Debe Ingresar el Tipo de Estacion.");
           return;
       }

       if (EstacionRandomTxt.getText().length() == 0) {
           Dialog.showMessage(this, "Debe Ingresar la Estacion Random.");
           return;
       }

       if (DescripcionTxt.getText().length() == 0) {
           Dialog.showMessage(this, "Debe Ingresar Descripcion de la Estacion.");
           return;
       }

       try {
           final IngresaestInsResult resultingresar = port.ingresaestIns(
               NombEstacionTxt.getText(),
               EmpresaComboBox.getSelectionModel().getSelectedItem().getcod_emp(),
               tipo_estacionTxt.getText(),
               DescripcionTxt.getText(),
               SucursalTxtRandom.getText(),
               EstacionRandomTxt.getText());
           if (resultingresar.getRegistros().isEmpty())
           {
               Dialog.showMessage(this, "Error en la Consulta");
           }else
               {
                  for (final IngresaestInsRegistro ingreso:resultingresar.getRegistros())
                  {
                      final String resultado = ingreso.getIns().trim();
                      if(resultado == "SI") {
                          Dialog.showMessage(this, "Estacion Ingresada Correctamente");
                          onClearAll();
                      } else {
                          Dialog.showMessage(this, "Estacion Modificada Correctamente");
                          onClearAll();
                      }
                  }
               }
       } catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
      }
   }

   /**
    * Se llama cuando se hace click en botón "Eliminar".
    *
    * @param event describes the click event.
    */

   private void onEliminarEst()
   {
       try {
           final EliminaestEliResult resultEli = port.eliminaestEli(NombEstacionTxt.getText().trim());
           if(resultEli.getErrorMessage() == "")
           {
               Dialog.showMessage(this, "Error en la Consulta");
           } else {
               Dialog.showMessage(this, "Estacion Eliminada Correctamente");
               onClearAll();
           }
       } catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
       }
   }

   private void onClearAll()
   {
       EstacionTxt.setText("");
       NombEstacionTxt.setText("");
       SucursalTxtRandom.setText("");
       tipo_estacionTxt.setText("");
       EstacionRandomTxt.setText("");
       DescripcionTxt.setText("");

       EstacionesList.clear();
       onrefreshTabla();

       //EmpresaComboBox.getSelectionModel().select(-1);
   }

   private void onrefreshTabla()
   {
       try {
               final BuscaestBcaResult resultestaciones = port.buscaestBca("%"+EstacionTxt.getText()+"%");
               if(resultestaciones.getEstaciones().isEmpty())
               {

               } else {
                   for (final BuscaestBcaEstacion estaciones:resultestaciones.getEstaciones())
                   {
                       final EstacionesList estacion = new EstacionesList();
                       estacion.setEstaciones(estaciones.getEstacion());
                       estacion.setCod_Emp(estaciones.getCodEmp());
                       estacion.setTipoEstaciones(estaciones.getTipoestacion());
                       EstacionesList.add(estacion);
                   }
               }
           }catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
       }
       return;
   }

}




/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.autorizadorventa;


import cl.imperial.autorizadorventa.ws.AutorizadorVentaWeb;
import cl.imperial.autorizadorventa.ws.AutorizadorVentaWebException;
import cl.imperial.autorizadorventa.ws.AutorizadorVentaWebService;
import cl.imperial.autorizadorventa.ws.BuscaclienterutBcaCliente;
import cl.imperial.autorizadorventa.ws.BuscaclienterutBcaResult;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.TaskEvent;
import cl.obcom.desktopfx.jfx.Dialog;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author ex.sf.cgonzalez
 */
public class Main extends BorderPane
{

    private final DesktopTask task;
    private final AutorizadorVentaWeb port;

    // Se crea Label
    final Label Entidadlbl     = new Label("Entidad");
    final Label Razonsocialbl  = new Label("Razón Social");
    final Label Estadolbl      = new Label("Estado");

    // Se crea TextField
    final TextField EntidadText     = new TextField();
    final TextField NumeroVerifText = new TextField();
    final TextField CodSucursalText = new TextField();
    final TextField RazonSocialText = new TextField();
    final TextField EstadoText      = new TextField();

    // Se cera Botton
    final Button PuntosButton   = new Button("...");
    final Button CancelarButton = new Button("Cancelar");
    final Button AceptarButton  = new Button("Aceptar");


    public Main(final DesktopTask task) throws Exception
    {
        // Save Desktop Task
        this.task = task;

        // Inicializa BorderPane
        setPadding(new Insets(5));

        // Se crea TopVBox
        final VBox TopVBox = new VBox(3);
        {
            // Se crea TitularTitled
            final TitledPane TitularTitled = new TitledPane();
            {
                // Inicializamos ValidacionCATitled
                TitularTitled.setText("Titular");
                TitularTitled.setStyle("-fx-font-weight: bold;");
                TitularTitled.setCollapsible(false);
                TitularTitled.setExpanded(true);

                // Se crea HBox
                final HBox TitularHBox = new HBox(3);
                {
                    //Se inicializa TitularHBox
                    HBox.setHgrow(TitularHBox, Priority.ALWAYS);

                    // Se crea EntidadVBox
                    final VBox EntidadVBox = new VBox();
                    {
                        //Se inicializa EntidadVBox
                        HBox.setHgrow(EntidadVBox, Priority.ALWAYS);

                        // Se inicializa EntidadTitle
                        EntidadVBox.getChildren().add(Entidadlbl);

                        // Se inicializa EntidadText
                        EntidadText.setPrefWidth(80);
                        EntidadText.setAlignment(Pos.CENTER);
                        EntidadText.setOnKeyPressed((keyEvent -> onRutKeyPressed(keyEvent)));
                        EntidadVBox.getChildren().add(EntidadText);

                    }
                    TitularHBox.getChildren().add(EntidadVBox);

                    // Se crea CamposHBox
                    final HBox CamposHBox = new HBox(3);
                    {
                        //Se inicializa EntidadVBox
                        HBox.setHgrow(CamposHBox, Priority.ALWAYS);
                        CamposHBox.setPadding(new Insets(17, 0, 0, 0));

                        // Se inicializa NumeroVerifText
                        NumeroVerifText.setPrefWidth(30);
                        CamposHBox.getChildren().add(NumeroVerifText);

                        // Se inicializa CodSucursalText
                        CodSucursalText.setPrefWidth(40);
                        CodSucursalText.setAlignment(Pos.CENTER);
                        CamposHBox.getChildren().add(CodSucursalText);

                        // Se inicializa PuntosButton
                        CamposHBox.getChildren().add(PuntosButton);
                    }
                    TitularHBox.getChildren().add(CamposHBox);

                    // Se crea RazonsocialVBox
                    final VBox RazonsocialVBox = new VBox();
                    {
                        //Se inicializa RazonsocialVBox
                        HBox.setHgrow(RazonsocialVBox, Priority.ALWAYS);

                        // Se inicializa Razonsocialbl
                        RazonsocialVBox.getChildren().add(Razonsocialbl);

                        // Se inicializa RazonSocialText
                        RazonsocialVBox.getChildren().add(RazonSocialText);

                    }
                    TitularHBox.getChildren().add(RazonsocialVBox);

                    // Se crea EstadoVBox
                    final VBox EstadoVBox = new VBox();
                    {
                        //Se inicializa EntidadVBox
                        HBox.setHgrow(EstadoVBox, Priority.ALWAYS);

                        // Se inicializa Estadolbl
                        EstadoVBox.getChildren().add(Estadolbl);

                        // Se inicializa EstadoText
                        EstadoVBox.getChildren().add(EstadoText);

                    }
                    TitularHBox.getChildren().add(EstadoVBox);

                }
                TitularTitled.setContent(TitularHBox);
            }
            TopVBox.getChildren().add(TitularTitled);

            //Se crea BottonHBox
            final HBox BottonHBox = new HBox();
            {
                // Inicializamos BottonHBox
                BottonHBox.setPadding(new Insets(3,5,3,5));
                BottonHBox.setStyle("-fx-background-color: #f5f5f5;-fx-border-style: solid inside;-fx-border-width: 1;-fx-border-insets: 0;-fx-border-radius: 5;-fx-border-radius: 5;-fx-border-color: Gray;");
                HBox.setHgrow(BottonHBox, Priority.ALWAYS);

                //Se crea leftHBox
                final HBox leftHBox = new HBox(3);
                {
                    //Se inicializa leftHBox
                    leftHBox.setAlignment(Pos.BOTTOM_LEFT);
                    leftHBox.setPadding(new Insets(0, 0, 0, 5));
                    leftHBox.setStyle("-fx-font-weight: bold;");
                    HBox.setHgrow(leftHBox, Priority.ALWAYS);

                    //Se inicializa CancelarButton
                    CancelarButton.setOnAction(e -> task.terminate(false));
                    leftHBox.getChildren().add(CancelarButton);
                }
                BottonHBox.getChildren().add(leftHBox);

                // Se crea rightHBox
                final HBox rightHBox = new HBox(3);
                {
                    //Se inicializa rightHBox
                    rightHBox.setAlignment(Pos.BOTTOM_RIGHT);
                    rightHBox.setPadding(new Insets(0, 5, 0, 0));
                    rightHBox.setStyle("-fx-font-weight: bold;");
                    HBox.setHgrow(rightHBox, Priority.ALWAYS);

                    //Se inicializa AceptarButton
                    rightHBox.getChildren().add(AceptarButton);
                }
                BottonHBox.getChildren().add(rightHBox);
            }
            TopVBox.getChildren().add(BottonHBox);
        }
        setTop(TopVBox);

        //create and initialize WebService Port and task Request
        final AutorizadorVentaWebService service = new AutorizadorVentaWebService();
        port = service.getAutorizadorVentaWebPort();
        task.initWebServicePort(port, service, task.getCodeBase());
        task.addEventHandler(TaskEvent.TASK_STATE_REQUEST, e -> onTaskStateRequest(e));
    }


    /**
     * @param event
     */
    private void onTaskStateRequest(final TaskEvent event)
    {
        event.setTaskState(task.getSettings());
    }


    /**
     * @param keyEvent
     * @return
     */
    private void onRutKeyPressed(final KeyEvent keyEvent)
    {
        try {
            final String codEntidad = "";
            final String codSucursal = "";
            if (keyEvent.getCode() == KeyCode.ENTER) {
                keyEvent.consume();
                buscarPorRut(EntidadText.getText().toString().trim(), codEntidad, codSucursal);
            }
        } catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
    }


    /**
     * @param trim
     * @param codEntidad
     * @param codSucursal
     * @throws AutorizadorVentaWebException
     */
    private void buscarPorRut(final String trim, final String codEntidad, final String codSucursal) throws AutorizadorVentaWebException
    {
        final BuscaclienterutBcaResult resulcliente = port.buscaclienterutBca(EntidadText.getText().toString().trim(), codSucursal, codSucursal);
        if (resulcliente.getClientes().isEmpty())
        {
            Dialog.showMessage(this, "Cliente no corresponde a titular de Vales Transitorios o autorizados para comprar a nombre de este cliente, no se puede efectuar el pago");
        } else {
            for (final BuscaclienterutBcaCliente cliente:resulcliente.getClientes())
            {
                NumeroVerifText.clear();
                NumeroVerifText.setText(cliente.getDvCliente());
                CodSucursalText.clear();
                CodSucursalText.setText(cliente.getCodSucursal());
                RazonSocialText.clear();
                RazonSocialText.setText(cliente.getCliente());
                EstadoText.clear();
                EstadoText.setText(cliente.getEstado());

            }
        }
    }
}

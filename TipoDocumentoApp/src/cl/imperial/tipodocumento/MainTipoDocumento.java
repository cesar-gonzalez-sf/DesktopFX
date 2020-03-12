/*
 * Copyright (c) IMPERIAL S.A. All rights reserved.
 *
 * All  rights  to  this product are owned by IMPERIAL S.A. and may only be used
 * under the terms of its associated license document. You may NOT copy, modify,
 * sublicense,  or  distribute  this  source  file  or  portions  of  it  unless
 * previously  authorized  in writing by IMPERIAL S.A. In any event, this notice
 * and above copyright must always be included verbatim with this file.
 */

package cl.imperial.tipodocumento;

import cl.imperial.escanerproducto.TipoDctoDate;
import cl.imperial.tipodocumento.ws.BuscaclienterutBcaCliente;
import cl.imperial.tipodocumento.ws.BuscaclienterutBcaResult;
import cl.imperial.tipodocumento.ws.TipoDocumentoWeb;
import cl.imperial.tipodocumento.ws.TipoDocumentoWebService;
import cl.obcom.desktopfx.core.DesktopTask;
import cl.obcom.desktopfx.core.TaskEvent;
import cl.obcom.desktopfx.jfx.Dialog;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 * @author Cesar Gonzalez
 */
public class MainTipoDocumento extends BorderPane
{

    private final DesktopTask task;
    private final TipoDocumentoWeb port;
    private final TipoDctoDate tipoDctoDate;

    // Se crea variable de envío
    private String entidad;
    private String rut;

    //Se crea ToggleGroup
    final ToggleGroup boletaFactura = new ToggleGroup();

    //Se crea RadioButton
    final RadioButton boletaRadioButton  = new RadioButton("");
    final RadioButton facturaRadioButton = new RadioButton("");

    //Se crean Label
    final Label Boletalbl       = new Label("Boleta");
    final Label Facturalbl      = new Label("Factura");
    final Label Rutlbl          = new Label("Rut");
    final Label CodEntidadlbl   = new Label("Cod.Entidad");
    final Label Nombrelbl       = new Label("Nombre");
    final Label PagoCMRlbl      = new Label("Pago CMR Falabella");

    //Se crean TextFild
    final TextField RutText             = new TextField();
    final TextField Rut2Text            = new TextField();
    final TextField CodEntidadText      = new TextField();
    final TextField CodEntidad2Text     = new TextField();
    final TextField NombreText          = new TextField();

    //Se crea CheckBox
    final CheckBox checkBoxPagoCMR = new CheckBox("");

    //Se crea Botton
    final Button pagoCMRButton = new Button("Aceptar");


    /**
     * Constructs a new {@code Main} instance.
     *
     * @throws Exception if an unexpected error occurs.
     */
    public MainTipoDocumento(final DesktopTask task)
        throws Exception
    {
        // Inicializamos
        this.tipoDctoDate = new TipoDctoDate();

        // Save Desktop Task
        this.task = task;

        // Inicializa BorderPane
        setPadding(new Insets(5));
        setStyle("-fx-background-color: #f5f5f5");

        //Se crea panel General
        final VBox generalVBox = new VBox();
        {
            // Se crea Panel principalVBox
            final VBox principalVBox = new VBox();
            {
                // Inicializa ingresoTotalVBox
                principalVBox.setAlignment(Pos.CENTER_LEFT);
                HBox.setHgrow(principalVBox, Priority.ALWAYS);
                principalVBox.setStyle("-fx-border-style: solid inside;fx-border-width: 1; -fx-border-insets: 0; -fx-border-radius: 5;-fx-border-color: Gray;");

                //Se crea panel de check
                final HBox CheckBoxHBox = new HBox();
                {
                    // Inicializa CheckBoxHBox
                    CheckBoxHBox.setPadding(new Insets(10, 10, 5, 10));
                    HBox.setHgrow(CheckBoxHBox, Priority.ALWAYS);
                    CheckBoxHBox.setAlignment(Pos.CENTER);

                    //Se iniculiza boletaRadioButton
                    boletaRadioButton.setToggleGroup(boletaFactura);
                    boletaRadioButton.setOnAction(e -> boleta());
                    CheckBoxHBox.getChildren().add(boletaRadioButton);

                    //Se inicializa Boletalbl
                    Boletalbl.setStyle("-fx-font-weight: bold; -fx-font-size: 150%;");
                    Boletalbl.setMaxWidth(Double.MAX_VALUE);
                    CheckBoxHBox.getChildren().add(Boletalbl);

                    facturaRadioButton.setToggleGroup(boletaFactura);
                    facturaRadioButton.setPadding(new Insets(0, 0, 0, 40));
                    facturaRadioButton.setOnAction(e -> factura());
//                    facturaRadioButton.setSelected(true);
                    CheckBoxHBox.getChildren().add(facturaRadioButton);

                    //Se inicializa Facturalbl
                    Facturalbl.setStyle("-fx-font-weight: bold; -fx-font-size: 150%;");
                    Facturalbl.setMaxWidth(Double.MAX_VALUE);
                    CheckBoxHBox.getChildren().add(Facturalbl);
                }
                principalVBox.getChildren().add(CheckBoxHBox);

                //Se crea e inicializa Linea de separación
                final Line line = new Line();
                line.setStartX(0.0f);
                line.setStartY(350f);
                line.setEndX(420.0f);
                line.setEndY(350.0f);
                line.setStroke(Color.GREY);
                HBox.setHgrow(line, Priority.ALWAYS);
                principalVBox.getChildren().add(line);

                //Se crea panel de Rut y Codigo Entidad
                final HBox RutCodHBox = new HBox(3);
                {
                    // Inicializa RutCodHBox
                    RutCodHBox.setPadding(new Insets(10, 10, 3, 10));
                    RutCodHBox.setAlignment(Pos.CENTER_LEFT);
                    HBox.setHgrow(RutCodHBox, Priority.ALWAYS);

                    //Inicializamos Rutlbl
                    Rutlbl.setPrefWidth(62);
                    Rutlbl.setStyle("-fx-font-size: 130%;");
                    Rutlbl.setMaxWidth(Double.MAX_VALUE);
                    RutCodHBox.getChildren().add(Rutlbl);

                    //Inicializamos RutText
                    RutText.setPrefWidth(80);
                    RutText.setOnKeyPressed((keyEvent -> onRutKeyPressed(keyEvent)));
                    HBox.setHgrow(RutText, Priority.ALWAYS);
                    RutCodHBox.getChildren().add(RutText);

                    //Inicializamos Rut2Text
                    Rut2Text.setPrefWidth(30);
                    RutCodHBox.getChildren().add(Rut2Text);

                    //Inicializamos CodEntidadlbl
                    CodEntidadlbl.setStyle("-fx-font-size: 130%;");
                    CodEntidadlbl.setMaxWidth(Double.MAX_VALUE);
                    CodEntidadlbl.setPadding(new Insets(0, 0, 0, 20));
                    RutCodHBox.getChildren().add(CodEntidadlbl);

                    //Inicializamos RutText
                    CodEntidadText.setPrefWidth(80);
                    HBox.setHgrow(CodEntidadText, Priority.ALWAYS);
                    CodEntidadText.setOnAction(e -> boleta());
                    RutCodHBox.getChildren().add(CodEntidadText);

                    //Inicializamos CodEntidad2Text
                    CodEntidad2Text.setPrefWidth(30);
                    RutCodHBox.getChildren().add(CodEntidad2Text);
                }
                principalVBox.getChildren().add(RutCodHBox);

                //Se crea panel de Nombre
                final HBox NombreHBox = new HBox(8);
                {
                    // Inicializa NombreHBox
                    NombreHBox.setPadding(new Insets(3, 10, 10, 10));
                    NombreHBox.setAlignment(Pos.CENTER_LEFT);
                    HBox.setHgrow(NombreHBox, Priority.ALWAYS);

                    //Inicializamos Nombrelbl
                    Nombrelbl.setStyle("-fx-font-size: 130%;");
                    Nombrelbl.setMaxWidth(Double.MAX_VALUE);
                    NombreHBox.getChildren().add(Nombrelbl);

                    //Inicializamos CodEntidad2Text
                    NombreText.setPrefWidth(336);
                    HBox.setHgrow(NombreText, Priority.ALWAYS);
                    NombreHBox.getChildren().add(NombreText);
                }
                principalVBox.getChildren().add(NombreHBox);
            }
            generalVBox.getChildren().add(principalVBox);

            //Se crea panel de Pago CMR Falabella
            final HBox PagoCMRHBox = new HBox(3);
            {
                // Inicializa PagoCMRHBox
                PagoCMRHBox.setPadding(new Insets(10, 10, 10, 10));
                PagoCMRHBox.setAlignment(Pos.CENTER);
                HBox.setHgrow(PagoCMRHBox, Priority.ALWAYS);

                //Se inicializa checkBoxFatura
                HBox.setHgrow(checkBoxPagoCMR, Priority.ALWAYS);
                PagoCMRHBox.getChildren().add(checkBoxPagoCMR);

                //Se inicializa
                PagoCMRlbl.setStyle("-fx-font-weight: bold; -fx-font-size: 180%;");
                PagoCMRlbl.setAlignment(Pos.CENTER_LEFT);
                PagoCMRlbl.setPrefWidth(230);
                PagoCMRHBox.getChildren().add(PagoCMRlbl);

                //Se inicializa pagoCMRButton
                pagoCMRButton.setPrefSize(100, 50);
                pagoCMRButton.setOnAction(e -> Aceptar(e));
                PagoCMRHBox.getChildren().add(pagoCMRButton);
                pagoCMRButton.setDisable(true);

            }
            generalVBox.getChildren().add(PagoCMRHBox);
        }
        setTop(generalVBox);

        //create and initialize WebService Port and task Request
        final TipoDocumentoWebService service = new TipoDocumentoWebService();
        port = service.getTipoDocumentoWebPort();
        task.initWebServicePort(port, service, task.getCodeBase());
        task.addEventHandler(TaskEvent.TASK_STATE_REQUEST, e -> onTaskStateRequest(e));
    }

    /**
     * @param e
     * @return
     */
    private void onTaskStateRequest(final TaskEvent event)
    {
        event.setTaskState(task.getSettings());
    }

    /**
     * Se llama cuando se presiona una tecla en el texto "Rut2".
     *
     * @param event describes key event.
     */
    private void onRutKeyPressed(final KeyEvent event)
    {
        try {
            if (event.getCode() == KeyCode.ENTER) {
                event.consume();
                buscarPorRut();
            }
        } catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
    }

    /**
     *
     */
    private void buscarPorRut()
    {
        try {
            final BuscaclienterutBcaResult resulcliente = port.buscaclienterutBca(RutText.getText().toString().trim());
            if (resulcliente.getClientes().isEmpty())
            {
                Dialog.showMessage(this, "Cliente no existe, por favor registrarse en Mesón de atención al cliente");
                onClear();
            }else
                {
                   for (final BuscaclienterutBcaCliente cliente:resulcliente.getClientes())
                   {
                       Rut2Text.clear();
                       Rut2Text.setText(cliente.getDvCliente());
                       CodEntidadText.clear();
                       CodEntidadText.setText(cliente.getCodEntidad());
                       CodEntidad2Text.clear();
                       CodEntidad2Text.setText(cliente.getCodSucursal());
                       NombreText.clear();
                       NombreText.setText(cliente.getCliente());
                       }
                   boleta();
                }
        }catch (final Throwable thrown) {
            Dialog.showError(this, thrown);
        }
    return;
    }


    /**
     *
     */
    private void onClear()
    {
        Rut2Text.setText("");
        CodEntidadText.setText("");
        CodEntidad2Text.setText("");
        NombreText.setText("");
    }

    /**
     * Se crea metodo para habilitar boton de Aceptar
     * @return
     */
    private void boleta()
    {
        //Se habilita Button de Aceptar
        pagoCMRButton.setDisable(false);
    }

    /**
     * Se crea metodo para deshabilitar boton de Aceptar
     * @return
     */
    private void factura()
    {
        //Se deshabilita Button de Aceptar
        pagoCMRButton.setDisable(true);
    }

    /**
     * @return
     */
    private void Aceptar(final ActionEvent event)
    {
       try {
           rut = RutText.getText().toString().trim();
           entidad = CodEntidadText.getText().toString().trim();

           //Se inicializa parametro de envío EscanerProducto
           final TipoDctoDate tipoDoctoDate = new TipoDctoDate();
           tipoDoctoDate.setCodEntidad(entidad);
           tipoDoctoDate.setrut(rut);


           task.createTask("escanerproducto",                           //Task plugin
                           "cl.imperial.escanerproducto.EscanerMain",   //Task class
                           "Scan de Productos - Ver 6.0.25",            //Task title
                           tipoDoctoDate,                               //Task argument
                           e ->  task.terminate(false));
       } catch (final Throwable thrown) {
           Dialog.showError(this, thrown);
              }
    }
}
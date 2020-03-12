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

import cl.imperial.escanerproducto.ws.EscanerProductoWebException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

/**
 * @author Cesar Gonzalez
 */
public final class CodigoRapidoTemp extends BorderPane
{
//    private final WebService webService;
//    private final EscanerTable tableScaner;

    //Se crean Label
    final Label Escanerlbl = new Label("Escanear Producto o Ingresar Código");

    //Se crean TextFild
    final TextField EscanerText = new TextField();

    //Se crea Botton
    final Button aceptarButton = new Button("Aceptar");

    /**
     * @param escanerMain
     * @throws Exception
     *
     */
    public CodigoRapidoTemp(final EscanerMain escanerMain) throws Exception
    {

         // Initialize BorderPane
         setPadding(new Insets(0, 0, 0, 10));

         // Se crea nodo con titulo Ingreso de documentos
         final TitledPane ingreseCodTitled = new TitledPane();
         {
             // Inicializamos ingreseDocTitled
             ingreseCodTitled.setText("Código Rapido");
             ingreseCodTitled.setStyle("-fx-font-weight: bold;");
             ingreseCodTitled.setCollapsible(false);
             ingreseCodTitled.setExpanded(true);

             //Se crea Escaneo de Producto
             final VBox escanerVBox = new VBox(5);
             {
                 //Se inicializa escanerVBox
                 HBox.setHgrow(escanerVBox, Priority.ALWAYS);

                 // Se crea nodo de objetos para el Codigo
                 final VBox codigoVBox = new VBox();
                 {
                     //Se inicializa Escanerlbl
                     HBox.setHgrow(Escanerlbl, Priority.ALWAYS);
                     codigoVBox.getChildren().add(Escanerlbl);

                     //Se inicializa EscanerText
                     EscanerText.setMinHeight(32);
                     HBox.setHgrow(EscanerText, Priority.ALWAYS);
                     EscanerText.setOnAction(e -> {
                        try {
                            codigoRapido(escanerMain);
                        } catch (final EscanerProductoWebException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    });
                     codigoVBox.getChildren().add(EscanerText);
                 }
                escanerVBox.getChildren().add(codigoVBox);

                // Se crea nodo para el objeto del boton Aceptar
                final HBox aceptarHBox = new HBox();
                {
                    //Se inicializa SalirHBox
                    HBox.setHgrow(aceptarHBox, Priority.ALWAYS);
                    aceptarHBox.setAlignment(Pos.BOTTOM_CENTER);

                     //Se inicializa codigoRapidoButton
                     aceptarButton.setPrefSize(80, 50);
                     aceptarButton.setStyle("-fx-font-weight: bold; -fx-font-size: 100%;");
                     aceptarButton.setAlignment(Pos.CENTER);
                     aceptarButton.setOnAction(e -> {
                         try {
                             codigoRapido(escanerMain);
                         } catch (final EscanerProductoWebException e1) {
                             // TODO Auto-generated catch block
                             e1.printStackTrace();
                         }
                     });
                     aceptarHBox.getChildren().add(aceptarButton);
                }
                escanerVBox.getChildren().add(aceptarHBox);

             }
             ingreseCodTitled.setContent(escanerVBox);
         }
         setTop(ingreseCodTitled);
    }

    /**
     * @param escanerMain
     * @return
     */
    private void codigoRapido(final EscanerMain escanerMain) throws EscanerProductoWebException
    {
        EscanerText.setOnKeyPressed(event -> {
            if(event.getCode().equals(KeyCode.ENTER)) {
                try {
                    escanerMain.IngresaProducto(EscanerText.getText().toString(), "CODRP");
                } catch (final EscanerProductoWebException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
    }
}

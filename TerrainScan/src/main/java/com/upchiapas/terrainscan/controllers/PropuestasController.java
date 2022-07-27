package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import com.upchiapas.terrainscan.models.Datos;
import com.upchiapas.terrainscan.models.Natural;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;
import java.util.Random;

public class PropuestasController {

    @FXML
    private Button btnOrganico;

    @FXML
    private Button btnQuimico;

    @FXML
    private TextArea txtArea;

    @FXML
    void btnOrganicoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("organico-view","Organico - Terrain Scan");
    }

    @FXML
    void btnQuimicoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("quimico-view","Quimico - Terrain Scan");
    }
    @FXML
    void txtAreaOnMouseClicked(MouseEvent event) {
        Random r = new Random();
       // String nombreAleatorio = nombres[ (1 + new Random().nextInt(8)) ];
     String[] Lista = {"Terreno tipo: Arenoso","Terreno tipo: Limo","Terreno tipo: Arcilloso"};

        Datos lis = new Datos(78,67,89,10,10);
        Datos lis2 = new Datos(98,88,91,20,10);
        Datos lis3 = new Datos(23,34,38,1,3);
        Datos lis4 = new Datos(89,90,100,5,10);
        Datos lis5 = new Datos(12,10,34,3,9);
        Datos lis6 = new Datos(18,78,39,13,23);
        Datos lis7 = new Datos(100,100,100,5,5);
        int e = r.nextInt(Lista.length);

        txtArea.setText(String.valueOf(Lista[e]+ lis3));

//        txtArea.setText(String.valueOf(Lista[e]));
    }
    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }
}

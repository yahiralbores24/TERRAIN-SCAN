package com.upchiapas.terrainscan.controllers;


import com.upchiapas.terrainscan.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EscaneoController {

    @FXML
    private Button btnEscanear;

    @FXML
    private TextField txtNutrientes;

    @FXML
    private TextField txtProteinas;

    @FXML
    private TextField txtTipoTerreno;

    @FXML
    void btnEscanearOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("propuestas-view","Propuestas - Terrain Scan");
    }

}


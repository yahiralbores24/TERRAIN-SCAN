package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.awt.Desktop.getDesktop;

public class TiendaController{

    @FXML
    private ImageView abssa;

    @FXML
    private ImageView agrifluide;

    @FXML
    private ImageView agrogen;

    @FXML
    private ImageView fertinal;

    @FXML
    private ImageView fertiquim;

    @FXML
    private ImageView pacifex;

    @FXML
    private ImageView btnVolver;

    @FXML
    void abssaOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.abssa.com.mx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void agrifluideOnMouseClicked(MouseEvent event) {

        try {
            getDesktop().browse(new URI("https://agrifluide.com"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void agrogenOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.agrogen.com.mx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void fertinalOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://mx.linkedin.com"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void fertiquimOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("http://www.fertiquim.com.mx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void pacifexOnMouseCliked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://pacifex.com.mx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void btnVolverOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("propuestas-view","Quimico - Terrain Scan");
    }
    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }


}

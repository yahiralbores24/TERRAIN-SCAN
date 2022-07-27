package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import static java.awt.Desktop.getDesktop;

public class TiendaOrganicoController {

    @FXML
    private ImageView biofert;

    @FXML
    private ImageView bures;

    @FXML
    private ImageView exagroaloe;

    @FXML
    private ImageView haifa;

    @FXML
    private ImageView masso;

    @FXML
    private ImageView projar;


    @FXML
    private ImageView btnVolver;

    @FXML
    void biofertOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.biofert3r.com.mx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void buresOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://buressa.com/es"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void exagroaloeOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.exagro-aloe.com"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void haifaOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.haifa-group.com/es"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void massoOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://www.massoagro.com/es"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void projarOnMouseClicked(MouseEvent event) {
        try {
            getDesktop().browse(new URI("https://projar.es"));
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

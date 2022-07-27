package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import com.upchiapas.terrainscan.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private Button btnIniciarSecion;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnIniciarSecionOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();

        if (user.autenticarUser(txtUsername.getText(), txtPassword.getText())){
           HelloApplication.setFXML("escaneo-view","Simulacion - Terrain Scan");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario o contraseña incorrecta");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

}

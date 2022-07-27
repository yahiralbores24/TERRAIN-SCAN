package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import com.upchiapas.terrainscan.models.Estado;
import com.upchiapas.terrainscan.models.Scaneo_Simulation;
import com.upchiapas.terrainscan.models.User;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;


public class OrganicoController extends PropuestasController{

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnTiendaOrganico;

    @FXML
    private TextArea txtArea;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }

    @FXML
    void btnTiendaOrganicoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("TiendaOrganico-view", "Tienda - Terrain Scan");
    }

    @FXML
    void txtAreaOnMouseClicked(MouseEvent event) {
        String info[] = new String[7];

        info[1] ="Suelo de fertilidad baja \n\nSu suelo actualmente no es apto para cultivo, no tiene los nutrientes \nnecesarios para un buen desarrollo" +
                " de la planta. \nSi desea incrementar la fertilidad de su suelo, le proponemos los siguientes \n" +
                "nutrientes: \n\nPotasio: 32 kg\nFosforo: 34 kg\nHumuz: 3 Ls\nNitrogeno: 11 kg\n";
        info[2]="\n!Le proporcinamos las mejores tiendas donde consiguira sus abonos organicos¡";

        txtArea.setText(info[1]+info[2]);

    }
    @FXML
    void btnVolverOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("propuestas-view","Propuestas - Terrain Scan");
    }
}

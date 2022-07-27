package com.upchiapas.terrainscan.controllers;

import com.upchiapas.terrainscan.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class QuimicoController {

    @FXML
    private Button btnSalir;

    @FXML
    private Button btnTiendaQuimico;

    @FXML
    private TextArea txtArea;

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
System.exit(1);
    }

    @FXML
    void btnTiendaQuimicoOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("Tienda-view","Tienda - Terrain Scan");
    }
    @FXML
    void txtAreaOnMouseClicked(MouseEvent event) {
        String info[] = new String[7];

       info[1] ="Suelo de fertilidad baja \n\nSu suelo actualmente no es apto para cultivo, no tiene los nutrientes \nnecesarios para un buen desarrollo" +
                " de la planta. \nSi desea incrementar la fertilidad de su suelo, le proponemos los siguientes fertilizantes \n" +
                "quimicos: \n\nUrea: 50 kg\n18-46: 40 kg\nPotasio: 37 kg\nTriple 17: 45 kg\n";
       info [2]="\nCabe mencionar que la disponibilidad de los elementos quimicos esto\n" +
               "en funcion del tipo de su suelo.\n";
        info[3] ="\nTodas las tierras pueden ser cultivadas depende del ciclo de siembra,\n"+
        "si el suelo es muy humedo y es pantenoso no se puede sembrar.\n";
        info [4]="\n!Le proporcinamos las mejores tiendas donde consiguira sus abonos quimicos¡";

        txtArea.setText(info[1]+info[2]+info[3]+info[4]);

    }
    @FXML
    void btnVolverOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("propuestas-view","Propuesta - Terrain Scan");
    }
}

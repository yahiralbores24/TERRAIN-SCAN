module com.upchiapas.terrainscan.terrainscan {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.upchiapas.terrainscan to javafx.fxml;
    exports com.upchiapas.terrainscan;
    exports com.upchiapas.terrainscan.controllers;
    opens com.upchiapas.terrainscan.controllers to javafx.fxml;
}
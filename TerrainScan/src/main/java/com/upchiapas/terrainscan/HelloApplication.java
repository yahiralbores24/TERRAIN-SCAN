package com.upchiapas.terrainscan;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        scene = new Scene(loadFXML("login-view"));
        stage.setTitle("Login - Terrain Scan");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    public static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(nameView + ".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setFXML(String nameView, String title){
        scene.setRoot(loadFXML(nameView));
        stage.setResizable(true);
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setTitle(title);
    }
    public static void main(String[] args) {
        launch();
    }
}
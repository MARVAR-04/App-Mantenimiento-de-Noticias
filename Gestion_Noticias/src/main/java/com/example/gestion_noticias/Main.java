package com.example.gestion_noticias;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("noticias.fxml"));
        primaryStage.setScene(new Scene(root, 925, 600)); // Ajusta el tamaño de la escena según sea necesario
        primaryStage.setTitle("Gestión de Noticias"); // Cambia el título de la ventana principal
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.example.gestion_noticias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class LoginController {

    private Stage stage; // Referencia a la ventana actual

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void initialize() {
        stage = new Stage(); // Inicializa la referencia a la ventana
    }

    @FXML
    private void loginButtonAction(ActionEvent event) {
        // Implementa la lógica de inicio de sesión aquí
        System.out.println("Botón de inicio de sesión presionado");
    }

    @FXML
    private void registerLinkAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Registro.fxml"));
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.setTitle("Registro");
            stage.show();

            // Cierra la ventana anterior
            ((Stage)((Node)event.getSource()).getScene().getWindow()).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openLoginWindow() {
    }
}




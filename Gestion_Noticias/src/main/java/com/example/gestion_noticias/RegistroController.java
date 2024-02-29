package com.example.gestion_noticias;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField emailField;

    @FXML
    private DatePicker dobPicker;

    @FXML
    private void registerButtonClicked(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String name = nameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String dob = dobPicker.getValue().toString();

        // Aquí debes implementar la lógica de registro
        // Por ahora, solo imprimimos los datos para demostración
        System.out.println("Nombre de Usuario: " + username);
        System.out.println("Contraseña: " + password);
        System.out.println("Nombre: " + name);
        System.out.println("Apellidos: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Fecha de Nacimiento: " + dob);
    }

    @FXML
    private void goToLogin(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Inicio de Sesión");
            stage.show();

            // Cerrar la ventana actual (ventana de registro)
            ((Stage)(((Hyperlink)event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



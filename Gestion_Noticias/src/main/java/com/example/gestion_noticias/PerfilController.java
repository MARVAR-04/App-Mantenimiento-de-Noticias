package com.example.gestion_noticias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class PerfilController {
        @FXML
        private ImageView userPhoto;

        @FXML
        private Label nameLabel;

        @FXML
        private Label lastNameLabel;

        @FXML
        private TextArea descriptionTextArea;

    // Otros métodos y campos de tu controlador...

    public void initialize() {
        // Supongamos que tienes los siguientes datos del usuario en tu controlador
        String imageURL = "https://cdn-icons-png.flaticon.com/512/3135/3135768.png";
        String nombre = "Nombre del Usuario";
        String apellido = "Apellido del Usuario";
        String descripcion = "Descripción del Usuario";

        // Establece la imagen del usuario
        Image image = new Image(imageURL);
        userPhoto.setImage(image);

        // Establece el nombre y apellido del usuario en los elementos del FXML
        nameLabel.setText(nombre);
        lastNameLabel.setText(apellido);

        // Establece la descripción del usuario en el elemento del FXML
        descriptionTextArea.setText(descripcion);
    }

    @FXML
    private void irANoticias(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("noticias.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Noticias");
            stage.show();

            // Cerrar la ventana actual (perfil)
            ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Otros métodos de tu controlador...
}


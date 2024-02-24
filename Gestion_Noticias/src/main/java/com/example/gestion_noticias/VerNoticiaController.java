package com.example.gestion_noticias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class VerNoticiaController {

    @FXML
    private ImageView imageView;

    @FXML
    private Text descriptionText;

    @FXML
    private Button volverButton;

    public void initialize() {
        // URL de ejemplo de la imagen de la noticia
        String imageURL = "https://img2.rtve.es/v/15972405/?w=400";

        // Descripción de ejemplo de la noticia
        String description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Pellentesque vestibulum nisi nec velit placerat fermentum.";

        // Establece la imagen y la descripción de la noticia
        Image image = new Image(imageURL);
        imageView.setImage(image);
        descriptionText.setText(description);
    }
    @FXML
    private void volverANoticias(ActionEvent event) {
        // Obtiene el Stage actual (perfil)
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();

        // Cierra la ventana actual (perfil)
        stage.close();
    }

}



package com.example.gestion_noticias;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.IOException;

public class NoticiasController {

    @FXML
    private void editarNoticia(ActionEvent event) {
        mostrarMensaje("Editar Noticia seleccionado.");
        // Aquí implementa la lógica para editar la noticia
    }

    @FXML
    private void nuevaNoticia(ActionEvent event) {
        mostrarMensaje("Nueva Noticia seleccionada.");
        // Aquí implementa la lógica para crear una nueva noticia
    }

    @FXML
    private void eliminarNoticia(ActionEvent event) {
        mostrarMensaje("Eliminar Noticia seleccionada.");
        // Aquí implementa la lógica para eliminar la noticia
    }

    @FXML
    private void buscarNoticias(ActionEvent event) {
        mostrarMensaje("Buscar Noticias seleccionado.");
        // Aquí implementa la lógica para buscar noticias
    }

    @FXML
    private void iniciarSesion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Iniciar Sesión");
            stage.show();

            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void irAPerfil(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("perfil.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Perfil");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void verNoticias(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("vernoticias.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Ver Noticias");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}



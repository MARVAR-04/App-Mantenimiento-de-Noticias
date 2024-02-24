module com.example.gestion_noticias {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gestion_noticias to javafx.fxml;
    exports com.example.gestion_noticias;
}
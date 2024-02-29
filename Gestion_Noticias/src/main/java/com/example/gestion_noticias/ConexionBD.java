package com.example.gestion_noticias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // URL de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_noticias";

    // Nombre de usuario de la base de datos
    private static final String USER = "root";

    // Contraseña de la base de datos (en este caso, no hay contraseña)
    private static final String PASSWORD = "";

    // Método para establecer la conexión a la base de datos
    public static Connection conectar() throws SQLException {
        try {
            // Cargar el driver JDBC de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establecer la conexión
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            // Manejar la excepción si el driver JDBC no puede ser cargado
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Ejemplo de uso para probar la conexión
        try {
            Connection conexion = conectar();
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                conexion.close(); // Cerrar la conexión después de usarla
            } else {
                System.out.println("Error al conectar a la base de datos.");
            }
        } catch (SQLException e) {
            // Manejar la excepción si hay un error al conectar a la base de datos
            e.printStackTrace();
        }
    }
}

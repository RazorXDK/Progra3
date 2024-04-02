/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Herrera
 */
public class EliminarBd {

    static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASSWORD = "123456";

    public void eliminar() {

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Crear una declaración
            try (Statement statement = connection.createStatement()) {
                // Consulta SQL para eliminar la base de datos "postgres"
                String sql = "DROP DATABASE postgres";

                // Ejecutar la consulta para eliminar la base de datos
                statement.executeUpdate(sql);
                System.out.println("La base de datos postgres ha sido eliminada exitosamente.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        EliminarBd eliminarBd = new EliminarBd();
        eliminarBd.eliminar();
    }

}

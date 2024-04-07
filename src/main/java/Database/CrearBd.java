/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrearBd {

    static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASSWORD = "123456";

    public void comprobarTablaArbol() {

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try (Statement statement = connection.createStatement()) {
                // Verificar si la tabla "arbol" ya existe
                ResultSet resultSet = connection.getMetaData().getTables(null, null, "arbol", null);
                if (resultSet.next()) {
                    // Si la tabla existe, vaciar los registros y reiniciar la secuencia
                    vaciarTablaArbol(statement, connection);
                } else {
                    // Si la tabla no existe, crearla
                    crearTablaArbol(statement);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    private void vaciarTablaArbol(Statement statement, Connection connection) throws SQLException {
        // Consulta SQL para vaciar la tabla "arbol"
        String sql = "DELETE FROM arbol";
        // Ejecutar la consulta
        statement.executeUpdate(sql);
        System.out.println("Registros de la tabla 'arbol' eliminados.");

        // Consulta SQL para reiniciar la secuencia del contador de identidad
        //sql = "ALTER SEQUENCE arbol_id_seq RESTART WITH 1";
        // Ejecutar la consulta
        statement.executeUpdate(sql);
        System.out.println("El contador de identidad 'id' de la tabla 'arbol' ha sido reiniciado.");
    }

    private void crearTablaArbol(Statement statement) throws SQLException {
        // Consulta SQL para crear la tabla "arbol"
        String sql = "CREATE TABLE arbol ("
                + "id SERIAL PRIMARY KEY,"
                + "dato INTEGER,"
                + "estado INTEGER"
                + ")";
        // Ejecutar la consulta
        statement.executeUpdate(sql);
        System.out.println("La tabla 'arbol' ha sido creada exitosamente.");
    }

    public static void main(String[] args) {
        CrearBd crearBd = new CrearBd();
        crearBd.comprobarTablaArbol();
    }
}

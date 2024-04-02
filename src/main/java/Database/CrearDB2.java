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
 * @author Bryan
 */
public class CrearDB2{
 static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASSWORD = "123456";
    public static void main(String[] args) {
 
  
    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
    // Crear una declaración
    try (Statement statement = connection.createStatement()) {
    // Consulta SQL para crear la tabla "arbol"
    String sql = "CREATE TABLE arbol (" +
    "id SERIAL PRIMARY KEY," + // Esto crea una columna de identidad
    "dato INTEGER," + // Esto crea una columna de tipo entero para "dato"
    "estado INTEGER" + // Esto crea una columna de tipo entero para "estado"
    ")";
    
    // Ejecutar la consulta para crear la tabla "arbol"
    statement.executeUpdate(sql);
    System.out.println("La tabla arbol ha sido creada exitosamente.");
    }
    } catch (SQLException e) {
    System.err.println("Error al conectar a la base de datos: " + e.getMessage());
    
     }
    }
}

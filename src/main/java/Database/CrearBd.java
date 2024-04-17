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

    
    private void vaciarTablaArbol(Statement statement, Connection connection) throws SQLException {
        // Consulta SQL para vaciar la tabla "arbol"
        String sql = "DELETE FROM arbol";
        // Ejecutar la consulta
        statement.executeUpdate(sql);
        System.out.println("Registros de la tabla 'arbol' eliminados.");

        // Consulta SQL para reiniciar la secuencia del contador de identidad
        //sql = "ALTER SEQUENCE arbol_id_seq RESTART WITH 1";
        //desactivar la funcion de reiniciar el identity
        
        // Ejecutar la consulta
        statement.executeUpdate(sql);
        System.out.println("El contador de identidad 'id' de la tabla 'arbol' ha sido reiniciado.");
    }

    public void crearTablaArbol()  {
         try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // Crear una declaración
            try (Statement statement = connection.createStatement()) {
                // Verificar si la tabla TipoArbol existe
                if (!existeTabla("TipoArbol", connection)) {
                    // Consulta SQL para crear la tabla "TipoArbol"
                    String sqlTipoArbol = "CREATE TABLE TipoArbol ("
                            + "idTipoArbol SERIAL PRIMARY KEY,"
                            + "Nombre VARCHAR(50),"
                            + "Estado INTEGER"
                            + ")";
                    // Ejecutar la consulta para crear la tabla "TipoArbol"
                    statement.executeUpdate(sqlTipoArbol);
                    System.out.println("La tabla TipoArbol ha sido creada exitosamente.");
                }

                // Verificar si la tabla Arbol existe
                if (!existeTabla("Arbol", connection)) {
                    // Consulta SQL para crear la tabla "Arbol"
                    String sqlArbol = "CREATE TABLE Arbol ("
                            + "id SERIAL PRIMARY KEY,"
                            + "idTipoArbol INTEGER,"
                            + "dato INTEGER,"
                            + "estado INTEGER,"
                            + "CONSTRAINT fk_idTipoArbol FOREIGN KEY (idTipoArbol) REFERENCES TipoArbol(idTipoArbol)"
                            + ")";
                    // Ejecutar la consulta para crear la tabla "Arbol"
                    statement.executeUpdate(sqlArbol);
                    System.out.println("La tabla Arbol ha sido creada exitosamente.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
    public static boolean existeTabla(String nombreTabla, Connection connection) throws SQLException {
        boolean existe = false;
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("SELECT 1 FROM " + nombreTabla);
            existe = true;
        } catch (SQLException ex) {
            if (ex.getSQLState().equals("42P01")) {
                // La tabla no existe (código de estado SQLState 42P01)
                existe = false;
            } else {
                // Otro tipo de excepción
                throw ex;
            }
        }
        return existe;
    }
    


    public static void main(String[] args)  {
        CrearBd crearBd = new CrearBd();
        crearBd.crearTablaArbol();
    }
}

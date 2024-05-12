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
                ResultSet resultSet = connection.getMetaData().getTables(null, null, "arbol", null);
                if (resultSet.next()) {
                    vaciarTablaArbol(statement);
                } else {
                    crearTablaArbol(statement);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    private void vaciarTablaArbol(Statement statement) {
        try {
            String sql = "DELETE FROM arbol";
            statement.executeUpdate(sql);
            System.out.println("Registros de la tabla 'arbol' eliminados.");

            sql = "ALTER SEQUENCE arbol_id_seq RESTART WITH 1";
            statement.executeUpdate(sql);
            System.out.println("El contador de identidad 'id' de la tabla 'arbol' ha sido reiniciado.");
        } catch (SQLException e) {
            System.err.println("Error al vaciar la tabla 'arbol': " + e.getMessage());
        }
    }

    private void crearTablaArbol(Statement statement) {
        try {
            String sql = "CREATE TABLE arbol ("
                    + "id SERIAL PRIMARY KEY,"
                    + "dato INTEGER,"
                    + "idtipoarbol INTEGER"
                    + ")";
            statement.executeUpdate(sql);
            System.out.println("La tabla 'arbol' ha sido creada exitosamente.");

            crearTipoArbol(statement);
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'arbol': " + e.getMessage());
        }
    }

    private void crearTipoArbol(Statement statement) {
        try {
            String sql = "CREATE TABLE tipoarbol ("
                    + "id SERIAL PRIMARY KEY,"
                    + "nombre VARCHAR,"
                    + "estado INTEGER"
                    + ")";
            statement.executeUpdate(sql);
            System.out.println("La tabla 'tipoarbol' ha sido creada exitosamente.");
        } catch (SQLException e) {
            System.err.println("Error al crear la tabla 'tipoarbol': " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        CrearBd crearBd = new CrearBd();
        crearBd.comprobarTablaArbol();
    }
}
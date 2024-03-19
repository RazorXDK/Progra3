/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.GrupoII;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class LectorArchivo {

    public static void File_Reader(String ruta) {
        try {
            File archivo = new File(ruta);
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
                Clase2 clase2 = new Clase2(linea); // Crear una instancia de Clase2
            }
            buffer.close();
        } catch (Exception e) {
            System.out.println("Error al cargar el archivo:" + e.getMessage());
        }
    }

    static class Clase2 {

        private String mensaje;

        public Clase2(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getMensaje() {
            return mensaje;
        }
    }
}

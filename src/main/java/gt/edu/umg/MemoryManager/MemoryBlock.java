/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.MemoryManager;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Definición de la clase MemoryBlock que representa un bloque de memoria
public class MemoryBlock {
    int size; // Tamaño del bloque de memoria
    boolean isFree; // Indica si el bloque está libre
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isIsFree() {
        return isFree;
    }

    // Constructor para inicializar un bloque de memoria
    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public MemoryBlock(int size, boolean isFree) {
        this.size = size;
        this.isFree = isFree;
    }
    
    

    // Método toString para representar el bloque de memoria como una cadena de texto
    @Override
public String toString() {
    return "Bloque de Memoria{" +
            "Espacio=" + size +
            ", Libre=" + isFree +
            "}\n"; // Agregar "\n" al final de la cadena
}
}

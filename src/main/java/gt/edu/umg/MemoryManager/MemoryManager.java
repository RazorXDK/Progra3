/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.MemoryManager;

/**
 *
 * @author EMILY
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class MemoryManager {

    List<MemoryBlock> memoryBlocks; // Lista de bloques de memoria
    Random random; // Generador de números aleatorios

    // Constructor que inicializa los bloques de memoria con tamaños aleatorios
    public MemoryManager(int numBlocks, int minSize, int maxSize) {
        memoryBlocks = new ArrayList<>();
        random = new Random();
        // Añadir bloques de memoria iniciales con tamaños aleatorios
        for (int i = 0; i < numBlocks; i++) {
            int size = random.nextInt(maxSize - minSize + 1) + minSize;
            memoryBlocks.add(new MemoryBlock(size, true));
        }
    }
    
        // Método para vaciar los bloques de memoria
    public void clearMemoryBlocks() {
        for (MemoryBlock block : memoryBlocks) {
            block.isFree = true; // Marcar el bloque como libre
            // Si deseas restablecer el tamaño original, puedes almacenar y restaurar el tamaño aquí.
            block.size = 64; // Restablecer el tamaño a cero
      
        }
        JOptionPane.showMessageDialog(null, "Todos los bloques de memoria han sido vaciados.");
        System.out.println("Todos los bloques de memoria han sido vaciados.");
    }
    

    // Método para asignar memoria usando el primer ajuste
    public void firstFit(int processSize) {
        for (MemoryBlock block : memoryBlocks) {
            if (block.isFree && block.size >= processSize) {
                block.size -= processSize; // Reducir el tamaño del bloque
                if (block.size == 0) {
                    block.isFree = false; // Marcar el bloque como no libre si su tamaño es cero
                }
                JOptionPane.showMessageDialog(null, "Proceso de " + processSize + "KB asignado usando Primer Ajuste.");
                // System.out.println("Proceso de " + processSize + "KB asignado usando Primer Ajuste.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Primer Ajuste.");
        System.out.println("No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Primer Ajuste.");
    }

    // Método para asignar memoria usando el mejor ajuste
    public void bestFit(int processSize) {
        MemoryBlock bestBlock = null; // Bloque que mejor se ajusta al proceso
        for (MemoryBlock block : memoryBlocks) {
            if (block.isFree && block.size >= processSize) {
                if (bestBlock == null || block.size < bestBlock.size) {
                    bestBlock = block; // Encontrar el bloque más pequeño que sea adecuado
                }
            }
        }
        if (bestBlock != null) {
            bestBlock.size -= processSize; // Reducir el tamaño del bloque
            if (bestBlock.size == 0) {
                bestBlock.isFree = false; // Marcar el bloque como no libre si su tamaño es cero
            }
            JOptionPane.showMessageDialog(null, "Proceso de " + processSize + "KB asignado usando Mejor Ajuste.");
            System.out.println("Proceso de " + processSize + "KB asignado usando Mejor Ajuste.");
        } else {
            System.out.println("No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Mejor Ajuste.");
            JOptionPane.showMessageDialog(null, "No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Mejor Ajuste.");
        }
    }

    // Método para asignar memoria usando el peor ajuste
    public void worstFit(int processSize) {
        MemoryBlock worstBlock = null; // Bloque que peor se ajusta al proceso
        for (MemoryBlock block : memoryBlocks) {
            if (block.isFree && block.size >= processSize) {
                if (worstBlock == null || block.size > worstBlock.size) {
                    worstBlock = block; // Encontrar el bloque más grande que sea adecuado
                }
            }
        }
        if (worstBlock != null) {
            worstBlock.size -= processSize; // Reducir el tamaño del bloque
            if (worstBlock.size == 0) {
                worstBlock.isFree = false; // Marcar el bloque como no libre si su tamaño es cero
            }
            JOptionPane.showMessageDialog(null, "Proceso de " + processSize + "KB asignado usando Peor Ajuste.");
            System.out.println("Proceso de " + processSize + "KB asignado usando Peor Ajuste.");
        } else {
            System.out.println("No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Peor Ajuste.");
            JOptionPane.showMessageDialog(null, "No se encontró un bloque adecuado para el proceso de " + processSize + "KB usando Peor Ajuste.");
        }
    }

    // Método para imprimir el estado actual de la memoria
    public void printMemoryState() {
        System.out.println("Estado actual de la memoria:");
        for (MemoryBlock block : memoryBlocks) {
            System.out.println(block); // Imprimir cada bloque de memoria
        }
    }

   public List<Integer> getMemoryBlockSizes() {
        List<Integer> blockSizes = new ArrayList<>();
        for (MemoryBlock block : memoryBlocks) {
            blockSizes.add(block.getSize());
        }
        return blockSizes;
    }

    public String printMemoryState2() {
        StringBuilder memoryState = new StringBuilder();
        for (MemoryBlock block : memoryBlocks) {
            memoryState.append(block.toString()); // Agregar la representación de cada bloque de memoria
        }
        return memoryState.toString();
    }

}

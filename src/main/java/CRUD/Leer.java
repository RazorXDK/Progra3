/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import gt.edu.umg.db.Arbol;
import gt.edu.umg.db.ArbolJpaController;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herrera
 */
public class Leer {

    private EntityManager em = null;
    private EntityManagerFactory emf = null;

    public Leer(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void LeerArbol(int id, int estado, int dato) throws Exception {

        List<Arbol> lstArbol = new ArrayList<>();
        ArbolJpaController cs = new ArbolJpaController(emf);

        try {
           lstArbol = cs.findArbolEntities();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //em.close();
        }
        if (lstArbol.isEmpty()) {
            System.out.println("Analisis de Mercado no contiene registros a mostrar.");
        } else {
            for (Arbol al : lstArbol) {
                System.out.println("ID Arbol: " + al.getId());
             
                System.out.println("Dato " + al.getDato());
                System.out.println("----------------------------------------------");
            }
        }
    }
    
    private int aux;

    public void LeerTipo() throws Exception {

        // Lista para almacenar los registros de Arbol
        List<Arbol> lstArbol = new ArrayList<>();

        // Controlador JPA para la entidad Arbol
        ArbolJpaController cs = new ArbolJpaController(emf);

        try {
            // Leer todos los registros de la tabla Arbol
            lstArbol = cs.findArbolEntities();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //em.close(); // Cerrar el EntityManager si es necesario
        }

        // Verificar si la lista está vacía
        if (lstArbol.isEmpty()) {
            System.out.println("La tabla Arbol no contiene registros.");
        } else {
            // Recorrer la lista de registros de Arbol
            for (Arbol al : lstArbol) {
                System.out.println("ID Arbol: " + al.getId());
                System.out.println("Dato: " + al.getDato());
                System.out.println("----------------------------------------------");
                
            }
        }
    }

    // Método para actualizar la variable auxiliar con cada IDTipoArbol
    public void actualizarAux(int idTipoArbol) {
        aux = idTipoArbol;
    }
    
   
}

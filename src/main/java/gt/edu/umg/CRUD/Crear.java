/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.CRUD;

import gt.edu.umg.db.Final;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Herrera
 */
public class Crear {

    public static void crearArbol(int estado, Integer dato) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gt.edu.umg_Ventanas_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        Final arbolBinario = new Final();
        //arbolBinario.setEstado(estado);
        //arbolBinario.setDato(dato);

        try {
            em.getTransaction().begin();
            em.persist(arbolBinario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("A ocurrido una excepcion: " + e.getMessage());
            
        } finally {
            em.close();
            emf.close();
        }
    }

}

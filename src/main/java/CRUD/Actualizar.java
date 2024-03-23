/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import ORM.ArbolBinario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Herrera
 */
public class Actualizar {

    public static void ActualizarArbol(int id, int estado, Character dato) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gt.edu.umg_Ventanas_jar_1.0-SNAPSHOTPU");
        EntityManager em = emf.createEntityManager();

        ArbolBinario arbolBinario = em.find(ArbolBinario.class, id);
        arbolBinario.setEstado(estado);
        arbolBinario.setDato(dato);

        try {
            em.getTransaction().begin();
            em.merge(arbolBinario);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("A ocurrido una excepcion: " + e.getMessage());

        } finally {
            em.close();
            emf.close();
        }
    }

}

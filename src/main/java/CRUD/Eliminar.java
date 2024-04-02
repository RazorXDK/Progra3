/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import gt.edu.umg.db.Arbol;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Herrera
 */
public class Eliminar {

    private EntityManager em = null;
    private EntityManagerFactory emf = null;

    public Eliminar(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void EliminarArbol(int id) throws Exception {

        Arbol arbol = em.find(Arbol.class, id);

        try {
            em.getTransaction().begin();
            em.remove(arbol);
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("A ocurrido una excepcion: " + e.getMessage());

        } finally {
            //em.close();
            //emf.close();
        }
    }

}

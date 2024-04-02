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
public class Actualizar {
    private EntityManager em = null;
    private EntityManagerFactory emf = null;

    public Actualizar(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void ActualizarArbol(int id, int estado, int dato) throws Exception {
        Arbol arbol = em.find(Arbol.class, id);
        arbol.setEstado(estado);
        arbol.setDato(dato);

        try {
            em.getTransaction().begin();
            em.merge(arbol);
            em.getTransaction().commit();
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

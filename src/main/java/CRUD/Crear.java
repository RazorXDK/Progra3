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
public class Crear {

    private EntityManager em = null;
    private EntityManagerFactory emf = null;

    public Crear(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void crearArbol(int estado, int dato) throws Exception {

        Arbol arbol = new Arbol();
        arbol.setEstado(estado);
        arbol.setDato(dato);

        try {
            em.getTransaction().begin();
            em.persist(arbol);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("A ocurrido una excepcion: " + e.getMessage());

        } finally {
            //em.close();
            //emf.close();
        }
    }

}

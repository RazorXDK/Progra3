/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import gt.edu.umg.db.Arbol;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.swing.JOptionPane;

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

    public void actualizarTodosLosArboles() {
        try {
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT a FROM Arbol a");
            List<Arbol> arboles = query.getResultList();

            if (!arboles.isEmpty()) {
                for (Arbol arbol : arboles) {
                    arbol.setEstado(1);
                    em.merge(arbol);
                }
            } else {
                System.out.println("La tabla Arbol está vacía. No hay ningún registro para actualizar.");
                JOptionPane.showMessageDialog(null, "La tabla Arbol está vacía. No hay ningún registro para actualizar.");
            }

            em.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Se genero Arbol Binario");
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Ha ocurrido una excepción: " + e.getMessage());
        } finally {
            //em.close(); // Esto depende de cómo estés gestionando tus EntityManagers
            //emf.close();
        }

    }
}

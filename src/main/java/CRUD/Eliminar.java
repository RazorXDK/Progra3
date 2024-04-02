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

    public void borrarTodosLosArboles() {
        try {
            em.getTransaction().begin();

            Query query = em.createQuery("SELECT a FROM Arbol a");
            List<Arbol> arboles = query.getResultList();

            if (!arboles.isEmpty()) {
                for (Arbol arbol : arboles) {
                    arbol.setEstado(0);
                    em.merge(arbol);
                }
            } else {
                System.out.println("La tabla Arbol está vacía. No hay ningún registro para actualizar.");
                 JOptionPane.showMessageDialog(null, "La tabla Arbol está vacía. No hay ningún registro.");
            }

            em.getTransaction().commit();
             JOptionPane.showMessageDialog(null, "Eliminacion logica Arbol Binario");
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

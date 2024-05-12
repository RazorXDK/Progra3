package CRUD;

import gt.edu.umg.db.Arbol;
import gt.edu.umg.db.Tipoarbol;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Crear {

    private final EntityManager em;
    private final EntityManagerFactory emf;

    public Crear(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void crearArbol(int dato,int id) throws Exception {

        Arbol arbol = new Arbol();

        arbol.setDato(dato);
        arbol.setIdtipoarbol(id);

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
    
    public  void tipoArbol(String nombre)throws Exception {
        
        Tipoarbol tipo = new Tipoarbol();
        
        tipo.setNombre(nombre);
        tipo.setEstado(0);
        try {
            em.getTransaction().begin();
            em.persist(tipo);
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
    
    


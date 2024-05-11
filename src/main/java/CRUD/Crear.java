package CRUD;

import gt.edu.umg.db.Arbol;
import gt.edu.umg.db.TipoArbol;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Crear {

    private final EntityManager em;
    private final EntityManagerFactory emf;

    public Crear(EntityManager em, EntityManagerFactory emf) {
        this.em = em;
        this.emf = emf;
    }

    public void crearArbol(int dato, TipoArbol tarbol) {
        try {
            em.getTransaction().begin();

            Arbol arbol = new Arbol();
            arbol.setEstado(0);
            arbol.setDato(dato);
            arbol.setIdTipoArbol(tarbol);// Establecer la relación con el TipoArbol pasado como parámetro

            em.persist(arbol);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
        }
    }

    public void crearTipoArbol(String tipo) {
        try {
            em.getTransaction().begin();

            TipoArbol tarbol = new TipoArbol();
            tarbol.setNombre(tipo);
            tarbol.setEstado(1);

            em.persist(tarbol);

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
        }
    }

    public void crearTipoArbol(List<Integer> listaEnteros) {
        try {
            em.getTransaction().begin();

            for (Integer dato : listaEnteros) {
                TipoArbol tarbol = new TipoArbol();
                tarbol.setNombre("Tipo" + dato); // Puedes asignar nombres distintos basados en los datos de la lista si es necesario
                tarbol.setEstado(1);

                em.persist(tarbol);
            }

            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println("Ha ocurrido una excepción: " + e.getMessage());
        }
    }
}

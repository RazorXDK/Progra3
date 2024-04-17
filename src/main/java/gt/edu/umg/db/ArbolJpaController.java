/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.db;

import CRUD.exceptions.NonexistentEntityException;
import gt.edu.umg.db.Arbol;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import gt.edu.umg.db.Tipoarbol;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author LENOVO
 */
public class ArbolJpaController implements Serializable {

    public ArbolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Arbol arbol) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipoarbol idtipoarbol = arbol.getIdtipoarbol();
            if (idtipoarbol != null) {
                idtipoarbol = em.getReference(idtipoarbol.getClass(), idtipoarbol.getIdtipoarbol());
                arbol.setIdtipoarbol(idtipoarbol);
            }
            em.persist(arbol);
            if (idtipoarbol != null) {
                idtipoarbol.getArbolList().add(arbol);
                idtipoarbol = em.merge(idtipoarbol);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Arbol arbol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Arbol persistentArbol = em.find(Arbol.class, arbol.getId());
            Tipoarbol idtipoarbolOld = persistentArbol.getIdtipoarbol();
            Tipoarbol idtipoarbolNew = arbol.getIdtipoarbol();
            if (idtipoarbolNew != null) {
                idtipoarbolNew = em.getReference(idtipoarbolNew.getClass(), idtipoarbolNew.getIdtipoarbol());
                arbol.setIdtipoarbol(idtipoarbolNew);
            }
            arbol = em.merge(arbol);
            if (idtipoarbolOld != null && !idtipoarbolOld.equals(idtipoarbolNew)) {
                idtipoarbolOld.getArbolList().remove(arbol);
                idtipoarbolOld = em.merge(idtipoarbolOld);
            }
            if (idtipoarbolNew != null && !idtipoarbolNew.equals(idtipoarbolOld)) {
                idtipoarbolNew.getArbolList().add(arbol);
                idtipoarbolNew = em.merge(idtipoarbolNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = arbol.getId();
                if (findArbol(id) == null) {
                    throw new NonexistentEntityException("The arbol with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Arbol arbol;
            try {
                arbol = em.getReference(Arbol.class, id);
                arbol.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The arbol with id " + id + " no longer exists.", enfe);
            }
            Tipoarbol idtipoarbol = arbol.getIdtipoarbol();
            if (idtipoarbol != null) {
                idtipoarbol.getArbolList().remove(arbol);
                idtipoarbol = em.merge(idtipoarbol);
            }
            em.remove(arbol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Arbol> findArbolEntities() {
        return findArbolEntities(true, -1, -1);
    }

    public List<Arbol> findArbolEntities(int maxResults, int firstResult) {
        return findArbolEntities(false, maxResults, firstResult);
    }

    private List<Arbol> findArbolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Arbol.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Arbol findArbol(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Arbol.class, id);
        } finally {
            em.close();
        }
    }

    public int getArbolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Arbol> rt = cq.from(Arbol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.db;

import gt.edu.umg.db.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author rober
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
            TipoArbol idTipoArbol = arbol.getIdTipoArbol();
            if (idTipoArbol != null) {
                idTipoArbol = em.getReference(idTipoArbol.getClass(), idTipoArbol.getIdTipoArbol());
                arbol.setIdTipoArbol(idTipoArbol);
            }
            em.persist(arbol);
            if (idTipoArbol != null) {
                idTipoArbol.getArbolList().add(arbol);
                idTipoArbol = em.merge(idTipoArbol);
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
            TipoArbol idTipoArbolOld = persistentArbol.getIdTipoArbol();
            TipoArbol idTipoArbolNew = arbol.getIdTipoArbol();
            if (idTipoArbolNew != null) {
                idTipoArbolNew = em.getReference(idTipoArbolNew.getClass(), idTipoArbolNew.getIdTipoArbol());
                arbol.setIdTipoArbol(idTipoArbolNew);
            }
            arbol = em.merge(arbol);
            if (idTipoArbolOld != null && !idTipoArbolOld.equals(idTipoArbolNew)) {
                idTipoArbolOld.getArbolList().remove(arbol);
                idTipoArbolOld = em.merge(idTipoArbolOld);
            }
            if (idTipoArbolNew != null && !idTipoArbolNew.equals(idTipoArbolOld)) {
                idTipoArbolNew.getArbolList().add(arbol);
                idTipoArbolNew = em.merge(idTipoArbolNew);
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
            TipoArbol idTipoArbol = arbol.getIdTipoArbol();
            if (idTipoArbol != null) {
                idTipoArbol.getArbolList().remove(arbol);
                idTipoArbol = em.merge(idTipoArbol);
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

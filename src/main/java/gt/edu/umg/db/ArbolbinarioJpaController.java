/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.db;

import gt.edu.umg.db.exceptions.NonexistentEntityException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import java.io.Serializable;
import jakarta.persistence.Query;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

/**
 *
 * @author rober
 */
public class ArbolbinarioJpaController implements Serializable {

    public ArbolbinarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Arbolbinario arbolbinario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(arbolbinario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Arbolbinario arbolbinario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            arbolbinario = em.merge(arbolbinario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = arbolbinario.getId();
                if (findArbolbinario(id) == null) {
                    throw new NonexistentEntityException("The arbolbinario with id " + id + " no longer exists.");
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
            Arbolbinario arbolbinario;
            try {
                arbolbinario = em.getReference(Arbolbinario.class, id);
                arbolbinario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The arbolbinario with id " + id + " no longer exists.", enfe);
            }
            em.remove(arbolbinario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Arbolbinario> findArbolbinarioEntities() {
        return findArbolbinarioEntities(true, -1, -1);
    }

    public List<Arbolbinario> findArbolbinarioEntities(int maxResults, int firstResult) {
        return findArbolbinarioEntities(false, maxResults, firstResult);
    }

    private List<Arbolbinario> findArbolbinarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Arbolbinario.class));
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

    public Arbolbinario findArbolbinario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Arbolbinario.class, id);
        } finally {
            em.close();
        }
    }

    public int getArbolbinarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Arbolbinario> rt = cq.from(Arbolbinario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

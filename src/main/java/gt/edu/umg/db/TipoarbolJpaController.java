/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.db;

import CRUD.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import gt.edu.umg.db.Arbol;
import gt.edu.umg.db.Tipoarbol;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author LENOVO
 */
public class TipoarbolJpaController implements Serializable {

    public TipoarbolJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Tipoarbol tipoarbol) {
        if (tipoarbol.getArbolList() == null) {
            tipoarbol.setArbolList(new ArrayList<Arbol>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Arbol> attachedArbolList = new ArrayList<Arbol>();
            for (Arbol arbolListArbolToAttach : tipoarbol.getArbolList()) {
                arbolListArbolToAttach = em.getReference(arbolListArbolToAttach.getClass(), arbolListArbolToAttach.getId());
                attachedArbolList.add(arbolListArbolToAttach);
            }
            tipoarbol.setArbolList(attachedArbolList);
            em.persist(tipoarbol);
            for (Arbol arbolListArbol : tipoarbol.getArbolList()) {
                Tipoarbol oldIdtipoarbolOfArbolListArbol = arbolListArbol.getIdtipoarbol();
                arbolListArbol.setIdtipoarbol(tipoarbol);
                arbolListArbol = em.merge(arbolListArbol);
                if (oldIdtipoarbolOfArbolListArbol != null) {
                    oldIdtipoarbolOfArbolListArbol.getArbolList().remove(arbolListArbol);
                    oldIdtipoarbolOfArbolListArbol = em.merge(oldIdtipoarbolOfArbolListArbol);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Tipoarbol tipoarbol) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Tipoarbol persistentTipoarbol = em.find(Tipoarbol.class, tipoarbol.getIdtipoarbol());
            List<Arbol> arbolListOld = persistentTipoarbol.getArbolList();
            List<Arbol> arbolListNew = tipoarbol.getArbolList();
            List<Arbol> attachedArbolListNew = new ArrayList<Arbol>();
            for (Arbol arbolListNewArbolToAttach : arbolListNew) {
                arbolListNewArbolToAttach = em.getReference(arbolListNewArbolToAttach.getClass(), arbolListNewArbolToAttach.getId());
                attachedArbolListNew.add(arbolListNewArbolToAttach);
            }
            arbolListNew = attachedArbolListNew;
            tipoarbol.setArbolList(arbolListNew);
            tipoarbol = em.merge(tipoarbol);
            for (Arbol arbolListOldArbol : arbolListOld) {
                if (!arbolListNew.contains(arbolListOldArbol)) {
                    arbolListOldArbol.setIdtipoarbol(null);
                    arbolListOldArbol = em.merge(arbolListOldArbol);
                }
            }
            for (Arbol arbolListNewArbol : arbolListNew) {
                if (!arbolListOld.contains(arbolListNewArbol)) {
                    Tipoarbol oldIdtipoarbolOfArbolListNewArbol = arbolListNewArbol.getIdtipoarbol();
                    arbolListNewArbol.setIdtipoarbol(tipoarbol);
                    arbolListNewArbol = em.merge(arbolListNewArbol);
                    if (oldIdtipoarbolOfArbolListNewArbol != null && !oldIdtipoarbolOfArbolListNewArbol.equals(tipoarbol)) {
                        oldIdtipoarbolOfArbolListNewArbol.getArbolList().remove(arbolListNewArbol);
                        oldIdtipoarbolOfArbolListNewArbol = em.merge(oldIdtipoarbolOfArbolListNewArbol);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = tipoarbol.getIdtipoarbol();
                if (findTipoarbol(id) == null) {
                    throw new NonexistentEntityException("The tipoarbol with id " + id + " no longer exists.");
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
            Tipoarbol tipoarbol;
            try {
                tipoarbol = em.getReference(Tipoarbol.class, id);
                tipoarbol.getIdtipoarbol();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The tipoarbol with id " + id + " no longer exists.", enfe);
            }
            List<Arbol> arbolList = tipoarbol.getArbolList();
            for (Arbol arbolListArbol : arbolList) {
                arbolListArbol.setIdtipoarbol(null);
                arbolListArbol = em.merge(arbolListArbol);
            }
            em.remove(tipoarbol);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Tipoarbol> findTipoarbolEntities() {
        return findTipoarbolEntities(true, -1, -1);
    }

    public List<Tipoarbol> findTipoarbolEntities(int maxResults, int firstResult) {
        return findTipoarbolEntities(false, maxResults, firstResult);
    }

    private List<Tipoarbol> findTipoarbolEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Tipoarbol.class));
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

    public Tipoarbol findTipoarbol(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Tipoarbol.class, id);
        } finally {
            em.close();
        }
    }

    public int getTipoarbolCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Tipoarbol> rt = cq.from(Tipoarbol.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}

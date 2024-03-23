/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import ORM.ArbolBinario;
import ORM.NewEntity;
import java.util.ArrayList;
import java.util.List;
import gt.edu.umg.GrupoII.exceptions.NonexistentEntityException;
import gt.edu.umg.GrupoII.NewEntityJpaController;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import ORM.NewEntity;

/**
 *
 * @author Herrera
 */
public class Leer {

    private EntityManager em = null;
    private EntityManagerFactory emf = null;
    
    public leer(EntityManager em, EntityManagerFactory emf){
        this.em;
        this.emf;
    }

    public void LeerArbol() {

        List<ArbolBinario> lstArbolBinario = new ArrayList<>();
        NewEntityJpaController ac = new NewEntityJpaController(emf);

        try {
            lstArbolBinario = ac.findNewEntityEntities();
        } catch (Exception e) {
            e.printStrackTrace();
        } finally {
            em.close();
            emf.close();
        }
        if (lstArbolBinario.isEmpty()) {
            System.out.println("Arbol se encuentra vacio :(");
        } else {
            for (ArbolBinario al : lstArbolBinario) {
                System.out.println("Id: " + al.getId());
                System.out.println("Estado: " + al.getEstado());
                System.out.println("Dato: " + al.getDato());
            }
        }
    }
}

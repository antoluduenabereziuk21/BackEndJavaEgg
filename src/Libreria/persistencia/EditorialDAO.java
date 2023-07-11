/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.persistencia;

/**
 *
 * @author antolube20
 */
import Libreria.entidades.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;


public class EditorialDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();
    
    public void guardar(Editorial editorial) throws Exception {
        try {
            if (editorial == null) {
                throw new Exception("Editor nulo");
            }
            em.getTransaction().begin();
            em.persist(editorial);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
    
    public void altaBaja(Integer id, boolean atl) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Autor nulo");
            }
            Editorial e = em.find(Editorial.class, id);
            e.setAlta(atl);
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Editorial au) throws Exception {
        try {
            if (au == null) {
                throw new Exception("Autor nulo");
            }
            Editorial e = em.find(Editorial.class, au.getId());
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
    
    public Editorial EditorialxNom(String nom) throws Exception {
        try {
            if (nom == null) {
                throw new Exception("Libro nulo");
            }
            Editorial a = (Editorial) em.createQuery("Select a"
                    + " From Editorial a "
                    + "Where a.nombre like :nombre").setParameter("nombre", nom).getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public List<Editorial> libros() {
        try {

            List<Editorial> a = em.createQuery("Select e "
                    + "From Editorial e "
            ).getResultList();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
     
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.persistencia;



import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import Libreria.entidades.Autor;
import java.util.List;
import javax.persistence.EntityManagerFactory;

public class AutorDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    public void guardar(Autor a) throws Exception {
        try {
            if (a == null) {
                throw new Exception("Autor nulo");
            }
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public Autor autorNom(String nom) throws Exception {
        try {
            if (nom == null) {
                throw new Exception("Autor nulo");
            }
            Autor a = (Autor) em.createQuery("Select a"
                    + " From Autor a "
                    + "Where a.nombre like :nombre").setParameter("nombre", nom).getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    
    public List<Autor> autores() throws Exception {
        try {

            List<Autor> a = em.createQuery("Select a "
                    + "From Autor a "
            ).getResultList();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    
     public void altaBaja(Integer id, Boolean alta) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Autor nulo");
            }
            Autor a = em.find(Autor.class,id);
            a.setAlta(alta);
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
     public void modificar(Autor au) throws Exception {
        try {
            if (au == null) {
                throw new Exception("Autor nulo");
            }
            Autor a = em.find(Autor.class,au.getId());
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.persistencia;

import Libreria.entidades.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

/**
 *
 * @author antolube20
 */
public class LibroDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibreriaPU");
    EntityManager em = emf.createEntityManager();

    public void guardar(Libro a) throws Exception {
        try {
            if (a == null) {
                throw new Exception("Libro nulo");
            }
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public Libro LibroxNom(String nom) throws Exception {
        try {
            if (nom == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = (Libro) em.createQuery("Select a"
                    + " From Libro a "
                    + "Where a.titulo like :titulo").setParameter("titulo", nom).getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }

    public Libro LibroxISBN(Long id) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = em.find(Libro.class, id);

            return a;
        } catch (NoResultException e) {
            return null;
        }
    }

    public Libro LibroxAutor(String nom) throws Exception {
        try {
            if (nom == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = (Libro) em.createQuery("Select a"
                    + " From Libro a, Autor au "
                    + "Where au.id = l.autor_id and au.nombre like :nombre").setParameter("nombre", nom).getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    public Libro LibroxEditorial(String nom) throws Exception {
        try {
            if (nom == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = (Libro) em.createQuery("Select a"
                    + " From Libro l, Editorial ed "
                    + "Where ed.id = l.editorial_id and e.nombre like :nombre").setParameter("nombre", nom).getSingleResult();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    public void altaBaja(Long id, Boolean alta) throws Exception {
        try {
            if (id == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = em.find(Libro.class, id);
            a.setAlta(alta);
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificar(Libro au) throws Exception {
        try {
            if (au == null) {
                throw new Exception("Libro nulo");
            }
            Libro a = em.find(Libro.class, au.getId());
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();

        } catch (Exception e) {
            throw e;
        }
    }

    public List<Libro> libros() {
        try {

            List<Libro> a = em.createQuery("Select a "
                    + "From Libro a "
            ).getResultList();
            return a;
        } catch (NoResultException e) {
            return null;
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.AutorDAO;
import Libreria.persistencia.EditorialDAO;
import Libreria.persistencia.LibroDAO;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antolube20
 *
 * // Esta es una clase padre genérica. Que sea genérica nos permite //
 * instanciar esta clase para cualquier tipo de objeto. En línea 10 // vemos que
 * <T> puede ser cualquier tipo de objeto: Integer, String, Mascota //
 * Dirección, etcétera. // Esta clase padre nos permite heredar métodos comunes
 * con el fin de reutilizar // código.
 * @param <T>
 */
public class ValidatorService<T> {

    AutorDAO ad;
    LibroDAO ld;
    EditorialDAO ed;

    public void noDuplicateAutor(String nombre) throws Exception {
        try {

            if (ad.autorNom(nombre).getNombre() != nombre || !nombre.trim().isEmpty()) {
                Autor autor = new Autor(nombre, Boolean.TRUE);
                ad.guardar(autor);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void noDuplicateEditorial(String nombre) throws Exception {
        try {
            Editorial a = ed.EditorialxNom(nombre);
            if (a.getNombre() != nombre || !nombre.trim().isEmpty()) {
                ed.guardar(a);
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void noDuplicateLibro(String nombre) throws Exception {
        try {
            Libro a = ld.LibroxNom(nombre);
            if (a.getTitulo() != nombre || !nombre.trim().isEmpty()) {
                ld.guardar(a);
            } else {
                System.out.println("El Autor ya esta Cargado");

            }
        } catch (Exception e) {
            throw e;
        }
    }
}

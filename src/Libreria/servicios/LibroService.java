/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.entidades.Libro;
import Libreria.entidades.Editorial;
import Libreria.persistencia.LibroDAO;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author antolube20
 */
public class LibroService {
    
   private LibroDAO ld;
   
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    AutorService as;
    EditorialService ed;
    public LibroService() {       
        ld =  new LibroDAO();                        
    }

    public void crear() {
        System.out.println("Ingrese el Titulo Del Libro");
        String titulo = input.next();
        System.out.println("Ingrese El Año de impresion");
        Integer anio = input.nextInt();
        System.out.println("Ingrese La Cantidad de Libros");
        Integer cantL = input.nextInt();
        System.out.println("Ingrese La Cantidad de Libros Disponible");
        Integer cantLd = input.nextInt();
        System.out.println("Ingrese La Cantidad de Libros Prestados");
        Integer cantLp = input.nextInt();
        
        
        Libro ldnvo = new Libro(titulo, anio, cantL, cantLp, cantLd, true, as.crearAutor(), ed.crearEditorial());
        try {
            ld.guardar(ldnvo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public Libro buscarPorISBN() {
        System.out.println("Ingrese la Id del Libro");
        Long id =input.nextLong();
        try {
            Libro l = ld.LibroxISBN(id);
            return l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }            
    }
    public Libro buscarPorTitulo() {
        System.out.println("Ingrese el titulo del Libro");
        String titulo = input.next();
        try {
            Libro l = ld.LibroxNom(titulo);
            return l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }            
    }
    public Libro buscarPorNombreAutor() {
        System.out.println("Ingrese el autor del Libro");
        String autor = input.next();
        try {
            Libro l = ld.LibroxAutor(autor);
            return l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }            
    }
    
    public Libro buscarPorNombreEditorial() {
        System.out.println("Ingrese la Editorial del Libro");
        String editorial = input.next();
        try {
            Libro l = ld.LibroxEditorial(editorial);
            return l;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }            
    }
    
    public void estadoLibro() {
        System.out.println("Desea dar de alta o baja");
        String rp = input.next();
        System.out.println("Ingrese el ID");
        Long rpId = input.nextLong();

        if (rp.equalsIgnoreCase("alta")) {

            try {
                ld.altaBaja(rpId, Boolean.TRUE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("El Libro se dio de alta");

        } else {

            try {
                ld.altaBaja(rpId, Boolean.FALSE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("El libro se dio de baja");
        }
    }
    
    public void modificarLibro() {
        System.out.println("Ingrese id de libro a modificar");
        try {
            Libro a = buscarPorISBN();
            System.out.println("Ingrese la opcion:"
                    + "\n 1- Devoler Libro "
                    + "\n 2- Prestar Libro "
                    + "\n 3- Agregar ejemplares");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    devloverLibro(a);
                    break;
                case 2:
                    prestarLibro(a);
                    break;
                case 3:
                    agregarEjemplares(a);
                    break;
                default:
                    System.out.println("No se modifico el libro");
            }
            ld.modificar(a);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

private void devloverLibro(Libro libro) {
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
    }

    private void prestarLibro(Libro libro) {
        libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() - 1);
    }

    private void agregarEjemplares(Libro libro) {
        libro.setEjemplares(libro.getEjemplares() + 1);
        libro.setEjemplaresRestantes(libro.getEjemplaresRestantes() + 1);
    }
    
    public List<Libro> libros() throws Exception {
        try {

            List<Libro> a = ld.libros();
            return a;
        } catch (Exception e) {
            return null;
        }
    }
    
       public void recorrerLista(List<Libro> l) {
         
         System.out.println("Lista");
         for (Object object : l) {
             System.out.println(object);
         }
    }
    
        public void menuLibro() throws Exception {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria Argentina  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Cargar Libro \n"
                    + "2-Buscar Por ISBN \n"
                    + "3-Buscar Por Titulo \n"
                    + "4- Buscar Por Nombre De Autor\n"
                    + "5-Buscar Por Nombre De Editorial\n"
                    +" 6-Modificar Disponiles Del Libro \n"
                    + "7-Modificar Estado\n"
                    + "8-Listar Libros \n"
                    + "9- Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    crear();
                    break;
                case 2:
                    buscarPorISBN();
                    break;
                case 3:
                    buscarPorTitulo();
                    break;
                case 4:
                   buscarPorNombreAutor();
                    break;
                case 5:
                    buscarPorNombreEditorial();
                    break;
                case 6:
                    modificarLibro();
                    break;
                case 7:
                    estadoLibro();
                    break;
                case 8:
                    recorrerLista(libros());
                    break;
                
                case 9:
                    System.out.println("Saliendo del Programa");
                    bandera = true;
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!bandera);
     } 
}

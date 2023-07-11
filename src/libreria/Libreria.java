/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.servicios.AutorService;
import Libreria.servicios.EditorialService;
import Libreria.servicios.LibroService;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Libreria {

    public static void main(String[] args) throws Exception {
     
   
      Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        AutorService as = new AutorService();
//        as.crearAutor();
//        Autor a = as.buscarXNom();
//        System.out.println(a.getNombre());

//        System.out.println(as.buscarTodos());
        LibroService ls = new LibroService();
//        ls.crear(new Autor("El señor de los anillos", Boolean.TRUE), new Editorial("tu papa", Boolean.TRUE));
//        ls.modificarLibro();
//          ls.estadoLibro();
        EditorialService es = new EditorialService();
            
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria Argentina  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Menu Autor \n"
                    + "2-Menu Libro \n"
                    + "3-Menu Editorial \n" 
                    + "4-Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    as.menuAutor();
                    break;
                case 2:
                    ls.menuLibro();
                    break;
                case 3:
                    es.menuEditorial();
                    break;
                
                case 4:
                    System.out.println("Saliendo del Programa");
                    bandera = true;
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!bandera);   
    }
}
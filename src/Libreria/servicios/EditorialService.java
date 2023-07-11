/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Editorial;
import Libreria.persistencia.EditorialDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class EditorialService {
    private EditorialDAO ed;
    Scanner sc = new Scanner(System.in);

    public EditorialService() {
        ed = new EditorialDAO();
    }

    public Editorial crearEditorial() {
        System.out.println("Ingrese el nombre de la Editorial.");
        String nombre = sc.next();
        Editorial editorial = new Editorial(nombre, Boolean.FALSE);

        try {
            ed.guardar(editorial);
            return editorial;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public void altaBaja() {
        System.out.println("Desea dar alta o baja?");
        String rta = sc.nextLine();
        System.out.println("Ingrese ID de la Editorial.");
        Integer id = sc.nextInt();

        if (rta.equalsIgnoreCase("alta")) {
            try {
                ed.altaBaja(id, Boolean.TRUE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("La editorial fue dada de alta exitosamente.");

        } else {
            try {
                ed.altaBaja(id, Boolean.FALSE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("La editorial fue dada de baja exitosamente.");
        }
    }
    
   public void modificarEditorial() {
        System.out.println("Infgrese nombre de la editorial a modificar");
        String nombre = sc.nextLine();
        Editorial editorial;
        try {
            editorial = ed.EditorialxNom(nombre);
            System.out.println("Ingrese el nombre de la editorial nuevo");
            String nuevo = sc.nextLine();
            editorial.setNombre(nuevo);
            ed.modificar(editorial);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
   
      public Editorial buscarPorNombre() {
        System.out.println("Ingrese la Editorial del Libro");
        String editorial = sc.next();
        try {
            Editorial e = ed.EditorialxNom(editorial);
            return e;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }            
    }
      
    public List<Editorial> editoriales() throws Exception {
        try {

            List<Editorial> a = ed.libros();
            return a;
        } catch (Exception e) {
            return null;
        }
    }
      
     public void menuEditorial() throws Exception {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria Argentina  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Cargar Nuevo Editorial\n"
                    + "2-Dar De Baja/Alta Editorial \n"
                    + "3-Buscar Por Nombre  \n "
                    + "4-Modificar Datos Editoril\n"
                    + "5-Listar Todos Las Ediotriales\n"
                    + "\n-6 Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                    crearEditorial();
                    break;
                case 2:
                    altaBaja();
                    break;
                case 3:
                    buscarPorNombre();
                    break;
                case 4:
                     modificarEditorial();
                    break;
                case 5:
                    recorrerLista(editoriales());
                    
                    break;
                
                case 6:
                    System.out.println("Saliendo del Programa");
                    bandera = true;
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!bandera);
     }
     
     public void recorrerLista(List<Editorial> l) {
         
         System.out.println("Lista");
         for (Object object : l) {
             System.out.println(object);
         }
    }
     
    
}

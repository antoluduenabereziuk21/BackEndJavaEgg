/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import Libreria.entidades.Autor;
import Libreria.persistencia.AutorDAO;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antolube20
 */
public class AutorService {

    protected AutorDAO ad;
    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ValidatorService<Object> vs;
    public AutorService() {

        ad = new AutorDAO();

    }

    public Autor crearAutor() {

        System.out.println("Ingrese El NOmbre Del Autor");
        String nombre = input.next();
        
        try {
            vs.noDuplicateAutor(nombre);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
//            return null;
        }

//        try {
//            
//            Autor autor = new Autor(nombre, Boolean.TRUE);
//            ad.guardar(autor);
//            return autor;
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            return null;
//        }
        return null;

    }

    public void estadoAutor() {
        System.out.println("Desea dar de alta o baja");
        String rp = input.next();
        System.out.println("Ingrese el ID");
        Integer rpId = input.nextInt();

        if (rp.equalsIgnoreCase("alta")) {

            try {
                ad.altaBaja(rpId, Boolean.TRUE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("El Autor se dio de alta");

        } else {

            try {
                ad.altaBaja(rpId, Boolean.FALSE);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("El Autor se dio de baja");
        }
    }

    public Autor buscarXNom() {
        System.out.println("Ingrese el nombre del autor.");
        String nom = input.nextLine();
        try {
            Autor a = ad.autorNom(nom);
            System.out.println("El nombre del autor es: " + a.getNombre());
            return a;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
    
    public List<Autor> buscarTodos() {
        try {
            List<Autor> a = ad.autores();
            
            return a;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public void modificarAutor() {
        System.out.println("Buscando autor a modificar");
        Autor au = buscarXNom();
        System.out.println("Ingrese el nombre del autor nuevo");
        String nuevo = input.nextLine();
        au.setNombre(nuevo);
        try {
            ad.modificar(au);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
       public void recorrerLista(List<Autor> l) {
         
         System.out.println("Lista");
         for (Object object : l) {
             System.out.println(object);
         }
    }
    
    public void menuAutor() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria Argentina  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Cargar Nuevo Autor \n2-Dar De Baja Autor "
                    + "\n3-Buscar Por Nombre \n" + "4-Modificar Datos Autor \n"
                    + "5-Listar Todos Los Autores\n"
                    + "\n-6 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    crearAutor();
                    break;
                case 2:
                    estadoAutor();
                    break;
                case 3:
                    buscarXNom();
                    break;
                case 4:
                    modificarAutor();
                    break;
                case 5:
                    recorrerLista(buscarTodos());
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
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceEJerExtra2;

import Entidades.Ejer2Extra.Pelicula;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class CineService {
   
    private SalaService slSv = new SalaService();
    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    
    public void menu(){
        boolean bandera = false;
        do {
        System.out.println("Panel Administrador");
        System.out.println("------------------");
        System.out.println("Selecciona La Operacion A Realizar");
        System.out.println("1- Crear Sala \n2-Modificar Pelicula En Sala\n3-Elminar Sala\n"
                + "4-Mostrar Asientos Disponible\n-5 Comprar Ticket\n-6 Salir");
        int op = input.nextInt();
        
            switch (op) {
                case 1:
                    slSv.crearSala();
                   
                    break;
                case 2:
                    System.out.println("Modificar Pelicula En Sala");
//                    modificarPrecio();
                    break;
                case 3:
                    System.out.println("Remplazar Pelicula En Sala");
//                    eliminarProducto();
                    break;
                case 4:
                    System.out.println("Asientos Disponibles");
                    slSv.asientosDispobles();
//                    mostrarProducto();
                    break;
                case 5:
                    System.out.println("Comprar Ticket");
                     break;
                case 6:
                    System.out.println("Saliendo del Programa");
                    bandera= true;
                    break;
                   
                default:
                    throw new AssertionError();
            }
        } while (!bandera);
            
    }
    
    public void ComprarTiket() {
        
        Pelicula pelicula = slSv.SeleccionPelicula();
    }    
}

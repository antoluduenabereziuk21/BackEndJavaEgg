/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.servicios;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class LibreriaService {
    
    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public void menu() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1-  \n2- "
                    + "\n3- \n" + "4-"
                    + "\n-6 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                   
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

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
    public void subMenu() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Libreria --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1-  \n2- "
                    + "\n3- \n" + "4-"
                    + "\n-6 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                   
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

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

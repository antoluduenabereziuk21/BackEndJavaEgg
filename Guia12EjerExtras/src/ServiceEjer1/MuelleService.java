/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceEjer1;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class MuelleService {
    
     private AlquilerService aS = new AlquilerService();
     private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
     public void menu() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Muelle Argentino  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Alquilar Amarre \n2-Modificar Datos Embarcacion "
                    + "\n3-Elminar Amarre \n" + "4-Gestion De Datos De Amarre"
                    + "\n-6 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    aS.alquilerAmarre();
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

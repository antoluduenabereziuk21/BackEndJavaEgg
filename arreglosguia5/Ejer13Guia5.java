/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosguia5;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer13Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de compañeros de equipo
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = leer.nextInt();

        // Crear el vector de tamaño igual a la cantidad ingresada por el usuario
        String[] equipo = new String[cantidad];

        // Pedir al usuario que ingrese los nombres de los compañeros de equipo
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = leer.next();
        }

        // Mostrar los nombres almacenados en el vector
        System.out.println("Los nombres de los compañeros de equipo son:");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println((i + 1) + ". " + equipo[i]);
        }

        leer.close(); // Cerrar el scanner
    }
    
}

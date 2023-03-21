/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer13_14Guia5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Pedir al usuario que ingrese la cantidad de compañeros de equipo
        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = leer.nextInt();

        // Llamar a la función para crear el vector con los nombres ingresados
        String[] equipo = crearEquipo(cantidad);

        // Mostrar los nombres almacenados en el vector
        System.out.println("Los nombres de los compañeros de equipo son:");
        for (int i = 0; i < equipo.length; i++) {
            System.out.println((i + 1) + ". " + equipo[i]);
        }

        leer.close(); // Cerrar el scanner
    }

    // Función que crea el vector con los nombres ingresados por el usuario
    public static String[] crearEquipo(int cantidad) {
        Scanner read = new Scanner(System.in);

        String[] equipo = new String[cantidad];

        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Ingrese el nombre del compañero " + (i + 1) + ": ");
            equipo[i] = read.next();
        }

        return equipo;
    }
}

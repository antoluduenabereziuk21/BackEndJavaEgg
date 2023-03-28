/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clase2;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer5Clase2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("escribir un numero entero:");
        int n1 = leer.nextInt();
        System.out.println("el doble es: " + (n1*2));
        System.out.println("el triple es: " + (n1*3));
        System.out.println("la raiz cuadrda es: " + Math.sqrt(n1));
    }
}

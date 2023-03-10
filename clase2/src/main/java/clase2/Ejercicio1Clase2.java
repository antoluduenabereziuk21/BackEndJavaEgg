/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clase2;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejercicio1Clase2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingresa un numero");
        int num1= leer.nextInt();
        System.out.println("Ingresa un numero");
        int num2= leer.nextInt();
        int resultado = num1 + num2;
        System.out.println("la suma de los numeros :"+resultado);
        
    }
}

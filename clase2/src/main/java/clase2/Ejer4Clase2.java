/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package clase2;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer4Clase2 {

    public static void main(String[] args) {
                int C, F;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa los grados celsius:");
        
        C = sc.nextInt();
        
        F = 32 + (9 * C / 5);
        
        System.out.println(C + "° Celsius equivalen a " + F + "° Fahrenheit");
    }
}

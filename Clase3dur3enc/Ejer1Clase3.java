/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase3dur3enc;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer1Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero: ");
        int num= leer.nextInt();
        if ((num % 2)==0) {
            System.out.println("El número " + num + " es par.");
        } else{
            System.out.println("El número " + num + " es impar.");
        }
    }
   
    
}

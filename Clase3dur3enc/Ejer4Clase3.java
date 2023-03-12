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
public class Ejer4Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una frase o Palabra");
        String palabra = leer.nextLine();
        if ("A".equals(palabra.substring(0,1))) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
  
        // TODO code application logic here
    }
    
}

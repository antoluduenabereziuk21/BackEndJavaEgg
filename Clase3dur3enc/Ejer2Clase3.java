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
public class Ejer2Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase = leer.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        // TODO code application logic here
    }
    
}

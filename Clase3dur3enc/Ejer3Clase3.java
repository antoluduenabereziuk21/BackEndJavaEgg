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
public class Ejer3Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase de no mas de 8 carcateres");
        String palabra = leer.nextLine();
        if (palabra.length()== 8) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        // TODO code application logic here
    }
    
}

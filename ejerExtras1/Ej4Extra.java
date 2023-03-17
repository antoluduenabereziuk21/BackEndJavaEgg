/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerExtras1;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ej4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa un numero entre 1 y 10");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("tu numero en romano es : I");
                break;
             case 2:
                 System.out.println("tu numero en romano es : II");
                break;
             case 3:
                 System.out.println("tu numero en romano es : III");
                break;
             case 4:
                 System.out.println("tu numero en romano es : IV");
                break;
              case 5:
                  System.out.println("tu numero en romano es : V");
                break;
             case 6:
                 System.out.println("tu numero en romano es : VI");
                break;
             case 7:
                 System.out.println("tu numero en romano es : VII");
                break;
             case 8:
                 System.out.println("tu numero en romano es : VIII");
                break;
             case 9:
                 System.out.println("tu numero en romano es : IX");
                break;
             case 10:
                 System.out.println("tu numero en romano es : X");
                break;
            default:
                System.out.println("has ingresado un numero fuera de rango");;
        }
        
        // TODO code application logic here
    }
    
}

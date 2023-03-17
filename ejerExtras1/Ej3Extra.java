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
public class Ej3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingresa una letra y te dire si es vocal");
        Scanner leer = new Scanner(System.in);
        String letra = leer.next();
        if(letra.equalsIgnoreCase("a")||
           letra.equalsIgnoreCase("e")||
           letra.equalsIgnoreCase("i")||
           letra.equalsIgnoreCase("o")||
           letra.equalsIgnoreCase("u")){
            System.out.println("Es vocal");
        }else{
            System.out.println("No es vocal");
        }
        // TODO code application logic here
    }
    
}

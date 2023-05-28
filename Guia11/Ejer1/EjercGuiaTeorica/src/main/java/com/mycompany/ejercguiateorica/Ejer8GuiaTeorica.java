/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercguiateorica;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer8GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa una nota");
        Scanner leer = new Scanner(System.in);
        int note= leer.nextInt();
        
        while(note<0 || note>10){
            System.out.println("ingrese una nota");
            note= leer.nextInt();
        }
        // TODO code application logic here
    }
    
}

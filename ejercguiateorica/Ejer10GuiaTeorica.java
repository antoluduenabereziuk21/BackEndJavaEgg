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
public class Ejer10GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=0;i<4;i++){
            System.out.println("Ingresa el "+(i+1)+"° entre 1 y 20");
            Scanner leer = new Scanner(System.in);
            int num = leer.nextInt();
            while(num<0||num>20){
                System.out.println("Ingresa un numero entre 1 y 20");
                num = leer.nextInt();
            }
            for(int j=0;j<num;j++){
            System.out.print(("*"));   
            }
        }
    }
    
}

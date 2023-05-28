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
public class Ejer6GuiaTeoriaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresa Dos Numeros Enteros");
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingres el primero numero");
        num1=leer.nextInt();
        System.out.println("Ingres el segunfo numero");
        num2=leer.nextInt();
        
        if(num1>25 && num2>25){
            System.out.println("Ambos Numeros son Mayores A 25");
        }else if(num1>25){
            System.out.println("El Primer Numero Es Mayor A 25 ");
        }else if (num2>25) {
            System.out.println("El Segundo Numero Es Mayor A 25 ");
        }else{
            System.out.println("Ninguno De Los Dos Numero Es Mayor A 25 ");
        }
    }
    
}

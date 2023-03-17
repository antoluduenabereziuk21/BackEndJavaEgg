/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.clase7_8;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Eje12Clase7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primero numero");
        int num1=leer.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2=leer.nextInt();
        
        EsMultiplo(num1,num2);
        // TODO code application logic here
    }
    
    public static void EsMultiplo(int a,int b){
        boolean resultado = (a%b)==0;
        
        System.out.println("Los numeros son multiplos?: " +resultado);
    }
}

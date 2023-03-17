/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase7_8;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Clase7_8Ejer11 {

    public static void main(String[] args) {
        
        System.out.println("Ingrese una frase o palabra para codificar");
        Scanner leer = new Scanner(System.in);
        String palabra= leer.nextLine();
      
//        palabra=palabra.replace("a", "@");
//        palabra=palabra.replace("e", "#");
//        palabra=palabra.replace("i", "$");
//        palabra=palabra.replace("o", "%");
//        palabra=palabra.replace("u", "*");  
//        
          Cod(palabra);
    }
    
    public static void Cod(String palabra){
    
        palabra=palabra.replace("a", "@");
        palabra=palabra.replace("e", "#");
        palabra=palabra.replace("i", "$");
        palabra=palabra.replace("o", "%");
        palabra=palabra.replace("u", "*");  
        System.out.println(palabra);
   


    }   
        
}

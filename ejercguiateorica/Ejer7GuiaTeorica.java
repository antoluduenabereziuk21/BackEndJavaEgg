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
public class Ejer7GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opcion;
        boolean sesion=true;
        
        do{
            
            System.out.println("MENU");
            System.out.println("1.BOMBA DE AGUA");
            System.out.println("2.BOMBA DE GASOLINA");
            System.out.println("3.BOMBA DE HORMIGÓN");
            System.out.println("4.BOMBA DE PASTA ALIMENTICIA");
            System.out.println("5.SALIR");
            System.out.println("ELIJA OPCION");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String letra=leer.next();
                    if(letra.equalsIgnoreCase("S")) {
                     
                        sesion=false;
                    }
                    break;
                    
                default:
                    System.out.println("No existe un valor válido para tipo de bomba");
                    break;
                
        }
        
       
    }while(sesion==true);
    System.out.println("ha cerrado sesion");
    }
    
}

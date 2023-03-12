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
public class Ejer6Clase3 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double num1, num2;
        int opcion;
        Scanner leer = new Scanner(System.in);
        
     do{

         System.out.println("MENU:");
         System.out.println("1. Sumar");
         System.out.println("2. Restar");
         System.out.println("3. Multiplicar");
         System.out.println("4. Dividir");
         System.out.println("5. Salir");
         System.out.println("Elija un a opción: ");
         opcion = leer.nextInt();
         
         switch(opcion) {
         case 1: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La suma de los numkeros es: " + (num1+num2) );
                break;
         case 2: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La resta de los numeros es: " + (num1-num2));
                break;
         case 3: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La multiplicacion de los numewros es: " + (num1*num2));
                break;
         case 4: 
                System.out.println("Ingrese un numero positivo: ");
                num1 = leer.nextInt();
                System.out.println("Ingrese otro numero positivo: ");
                num2 = leer.nextInt();
                System.out.println("La division de los numeros es: " + (num1/num2));
                break;
         case 5: System.out.println("Adios");
         break;
         default: System.out.println("Opcion incorrecta."); 
        }
         System.out.println("");
     }
     while(opcion != 5);
         
     }
    

    
}


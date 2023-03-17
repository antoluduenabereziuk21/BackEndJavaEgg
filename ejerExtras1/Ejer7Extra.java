/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerExtras1;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer7Extra {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La cantidad de numeros A Ingresar");
        int num = leer.nextInt();
        
        promedio(num);
        
    }
    
    public static void promedio(int num) {
        int max,min,num1;
        max=0;
        min=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num; i++) {
            System.out.println("Ingresa un numero");
            num1= sc.nextInt();
            if(i == 0){
                max=num1;
                min=num1;
            }else{
                if(num1>max){
                    max=num1;
                }
                if(num1<min){
                    min=num1;
                }
            }
        }
        System.out.println("El Maximo Valor Es :"+max+"\nY El Minimo Es :"+min);
    }
    
}

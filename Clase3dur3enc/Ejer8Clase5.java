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
public class Ejer8Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingresa el lado del cuadrado a dibujar");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        for(int i=0; i<num;i++){
            
            for( int j=0;j<num;j++){
                if(i==0 || i==num-1){
                    System.out.print("*");
                }else if(j==0 || j==num-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        
        // TODO code application logic here
    }
    
}

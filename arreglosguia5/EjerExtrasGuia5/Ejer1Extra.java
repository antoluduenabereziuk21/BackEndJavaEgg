/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5.EjerExtrasGuia5;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer1Extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La Dimencion Del Vector");
        int n = leer.nextInt();
        int [] vector = generadorVector(n);
        System.out.println("-----------------");
        
        printVector(vector);
        
        System.out.println("-----------------");
        
        int sumatoria = SumaElementos(vector);
        
        System.out.println("La Sumatoria de todos los Elementos es : "+sumatoria);
    }
    
    public static int[] generadorVector(int n) {
        Scanner leer = new Scanner(System.in);
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {

            System.out.println("Ingresa " + (i + 1) + "° valor ");
            vector[i] = leer.nextInt();
        }
        return vector;
    }
    public static int SumaElementos(int [] vector) {
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            suma+=vector[i];
        }
        return suma;
    }
    
    public static void printVector(int [] vector){
        for (int i = 0; i < vector.length; i++){
            
                System.out.print("[" + vector[i]+ "]");
            
        }
        System.out.println("");
    }
}

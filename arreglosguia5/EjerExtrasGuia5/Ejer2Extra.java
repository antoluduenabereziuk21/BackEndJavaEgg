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
public class Ejer2Extra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La Dimension De Los Vectores A Comparar :");
        int n = leer.nextInt();
        int []vec1= generadorVector(n);
        int []vec2= generadorVector(n);
        comparaVec(vec1,vec2);
        
    }
    public static int[] generadorVector(int n) {
        
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    
    public static void comparaVec(int []vec1,int []vec2) {
        
        for (int i = 0; i < vec1.length; i++) {
            if(vec1[i]!=vec2[i]){
                System.out.println("Los Vectores No Son Iguales");
                break;
            }
        }
        printVector(vec1);
        printVector(vec2);
    }
    
    public static void printVector(int [] vector){
        for (int i = 0; i < vector.length; i++){
            
                System.out.print("[" + vector[i]+ "]");
            
        }
        System.out.println("");
    }
}

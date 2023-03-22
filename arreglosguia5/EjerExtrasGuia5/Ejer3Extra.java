/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5.EjerExtrasGuia5;

import java.util.Scanner;

/**
 *
 * @author antolube20
 * Crear una función rellene un vector con números
 * aleatorios, pasándole un arreglo por parámetro. Después haremos otra función
 * o procedimiento que imprima el vector.
 */
public class Ejer3Extra {
    public static void main(String[] args) {
        System.out.println("Ingresa La Cantidad De Numeros Del Array");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int [] array = generadorVector(n);
        printVector(array);
        int [] vector= CargaAleatoria(array,n);
        printVector(vector);
        
    }
    public static int[] generadorVector(int n) {
        
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        return vector;
    }
    
    public static int [] CargaAleatoria(int [] array,int n){
        int[] vector = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int j = (int) (Math.random()*array.length);
            System.out.println("print j: "+j);
            vector[i]= array[j];
        }
        return vector;
    }
    
    public static void printVector(int [] vector){
        for (int i = 0; i < vector.length; i++){
            
                System.out.print("[" + vector[i]+ "]");
            
        }
        System.out.println("");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosguia5;

//import java.util.Random;
//import java.util.Scanner;
import java.util.*;

/**
 *
 * @author antolube20
 */
public class Ejer2Guia5Ejer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randon = new Random();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa El Tamaño del Vector");
//        int n = leer.nextInt();
        int [] vec = new int[leer.nextInt()];
        
        
        for (int i = 0; i < vec.length ; i++) {
            /*random dos metodos class Random tiene multiples metodos , y se ingresa el valor a rellenar.
              math.random() asi solo genera numeros entre 0.0 y 1.0 , si usamos math.random()*10, multiplica esos valores
            ejemplo 0.1x10=1 , 0.5x10=*/
            vec[i]=randon.nextInt(100);// Generamos números aleatorios entre 0 y 99
            System.out.print(vec[i]+" | ");
        }
        System.out.println("");
        System.out.println("Ingrese El Numero A Buscar");
        int num = leer.nextInt();
        int cont = 0;
        boolean encontrado = false;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i] == num) {
                cont+=1;
                if (!encontrado) {
                    System.out.println("El número " + num + " se encuentra en las siguientes posiciones:");
                }
                System.out.println("Posición " + i);
                encontrado = true;
            }
        }
        if(cont>=1){
            System.out.println("El numero se repite :"+cont+"veces");
        }
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el vector.");
        }
    }
        
}
//      
//        
    
//    }
//    Scanner leer = new Scanner(System.in);
//        Random randon = new Random();
//        
//        System.out.print("Ingrese el tamaño del vector: ");
//        int n = leer.nextInt();
//        
//        int[] vector = new int[n];
//        for (int i = 0; i < n; i++) {
//            vector[i] = randon.nextInt(100); // Generamos números aleatorios entre 0 y 99
//        }
//        
//        System.out.print("Ingrese el número a buscar: ");
//        int num = leer.nextInt();
//        
//        boolean encontrado = false;
//        for (int i = 0; i < n; i++) {
//            if (vector[i] == num) {
//                if (!encontrado) {
//                    System.out.println("El número " + num + " se encuentra en las siguientes posiciones:");
//                }
//                System.out.println("Posición " + i);
//                encontrado = true;
//            }
//        }
//        
//        if (!encontrado) {
//            System.out.println("El número " + num + " no se encuentra en el vector.");
//        }
//    }
    
    
        // TODO code application logic here
   

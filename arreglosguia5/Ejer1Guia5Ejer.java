/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5;

/**
 *
 * @author antolube20
 */
public class Ejer1Guia5Ejer {
//    
//    public static void main(String[] args) {
//        int [] numeros = new int[100];
//        
////        for(int numero:numeros){
////         numero+=1;
////            System.out.println("numero"+numero);
////        }
//
//           for (int i = 0; i < numeros.length; i++) {
//            numeros[i]=i+1;
//        }
//        
//        for (int i = 0; i < numeros.length; i--) {
//            System.out.println(numeros[i]+"");
//        }
//    }
    public static void main(String[] args) {
           // Crear el vector de tamaño 100
        int[] vector = new int[100];

             

        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }

        // Mostrar el vector en orden descendente
        System.out.println("Vector en orden descendente:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
    }
}


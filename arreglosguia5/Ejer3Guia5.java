/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosguia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer3Guia5 {

    /**
     * @param args the command line arguments
     */
                           public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] vector = new int[16];
        rellenarVector(vector);//llenamos el vector
        System.out.println("#### Se llena el vector ####");
        
        System.out.println("####Contabiliza los dígitos####");// Llamada al metodo para contabilizar los digitos
        compararDigitos(vector);
        System.out.println("#### Mostramos el vector ####");
        mostrarvector(vector);
                                                                               
    }
       	/*
	 * Llena el vector con valores aleatorios, haciendo uso de la clase Random
	 * y su metodo .nextInt() en este caso tendremos un rango de 0 a 300
	 */
    public static void rellenarVector(int[] vector){           
        Random numRandom = new Random(); 
        // Obj de la clase random para usar el metodo nextInt()
        
        for (int i = 0; i < vector.length ; i++) {
            vector[i]= numRandom.nextInt(100000+1);
        }
        
    }
       	/**
	 * Recorrera el vector, obtendremos el valor int en c/u de sus posiciones.
	 * Convertiremos a String cada valor int y obtendremos su longitud,
	 * con esto sabremos cuantos digitos tiene cada valor entero del vector.
	 * Y almacenaremos el total de numeros que son de 1, 2 o 3 digitos.
	 */
    
    public static void compararDigitos(int[] vector){
        String numenText;
        int undig=0;
        int dosdig=0;
        int tresdig=0;
        int cuatrodig=0;
        int cincodig=0;
        
        for (int i = 0; i < vector.length ; i++) {
            numenText= Integer.toString(vector[i]); //// convertimos a String los valores del vector
            switch (numenText.length()){
                case 1:
                    undig++;
                    break;
                case 2:
                    dosdig++;
                    break;
                case 3:
                    tresdig++;
                    break;
                case 4:
                    cuatrodig++;
                    break;
                case 5:
                    cincodig++;
                    break;
            }
        }
        System.out.println("El vector tiene ");
        System.out.println(undig + "cantidad de 1 digito");
        System.out.println(dosdig + "cantidad de 2 digitos");
        System.out.println(tresdig + "cantidad de 3 digitos");
        System.out.println(cuatrodig + "cantidad de 4 digitos");
        System.out.println(cincodig + "cantidad de 5 digitos");
    }
    
    public static void mostrarvector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
            
        }
    }
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosguia5;
import java.util.*;
/**
 *
 * @author antolube20
 */
public class Ejer3bGuia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = scanner.nextInt();
        
        int[] vector = new int[N];
        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100000); // genera un número aleatorio entre 0 y 99999
        }

        int[] contador = new int[6]; // se usará para contabilizar cada número de dígitos

        for (int i = 0; i < vector.length; i++) {
            int n = vector[i];
            int digitos = 0;
            while (n > 0) { // contar cuántos dígitos tiene n
                digitos++;
                n /= 10;
                System.out.println("n vale:"+n);
            }
            if (digitos > 5) {
                digitos = 5; // si tiene más de 5 dígitos, se cuenta como un número de 5 dígitos
            }
            contador[digitos]++;
            System.out.println("contador [cantidad de digitos] incrementa 1 la poscion,posicion actual"+contador[digitos]);
        }

        // imprimir los resultados
        for (int i = 1; i <= 5; i++) {
            System.out.println(contador[i] + " números de " + i + " dígitos");
        }
        
        mostrarVector(vector);
        
        
    }
    
    public static void mostrarVector(int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("["+vector[i]+"]");
        }
    }
    
}

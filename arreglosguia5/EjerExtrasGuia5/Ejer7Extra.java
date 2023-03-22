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
public class Ejer7Extra {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números de Fibonacci ha generar: ");
        int n = read.nextInt();
        int[] fibonacci = Fibonacci(n);
        System.out.println("Fibonacci: ");
        for(int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int[] Fibonacci(int n) {
        int[] serie = new int[n];
        if(n >= 1) {
            serie[0] = 1;
        }
        if(n >= 2) {
            serie[1] = 1;
        }
        for(int i = 2; i < n; i++) {
            serie[i] = serie[i-1] + serie[i-2];
        }
        return serie;
    }
}
 


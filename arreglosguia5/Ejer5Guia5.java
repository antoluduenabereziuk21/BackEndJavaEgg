/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5;

import java.util.Scanner;

/**
 *
 * @author antolube20
 * Realice un programa que compruebe si una matriz dada es
 * antisimétrica. Se dice que una matriz A es antisimétrica cuando ésta es igual
 * a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica
 * si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
 * obtiene cambiando sus filas por columnas (o viceversa
 */
public class Ejer5Guia5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ CUADRADA");
        int dim = leer.nextInt();

        int[][] matriz = generadorMatriz(dim);

        System.out.println("-------------------");

        generadorMatrizAT(dim, matriz);

    }

    public static int[][] generadorMatriz(int dim) {
        int[][] matriz = new int[dim][dim];
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                matriz1[c] = (int) (Math.random() * 11);//si por ejemplo queres desde -10 a 10. tendrías que hacer (Math.random()* 20)-10
                System.out.print("[" + matriz1[c] + "]");
            }
            System.out.println("");
        }
        return matriz;
    }

    public static int[][] generadorMatrizAT(int dim, int[][] matriz) {
        int[][] traspuesta = new int[dim][dim];
        for (int f = 0; f < traspuesta.length; f++) {
            for (int c = 0; c < traspuesta.length; c++) {
                traspuesta[f][c] = (matriz[c][f] * -1);
                System.out.print("[" + traspuesta[f][c] + "]");
            }
            System.out.println("");
        }
        return traspuesta;
    }
}

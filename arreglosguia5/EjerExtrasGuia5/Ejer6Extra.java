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
public class Ejer6Extra {
    public static void main(String[] args) {
        // Crea una matriz de tamaño 20x20
        char[][] sopaLetras = new char[20][20];

        // ingrese 5 palabras entre 3 y 5 caracteres
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la palabra #" + (i+1) + " (entre 3 y 5 caracteres): ");
            String palabra = scanner.nextLine();
            while (palabra.length() < 3 || palabra.length() > 5) {
                System.out.println("Ingresa palabra entre 3 y 5 caracteres: ");
                System.out.print("Ingrese la palabra #" + (i+1) + " (entre 3 y 5 caracteres): ");
                palabra = scanner.nextLine();
            }
            // Inserta la palabra en la matrix aleatoria
            int f = (int) (Math.random() * 20);
            int c = (int) (Math.random() * (20 - palabra.length()));
            for (int j = 0; j < palabra.length(); j++) {
                sopaLetras[f][c+j] = palabra.charAt(j);
            }
        }

        // Rellena los espacios vacíos con números aleatorios del 0 al 9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaLetras[i][j] == '\0') {
                    sopaLetras[i][j] = (char) (Math.random() * 10 + '0');
                }
            }
        }

        // Imprime la sopita
        System.out.println("Sopa de Letras:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}


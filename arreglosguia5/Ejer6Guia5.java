/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosguia5;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author antolube20
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por
 * números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales
 * son idénticas. Crear un programa que permita introducir un cuadrado por
 * teclado y determine si este cuadrado es mágico o no. El programa deberá
 * comprobar que los números introducidos son correctos, es decir, están entre
 * el 1 y el 9.
 * 
 */
public class Ejer6Guia5 {
    public static void main(String[] args) {

        System.out.println("Cudrado Mágico");
        System.out.println("-------------------");
        

        int[][] matriz = generadorMatriz();//generamos la matriz con los numeros ingresados po

        printMatriz(matriz);//imprimimos la matriz
        
        System.out.println("-------------------");
        
        boolean magica = CuadradoMagico(matriz);//llamamos al método y luego asiganomos el return en una variable
        
        System.out.println("La Matriz Es Magica : "+magica);//imprimos el resultado del metodo
    }

    public static int[][] generadorMatriz() {
        Scanner leer = new Scanner(System.in);
        int num;
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingresa "+(j+1)+"° valor de la "+(i+1)+"° Fila");
                num=leer.nextInt();
                while(num<1 && num>10){
                    System.out.println("El valor No Es Valido.\n"
                            + " Ingresa Un Valor Entre 1 y 9");
                    num=leer.nextInt();
                }
                matriz[i][j]= num;
//                System.out.print("[" + matriz[i][j] + "]");
//                limpiarAnt();
            }
            
            
        }
        return matriz;
    }
    
    public static void printMatriz(int [][] matriz){
        for (int[] matriz1 : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print("[" + matriz1[c] + "]");
            }
            System.out.println("");
        }
    }

    public static boolean CuadradoMagico(int[][] matriz) {
        boolean magica = false;
        int sumaF = 0, sumaC = 0, sumaD1 = 0, sumaD2 = 0, sumaC2 = 0, j, sumaC3 = 0, conta = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                sumaF += matriz[i][j];
            }
            if (sumaF != 15) {//Si La primera columna NO comple Salimos del codigo
                break;
            } else { //En caso Contrario avanzamos ala proxima columna,fila,diagonal
                conta++;
                sumaF = 0;
                sumaC3 += matriz[i][2];
                sumaC2 += matriz[i][1];
                sumaC += matriz[i][0];
                sumaD1 += matriz[i][i];
                sumaD2 += matriz[i][j - 1];
            }
        }
        if (conta == 3 && (sumaC3 + sumaC2 + sumaC + sumaD1 + sumaD2) % 15 == 0) {
            return !magica;//si se cumple modificamos el valor de false a true, y lo retornamos; 
        } else {
            return magica;
        }
    }
//    public static void limpiarAnt(){
//        try{
//            System.out.println("Presione enter para continuar...");
//            new java.util.Scanner(System.in).nextLine();
//
//            Robot limpiar = new Robot();
//            limpiar.keyPress(KeyEvent.VK_CONTROL);
//            limpiar.keyPress(KeyEvent.VK_L);
//            limpiar.keyRelease(KeyEvent.VK_CONTROL);
//            limpiar.keyRelease(KeyEvent.VK_L);
//            
//        }  catch (Exception e) {
//            System.out.println("Error al limpiar la pantalla"+e.getMessage());
//        }
//    }
}

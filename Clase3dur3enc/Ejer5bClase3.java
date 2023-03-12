/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase3dur3enc;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer5bClase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0, cont = 1, num;

        System.out.println("Ingresa un numero limite:");

        num = sc.nextInt();

        while (num <= 0) {

            if (num == 0) {
                System.out.println("Ingresa un numero mayor a cero:");
                num = sc.nextInt();
            } else {
                System.out.println("Ingresa un numero entero positivo:");
                num = sc.nextInt();
            }
        }

        System.out.println("Ingresa los numeros a sumar:");

        while (suma < num) {
            
            System.out.print("Num " + cont + ':');
             suma += sc.nextInt();
            cont++;
        }

        System.out.println("El limite es:" + num);
        System.out.println("La suma total de los numeros es:" + suma);
        // TODO code application logic here
    }
    
}

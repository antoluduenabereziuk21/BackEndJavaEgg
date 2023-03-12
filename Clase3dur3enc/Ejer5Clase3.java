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
public class Ejer5Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un valor limite positivo");
        int numero =leer.nextInt();
        int numR,suma=0;
        while(numero>=suma){
            Scanner intro = new Scanner(System.in);
            System.out.println("Ingrese un numero para sumar");
            int num = intro.nextInt();
            suma+= num;
            System.out.println("La Suma Fue :"+suma);
        }
        System.out.println("El numero ingresado fue "+numero+" y las sumatoria fue"+suma);
        do {
            System.out.print("Ingrese un numero a sumar: ");
            numR = leer.nextInt();
            numero -= numR;
            System.out.println("Saldo Maximo: " + numero);
        } while (numero >= 0);
        // TODO code application logic here
    }
    
}

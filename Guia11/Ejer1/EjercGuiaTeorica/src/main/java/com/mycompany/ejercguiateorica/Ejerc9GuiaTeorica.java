/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercguiateorica;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejerc9GuiaTeorica {

    public static void main(String[] args) {
        int valor;
        int suma;
        int contador;
        suma = 0;
        contador = 0;
        

        do {
            System.out.println("Ingrese un valor");
            Scanner sc = new Scanner(System.in);
            valor = sc.nextInt();
            contador=contador+1;
            
            System.out.println("el contador va en:"+contador);
                if (valor > 0) {
                    suma = (suma + valor);
                }
        }while (valor != 0 && contador <= 3); 
        
        if (valor == 0) {
            System.out.println("Se a encontrado el numero 0");
        }
        System.out.println("La sumatoria final de los numeros ingresados es de: " + suma);

    }
}
 


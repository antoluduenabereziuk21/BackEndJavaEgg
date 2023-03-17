/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerExtras1;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La Clase De Socios(A;B;C)");
        String letra = leer.next();
        System.out.println("Ingrese el costo del tratamiento");
        int costo= leer.nextInt();
        switch (letra) {
            case "A":
            case "a":
                System.out.println("El Costo del tratamiento es $:"+(costo*0.5));
                break;
            case "B":
            case "b": 
                System.out.println("El Costo del tratamiento es $:"+(costo-(costo*0.35)));
                break;
            case "C":
            case "c":
                System.out.println("El Costo del tratamiento es $:"+(costo));
                break;
            default:
                System.out.println("A ingresado Una clase Incorrecta");;
        }
        
    }
    
}

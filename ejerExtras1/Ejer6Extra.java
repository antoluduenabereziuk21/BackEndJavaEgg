/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerExtras1;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejer6Extra {
    public static void main(String[] args) {
        float pr;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La Cantidad De Personas\nPara Promediar Su Altura");
        int cant = leer.nextInt();
        pr=PromedioAltura(cant);
        System.out.println("El Promedio De Altura Es:"+pr);
        
    }
    
    public static float PromedioAltura(int cant){
        Scanner sc = new Scanner(System.in);
        float promedio;
        float sumatoria=0;
        float altura;
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa La Altura De La " + (i + 1) + "° Persona con comas:");
            altura = sc.nextFloat();
            sumatoria+=altura;
        }
        promedio= sumatoria/cant;

        return promedio;
    }
}

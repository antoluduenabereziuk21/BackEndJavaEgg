/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejrguia8;

import Entedides.Cafetera;
import Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class ejer2Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio cafe = new CafeteraServicio();
        Scanner leer = new Scanner(System.in);;
        cafe.llenarCafetera();
        System.out.println("Ingrese La Capacidada De La Taza");
        double taza = leer.nextDouble();
        cafe.servirTaza(taza);
        System.out.println("Ingresa la Cantidad De Cafe");
        cafe.agregarCafe(leer.nextDouble());
       
    }
    
}

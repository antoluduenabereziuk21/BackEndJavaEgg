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
public class Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingresa un tiempo en minutos");
        Scanner leer = new Scanner(System.in);
        int min= leer.nextInt();
        int dias,horas;
        //1hs=60m,1dia=24hs=1440
        dias = min / 1440;
        horas = (min % 1440)/60;
        System.out.println(min+" minutos son "+dias+" dia "+horas+" horas");
        // TODO code application logic here
    }
    
}

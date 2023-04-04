/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooEjrExtra;

import EntidadesEjExtras.Puntos;

/**
 *
 * @author antolube20
 */
public class Ejer2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Puntos p1= new Puntos();
        
        p1.crearPuntos();
        
        System.out.println("La Distancia entre Los puntos es :" + p1.calcular());
    }
    
}

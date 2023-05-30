/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author antolube20
 */
public class Ejer1Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal p1= new Perro("juanjo","Balanceado",15,"pichicho");
        Animal p2= new Perro("Teddy","Balan",12,"pichi");
        Animal g1 = new Gato ("miua","pescado",4,"gatuna");
        Animal c1 = new Caballo("Spark","Pasto",25,"Fino");
        
        p1.alimento();
        p2.alimento();
        g1.alimento();
        c1.alimento();
    }
    
}

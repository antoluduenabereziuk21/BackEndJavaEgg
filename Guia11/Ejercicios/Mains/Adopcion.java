/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author antolube20
 */
public class Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Antonio", "luduena", 36, 32323232);
        Persona p2 = new Persona("Angel", "banegas", 21, 4201215);
        Perro m1 = new Perro("roma", "pastor Aleman", 4,"grande" );
        Perro m2 = new Perro("prince", "caniche", 6,"pequeño" );
        // TODO code application logic here
        p1.setPerro(m2);
        p2.setPerro(m1);
        
        
        System.out.println(p1);
        System.out.println(p2);
    }
    
}

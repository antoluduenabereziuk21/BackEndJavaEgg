/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia11;

import Entidades.DNI;
import Entidades.Persona;

/**
 *
 * @author antolube20
 */
public class personaDni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DNI dni = new DNI('A', 388888888);
        Persona p1 = new Persona("Juan", "Dominguez", dni);
        System.out.println(p1);
    }
/*
    
    */
}

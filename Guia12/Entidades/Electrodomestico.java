/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author antolube20
 */
public class Electrodomestico {
    protected Double precio;
    
    
    private static char randomChar() {
        Random r = new Random();
        return (char)(r.nextInt(26) + 'A');
    }
 
    public static void main(String[] args) {
        char c = randomChar();
        System.out.println(c);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Circunferencia {
    private double radio;
    //en las clases las constantes se declaran como "final"
    private final double pi = 3.14 ;

    public Circunferencia() {
    }
    
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void pedirRadio(){
        System.out.println("Ingresa el Radio");
        Scanner leer = new Scanner(System.in);
        radio = leer.nextDouble();
    }
    
    public void area(){
        System.out.println("El Area es :"+(pi*Math.pow(radio,2)));
    
    }
    public void perimetro(){
        System.out.println("El Perimetro es :"+(2*pi*radio));
    
    }
}

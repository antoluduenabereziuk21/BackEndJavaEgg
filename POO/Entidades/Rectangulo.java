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
public class Rectangulo {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void CrearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa La Base Del Rectangulo");
        base=leer.nextInt();
        System.out.println("Ingresa La Altura Del Rectangulo");
        altura=leer.nextInt();
    }
    
    public void SuperficieYPerimetro(){
        System.out.println("El Rectangulo Tiene Una Superfice De :"+base*altura);
        System.out.println("El Rectangulo Tiene Un Perimetro De :"+(base+altura)*2);
    }
    
    public void DibujarRectangulo(){
          for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print(" * ");
                } else if (j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        
    }
}

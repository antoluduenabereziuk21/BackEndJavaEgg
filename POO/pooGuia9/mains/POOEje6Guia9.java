/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Entidades.Curso;

/**
 *
 * @author antolube20
 */
public class POOEje6Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Curso c1 = new Curso ();
         
         c1.crearCurso();
//         double ganancia = ;
         
         System.out.println("La Ganancia es : "+c1.calcularGananciasSemanal());
            
    }
    
}

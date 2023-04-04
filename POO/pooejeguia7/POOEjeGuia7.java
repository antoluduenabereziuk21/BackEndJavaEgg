/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejeguia7;

import Entidades.Libro;

/**
 *
 * @author antolube20
 */
public class POOEjeGuia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro();
        
//        libro1.Titulo= "juan";
//          libro1.setTitulo("juan");
        
        
        libro1.CargarLibro();
//        libro1.MostrarLibro();

        System.out.println( libro1);
    }
    
}

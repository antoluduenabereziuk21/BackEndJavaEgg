/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejeguia7;

import Entidades.Operacion;

/**
 *
 * @author antolube20
 */
public class POOEje3Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion operaciones = new Operacion();
        // TODO code application logic here
        operaciones.crearOperacion();
        System.out.println("suma: "+operaciones.sumar());
        System.out.println("resta: "+operaciones.restar());
        System.out.println("multiplicacion: "+operaciones.multiplicar());
        System.out.println("division:"+operaciones.division());
        
    }
    
}

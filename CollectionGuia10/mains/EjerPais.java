/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Services.PaisService;

/**
 *
 * @author antolube20
 */
public class EjerPais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisService sv = new PaisService();
        
//        sv.crearPais();
        sv.paiseCodeados();
        sv.ordenAlfabetico();
        sv.buscarPais();
           
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Servicios.FechaSevice;
import java.util.Date;

/**
 *
 * @author antolube20
 */
public class POOEje4Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        FechaSevice sv = new FechaSevice();
        
        Date fechaNac= sv.fechaNacimiento(); 
        
        System.out.println("La Fecha De Naciemientos :"+ fechaNac );
        
        
        System.out.println("La Fecha Actual Es :"+sv.fechaActual());
        
        System.out.println("Su Edad Es: "+sv.diferencia(sv.fechaActual(),fechaNac));
    }
    
}

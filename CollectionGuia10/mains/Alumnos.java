/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Services.AlumnoServices;

/**
 *
 * @author antolube20
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServices sv = new AlumnoServices();
        
        sv.crearAlumno();
        
        
        sv.notaFinal();
    }
    
}

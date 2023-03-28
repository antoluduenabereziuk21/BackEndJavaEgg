/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooej01;

import Entidad.Persona;
/**
 *
 * @author antolube20
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Instanciamos dos objetos en el main del tipo Persona
        
        Persona primeraPersona = new Persona("antonio",36,1.78);
        
        System.out.println("Nombre :"+primeraPersona.nombre+""
                + "\nedad :"+primeraPersona.edad+""
                + "\naltura :"+primeraPersona.altura);
        
        primeraPersona.setNombre("Eugenia");
        
        System.out.println("Nombre :"+primeraPersona.nombre+"");
        System.out.println("Nombre :"+primeraPersona.getAltura()+"");

    }
    
   
}

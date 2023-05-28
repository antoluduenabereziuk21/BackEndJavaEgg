/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entedides.Persona;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class PersonaServicio {
    
        Persona sujeto = new Persona();

    public boolean esMayordeEdad(Persona sujeto) {
        return sujeto.getEdad()>=18;
    }

    public Persona crearPersona() {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese su nombre");
        sujeto.setNombre(leer.next());
        System.out.println("Por favor ingrese su edad");
        sujeto.setEdad(leer.nextInt());
        String seso = "";
        do {
            System.out.println("Por favor ingrese su sexo");
            seso= leer.next();
            sujeto.setSexo(seso);
           
            
        } while (!seso.equalsIgnoreCase("H") && !seso.equalsIgnoreCase("M") && !seso.equalsIgnoreCase("O") );

        System.out.println("Por favor ingrese su peso");
        sujeto.setPeso(leer.nextDouble());
        System.out.println("Por favor ingrese su altura");
        sujeto.setAltura(leer.nextDouble());
        
        return sujeto;
    }

    public short calcularIMC(Persona sujeto) {
        double Imc = sujeto.getPeso()/(Math.pow(sujeto.getAltura(),2));
        
        if (Imc <20 ){
            return -1;
        }else if(Imc >=20 && Imc <=25){
            return 0;
        }else{
            return 1;
        }
       
    }
}

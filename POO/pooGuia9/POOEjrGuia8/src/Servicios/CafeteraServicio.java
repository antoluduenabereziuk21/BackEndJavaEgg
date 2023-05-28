/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entedides.Cafetera;

/**
 *
 * @author antolube20
 */
public class CafeteraServicio {
        
    Cafetera cafetera = new Cafetera();
    
    public Cafetera llenarCafetera(){
        cafetera.setCapacidadActual (cafetera.getCapacidadMaxima());
        return cafetera;
    }
    
    public void servirTaza(double taza){
        double cafeActual = cafetera.getCapacidadActual();
        //cafetera 40 / taza 50 
        if ( cafeActual >= taza){
            System.out.println("Taza LLena");
            cafetera.setCapacidadActual(cafetera.getCapacidadActual()-taza);
            System.out.println("Queda : "+cafetera.getCapacidadActual()+"ml de Cafe");
        }else if ( cafeActual>0){
            System.out.println("La Taza se llena con "+cafeActual);
            cafetera.setCapacidadActual(0);
            System.out.println("Queda : "+cafetera.getCapacidadActual()+"ml de Cafe");
        }else{
            System.out.println("No Hay Mas Cafe");
        }
    }
    
    public void vaciarCafetera(){
     cafetera.setCapacidadActual(0);
    }
    
    public void agregarCafe(double agrega){
        
        
        double cafeActual = cafetera.getCapacidadActual();
        System.out.println("hay "+cafeActual);
        //cafetera 40 / taza 50 
        if ((cafeActual + agrega)> cafetera.getCapacidadMaxima()){
            System.out.println("Lo Que Se Agrega Supera La Capacidad Maxima");
            System.out.println("Se Sugiere : "+(cafetera.getCapacidadMaxima()-cafeActual));
        }else{
            cafetera.setCapacidadActual(cafeActual+agrega);
            System.out.println("El Cantidad Cafe Actual es : "+cafetera.getCapacidadActual());
        }
    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class FechaSevice {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        
        System.out.println("Ingrese el dia en que nacio ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en que nacio ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año en que nacio ");
        int anio = leer.nextInt();
        
       Date fecha =new Date(anio, mes, dia);
       
       return fecha;
    }
    
    public Date fechaActual(){
    
        return new Date();
    }
    
//    public int diferencia(Date fechaAct, Date fechaNac){
////        int edad=(fechaAct.getYear()+1900)-fechaNac.getYear();
////        if (fechaAct.getDate()<fechaNac.getDate() && fechaAct.getMonth()<= fechaNac.getMonth()) {
////            edad--;
////        }
//    int diferencia = (fechaAct.getYear() + 1900) - fechaNac.getYear();
//        System.out.println(fechaAct.getMonth());
//        if ((fechaAct.getMonth() + 1) < fechaNac.getMonth()) {
//            diferencia--;
//        } else if ((fechaAct.getMonth() + 1) == fechaNac.getMonth() && fechaAct.getDate() < fechaNac.getDate()) {
//            diferencia--;
//        }
//        return diferencia;
//
////        return fechaActual.getDate()-fechaNacimiento.getDate();
////    return edad;
//    }
//    
    public int diferencia(Date actual, Date nacimiento){
        int edad=actual.getYear()-nacimiento.getYear();
        if (actual.getDate()<nacimiento.getDate() && actual.getMonth()<=nacimiento.getMonth() || actual.getMonth()<nacimiento.getMonth()) {
            edad--;
        }
        return edad;
    }
}

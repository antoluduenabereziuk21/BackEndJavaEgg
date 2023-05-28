/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Servicios.ArregloService;

/**
 *
 * @author antolube20
 */
public class POOEje3Guia9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArregloService sv = new ArregloService();
        
       Double [] A = new Double [50];
       Double [] B = new Double [20];
         
        
        sv.inicializarA(A);
//        sv.inicializarA(B);
        sv.mostrar(A);
//        sv.mostrar(B);
        sv.inicializarA(A);
        sv.mostrar(A);
        System.out.println("----------------");
        sv.ordenar(A);
        System.out.println("----------------");
        sv.inicializarB(A, B);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author antolube20
 */
public class ArregloService {
    
    public Double [] inicializarA(Double [] A){
        for (int i = 0; i < A.length; i++) {
            
            A[i]= (Double)(Math.random()*50);
            
        }
 
        
        return A;
    }
    
    public void mostrar( Double [] A){
        for (int i = 0; i < A.length; i++) {
            System.out.print(" [+A[i]+ ]");
            
        }
        System.out.println("");
    }
    
    public void ordenar(Double [] A){
        
            Arrays.sort(A , Collections.reverseOrder());
            System.out.println(Arrays.toString(A));
        
    }
    
    public void inicializarB (Double[] vectorA, Double[] vectorB){
        Arrays.fill(vectorB, 10, 20, 0.5);
        for (int i = 0; i < 10; i++) {
            vectorB[i]=vectorA[i];
        }
        System.out.println("Arreglo B");
        System.out.println(Arrays.toString(vectorB));
    }
}

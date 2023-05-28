/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejrguia8;

import Entedides.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author antolube20
 */
public class ejer3Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio sv = new PersonaServicio();
        Persona[] persona = new Persona[4];
        boolean[] vecEdad = new boolean[4];
        short[] vecImc = new short[4];
        //llenar vectores
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa Los Datos de La Persona "+(i+1)+"°");
            persona[i] = sv.crearPersona();
            vecEdad[i] = sv.esMayordeEdad(persona[i]);
            vecImc[i] = sv.calcularIMC(persona[i]);
        }
        //cualcular Edad

        int mayor = 0;
        int menor = 0;

        for (int i = 0; i < 4; i++) {
            if (vecEdad[i]) {
                mayor++;

            } else {
                menor++;
            }
        }

        System.out.println("El Porcentaje De Mayores es : " + (mayor * 100) / 4 + "\nEl Porcentaje De Menores es : " + (menor * 100) / 4);
        int pIdeal =0;
        int pGordito =0;
        int pFlaquito =0;
        for (int i = 0; i < 4; i++) {
            if (vecImc[i]== 0){
                pIdeal++;
            }else if(vecImc[i]==-1){
                pFlaquito++;
            }else{
                pGordito++;
            }
        }
        System.out.println("El Porcentaje De Persona Con Peso Ideal Es :" + (pIdeal * 100) / 4+"%");
        System.out.println("El Porcentaje De Persona Con Peso Por Encima De Lo Ideal Es :" + (pGordito * 100) / 4+"%");
        System.out.println("El Porcentaje De Persona Con Peso Por Debajo De Lo Ideal Es :" + (pFlaquito* 100) / 4+"%");
    }
    
}

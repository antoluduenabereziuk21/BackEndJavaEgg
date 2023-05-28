/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class CadenaServicio {

    public Cadena c1() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la frase");
        Cadena c1 = new Cadena(leer.nextLine());

        return c1;
    }

    public int mostrarVocales(Cadena c1) {
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String s = c1.getFrase().substring(i, i + 1);
            if ("a".equalsIgnoreCase(s)
                    || "e".equalsIgnoreCase(s)
                    || "i".equalsIgnoreCase(s)
                    || "o".equalsIgnoreCase(s)
                    || "u".equalsIgnoreCase(s)) {

                cont++;
            }
        }
        return cont;
    }

    public void invertirFrase(Cadena c1) {
        String invFrase = "";
        for (int i = c1.getLongitud() - 1; i >= 0; i--) {
            String s = c1.getFrase().substring(i, i + 1);
            invFrase = invFrase.concat(s);
        }
        System.out.println("imprimo frase Invertida :" + invFrase);
    }

    public void vecesRepetido(String letra, Cadena c1) {
        int cont = 0;
        for (int i = 0; i < c1.getLongitud(); i++) {
            String s = c1.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(s)) {
                cont++;
            }
        }
        System.out.println("La Letra Ingresada se repite :" + cont + " tantas veces");
    }

    public void compararLongitud(String frase, Cadena c1) {
//      int longitud = frase.length();
        int resultado = c1.getFrase().compareTo(frase);
        if (resultado == 0) {
            System.out.println("La Frase Es De Igual Longitud");

        } else {
            System.out.println("La Frases Son Diferentes");
        }

//        int longitud = frase.length();        
//        if(longitud< c1.getLongitud()){
//            System.out.println("La Frase Es De Menor Longitud");
//        }else{
//            System.out.println("La Frase Es De Mayor Longitud");  
//        }
    }

    public void unirFrases(String frases, Cadena c1) {
//        String nvaCadena= c1.getFrase();
//        nvaCadena = nvaCadena.concat(frases);
//        
//        System.out.println(nvaCadena);
        System.out.println(c1.getFrase().concat(frases));

    }

    public void reemplazar(String letra, Cadena c1) {
        String nvaF="";
//        for (int i = 0; i < c1.getLongitud(); i++) {
//            String s = c1.getFrase().substring(i, i + 1);
//            if ("a".equalsIgnoreCase(s)){
//                s= letra;
//            }
//            nvaF=nvaF.concat(s);
//        }
//        System.out.println(nvaF);
        
        nvaF=c1.getFrase().replace("a", letra);
        System.out.println(nvaF);
    }
    
    public void contiene(String letra, Cadena c1){
//        boolean bandera = false;
//        for (int i = 0; i < c1.getLongitud(); i++) {
//            String s = c1.getFrase().substring(i, i + 1);
//            if (s.equalsIgnoreCase(letra)){
//                bandera= true;
//                break;
//            }
//        }
//        System.out.println(bandera);
          System.out.println(c1.getFrase().contains(letra));
          
    }
}
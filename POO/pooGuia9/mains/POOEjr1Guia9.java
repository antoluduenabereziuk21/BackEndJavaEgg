/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mains;

import Entidades.Cadena;
import Servicios.CadenaServicio;

/**
 *
 * @author antolube20
 */
public class POOEjr1Guia9 {

    public static void main(String[] args) {
        CadenaServicio sv = new CadenaServicio();
        Cadena c1 = sv.c1();
        System.out.println("Mostrar Vocales :"+sv.mostrarVocales(c1));
        
         sv.invertirFrase(c1);
         sv.vecesRepetido("o", c1);
         sv.compararLongitud("hola don pepito ", c1);
         sv.unirFrases("Hola don jose", c1);
         sv.reemplazar("#", c1);
         sv.contiene("o", c1);
    }
}

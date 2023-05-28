/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;


import Entidades.Pais;
import Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author antolube20
 */
public class Comparadores {
      /*
    La Class Compardores puede ir en plural
    Es Recomendable tener una clase que contenga todos los comparadores necesarios
    */
    public static Comparator<Pelicula> ordenarPorTituloAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            //t<t1
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
    //t>t1 va ponerlo primero a t y asi con cada elemento
    public static Comparator<Pelicula> ordenarPorDuracionDesendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    public static Comparator<Pelicula> ordenarPorDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
    public static Comparator<Pais> ordenarPorNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
    
}

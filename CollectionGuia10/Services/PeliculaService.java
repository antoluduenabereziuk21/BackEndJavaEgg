/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import utilidades.Comparadores;

import static utilidades.Comparadores.ordenarPorDuracionAscendente;

/**
 *
 * @author antolube20
 */
public class PeliculaService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas ;
    
    public PeliculaService(){
     this.peliculas = new ArrayList();
    }
    
     public void crearPelicula() {

        boolean bandera = false;
        do {
            System.out.println("Ingrese El Nombre De La Pelicula");
            String titulo = leer.next();
            System.out.println("Ingrese El Autor De La Pelicula");
            String director = leer.next();
            System.out.println("Ingrese La Duracion De La Pelicula En Horas");
            Double duracion = leer.nextDouble();
            peliculas.add(new Pelicula(titulo,director,duracion));
            System.out.println("Desea Cargar Otra Pelicula, Ingrese S para Continuar o N para Salir ");
            String continua = leer.next();

            bandera = continua.equalsIgnoreCase("s");
            System.out.println(bandera);

        } while (bandera);
    }
     
     public void mostrarPeliculas(){
         System.out.println(" Lista De Peliculas");
         for (Pelicula pelicula : peliculas) {
             System.out.println(pelicula);
         }
         System.out.println("------------------------------------------");
     }
     
     public void duracionMayorA1(){
         System.out.println("Peliculas Con Duracion Mayor A Una Hora");
         for (Pelicula pelicula : peliculas) {
             if(pelicula.getDuracion()>1){
                 System.out.println(pelicula);
             }
         }
         System.out.println("------------------------------------------");
     }
     
     public void ordenAscendenteDuracion(){
          System.out.println("Orden Por Duracion Ascendete");
         Collections.sort(peliculas, ordenarPorDuracionAscendente);
         mostrarPeliculas();
         System.out.println("------------------------------------------");
       
     }
     
     public void ordenDesendenteDuracion(){
         System.out.println("Orden Por Duracion Descendete");
         Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesendente);
         mostrarPeliculas();
         System.out.println("------------------------------------------");
     }
     
     public void ordenAlfabeticoTitulo(){
          System.out.println("Orden Por Alfabeto");
         Collections.sort(peliculas, Comparadores.ordenarPorTituloAscendente);
         mostrarPeliculas();
         System.out.println("------------------------------------------");
     }
     
     
     public void ordenAlfabeticoDirector(){
         System.out.println("Orden Por Director");
         Collections.sort(peliculas, Comparadores.ordenarPorDirector);
         mostrarPeliculas();
         System.out.println("------------------------------------------");
     }
     
      public void cargarpeliculasCodeados(){
       peliculas.add(new Pelicula("El Alquimista","Paulo Cohelo",2.5));
       peliculas.add(new Pelicula("La Monja","Steven King",3.2));
       peliculas.add(new Pelicula("Los Intocable","Martin Koo",1.25));
       peliculas.add(new Pelicula("Euforia","Desconocido",2.20));
       peliculas.add(new Pelicula("1899","Luarence Phill",1.40));
   
   }
}

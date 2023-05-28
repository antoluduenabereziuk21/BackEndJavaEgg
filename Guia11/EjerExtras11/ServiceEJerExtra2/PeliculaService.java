/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceEJerExtra2;

import Entidades.Ejer2Extra.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
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
            System.out.println("Ingrese La Duracion De La Pelicula En Horas");
            Double duracion = leer.nextDouble();
            System.out.println("Ingrese La Edad Minima De La Pelicula En Horas");
            Integer edadMin = leer.nextInt();
            System.out.println("Ingrese El Director De La Pelicula");
            String director = leer.next();
            peliculas.add(new Pelicula(titulo,duracion,edadMin,director));
            System.out.println("Desea Cargar Otra Pelicula, Ingrese S para Continuar o N para Salir ");
            String continua = leer.next();

            bandera = continua.equalsIgnoreCase("s");
            System.out.println(bandera);

        } while (bandera);
    }
     
     public void mostrarPeliculas(){
//         System.out.println(" Lista De Peliculas");
         for (Pelicula pelicula : peliculas) {
             System.out.println(pelicula.getTitulo());
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

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
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
       peliculas.add(new Pelicula("El Alquimista",1.30,18,"Paulo Cohelo"));
       peliculas.add(new Pelicula("La Monja",1.30,18,"Steven King"));
       peliculas.add(new Pelicula("Los Intocable",1.30,18,"Martin Koo"));
       peliculas.add(new Pelicula("Euforia",1.30,18,"Martin "));
       peliculas.add(new Pelicula("1899",1.30,18,"Lucas"));
   
   }
}

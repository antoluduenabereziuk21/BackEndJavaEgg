/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceEJerExtra2;

import Entidades.Ejer2Extra.Asiento;
import Entidades.Ejer2Extra.Espectador;
import Entidades.Ejer2Extra.Pelicula;
import Entidades.Ejer2Extra.Sala;
import enums.Columna;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class SalaService {
    
    public PeliculaService ps = new PeliculaService();
    
    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");

    ArrayList<Sala> salas;

    public SalaService() {
        this.salas = new ArrayList();
    }
    public void method(Sala s) {
     salas.add(s);
    }
    
    public Sala crearSala() {
        ps.cargarpeliculasCodeados();
        //deberia una sala 
        ArrayList<Asiento> butaca = new ArrayList();
        for (int i = 0; i < 8; i++) {
            for (Columna aux : Columna.values()) {
                String asiento = (8 - i) + aux.toString();
                butaca.add(new Asiento(asiento, null));
                System.out.print(asiento+" ");
                
            }
            System.out.println(" ");
        }
        Sala s = new Sala(butaca,agregarPelicula(),precioPelicula());
        method(s);
        return s;
        

    }
    
    public Pelicula agregarPelicula() {
        Pelicula pelicula = null;
        System.out.println("Ingresa La Pelicula Para Esta Sala");
        return pelicula= SeleccionPelicula();
    }
    
    public Double precioPelicula() {
        Double precio = 0.0;
        System.out.println("Ingrese El Precio Para Esta Pelicula");
        return precio = input.nextDouble();
    }
    
    public Pelicula SeleccionPelicula() {
        boolean bandera = false;
        Pelicula pelicula = null;
        System.out.println("---Seleccione una Pelicula del Listado---\n-- Para reproducir en la Sala --");
        ArrayList<Pelicula> peliculas =ps.getPeliculas();
        ps.mostrarPeliculas();
        System.out.println("Ingrese El Titulo :");
        String selc= input.next();
        for (Pelicula pelicula1 : peliculas) {
            System.out.println(pelicula1.getTitulo());
            if (pelicula1.getTitulo().equalsIgnoreCase(selc)) {
                 pelicula= pelicula1;
                 System.out.println("Pelicula Seleccionada "+pelicula1.getTitulo());
                 bandera=true;
                 break;
                 
            }
            
        }
        if (!bandera) {
            
          System.out.println("El Titulo No Se Encuentre En La Lista");
        }
        
        return pelicula;
    }
    
    public void asientosDispobles() {
        for (Sala sala : salas) {
            System.out.println(sala.toString());
        }
    }
}
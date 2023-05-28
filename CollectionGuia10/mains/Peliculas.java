/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mains;

import Services.PeliculaService;

/**
 *
 * @author antolube20
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService sv = new PeliculaService();
        
//        sv.crearPelicula();
        sv.cargarpeliculasCodeados();
        sv.mostrarPeliculas();
        sv.duracionMayorA1();
        sv.ordenAscendenteDuracion();
        sv.ordenDesendenteDuracion();
        sv.ordenAlfabeticoTitulo();
        sv.ordenAlfabeticoDirector();
    }
    
}

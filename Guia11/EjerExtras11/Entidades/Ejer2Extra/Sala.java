/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades.Ejer2Extra;

import java.util.List;

/**
 *
 * @author antolube20
 */
public class Sala {
    private List<Asiento> sala;
    private Pelicula pelicula;
    private Double precio;

    public Sala() {
    }

    public Sala(List<Asiento> sala, Pelicula pelicula, Double precio) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public List<Asiento> getSala() {
        return sala;
    }

    public void setSala(List<Asiento> sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return   sala.toString() ;
    }
    
    
    
    
}

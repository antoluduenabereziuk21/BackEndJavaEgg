/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author antolube20
 */
public class Jugador {
    
    private  static Integer id = 1;
    private String nombre;
    private boolean mojado;
//    private RevolverDeAgua revolver;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre + id++;
        this.mojado = false;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Jugador.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    public boolean disparo(RevolverDeAgua r) {
      
      mojado = r.mojar();
      r.siguienteChorro();
      return mojado;
       
    }
    
//    public String crearJugador() {
//        String nombre;
//        System.out.println("Ingrese El Nombre Del Jugador");
//        return nombre = input.next();
//    }
//    
//    public ArrayList<Jugador> cargarJugadores() {
//        System.out.println("Ingresa La Cantidad De Jugadores Entre 1  y 6");
//        int cant= input.nextInt();
//        if(cant <=6){
//            for (int i = 0; i < cant; i++) {
//                jugadores.add(new Jugador(crearJugador()));
//            }
//        }else{
//            for (int i = 0; i < 6; i++) {
//                jugadores.add(new Jugador(crearJugador()));
//            }
//        }
//        return jugadores;
//    }
}

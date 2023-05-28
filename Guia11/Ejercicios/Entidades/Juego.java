/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author antolube20
 */
public class Juego {
    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private ArrayList<Jugador> jugadores = new ArrayList();
    private RevolverDeAgua Revolver = new RevolverDeAgua();
    
    public String crearJugador() {
        String nombre;
        System.out.println("Ingrese El Nombre Del Jugador");
        return nombre = input.next();
    }
    
    public void cargarJugadores() {
        System.out.println("Ingresa La Cantidad De Jugadores Entre 1  y 6");
        int cant= input.nextInt();
        if(cant <=6){
            for (int i = 0; i < cant; i++) {
                jugadores.add(new Jugador(crearJugador()));
            }
        }else{
            for (int i = 0; i < 6; i++) {
                jugadores.add(new Jugador(crearJugador()));
            }
        }
        
    }
    
    public void llenarJuego(){
       Revolver.llenarRevolver();
//       cargarJugadores();
        System.out.println(Revolver.toString());
        
    }
    
    public void ronda() {
        for (Jugador jugador : jugadores) {
            if(jugador.disparo(Revolver)){
                System.out.println("El Jugador "+jugador.getNombre()+" Se mojo");
                break;
            }else{
                System.out.println("El jugador "+jugador.getNombre()+" No Se Mojo");
            }
        }
    }
    
    public void jugadorCodeado() {
        jugadores.add(new Jugador("jugador"));
        jugadores.add(new Jugador("jugador"));
        jugadores.add(new Jugador("jugador"));
        jugadores.add(new Jugador("jugador"));
        jugadores.add(new Jugador("jugador"));
        jugadores.add(new Jugador("jugador"));
    }
}

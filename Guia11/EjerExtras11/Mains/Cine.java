/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Espectador;

import ServiceEJerExtra2.CineService;
import java.util.ArrayList;
import services.CineServicio;

/**
 *
 * @author antolube20
 */
public class Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CineServicio cs = new CineServicio();
        
        Entidades.Cine c = cs.abrirCine();
        ArrayList<Espectador> e = cs.crearPosiblesEspectadores();
        cs.recibirPosiblesEspectadores(c, e);
        cs.verSala(c);
        cs.revisarEspectadores(c);
        
    }
    
}

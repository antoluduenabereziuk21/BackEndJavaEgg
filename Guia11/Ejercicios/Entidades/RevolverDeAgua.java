/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author antolube20
 */
public class RevolverDeAgua {
    private Integer posicionAgua;
    private Integer posicionActual;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicion, Integer posicionActual) {
        this.posicionAgua = posicion;
        this.posicionActual = posicionActual;
    }

    public Integer getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Integer posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionAgua=" + posicionAgua + ", posicionActual=" + posicionActual + '}';
    }

    public void llenarRevolver(){
        this.posicionAgua= (int) (Math.random()*6+1);
        this.posicionActual= (int) (Math.random()*6+1); 
    }
    
    public boolean mojar() { 
        return (posicionAgua == posicionActual);
    }
    
    public void siguienteChorro() {
        if(posicionActual == 6){
            posicionActual = 1;
        }else{
            posicionActual++;
        }
    }
}

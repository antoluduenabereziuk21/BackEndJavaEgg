/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entedides;

/**
 *
 * @author antolube20
 */
public class Cafetera {
    private double capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {
        this.capacidadMaxima = 2000;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = 2000;
        this.capacidadActual = capacidadActual;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
}

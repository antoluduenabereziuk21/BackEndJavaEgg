/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entedides;

/**
 *
 * @author antolube20
 */
public class NIF {

    private int dni;
    private String letra;

    public NIF() {
    }

    public NIF(int dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = (int) dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

}

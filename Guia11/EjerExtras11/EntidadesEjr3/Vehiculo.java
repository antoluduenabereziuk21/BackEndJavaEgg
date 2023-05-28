/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjr3;

/**
 *
 * @author antolube20
 */
public class Vehiculo {
    private String marca;
    private Integer modelo;
    private String numeroMotor;
    private String numeroChasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, Integer modelo, String numeroMotor, String numeroChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroMotor = numeroMotor;
        this.numeroChasis = numeroChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Marca=" + marca + ", modelo=" + modelo + " \n"
                + " numeroMotor=" + numeroMotor + ", numeroChasis=" + numeroChasis + "\n"
                + " color=" + color + ", tipo=" + tipo ;
    }
    
    
    
    
    
}

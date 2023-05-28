/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author antolube20
 */
public enum TipoVehiculo {
    COMIONETA("CAMIONETA"),SEDAN("SEDAN"),UTILITARIO("UTILITARIO");
    
    private String tipo;

    private TipoVehiculo() {
    }

    private TipoVehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author antolube20
 */
public enum TipoCobertura {
    TOTAL("TOTAL"),TERCEROS("TERCEROS"),TERCEROS_COMPLETO("TERCEROS_COMPLETO");
    
    private String tipo;

    private TipoCobertura() {
    }

    private TipoCobertura(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}

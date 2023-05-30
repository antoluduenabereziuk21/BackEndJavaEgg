/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer2Y3;

/**
 *
 * @author antolube20
 */
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, String color, char consumoElectrico, double peso) {
        super(color, consumoElectrico, peso);
        this.carga = carga;
    }
     public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora() {
        this.crearElectrodomestico();
        System.out.println("Ingrese el peso de carga: ");
        carga = input.nextDouble();
    }

    @Override
    public void precioFinal() {
        super.precioFinal(); 
        if(carga>=30){
            precio+=500;
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+"Lavadora {"+carga +"}"; 
    }

    
    
}

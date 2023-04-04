/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

/**
 *
 * @author antolube20
 */
public class Rectangulo {
    private int lado1;
    private int lado2;

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public int calcular_area(){
         int area = lado1 * lado2;
         return area;
    }
}

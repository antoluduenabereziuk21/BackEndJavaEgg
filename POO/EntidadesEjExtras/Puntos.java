/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Puntos {
    private int x1,y1,x2,y2;
    Scanner leer = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#.00");
    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        System.out.println("Ingresa La Primera Cordena Del Punto :");
        x1=leer.nextInt();
        System.out.println("Ingresa La Segunda Cordena Del Punto :");
        y1=leer.nextInt();
        System.out.println("Ingresa La Primera Cordena Del Segundo Punto :");
        x2=leer.nextInt();
        System.out.println("Ingresa La Primera Cordena Del  Segundo Punto :");
        y2=leer.nextInt();
    }
    
    
    public String calcular(){
        
        double resultado;
       
        resultado= Math.sqrt( Math.pow( (x2 - x1), 2 ) + Math.pow((y2 - y1),2));
        
        return df.format(resultado);
    }
}

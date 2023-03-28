/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Operacion {
    private int num1,num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el 1° numero :");
        num1= leer.nextInt(); 
        System.out.println("Ingresa el 2° numero :");
        num2= leer.nextInt(); 
    }
    
    public int sumar(){
         return (num1 + num2);
        
    }
    
    public int restar(){
        return (num1 - num2);
        
    }
    public int multiplicar(){
        if (num2!=0 && num1!=0){
            return (num1 * num2);    
        }else{
            System.out.println("La Multiplicacion por 0 No es Posible");
            return 0;
        }
    }
    public int division(){
        if (num2!=0){
            return (num1 / num2);    
        }else{
            System.out.println("La Division por 0 No es Posible");
            return 0;
        }
    }
}

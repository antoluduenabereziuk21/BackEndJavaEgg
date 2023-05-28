/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.text.DecimalFormat;

/**
 *
 * @author antolube20
 */
public class ParDeNumerosService {
    
    DecimalFormat df = new DecimalFormat("#.00");

    ParDeNumeros parD = new ParDeNumeros();

    public void mostrarValores() {

        System.out.println("Numero 1 " + parD.num1);
        System.out.println("Numero 2 " + parD.num2);
    }

    public void devolverMayor() {

        if (parD.getNum1() > parD.getNum2()) {
            System.out.println("El Mayor Es : " +df.format(parD.getNum1()) );
        } else {
            System.out.println("El Mayor Es : " + df.format(parD.getNum2()));
        }

    }

    public void calcularPotencia() {
        int num1 = Math.round(parD.num1);
        int num2 = Math.round(parD.num2);

        if (parD.getNum1() > parD.getNum2()) {
            System.out.println("La Potencia del 1° Elevado Al 2° :" +df.format(Math.pow(num1, num2)));
        } else {
            System.out.println("La Potencia del 2° Elevado Al 1° :" +df.format(Math.pow(num2, num1)));
        }

    }

    public void calculaRaiz() {
        int num1 = Math.abs(Math.round(parD.num1));
        int num2 = Math.abs(Math.round(parD.num2));
       

        if (parD.getNum1() < parD.getNum2()) {
            System.out.println("la raiz del 1° sobre 2° es :"+df.format(Math.sqrt(num1)));
        } else {
            System.out.println("la raiz del 2° sobre 1° es :"+df.format(Math.sqrt(num2)));

        }
    }

}

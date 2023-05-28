/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejrguia8;

import Entedides.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class ejer1Guia8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cS1= new CuentaBancariaServicio();
        CuentaBancaria cl1 = new CuentaBancaria();
        
        cl1 = cS1.crearCuentaUsuario();
        cS1.menuOperaciones(cl1);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase3dur3enc;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Ejr5bClase6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el tamanio del cuadrado: ");
		
		for (int i = 0, size = scan.nextInt(); i < size; i++) {
			for (int j = 0; j < size; j++) {
				//Operador ternario -> ?
				//Uso -> condicion ? retornoPorVerdadero : retornoPorFalso;
				System.out.printf("%s", (i == 0 | j == 0 | i == (size - 1) | j == size - 1) ? " * " : "   ");
			}
			System.out.print("\n");
		}
        // TODO code application logic here
    }
    
}

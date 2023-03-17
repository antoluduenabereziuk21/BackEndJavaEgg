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
public class Ejer7Clase4 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
     * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de
     * 5 caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O. Las secuencias leídas que respeten el formato se
     * consideran correctas, la secuencia especial “&&&&&” marca el final de los
     * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete
     * el formato se considera incorrecta. Al finalizar el proceso, se imprime
     * un informe indicando la cantidad de lecturas correctas e incorrectas
     * recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan
     * las siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la frase rs232:");

        int correctas,incorrectas;
        correctas=0;
        incorrectas=0;
        boolean sesion;
        sesion = true;
        


        
        do{
            String frase = leer.next();
            if(frase.length()==5 && frase.substring(0,1)=="X" && frase.substring(4, 5)== "O"){
                correctas+=1;
                System.out.println("frases encontradas correctas: "+correctas);
            }else{
                incorrectas+=1;
                System.out.println("frases encontradas incorrectas: "+incorrectas);

            }
            if(frase.equalsIgnoreCase("&&&&&")) {
                     
                        sesion=false;
                    }
            System.out.println("frase");
        
        }while(sesion == true);
        System.out.println("frase");
    }
}
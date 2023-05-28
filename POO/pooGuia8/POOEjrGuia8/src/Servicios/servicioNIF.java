/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entedides.NIF;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class servicioNIF {

    NIF p1 = new NIF();
    Scanner leer = new Scanner(System.in);

    public void crarNIF() {
        long num;
        
        System.out.println("ingrese el numero de DNI de 8 digitos");
        num = leer.nextInt();
        System.out.println(num);
        while (String.valueOf(num).length() != 8){
            System.out.println("ingrese el numero de DNI de 8 digitos");
            num = leer.nextInt();
        }
        
         String[] NIF = new String[23];
            NIF[0] = "T";
            NIF[1] = "R";   
            NIF[2] = "W";
            NIF[3] = "A";
            NIF[4] = "G";
            NIF[5] = "M";
            NIF[6] = "Y";
            NIF[7] = "F";
            NIF[8] = "P";
            NIF[9] = "D";
            NIF[10] = "X";
            NIF[11] = "B";
            NIF[12] = "N";
            NIF[13] = "J";
            NIF[14] = "Z";
            NIF[15] = "S";
            NIF[16] = "Q";
            NIF[17] = "V";
            NIF[18] = "H";
            NIF[19] = "L";
           NIF[20] = "C";
            NIF[21] = "K";
            NIF[22] = "E";
           p1.setDni(num);
           num = (int) (p1.getDni() % 23);
            p1.setLetra(NIF[(int)num]);
//        do {
//
//            System.out.println("ingrese el numero de DNI de 8 digitos");
//            String[] NIF = new String[23];
//            NIF[0] = "T";
//            NIF[1] = "R";
//            NIF[2] = "W";
//            NIF[3] = "A";
//            NIF[4] = "G";
//            NIF[5] = "M";
//            NIF[6] = "Y";
//            NIF[7] = "F";
//            NIF[8] = "P";
//            NIF[9] = "D";
//            NIF[10] = "X";
//            NIF[11] = "B";
//            NIF[12] = "N";
//            NIF[13] = "J";
//            NIF[14] = "Z";
//            NIF[15] = "S";
//            NIF[16] = "Q";
//            NIF[17] = "V";
//            NIF[18] = "H";
//            NIF[19] = "L";
//            NIF[20] = "C";
//            NIF[21] = "K";
//            NIF[22] = "E";
//            p1.setDni(leer.nextInt());
//            num = (int) (p1.getDni() % 23);
//            p1.setLetra(NIF[num]);
//        } while (String.valueOf(p1.getDni()).length() != 8);;
    }

    public void mostrar() {
        System.out.println(p1.getDni() + "-" + p1.getLetra());

    }
}

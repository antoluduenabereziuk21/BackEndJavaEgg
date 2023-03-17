/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerExtras1;

/**
 *
 * @author antolube20
 */
public class Ej2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A,B,C,D,E;
        A=1;
        B=2;
        C=3;
        D=4;
        System.out.println("valores Iniciales, A ="+A+"; B ="+B+"; C="+C+"; D="+D);
        E=B;
        B=C;
        C=A;
        A=D;
        D=E;
        
        System.out.println("valores reasignados, A ="+A+"; B ="+B+"; C="+C+"; D="+D);

        // TODO code application logic here
    }
    
}

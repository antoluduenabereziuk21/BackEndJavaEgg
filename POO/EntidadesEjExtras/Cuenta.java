/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Cuenta {
    private int saldo = 1000;
    private String titular;
    Scanner leer = new Scanner(System.in);

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    
    public void retirar_dinero(){
        System.out.println("Ingrese Su Nombre");
        titular=leer.nextLine();
        int retiro = 0;
        int resp = 1;
        System.out.println("Buenos dias " + titular);
        do {
            if (retiro > saldo) {
                System.out.println("No tiene saldo en su cuenta");
            } else if (retiro <= saldo) {
                System.out.println("Su saldo es de: $" + saldo);
                System.out.println("¿Cuanto desea retirar?");
                System.out.print("$");
                retiro = leer.nextInt();
                saldo -= retiro;
                System.out.println("Retiro $" + retiro);
            }
            System.out.println("Tiene en su cuenta $" + saldo);
            System.out.println("1-Seguir retirando dinero\n2-Salir");
            resp = leer.nextInt();
        } while (resp != 2);
        System.out.println("Que tenga un buen dia");
    }
    
}

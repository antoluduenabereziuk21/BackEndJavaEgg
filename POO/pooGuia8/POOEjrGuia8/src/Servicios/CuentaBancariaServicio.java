/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entedides.CuentaBancaria;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author antolube20
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancariaServicio() {
    }

    public CuentaBancaria crearCuentaUsuario() {
        CuentaBancaria c1 = new CuentaBancaria();
        System.out.println("Ingrese su dni cliente");
        c1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el saldo");
        c1.setSaldoActual(leer.nextDouble());

        return c1;

    }

    public void ingresarDinero(double ingreso, CuentaBancaria c1) {
        System.out.println("su saldo actual es " + c1.getSaldoActual() + "$");
        c1.setSaldoActual(ingreso + c1.getSaldoActual());
        System.out.println("nuevo sal es " + c1.getSaldoActual() + "$");

    }

    public void retirarDinero(double retiro, CuentaBancaria c1) {
        int resp = 1;
        System.out.println("Buenos dias ");
        do {
            if (retiro > c1.getSaldoActual()) {
                System.out.println("No tiene saldo en su cuenta");
            } else if (retiro <= c1.getSaldoActual()) {
                System.out.println("Su saldo es de: $" + c1.getSaldoActual());

                c1.setSaldoActual(c1.getSaldoActual() - retiro);
                System.out.println("Retiro $" + retiro);
            }
            System.out.println("Tiene en su cuenta $" + c1.getSaldoActual());
            System.out.println("1-Seguir retirando dinero\n2-Salir");
            resp = leer.nextInt();
        } while (resp != 2);
        System.out.println("Que tenga un buen dia");
    }

    public void extraccionRapida(double retiro, CuentaBancaria c1) {
        int resp = 1;
        System.out.println("Buenos dias Bienvenido a Extraccion Rapida ");
        do {
            if (retiro > (c1.getSaldoActual()) * 0.2) {
                System.out.println("No Es Posible Retirar La Cifra\nEl Monto Maximo es:"
                        + "$" + (c1.getSaldoActual()) * 0.2);
                break;
            } else if (retiro <= c1.getSaldoActual()) {
                System.out.println("Su saldo es de: $" + c1.getSaldoActual());

                c1.setSaldoActual(c1.getSaldoActual() - retiro);
                System.out.println("Retiro $" + retiro);
            }
            System.out.println("Tiene en su cuenta $" + c1.getSaldoActual());
            System.out.println("1-Seguir retirando dinero\n2-Salir");
            resp = leer.nextInt();
        } while (resp != 2);
        System.out.println("Que tenga un buen dia");
    }

    public void consultarSaldo(CuentaBancaria c1) {
        System.out.println("Saldo : $" + c1.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria c1) {
        System.out.println("DNI TItular : " + c1.getDniCliente());
        System.out.println("Numero De Cuenta : " + c1.getNumeroCuenta());
        System.out.println("Saldo : $" + c1.getSaldoActual());
    }

    public void menuOperaciones(CuentaBancaria cl) {
        int op = 0;
        do {
            System.out.println("--------------------------------------");
            System.out.println("- Bienvenido Al Menu De Operaciones  -");
            System.out.println("--------------------------------------");
            System.out.println("- Seleccione La Operacion A Realizar -");
            System.out.println("- 1* Ingresar Dinero                -");
            System.out.println("- 2* Extraccion                      -");
            System.out.println("- 3* Extraccion Rapida               -");
            System.out.println("- 4* Consultar Saldo                 -");
            System.out.println("- 5* Consultar Datos Titular         -");
            System.out.println("- 6* Salir Menu -");
            op = leer.nextInt();
            while (op < 1 || op > 6) {
                System.out.println("--    *****Opcion No Valida****     --");
                System.out.println("-- *****Seleccione Nuevamente****   --");
                System.out.println("");
                System.out.println("--------------------------------------");
                System.out.println("- Bienvenido Al Menu De Operaciones  -");
                System.out.println("--------------------------------------");
                System.out.println("- Seleccione La Operacion A Realizar -");
                System.out.println("- 1* Ingresar Dinero                 -");
                System.out.println("- 2* Extraccion                      -");
                System.out.println("- 3* Extraccion Rapida               -");
                System.out.println("- 4* Consultar Saldo                 -");
                System.out.println("- 5* Consultar Datos Titular         -");
                System.out.println("- 6* Salir Menu                      -");
                System.out.println("--------------------------------------");
                System.out.println("- Bienvenido Al Menu De Operaciones  -");
                System.out.println("--------------------------------------");
                op = leer.nextInt();
            }
            switch (op) {

                case 1:
                    System.out.println("Ingrese el saldo a Cargar");
                    ingresarDinero(leer.nextDouble(), cl);
                    break;
                case 2:
                    System.out.println("Ingrese el saldo a Retirar");
                    retirarDinero(leer.nextDouble(), cl);
                    break;
                case 3:
                    System.out.println("Ingrese el saldo a Retirar");
                    extraccionRapida(leer.nextDouble(), cl);
                    break;
                case 4:
                    consultarSaldo(cl);
                    break;
                case 5:
                    consultarDatos(cl);
                    break;
                case 6:
                    System.out.println("Saliendo Del Menu");
                    break;

            }

        } while (op != 6);
        System.out.println("Que tenga un buen dia");
    }
}

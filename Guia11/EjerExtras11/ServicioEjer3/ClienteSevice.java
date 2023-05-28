/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioEjer3;

import EntidadesEjr3.Cliente;
import EntidadesEjr3.Cuota;
import EntidadesEjr3.Poliza;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class ClienteSevice {

    PolizaService ps;

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
///SearchClient Retorna La Poliza Segun El Dni Cliente , atravez De la Cual Se modificaran Los datos

    public Poliza searchClient(HashMap<Integer, Poliza> polizas, Integer dni) {
        boolean bandera = false;
        for (Map.Entry<Integer, Poliza> entry : polizas.entrySet()) {
            Object key = entry.getKey();
            Poliza val = entry.getValue();
            if (dni.equals(key)) {
                bandera = true;
                return val;
//                updateCliente(val);

            }
        }
        if (!bandera) {
            System.out.println("No Se Encontro El Cliente");
        }
        return null;
    }

    public void updateCliente(Poliza poliza) {

        Cliente clienteUpdate = poliza.getCliente();
        System.out.println("Ingrese El Campo a Modificar");
        System.out.println(clienteUpdate);

    }

    public void mostrarCuotas(Poliza poliza) {
        List<Cuota> c1 = poliza.getCtasPoliza();
        System.out.println("--------------Cuotas------------------- ");
        System.out.println("---------------------------------------");
        for (Cuota cuota : c1) {
            System.out.println("*****************************************");
            System.out.println(cuota.toString());
            System.out.println("*****************************************");
        }
    }

    public void pagarCuotas(Poliza poliza) {
        boolean bandera = false;
        List<Cuota> c1 = poliza.getCtasPoliza();
        System.out.println("Selecciones Una Cuota Para Pagar");
        System.out.println("--------------Cuotas------------------- ");
        System.out.println("---------------------------------------");
        for (Cuota cuota : c1) {
            System.out.println("*****************************************");
            System.out.println(cuota.getNumCuota()+" - $ "+cuota.getMonto()+"\n"
            + "Vencimiento: "+cuota.fecha());
            System.out.println("*****************************************");
        }
        int cuotaPago = input.nextInt();
        for (Cuota cuota : c1) {
            if (cuota.getNumCuota() == cuotaPago) {
                cuota.setPagado(true);
                System.out.println("Pago Realizado");
                bandera = true;
                break;
            }
        }
        if (!bandera) {
            System.out.println("Error No Se Encontro Numero De Cuota");
        }

    }

    public void gestionCuotas(Poliza poliza) {

        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- La Tercera Seguros  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Consultar Cuotas \n2-Pagar Cuota " + "\n-3 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    mostrarCuotas(poliza);

                    break;
                case 2:
                    pagarCuotas(poliza);
                    break;
                case 3:
                    System.out.println("Regresando Al Menu Principal");
                    bandera = true;
//                    eliminarProducto();
                    break;

                default:
                    System.out.println("Fijate Que Te estoy Pidiendo");
                    throw new AssertionError();
            }
        } while (!bandera);
    }
}

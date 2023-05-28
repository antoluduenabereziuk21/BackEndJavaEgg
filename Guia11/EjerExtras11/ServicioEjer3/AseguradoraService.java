/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioEjer3;

//import EntidadesEjr3.Cliente;
//import EntidadesEjr3.Poliza;
//import EntidadesEjr3.Vehiculo;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
import EntidadesEjr3.Poliza;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class AseguradoraService {

    Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    private PolizaService ps = new PolizaService();
    private ClienteSevice cs = new ClienteSevice();

   

    public void menu() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- La Tercera Seguros  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Operacion A Realizar");
            System.out.println("1- Cargar Nueva Poliza \n2-Modificar Datos Asegurod/a "
                    + "\n3-Elminar Poliza\n" + "4-Gestion De Cuotas"
                    + "\n-6 Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    ps.nuevaPoliza();
                    System.out.println("Poliza Generada");
                    ps.mostrarPolizas();
                    break;
                case 2:
                    System.out.println("Ingrese El Numero de Dni Del Cliente");
                    Integer dni = input.nextInt();
                    cs.updateCliente(cs.searchClient(ps.mpolizas,dni));
                    break;
                case 3:
                    System.out.println("Ingrese El Numero de Dni Del Cliente");
                    Integer dni1 = input.nextInt();
                    ps.deletePoliza(dni1);
                    break;
                case 4:
                    System.out.println("-----------Gestion Cuotas-----------");
//                    System.out.println("Ingrese El Numero de Dni Del Cliente");
//                    Integer dni2 = input.nextInt();
                    Integer dni2= 3234564;
                    Poliza p1= cs.searchClient(ps.mpolizas, dni2);
                    cs.gestionCuotas(p1);
                    break;
                case 6:
                    System.out.println("Saliendo del Programa");
                    bandera = true;
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!bandera);

    }

//    public void nuevaPoliza() {
//        Integer numPoliza = (int) (Math.random() * 1000 * 1000 + 1);
//        System.out.println("numeroPilza: " + numPoliza);
//        System.out.println("Ingrese La Fecha de Inicio dd/mm/aaaa");
//        String fecha = input.next();
//        Date inicioPoliza = cargaFecha(fecha);
//        System.out.println("Ingrese La Fecha de Fin dd/mm/aaaa");
//        String fecha2 = input.next();
//        Date finPoliza = cargaFecha(fecha2);
//        System.out.println("Ingrese La Canitdad De Cuotas :");
//        Integer cantCuotas = input.nextInt();
//        System.out.println("Ingrese El Medio De Pago :");
//        String medioPago = input.next();
//        System.out.println("Ingrese La Suma Asegurada :");
//        Integer sumaAsegurada = input.nextInt();
//        System.out.println("Incluye Cobertura Contra Granizo? Si/NO");
//        String rep = input.next();
//        if (rep.equalsIgnoreCase("si")) {
//            Boolean incGranizo = true;
//            System.out.println("Inrese El monto de Cobertura Por Granizo:");
//            Integer cobGranizo = input.nextInt();
//        } else {
//            Boolean incGranizo = false;
//            Integer cobGranizo = 0;
//        }
//
//        System.out.println("Ingrese El tipo De Cobertura");
//        String tipoCober = input.next();
//        polizas.add(
//                new Poliza(crearCliente(),
//                        cargarVehiculo(),
//                        Integer.SIZE,
//                        inicioPoliza,
//                        finPoliza,
//                        Integer.BYTES,
//                        medioPago,
//                        sumaAsegurada,
//                        Boolean.TRUE,
//                        Integer.SIZE,
//                        tipoCober));
//        cargaCodeados();
//        System.out.println(polizas.get(0).toString());
//    }

//    public Cliente crearCliente() {
//        System.out.println("Ingrese El Nombre:");
//        String nombre = input.next();
//        System.out.println("Ingrese El Apellido :");
//        String apellido = input.next();
//        System.out.println("Ingrese El Documento :");
//        Integer documento = input.nextInt();
//        System.out.println("Ingrese El Mail :");
//        String mail = input.next();
//        System.out.println("Ingrese El Domicilio :");
//        String domicilio = input.next();
//        System.out.println("Ingrese El Telefono :");
//        Integer telefono = input.nextInt();
//
//        return new Cliente(nombre, nombre, Integer.SIZE,
//                nombre, nombre, Integer.SIZE);
//
//    }

//    public Vehiculo cargarVehiculo() {
//        System.out.println("Ingrese La Marca Del Vehiculo:");
//        String marca = input.next();
//        System.out.println("Ingrese El Modelo(año) Del Vehiculo:");
//        Integer modelo = input.nextInt();
//        System.out.println("Ingrese N° De Motor Del Vehiculo:");
//        String numeroMotor = input.next();
//        System.out.println("Ingrese N° De Chasis Del Vehiculo:");
//        String numeroChasis = input.next();
//        System.out.println("Ingrese El Color Del Vehiculo:");
//        String color = input.next();
//        System.out.println("Ingrese El Tipo De Vehiculo:");
//        String tipo = input.next();
//
//        return new Vehiculo(marca, modelo, numeroChasis,
//                numeroChasis, color, tipo);
//
//    }
    
   
//    public Date cargaFecha(String fecha) {
//
//        String fechaString = fecha;
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date date = sdf.parse(fechaString);
////            System.out.println(date);
//            return date;
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

//    public void cargaCodeados() {
//        Cliente c1 = new Cliente("pepe", "chikito", 12345678, "juancito@juancito.com", "mi casa", 12345678);
//        Vehiculo v1 = new Vehiculo("volvo", 2023, "AB12345c", "AB2546j", "negro", "sedan");
//        
//        polizas.add(new Poliza(c1, v1, 123456789, cargaFecha("12/05/2023"), cargaFecha("31/12/2023"), 1200000, "Efectivo", 7, false, 0, "total"));
//    }

//    public Integer generadorCuotas() {
//        System.out.println("Ingrese La Canitdad De Cuotas :");
//        Integer cantCuotas = input.nextInt();
//        return cantCuotas;
//    }
//    
//    public String medioPago() {
//        System.out.println("Ingrese El Medio De Pago :");
//        String medioPago = input.next();
//        return medioPago;
//    }
//
//    public void gestionCuotas() {
//        System.out.println("Ingrese El Documento Para Buscar Las Cuotas Generadas");
//        Integer dniCons= input.nextInt();
//    }

    private void updateClient(HashMap<Integer, Poliza> mpolizas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
/*
        
        String fechaString = "2023-05-22";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = sdf.parse(fechaString);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        System.out.print("Fecha (dd/mm/YYYY): ");
        String[] fecha=leer.next().split("/");
        return  new Date(Integer.parseInt(fecha[2])-1900,Integer.parseInt(fecha[1])-1,Integer.parseInt(fecha[0])));
        
 */

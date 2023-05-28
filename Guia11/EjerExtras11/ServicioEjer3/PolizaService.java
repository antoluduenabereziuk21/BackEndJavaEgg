/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServicioEjer3;

import EntidadesEjr3.Cliente;
import EntidadesEjr3.Poliza;
import EntidadesEjr3.Vehiculo;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class PolizaService {
    Boolean incGranizo;
    Integer cobGranizo;
    /*
    Se crea Un mapa con el fin de poder ubicar las polizas por dni
     */
    protected HashMap<Integer, Poliza> mpolizas = new HashMap();
    private Scanner input = new Scanner(System.in, "ISO-8859-1")
            .useDelimiter("\n");

//    public PolizaService() {
//        this.mpolizas = new HashMap();
//    }
    
    public void mostrarPolizas() {
        for (Map.Entry<Integer, Poliza> entry : mpolizas.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(val);
            
//            System.out.println("muesto cuotas"+entry.getValue().method());
            
        }
    }
    public void nuevaPoliza() {

        Poliza nvaPoliza = crearPoliza();
//        System.out.println("Entre a  nuevaPoliza");
        Integer dni = nvaPoliza.getCliente().getDocumento();
//        System.out.println("Entre a generar el dni para el map");

        mpolizas.put(dni, nvaPoliza);
       
//        mpolizas.put(32456154, null);
//        mpolizas.put(32456154, null);
//        mpolizas.put(32456154, null);
//        System.out.println("Pase el Map , dni "+dni+"obejtoPoliza "+nvaPoliza);
        

    }

    public Cliente crearCliente() {
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
        Vehiculo vehiculo = cargarVehiculo();
//        System.out.println("Entre a Crear Cliente");
        return new Cliente("juan","perez",3234564,"juan@gmail.com","la calera",3512456,vehiculo);
//        return new Cliente(nombre, nombre, Integer.SIZE,
//                mail, domicilio, Integer.SIZE, vehiculo);
        

    }

    public Vehiculo cargarVehiculo() {
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
//        System.out.println("Entre a Crear Vehiculo");
 return new Vehiculo("vw",2010,"asdas4546","asdasd545","gris","sedan");
//        return new Vehiculo(marca, modelo, numeroChasis,
//                numeroChasis, color, tipo);

    }
    
    public Poliza crearPoliza() {

        Integer numPoliza = (int) (Math.random() * 1000 * 1000 + 1);
//        System.out.println("numeroPilza: " + numPoliza);
//        System.out.println("Ingrese La Suma Asegurada :");
//        Integer sumaAsegurada = input.nextInt();
//        System.out.println("Ingrese La Cantidad De Cuotas");
//        Integer cantCuotas = input.nextInt();
//       
//        System.out.println("Incluye Cobertura Contra Granizo? Si/NO");
//        String rep = input.next();
//        
//        if (rep.equalsIgnoreCase("si")) {
//            this.incGranizo = true;
//            System.out.println("Inrese El monto de Cobertura Por Granizo:");
//            this.cobGranizo = input.nextInt();
//        }else{
//             this.incGranizo = false;
//             this.cobGranizo  = 0;
//        }

        Vehiculo vehiculo= crearCliente().getVehiculos().get(0);
//        System.out.println("Ingrese El tipo De Cobertura");
//        String tipoCober = input.next();
//        System.out.println("Saliendo de CrearPoliza");

//        return new Poliza(crearCliente(),cargarVehiculo(),numPoliza,sumaAsegurada,cantCuotas,incGranizo,cobGranizo);
        return new Poliza(crearCliente(),vehiculo, numPoliza, 2000000,6, true, 150000, "Total");

        
    }
    
    public void deletePoliza(Integer dni) {
        System.out.println("Esta A Punto De Elminar El Cliente,"
                + "Ingrese S pra Confirmar o N para Cancelar ");
        String resp = input.next();
        if(resp.equalsIgnoreCase("S")){
            for (Map.Entry<Integer, Poliza> entry : mpolizas.entrySet()) {
                Integer key = entry.getKey();
                Poliza val = entry.getValue();
                if(dni == key){
                    mpolizas.remove(key);
                    System.out.println("Cliente Elminado");
                    break;
                }
                
            }
        }else{
            System.out.println("Operacion Cancelada Volviendo Al Menu Principal");
        }
        
    }
     
    

}

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
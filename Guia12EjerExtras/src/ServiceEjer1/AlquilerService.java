/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceEjer1;

import EntidadesEjer1.Alquiler;
import EntidadesEjer1.Barco;
import EntidadesEjer1.BarcoMotor;
import EntidadesEjer1.Velero;
import EntidadesEjer1.Yates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class AlquilerService {

    private Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    protected HashMap<Integer, Alquiler> mAlquiler = new HashMap();

    public void alquilerAmarre() {
        System.out.println("Ingrese los Datos Para El Alquiler Del Amarre ");
        Alquiler alquiler = crearAlquiler();
        mAlquiler.put(alquiler.getDocumento(), alquiler);
    }
     public void costoAmarre(LocalDate fechaAlquiler,LocalDate fechaDevolucion,Barco barco) {
        /*La Estadia De La Embarcacion 
        Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
        alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
        multiplicando por 10 los metros de eslora).
         */
        int costoFinal= 0;
        LocalDate fecha1 = fechaAlquiler;
         System.out.println("Fecha Alquiler "+fechaAlquiler);
        LocalDate fecha2 = fechaDevolucion;
        System.out.println("Fecha Devolucion "+fechaDevolucion);
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
        Integer eslora = barco.getEslora();
        int costo = eslora*10;
        if(barco instanceof Velero){
           costoFinal= costo+ ((Velero) barco).getNumeroMastiles();
           System.out.println("El Costo Del Amarre sera :$"+costoFinal*dias+" por "+dias+" dias");
        }else if(barco instanceof BarcoMotor){
            costoFinal= costo+ ((BarcoMotor) barco).getCv();
            System.out.println("El Costo Del Amarre sera :$"+costoFinal*dias+" por "+dias+" dias");
        
        }else if (barco instanceof Yates){
            costoFinal= costo+ ((Yates) barco).getCv()+((Yates) barco).getNumCamarotes() ;
            System.out.println("El Costo Del Amarre sera :$"+costoFinal*dias+" por "+dias+" dias");
            
        }
        
        
    }
    private Alquiler crearAlquiler() {
        System.out.println("Ingrese El Nombre:");
        String nombre = input.next();
        System.out.println("Ingrese El Apellido :");
        String apellido = input.next();
        System.out.println("Ingrese El Documento :");
        Integer documento = input.nextInt();
        LocalDate fechaAlquiler = LocalDate.now();
        LocalDate fechaDevolucion = fechaDevolucion();
        Barco barco = Embarcaciones();
        costoAmarre(fechaAlquiler, fechaDevolucion,barco);

        return new Alquiler(nombre, documento, fechaAlquiler, fechaDevolucion, nombre, barco);

    }

    public Barco basicDateBarco() {
        System.out.println("Ingrese La Matricula De La Embarcacion");
        Integer matricula = input.nextInt();
        System.out.println("Ingrese La Eslora De La Embarcacion");
        Integer eslora = input.nextInt();
        System.out.println("Ingrese El Año De Fabricacion De La Embarcacion");
        Integer AnoFabricacion = input.nextInt();
        return new Barco(matricula, eslora, AnoFabricacion);
    }

    ;
    
    private Velero crearVelero() {
        System.out.println("Ingrese La Cantidad De Mastiles De La Embarcacion");
        Integer numeroMastiles = input.nextInt();
        Barco barco = basicDateBarco();
        return new Velero(numeroMastiles, barco.getMatricula(), barco.getEslora(), barco.getAnoFabricacion());
    }

    private BarcoMotor crearBarcoMotor() {
        System.out.println("Ingrese La Cantidad De CV De La Embarcacion");
        Integer cV = input.nextInt();
        Barco barco = basicDateBarco();
        return new BarcoMotor(cV, barco.getMatricula(), barco.getEslora(), barco.getAnoFabricacion());
    }

    private Yates crearYates() {
        System.out.println("Ingrese La Cantidad De CV De La Embarcacion");
        Integer cV = input.nextInt();
        System.out.println("Ingrese La Cantidad De Camarotes De La Embarcacion");
        Integer camarotes = input.nextInt();
        Barco barco = basicDateBarco();
        return new Yates(camarotes, cV, barco.getMatricula(), barco.getEslora(), barco.getAnoFabricacion());
    }

   

    public Barco Embarcaciones() {
        boolean bandera = false;
        do {
            System.out.println("-------------------------");
            System.out.println("-- Muelle Argentino  --");
            System.out.println("-------------------------");
            System.out.println("-- Panel Administrador --");
            System.out.println("-------------------------");
            System.out.println("Selecciona La Embarcacion A Amarrar");
            System.out.println("1- Velero \n2- Barco Motor "
                    + "\n3-Yate  \n" + "4-Salir");
            int op = input.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Ingrese los Datos De La Embarcacion");
                    return crearVelero();

                case 2:
                    System.out.println("Ingrese los Datos De La Embarcacion");
                    return crearBarcoMotor();

                case 3:
                    System.out.println("Ingrese los Datos De La Embarcacion");
                    return crearYates();

                case 4:
                    System.out.println("Saliendo Al Menu Principal");
                    bandera = true;
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!bandera);

        return null;
    }

    public LocalDate fechaDevolucion() {
        /*
        System.out.println("Ingrese la fecha de inicio de alquiler (día/mes/año)");
       int dia = input.nextInt();
       int mes = input.nextInt();
       int anio = input.nextInt();
       LocalDate fecha_Alquiler = LocalDate.of(anio+1900, mes, dia);
       System.out.println("Ingrese la fecha de devolución (día/mes/año)");
       int dia2 = input.nextInt();
       int mes2 = input.nextInt();
       int anio2 = input.nextInt();
       LocalDate fecha_Devolucion = LocalDate.of(anio2+1900, mes2, dia2);
       int dias = (int) (ChronoUnit.DAYS.between(fecha_Alquiler, fecha_Devolucion));
        
        */
//        System.out.println("Ingrese Año,Mes, y Dia de Devolucion (dd/mm/yyyy)");
        System.out.println("Ingrese la fecha de devolución (día/mes/año)");
       int dia2 = input.nextInt();
       int mes2 = input.nextInt();
       int anio2 = input.nextInt();
       LocalDate fecha_Devolucion = LocalDate.of(anio2, mes2, dia2);
//        String fecha = input.next();
//        Date f1=cargaFecha(fecha);
//        LocalDate f2= f1.toInstant().atZone( );
//        System.out.println("f2 :"+f2);
        return fecha_Devolucion;

    }

    public Date cargaFecha(String fecha) {

        String fechaString = fecha;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            Date date = sdf.parse(fechaString);
            System.out.println("date :"+date);
//            System.out.println(date);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}

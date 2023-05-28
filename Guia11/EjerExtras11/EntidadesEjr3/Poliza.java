/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjr3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author antolube20
 */
public class Poliza {

    private Cliente cliente;
    private Vehiculo vehiculo;
    private Integer numPoliza;
    private LocalDate inicioPoliza = LocalDate.now();
    private Calendar finPoliza;
    private Integer sumaAsegurada;
    private Integer numCuotas;
    private List<Cuota> ctasPoliza;
    private Boolean incGranizo;
    private Integer cobGranizo;
    private String tipoCober;

    public Poliza(Cliente cliente, Vehiculo vehiculo, Integer numPoliza,
            Integer sumaAsegurada, Integer numCuotas, Boolean incGranizo,
            Integer cobGranizo, String tipoCober) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numPoliza = numPoliza;
        this.sumaAsegurada = sumaAsegurada;
        this.numCuotas = numCuotas;
        this.ctasPoliza = new ArrayList<>();
        this.incGranizo = incGranizo;
        this.cobGranizo = cobGranizo;
        this.tipoCober = tipoCober;
        setCtasPoliza();
        setFinPoliza();

    }

    public Poliza() {

    }

    public Integer getNumCuotas() {
        return numCuotas;
    }

    private void setCtasPoliza() {
        for (int i = 0; i < this.numCuotas; i++) {
            ctasPoliza.add(new Cuota((i + 1), (this.sumaAsegurada / this.numCuotas + 150)*1.1, this.inicioPoliza));

        }
//        this.ctasPoliza.add(new Cuota((1), ((this.sumaAsegurada * 0.1) / this.numCuotas + 150), this.inicioPoliza));
//        this.ctasPoliza.add(new Cuota((2), ((this.sumaAsegurada * 0.1) / this.numCuotas + 150), this.inicioPoliza));

    }

    private void setFinPoliza() {

        this.finPoliza = method();
//        this.finPoliza.set(this.inicioPoliza.getYear() + ((this.numCuotas > 12) ? (int) (this.numCuotas / 12) : 0),
//                inicioPoliza.getMonthValue() + ((this.numCuotas > 12) ? (int) (this.numCuotas % 12) : this.numCuotas),
//                inicioPoliza.getDayOfMonth());
    }

    public Calendar method() {
        Integer cuotasPorAño = 12;
        Integer añosCompletos = this.numCuotas / cuotasPorAño;
        Integer mesesRestantes = this.numCuotas % cuotasPorAño;

        Integer añoFinalizacion = this.inicioPoliza.getYear() + añosCompletos;
        Integer mesFinalizacion = this.inicioPoliza.getMonthValue() + mesesRestantes;
        Integer diaFinalizacion = this.inicioPoliza.getDayOfMonth();

// Manejar el desbordamiento de los meses
        if (mesFinalizacion > 12) {
            añoFinalizacion += 1;
            mesFinalizacion -= 12;
        }
        Calendar fechaFin = Calendar.getInstance();
        fechaFin.set(añoFinalizacion, mesFinalizacion, diaFinalizacion);
        return fechaFin;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public LocalDate getInicioPoliza() {
        return inicioPoliza;
    }

    public Calendar getFinPoliza() {
        return finPoliza; 
        
    }

    public void setNumCuotas(Integer numCuotas) {
        this.numCuotas = numCuotas;
    }

    public void setCtasPoliza(List<Cuota> ctasPoliza) {
        this.ctasPoliza = ctasPoliza;
    }

    public Integer getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Integer sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public List<Cuota> getCtasPoliza() {
        return ctasPoliza;
    }

    public Boolean getIncGranizo() {
        return incGranizo;
    }

    public void setIncGranizo(Boolean incGranizo) {
        this.incGranizo = incGranizo;
    }

    public Integer getCobGranizo() {
        return cobGranizo;
    }

    public void setCobGranizo(Integer cobGranizo) {
        this.cobGranizo = cobGranizo;
    }

    public String getTipoCober() {
        return tipoCober;
    }

    public void setTipoCober(String tipoCober) {
        this.tipoCober = tipoCober;
    }
    
    public String fecha() {
        return (method().get(DAY_OF_MONTH)+"-" + method().get(MONTH)+"-" +method().get(YEAR));
    }

    @Override
    public String toString() {
        return "-----------------------------\n"
                + " Cliente = " + cliente + "\n"
                + "-----------------------------\n"
                + "Vehiculo = " + vehiculo + "\n"
                + "-----------------------------\n"
                + " numPoliza=" + numPoliza + "\n"
                + " inicioPoliza =" + inicioPoliza + ", finPoliza = " + fecha() +"\n"
                + " sumaAsegurada=" + sumaAsegurada + "\n"
                + " numCuotas=" + numCuotas + ", ctasPoliza =$" + ctasPoliza.get(0).getMonto().shortValue() + " FechaVencimiento : " + ctasPoliza.get(0).method().get(DAY_OF_MONTH)+"-" + method().get(MONTH)+"-" +method().get(YEAR)+ "\n"
                + "incGranizo=" + incGranizo + ", cobGranizo=" + cobGranizo + "\n"
                + "tipoCober=" + tipoCober ;
    }

}
/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
12
a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */

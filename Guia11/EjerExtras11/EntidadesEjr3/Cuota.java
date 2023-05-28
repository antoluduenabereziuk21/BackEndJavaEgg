/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjr3;

import java.time.LocalDate;
import java.util.Calendar;
//podriamos importar el packete completo "java.util.Calendar.*"
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import java.util.Date;

/**
 *
 * @author antolube20
 */
public class Cuota {
    private int numCuota;
    private Double monto;
    private boolean pagado;
    private LocalDate vencimientoAux;
    private Calendar vencimientoFinal;
    private String medioPago;

    public Cuota(int numCuota, Double monto, LocalDate vencimiento) {
        this.numCuota = numCuota;
        this.monto = monto;
        this.pagado = false;
        this.vencimientoAux= vencimiento;
        /*El vencimiento se trabaja de La siguiente manera, se setea la fecha trayendo el año:
        el cual si el numero de la NumCuotasEsMayor12 se suma 1(si numCuota/12=1),
        en caso contrario se suma = 0;
        De manera Similar con Los meses Pero este caso Si numCuotaEsMayo12 , se suma el
        resto de numCuota%12 si no se suma el numCuota;Para asi obtner correctamente el mes
        */
        setVencimientoFinal();
//        this.vencimiento.setTime(YEAR);
//        this.vencimiento.set(vencimiento.get(YEAR)+((numCuota>12)?(int)(numCuota/12):0),
//                vencimiento.get(MONTH)+((numCuota>12)?(int)(numCuota%12):numCuota),
//                vencimiento.get(DAY_OF_MONTH));
        this.medioPago="";
    }
       public Calendar method() {
        Integer cuotasPorAño = 12;
        Integer añosCompletos = this.numCuota / cuotasPorAño;
        Integer mesesRestantes = this.numCuota % cuotasPorAño;

        Integer añoFinalizacion = this.vencimientoAux.getYear() + añosCompletos;
        Integer mesFinalizacion = this.vencimientoAux.getMonthValue() + mesesRestantes;
        Integer diaFinalizacion = this.vencimientoAux.getDayOfMonth();

// Manejar el desbordamiento de los meses
        if (mesFinalizacion > 12) {
            añoFinalizacion += 1;
            mesFinalizacion -= 12;
        }
        Calendar fechaVencimiento = Calendar.getInstance();
        fechaVencimiento.set(añoFinalizacion, mesFinalizacion, diaFinalizacion);
        return fechaVencimiento;
    }
    public Calendar getVencimientoFinal() {
        return vencimientoFinal;
    }

    public void setVencimientoFinal() {
        this.vencimientoFinal = method();
    }
       
//    private void setVencimiento() {
//        this.vencimientoFinal = method();
//    }
//       
    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago;
    }
    
    public String fecha() {
        return (method().get(DAY_OF_MONTH)+"-" + (method().get(MONTH )-1)+"-" +method().get(YEAR));
    }

    @Override
    public String toString() {
        return "numCuota=" + numCuota + ", monto=" + monto + "\n"
                + " pagado=" + pagado + ", vencimientoFinal=" + fecha() + "\n"
                + " medioPago=" + medioPago ;
    }
    

    
    
    
    
    
}

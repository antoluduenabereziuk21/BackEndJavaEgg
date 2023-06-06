/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer1;

import java.time.LocalDate;

/**
 *      DecimalFormat df = new DecimalFormat("###,###,###.00
 *      df.format(getPrecio
 *      LocalDate fecha1 = LocalDate.of(2023, 5, 1);
        LocalDate fecha2 = LocalDate.of(2023, 5, 10);
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
 * @author antolube20
 */
public class Alquiler {
    
    private String nombre;
    private Integer documento;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private String amarre;
    private Object barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Integer documento, LocalDate fechaAlquiler, LocalDate fechaDevolucion, String amarre, Object barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.amarre = amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getAmarre() {
        return amarre;
    }

    public void setAmarre(String amarre) {
        this.amarre = amarre;
    }

    public Object getBarco() {
        return barco;
    }

    public void setBarco(Object barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", amarre=" + amarre + ", barco=" + barco + '}';
    }
    
    
    
}

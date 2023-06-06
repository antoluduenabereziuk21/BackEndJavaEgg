/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer1;

/**
 *      DecimalFormat df = new DecimalFormat("###,###,###.00
 *      df.format(getPrecio
 *      LocalDate fecha1 = LocalDate.of(2023, 5, 1);
        LocalDate fecha2 = LocalDate.of(2023, 5, 10);
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
 * @author antolube20
 */
public class Velero extends Barco {
    
    private Integer numeroMastiles;

    public Velero(Integer numeroMastiles, Integer matricula, Integer eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(Integer numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    @Override
    public String toString() {
        return "Veleros{" + "numeroMastiles=" + numeroMastiles + '}';
    }
    
    
    
}

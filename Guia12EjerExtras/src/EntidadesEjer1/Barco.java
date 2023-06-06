/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer1;

/**
 *
 * @author antolube20
 */
public class Barco {
    
    protected Integer matricula;
    protected Integer eslora;
    protected Integer anoFabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, Integer anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
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
        return "Barco{" + "matricula=" + matricula + ",\n"
                + " eslora=" + eslora + ",\n "
                + "anoFabricacion="  + anoFabricacion + '}';
    }
    
    
    
}

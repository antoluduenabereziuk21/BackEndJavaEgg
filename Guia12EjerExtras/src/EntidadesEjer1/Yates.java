/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer1;

/**
 *
 * @author antolube20
 */
public class Yates extends BarcoMotor{
    
    private Integer numCamarotes;

    public Yates(Integer numCamarotes, Integer cv, Integer matricula, Integer eslora, Integer anoFabricacion) {
        super(cv, matricula, eslora, anoFabricacion);
        this.numCamarotes = numCamarotes;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
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
        return super.toString()+ "Yates{" + "numCamarotes=" + numCamarotes + '}';
    }
    
    
}

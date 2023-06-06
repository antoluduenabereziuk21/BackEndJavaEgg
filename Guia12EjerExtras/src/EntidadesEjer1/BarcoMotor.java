/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjer1;

/**
 *
 * @author antolube20
 */
public class BarcoMotor extends Barco{
    protected Integer cv;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer cv, Integer matricula, Integer eslora, Integer anoFabricacion) {
        super(matricula, eslora, anoFabricacion);
        this.cv = cv;
    }

    public Integer getCv() {
        return cv;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    @Override
    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public Integer getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    @Override
    public Integer getAnoFabricacion() {
        return anoFabricacion;
    }

    @Override
    public void setAnoFabricacion(Integer anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
    
    
}

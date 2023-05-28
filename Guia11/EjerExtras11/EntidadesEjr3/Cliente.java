/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjr3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antolube20
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private Integer documento;
    private String mail;
    private String domicilio;
    private Integer telefono;
    private List<Vehiculo> vehiculos= new ArrayList<>();

    public Cliente() {
    }

    public Cliente( String nombre, String apellido, Integer documento, String mail,
            String domicilio, Integer telefono,Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
//        this.vehiculos.add(vehiculo);
        this.vehiculos.add(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return   nombre + apellido + "\n"
                + "documento =" + documento + "\n"
                + " mail =" + mail + "\n"
                + " domicilio =" + domicilio + "\n"
                + " telefono =" + telefono ;
             
    }
    
    
   
    
}
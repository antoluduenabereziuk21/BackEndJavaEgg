/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author antolube20
 */
public class Persona {
    //Estados son los atributos y cuentan con
    //modficadores public,protected,private
    //tipo , tipo de dato
    //nombre asignado al atributo
    public String nombre;
    public int edad;
    public double altura ;
    //Comportamientos son los metodos procedimientos funciones ,ect
    
    //Constructor con argumetnos 
    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }
    
    /*metodos getter & setter
    get: Es un método de consulta. La lista de parámetros de un método get queda vacía
    
    public String getNombre(){
        return nombre;
    }
    
    set :Se declara public y devuelve void. La lista de
    parámetros de un método set incluye el tipo y el valor a modificar.
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    */

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}

/*  Una vez que se ha declarado una clase, se pueden crear objetos a partir de
    ella. A la creación de un objeto se le denomina instanciación. Por esta razón
    que se dice que un objeto es una instancia de una clase y el término instancia y
    objeto se utilizan indistintamente. Para crear objetos, basta con declarar una
    variable de alguno de los tipos de las clases definidas.

    NombreClase nombreObjeto;
    

    Para crear el objeto y asignar un espacio de memoria es necesario realizar la
    instanciación con el operador new. El operador new instancia el objeto y
    reserva espacio en memoria para los atributos y devuelve una referencia que
    se guarda en la variable.

    nombreObjeto = new nombreClase();
*/
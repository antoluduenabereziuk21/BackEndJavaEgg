/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

import java.util.Scanner;

/**
 *
 * @author antolube20 Crea una clase "Empleado" que tenga atributos como
 * "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que
 * calcule el aumento salarial de un empleado en función de su edad y salario
 * actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30
 * años o del 5% si tiene menos de 30 años.
 */
public class Empleado {

    private String nombre;
    private int edad;
    private int salario;
    Scanner leer = new Scanner(System.in);

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public void cargar_empleado(){
        System.out.println("Ingrese El Nombre Del Empleado :");
        nombre= leer.next();
        System.out.println("Ingrese La Edad Del Empleado :");
        edad= leer.nextInt();
        System.out.println("Ingrese El Salario Del Empleado :");
        salario= leer.nextInt();
   
    }
    public void calcular_aumento() {
//        System.out.println("Ingrese El Nombre Del Empleado :");
//        nombre= leer.next();
//        System.out.println("Ingrese La Edad Del Empleado :");
//        edad= leer.nextInt();
//        System.out.println("Ingrese El Salario Del Empleado :");
//        salario= leer.nextInt();
        
        if (edad >= 30){
        
            System.out.println("Al Empleado le corresponde un incremento\n"
                    + "del 10% , siendo: $ "+(salario*0.1)+"\n"
                            + "el salario total es : $"+((salario*0.1)+salario));
        }else{
            System.out.println("Al Empleado le corresponde un incremento\n"
                    + "del 5% , siendo: $ "+(salario*0.05)+"\n"
                            + "el salario total es : $"+((salario*0.05)+salario));
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class AlumnoServices {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos;

    public AlumnoServices() {

        this.alumnos = new ArrayList();

    }

    public void crearAlumno() {

        boolean bandera = false;
        do {
            ArrayList<Integer> notasAux = new ArrayList();
            System.out.println("Ingrese El Nombre Completo Del Alumno");
            String nombre = leer.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese La " + (i + 1) + "° Nota Del Alumno");
                notasAux.add(leer.nextInt());
            }
            alumnos.add(new Alumno(nombre, notasAux));
            System.out.println("Desea Cargar Otro Alumno, Ingrese S para Continuar o N para Salir ");
            String continua = leer.next();

            bandera = continua.equalsIgnoreCase("s");
            System.out.println(bandera);

        } while (bandera);
    }

    public Alumno buscarAlumno() {

        System.out.println("Ingrese El Nombre Del Alumno A Calcular el Promedio");
        String nombre = leer.next();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                return alumno;

            }
        }
        System.out.println("NO Se Encontro El Alumno");
        return null;
    }

    public void notaFinal() {

        Alumno alumnoAux = buscarAlumno();
        double sumatoria = 0;
        for (int notas : alumnoAux.getNotas()) {
            sumatoria += notas;
        }
        System.out.println("El Promedio del Alumno Es :" + (sumatoria / 3));

    }
}

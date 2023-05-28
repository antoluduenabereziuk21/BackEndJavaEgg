/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Curso {
    private String nombreCurso;
    private int cantidadDeHorasPorDia;
    private int cantidadDeDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private String[] alumnos = new String[5];
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadDeHorasPorDia, int cantidadDeDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadDeHorasPorDia() {
        return cantidadDeHorasPorDia;
    }

    public void setCantidadDeHorasPorDia(int cantidadDeHorasPorDia) {
        this.cantidadDeHorasPorDia = cantidadDeHorasPorDia;
    }

    public int getCantidadDeDiasPorSemana() {
        return cantidadDeDiasPorSemana;
    }

    public void setCantidadDeDiasPorSemana(int cantidadDeDiasPorSemana) {
        this.cantidadDeDiasPorSemana = cantidadDeDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el Nombre Del "+ (i+1) +"° alumno");
            alumnos[i]= leer.next();    
        }
    
    }
    
    public void crearCurso(){
        System.out.println("Ingrese El Nombre Del Curso: ");
        setNombreCurso(leer.nextLine());
        System.out.println("Ingrese La Cantidad De Horas Del Curso: ");
        setCantidadDeHorasPorDia(leer.nextInt());
        System.out.println("Ingrese La Cantidad De Dias Del Curso: ");
        setCantidadDeDiasPorSemana(leer.nextInt());
        System.out.println("Ingresa el turno (mañana/tarde)");
        turno=leer.next();
        System.out.println(turno);
       while(!("manana".equalsIgnoreCase(turno))&& !("tarde".equalsIgnoreCase(turno))){
           
           /// ((mañana=mañana == true) ! => flase  ) && ((tarde=mañana == false) ! => true  )
           // && es solo verdadero cuando ambos los son o false en caso similar
           // false && true == false 
           //while (se repite mientras que la condicion sea verdera)
             System.out.println("Ingrese un turno correcto");
           turno=leer.next();
        
       }
//       if (turno.equals("mañana")) {
//         System.out.println("El turno ingresado es mañana");
//      } else if (turno.equals("tarde")) {
//         System.out.println("El turno ingresado es tarde");
//      } else {
//         System.out.println("El turno ingresado no es válido");
//      }
//        System.out.println("Ingrese Precio Por Hora Del Curso: ");
//        setPrecioPorHora(leer.nextInt());
//        cargarAlumnos();
   }
    public double calcularGananciasSemanal(){
        return (getCantidadDeHorasPorDia()*
                getPrecioPorHora())+(getAlumnos().length * 
                getCantidadDeDiasPorSemana()); 
        
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantidadDeHorasPorDia=" + cantidadDeHorasPorDia + ", cantidadDeDiasPorSemana=" + cantidadDeDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + ", leer=" + leer + '}';
    }
    
    
}

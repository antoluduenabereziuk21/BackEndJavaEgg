/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesEjExtras;

import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    Scanner leer = new Scanner(System.in);

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    public void cancion(){
        System.out.println("Ingresa El Titulo De La Cancion");
        titulo= leer.nextLine();
        autor= leer.nextLine();
    }
}

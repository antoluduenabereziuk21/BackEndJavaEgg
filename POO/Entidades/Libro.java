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
public class Libro {
    //atributos como privados,para que no sean modifcados (Encapsulamiento);
    private String ISBN;
//    public String Titulo;
    private String Titulo;
    private String Autor;
    private int paginas;
    //Constructor
    public Libro(String ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public Libro() {
    }
    
    public void CargarLibro(){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN del libro :");
        ISBN = leer.nextLine();
        System.out.println("Ingrese Titulo del libro :");
        Titulo = leer.nextLine();
        System.out.println("Ingrese Autor del libro :");
        Autor= leer.nextLine();
        System.out.println("Ingrese el numero de Paginas del libro :");
        paginas = leer.nextInt();
    }
    
    public void MostrarLibro(){
        System.out.println("ISBN: "+ISBN+"\nTitulo :"+Titulo+"\n Autor :"+Autor+"\n paginas: "+paginas);
    }
    
   ////Setter

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    
    ///Getters
    
    
    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPaginas() {
        return paginas;
    }

    ///con este metodo Override viene en todos las clases, provisoria devolve la info.
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
    

    
}

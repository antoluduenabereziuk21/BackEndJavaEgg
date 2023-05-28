/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import utilidades.Comparadores;

/**
 *
 * @author antolube20
 */
public class PaisService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashSet<Pais> paises;

    public PaisService() {

        this.paises = new HashSet();
    }

    public void mostrar(Collection paisAux) {

        for (Object pais : paisAux) {
            Pais pais1 = (Pais) pais;
            System.out.println(pais1.getNombre());
        }
    }

    public void crearPais() {

        boolean bandera = false;
        do {
            System.out.println("Ingrese El Nombre Del Pais");
            String pais = leer.next();

            paises.add(new Pais(pais));
            System.out.println("Desea Cargar Otra Pais, Ingrese S para Continuar o N para Salir ");
            String continua = leer.next();

            bandera = continua.equalsIgnoreCase("s");
//            System.out.println(bandera);

        } while (bandera);
        System.out.println("------------------------------------------");
        mostrar(paises);
    }

    public void ordenAlfabetico() {

        ArrayList<Pais> paisAux = new ArrayList(paises);

        Collections.sort(paisAux, Comparadores.ordenarPorNombre);
        System.out.println("------------------------------------------");
        System.out.println("Ordenados Alfabeticamente");
//         System.out.println(paisAux);
//         this.paises= new HashSet(paisAux);
        mostrar(paisAux);

    }

    public void buscarPais() {
        System.out.println("Ingrese El Pais A Buscar:");
        String busca = leer.next();
        boolean bandera = false;
        //creo un iterador del conjunto paises
        Iterator iterator = paises.iterator();
        //con hasNext , se pregunta si hay una posicion siguiente
        while (iterator.hasNext()) {

            //El metodod Next() devuelve un  tipo objeto ,indicandole entre (Pais) le casteamos
            //el tipo de dato que duevuelve next();
            Pais paisAux = (Pais) iterator.next();
            if (paisAux.getNombre().equals(busca)) {
                iterator.remove();
                bandera = true;
            }
        }
        System.out.println((bandera) ? "Se Elimino El Pais" : "No Se Encontro El Pais");
        mostrar(paises);
    }

    public void paiseCodeados() {
        paises.add(new Pais("francia"));
        paises.add(new Pais("argentina"));
        paises.add(new Pais("italia"));
        paises.add(new Pais("suiza"));
        paises.add(new Pais("brasil"));
        mostrar(paises);
    }
}

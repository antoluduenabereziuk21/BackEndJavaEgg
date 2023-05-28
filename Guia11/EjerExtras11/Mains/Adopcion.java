/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mains;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        ArrayList<Perro> adoptables = new ArrayList();
        Perro prince = new Perro("Prince", "caniche", 2, "chico");
        Perro princ2 = new Perro("Juanito", "caniche", 2, "chico");
        Perro princ3 = new Perro("Chiky", "caniche", 2, "chico");
        adoptables.add(prince);
        adoptables.add(princ2);
        adoptables.add(princ3);
        ArrayList<Persona> clientes = new ArrayList();
        Persona p1 = new Persona("Antonio", "perez", 33, 32564581);
        Persona p2 = new Persona("Juan", "perez", 20, 32564556);
        Persona p3 = new Persona("Carlos", "perez", 25, 32564587);
        
        
        for (Persona cliente : clientes) {
            System.out.println(cliente.getNombre() + " " + cliente.getApellido()+" ");
            System.out.println("Quisiera adoptar un perro");
            String resp = input.next();
            if (resp.equalsIgnoreCase("si")) {
                System.out.println("Los perro que puede adoptar son: ");
                for (Perro perro : adoptables) {
                    System.out.println(perro.getNombre());
                }
            }
            System.out.println("Ingrese el nombre del Perro A Adoptar :");
            String nombre = input.next();
            Iterator it = adoptables.iterator();
            while (it.hasNext()) {
                Perro pr = (Perro)it.next();
                if (nombre.equalsIgnoreCase(pr.getNombre())) {
                    it.remove();
                    cliente.setPerro(pr);
                    System.out.println("Felicitaciones adoptaste un perrito");
                }
                
            }
        }
    }
    
}
/*
Scanner sc = new Scanner(System.in);
        ArrayList<Perro> adoptable = new ArrayList<>();

        Perro ofelia = new Perro("Ofelia", "Caniche", 3, "Pequeño");
        Perro matilda = new Perro("Matilda", "Pug", 4, "Pequeño");
        Perro chocolate = new Perro("Chocolate", "Bulldog I", 2, "Mediano");
        Perro duque = new Perro("Duque", "Pastor", 2, "Mediano");
        Perro dios = new Perro("Diosito", "Pastor", 3, "Grande");

        adoptable.add(ofelia);
        adoptable.add(dios);
        adoptable.add(duque);
        adoptable.add(chocolate);
        adoptable.add(matilda);

        ArrayList<Persona> cliente = new ArrayList<>();

        Persona p1 = new Persona("Juan", "Ismael", 18, 44000123);
        Persona p2 = new Persona("Esteban", "Palacios", 20, 44000100);
        Persona p3 = new Persona("Gonzalo", "Echenique", 20, 44000111);
        Persona p4 = new Persona("Tomas", "Magliola", 20, 44000198);
        Persona p5 = new Persona("Ignacio", "Martin", 20, 44000146);
        cliente.add(p5);
        cliente.add(p1);
        cliente.add(p2);
        cliente.add(p3);
        cliente.add(p4);

        for (Persona persona : cliente) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " ");
            System.out.println("Quisiera adoptar un perro? si/no");
            String respuesta = sc.next();
            boolean bandera = false;
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.println("Los perros que se pueden adoptar son: ");
                for (Perro perro : adoptable) {
                    System.out.println(perro);
                }
                System.out.println("Ingrese el nomnbre del perro que quisiera adoptar:");
                String nombre = sc.next();
                Iterator it = adoptable.iterator();
                String mensaje= "El nombre del perro no se encuentra en lista";
                while (it.hasNext()) {
                    Perro pr = (Perro) it.next();
                    if (nombre.equalsIgnoreCase(pr.getNombre())) {
                        if (pr.getAdopcion()) {
                            pr.setAdopcion(false);
                            mensaje="El perro se puede adoptar";
                            persona.setPerro(pr);
                            break;
                        } else {
                            mensaje = "El perro ya ha sido adoptado por otra persona";
                        }
                    } 
                }
                System.out.println(mensaje);
            }else{
                System.out.println("Gracias por su visita compre algo o vallase!");
            }
        }
        for (Persona persona : cliente) {
            System.out.println(persona);
        }
    }

}



*/
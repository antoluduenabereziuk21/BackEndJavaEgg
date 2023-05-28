/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author antolube20
 */
public class ProductosService {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    HashMap<String,Double> productos;

    public ProductosService() {

        this.productos = new HashMap();
    }
    
    public void menu(){
        boolean bandera = false;
        do {
        System.out.println("Menu De Productos");
        System.out.println("------------------");
        System.out.println("Selecciona La Operacion A Realizar");
        System.out.println("1- Ingresar Producto\n2-Modificar Su Precio\n3-Elminar Producto\n"
                + "4-Mostrar Productos\n-5 Salir");
        int op = leer.nextInt();
        
            switch (op) {
                case 1:
//                    crearProducto();
                    prodCodeados();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProducto();
                    break;
                case 5:
                    System.out.println("Saliendo del Programa");
                    bandera= true;
                    break;
                default:
                    throw new AssertionError();
            }
        } while (!bandera);
            
    }
    
    public void crearProducto(){
        System.out.println("Ingrese El Nombre Del Producto");
        String nombre = leer.next();
        System.out.println("Ingrese El Precio Del Producto");
        Double precio = leer.nextDouble();
        productos.put(nombre, precio);
  
    }
    
    public void modificarPrecio(){
        System.out.println("Ingrese El Nombre Del Producto");
        String prodAux = leer.next();
        boolean bandera = false;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            Object key = entry.getKey();
            if (entry.getKey().equals(prodAux)) {
                System.out.println("Ingresa Un Nuevo Valor");
                Double valor= leer.nextDouble();
                entry.setValue(valor);
                bandera = true;
            }    
        }
        System.out.println((bandera) ? "Se Modifio el Precio" : "No Se Encontro El Producto");
    }
    
    public void eliminarProducto(){
        System.out.println("Ingrese El Nombre Del Producto");
        String prodAux = leer.next();
        boolean bandera = false;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            Object key = entry.getKey();
            if (key.equals(prodAux)) {
                productos.remove(prodAux);
                bandera = true;
                break;
            }    
        }
        System.out.println((bandera) ? "Se Modifio el Precio" : "No Se Encontro El Producto");
    
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println("Producto :"+key+" precio :"+val);
            
        }
    
    }
    
    public void prodCodeados() {
        productos.put("pela papa",125.50);
        productos.put("rallador",25.50);
        productos.put("paba Eelectrica",1250.00);
        productos.put("MicroHondas",37525.99);
        productos.put("Heladera",125000.00);
        productos.put("Cocina",75.00);

        
    }
}

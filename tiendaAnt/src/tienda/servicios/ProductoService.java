package tienda.servicios;

import java.util.Scanner;
import tienda.persistencia.ProductoDAO;

public class ProductoService {


    Scanner ingreso = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    ProductoDAO dao = new ProductoDAO();
    
    public void listar() throws Exception {
        System.out.println(dao.listaProducto(ingreso.next()));
    }

}

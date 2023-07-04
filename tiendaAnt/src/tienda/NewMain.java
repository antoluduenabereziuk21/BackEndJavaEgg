
package tienda;

import tienda.servicios.FabricanteService;

public class NewMain {
    public static void main(String[] args) throws Exception {
        
        FabricanteService fs = new FabricanteService();
//        fs.buscarFabricantePorCodigo(1);
//        fs.listarFabricantes();
        fs.ejecutarSentencia();
        
    }

}

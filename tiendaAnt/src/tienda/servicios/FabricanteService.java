package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {

    private FabricanteDAO dao;

    public FabricanteService() {
        dao = new FabricanteDAO();
    }

    public void crearFabricante(int codigo, String nombre) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codigo");
            }
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("Debe indiciar un nombre");
            }
            Fabricante fabricante = new Fabricante();
            fabricante.setCodigo(codigo);
            fabricante.setNombre(nombre);
            dao.guardar(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }

    public void modifcarFabricante(int codigo, String nombre) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("Debe indicar un codigo");
            }
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new Exception("Debe indiciar un nombre");
            }
            Fabricante fabricante = buscarFabricantePorCodigo(codigo);
              dao.modificar(fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarFabricante(int codigo) throws Exception{
        try {
            if(codigo < 0){
                throw new Exception("Debe indicar un codigo");
            }
            dao.eliminar(codigo);
        } catch (Exception e) {
            throw e;
        }
    }

    
    public Fabricante buscarFabricantePorCodigo(int codigo) throws Exception{
        try {
            if(codigo < 0){
                throw new Exception("Debe indicar un codigo");
            }
            Fabricante fabricante = dao.buscarCodigo(codigo);
            if(fabricante == null){
                throw new Exception("No se encontro ningun FABRICANTE con ese CODIGO");
            }
            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Collection<Fabricante> listarFabricantes() throws Exception{
        try {
            Collection<Fabricante> fabricantes = dao.listaFabricantes();
            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirFabricantes() throws Exception{
        try {
            Collection<Fabricante> lista = listarFabricantes();
            if(lista.isEmpty()){
                throw new Exception("No existen fabricantes para imprimir");
            }else{
                System.out.println(lista);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void ejecutarSentencia() throws Exception{
        Scanner ingreso = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String sql = ingreso.next();
        //'SELECT nombre FROM producto'
        try {
            Collection<Fabricante> fabricantes = dao.listaFabricantes(sql);
            if(fabricantes.isEmpty()){
                throw new Exception("No se encuentran fabricantes para esa consulta");
            }else{
                System.out.println(fabricantes);
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
}

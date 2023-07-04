package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {
    
    public void guardar(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante");
            }
            String sql = "INSERT INTO Fabricante (codigo, nombre)"
                    + "VALUES ('" + fabricante.getCodigo() + "' , '"
                    + fabricante.getNombre() + "');)";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificar(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el usuario que desea modificar");
            }
            String sql = "UPDATE Fabricante SET "
                    + "nombre = '" + fabricante.getNombre() + "' WHERE codigo = '" + fabricante.getCodigo() + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminar(int id) throws Exception {
        try {
            String sql = "DELETE FROM Fabricante WHERE id = '" + id + "'";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Fabricante buscarCodigo(Integer codigo) throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante"
                    + " WHERE codigo = '" + codigo + "'";
            consultarBase(sql);
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
            }
            desconectarBase();
            System.out.println(fabricante);
            return fabricante;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Fabricante> listaFabricantes() throws Exception {
         try {
            String sql = "SELECT * FROM Fabricante";
            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> listado = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                listado.add(fabricante);
            }
            desconectarBase();
             System.out.println(listado);
            return listado;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }public Collection<Fabricante> listaFabricantes(String sql) throws Exception {
         try {
            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> listado = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt("codigo"));
                fabricante.setNombre(resultado.getString("nombre"));
                listado.add(fabricante);
            }
            desconectarBase();
             System.out.println(listado);
            return listado;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}

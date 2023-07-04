package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {
    
    
   public Producto guardarProducto(String sql) throws Exception{
       try {
           consultarBase(sql);
           Producto p = null;
           while(resultado.next()){
               p = new Producto();
               p.setCodigo(resultado.getInt("codigo"));
               p.setNombre(resultado.getString("nombre"));
               p.setPrecio(resultado.getDouble("precio"));
               p.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
           }
           desconectarBase();
           return p;
       } catch (Exception e) {
           desconectarBase();
           throw e;
       }
   }
   
   public Collection<Producto> listaProducto(String sql) throws Exception{
       try {
           consultarBase(sql);
           Producto p = null;
           Collection<Producto> lista = new ArrayList();
           while(resultado.next()){
               p = new Producto();
               p.setCodigo(resultado.getInt("codigo"));
               p.setNombre(resultado.getString("nombre"));
               p.setPrecio(resultado.getDouble("precio"));
               p.setCodigo_fabricante(resultado.getInt("codigo_fabricante"));
               lista.add(p);
           }
           desconectarBase();
           for (Producto producto : lista) {
               System.out.println(producto);
           }
           return lista;
       } catch (Exception e) {
           desconectarBase();
           throw new Exception("Error de sistema");
       }
   }
   
   
   public void editarEliminar(String sql) throws Exception{
       try {
           insertarModificarEliminar(sql);
       } catch (Exception e) {
           throw e;
       }
   }

}

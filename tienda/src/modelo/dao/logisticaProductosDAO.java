/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;
import modelo.dto.logisticaProductosDTO;
import modelo.interfaces.crud;

/**
 *
 * @author David
 */
public class logisticaProductosDAO implements crud<logisticaProductosDTO> {//NOSONAR
    
    private static final String SQL_Insert="INSERT into producto(codigo, fecha_venc, nombre, precio, stock, categoria, marca, estado, proveedor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";//NOSONAR
    private static final String SQL_Delete="DELETE from producto WHERE codigo=?";//NOSONAR
    private static final String SQL_Update="UPDATE producto SET codigo=?, fecha_venc=?,nombre=?,precio=?,stock=?,categoria=?,marca=?,estado=?,proveedor=?  WHERE codigo=?";//NOSONAR
    private static final String SQL_Read="SELECT * FROM producto WHERE codigo= ?";//NOSONAR
    private static final String SQL_ReadAll="SELECT * from usuarios";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton

   

    

    

    @Override
    public boolean create(logisticaProductosDTO c) {
        
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)) {
            
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getFecha());
            ps.setString(3, c.getNombre());
            ps.setFloat(4, c.getPrecio());
            ps.setInt(5, c.getStock());
            ps.setString(6, c.getCategoria());
            ps.setString(7, c.getMarca());
            ps.setString(8, c.getDescripcion());
            ps.setString(9, c.getProveedor());
            
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Delete);){

        ps.setInt(1, (int) key);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean update(logisticaProductosDTO c, Object a) {
            
            try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Update)){

                ps.setString(1, c.getCodigo());
                ps.setString(2, c.getFecha());
                ps.setString(3, c.getNombre());
                ps.setFloat(4, c.getPrecio());
                ps.setInt(5, c.getStock());
                ps.setString(6, c.getCategoria());
                ps.setString(7, c.getMarca());
                ps.setString(8, c.getDescripcion());
                ps.setString(9, c.getProveedor());
                
                ps.setString(10, (String) a);
               
                if(ps.executeUpdate()>0){
                    return true;
                }
            } catch (SQLException ex) {
                Logger.getLogger(CajeroVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{//Es una clausula que se va a ejecutar siempre
                con.cerrarConexion();

            }
            return false;
    }
    /*public boolean update2(logisticaProductosDTO c, Object a) {
        PreparedStatement ps;
        try {
            
            ps=con.getCon().prepareStatement(SQL_Update);
            ps.setInt(1, c.getNum_ventas());
            ps.setObject(5,a);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CajeroVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }*/
    @Override
    public logisticaProductosDTO read(Object key) {
 
        
        logisticaProductosDTO l = null;
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Read)) {

            ps.setInt(1, (int) key);
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                System.out.println(res.getInt("codigo"));
                
                l=new logisticaProductosDTO(String.valueOf(res.getInt("codigo")),res.getString("nombre"),res.getInt("precio"),
                        res.getString("estado"), res.getString("fecha_venc"),   res.getString("proveedor") , 
                        res.getString("marca"),  res.getString("categoria"),  res.getInt("stock"));
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        System.out.println(key+"XDDDD");
        return l;
    }

    @Override
    public logisticaProductosDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<logisticaProductosDTO> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    

    

   
    
}

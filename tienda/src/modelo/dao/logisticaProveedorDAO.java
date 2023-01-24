/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;
import modelo.dto.administradorDTO;
import modelo.dto.logisticaProveedorDTO;
import modelo.interfaces.crud;

/**
 *
 * @author David
 */
public class logisticaProveedorDAO implements crud<logisticaProveedorDTO> {//NOSONAR
    
    private static final String SQL_Insert="INSERT into proveedor(razon_social, ruc, representante, telefono, correo, distrito, direccion, descripcion, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";//NOSONAR
    private static final String SQL_Delete="DELETE from proveedor WHERE ruc=?";//NOSONAR
    private static final String SQL_Update="UPDATE proveedor SET razon_social=?, ruc=?, representante=?, telefono=?, correo=?, distrito=?, direccion=?, descripcion=?, estado=? WHERE ruc=?";//NOSONAR
    private static final String SQL_Read="SELECT * FROM proveedor WHERE ruc = ?";//NOSONAR
    private static final String SQL_ReadAll="SELECT razon_social from proveedor";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton

    @Override
    public boolean create(logisticaProveedorDTO c) {

        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)) {
            
            
            ps.setString(1, c.getRazonSocial());
            ps.setString(2, c.getRuc());
            ps.setString(3, c.getRepresentante());
            ps.setInt(4, c.getTelefono());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDistrito());
            ps.setString(7, c.getDireccion());
            ps.setString(8, c.getDetalles());
            ps.setString(9, c.getEstado());
            

            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Delete)){
   
        ps.setInt(1, (int) key);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean update(logisticaProveedorDTO c, Object a) {
       try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Update)){

            ps.setString(1, c.getRazonSocial());
            ps.setString(2, c.getRuc());
            ps.setString(3, c.getRepresentante());
            ps.setInt(4, c.getTelefono());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDistrito());
            ps.setString(7, c.getDireccion());
            ps.setString(8, c.getDetalles());
            ps.setString(9, c.getEstado());
            ps.setObject(10, a);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public logisticaProveedorDTO read(Object key) {
       
        
        logisticaProveedorDTO l = null;
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Read)){
            
            
            ps.setString(1, (String) key);
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new logisticaProveedorDTO(res.getString("razon_social"), res.getString("representante"), res.getInt("telefono"), res.getString("distrito"), res.getString("ruc"), res.getString("estado"), res.getString("correo"), res.getString("direccion"), res.getString("descripcion"));
                
            
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        System.out.println(key+"XDDDD");
        return l;
    }

    @Override
    public logisticaProveedorDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<logisticaProveedorDTO> readAll() {
        
        
        logisticaProveedorDTO l = null;
        List<logisticaProveedorDTO> customerList = new ArrayList<>();
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_ReadAll);){
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new logisticaProveedorDTO(res.getString("razon_social"));
                customerList.add(l);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(logisticaProveedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        
        return customerList;
    }

    

   
    
}

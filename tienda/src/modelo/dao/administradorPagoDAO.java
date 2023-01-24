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
import modelo.dto.administradorPagoDTO;
import modelo.interfaces.crud;

/**
 *
 * @author David
 */
public class administradorPagoDAO implements crud<administradorPagoDTO> {//NOSONAR
    
    private static final String SQL_Insert="INSERT into pagos(titulo, monto, entidad, descripcion, fecha_pago, imagen) VALUES (?, ?, ?, ?, ?, ?)";//NOSONAR
    private static final String SQL_Delete="DELETE from pagos WHERE idpagos=?";//NOSONAR
    private static final String SQL_Update="UPDATE pagos SET titulo=?, monto=?, entidad=?, descripcion=?, fecha_pago=?  WHERE idpagos=?";//NOSONAR
    private static final String SQL_Read="SELECT * FROM pagos WHERE idpagos = ?";//NOSONAR
    private static final String SQL_ReadAll="SELECT * from pagos";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton

    @Override
    public boolean create(administradorPagoDTO c) {
       
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)){
            
            ps.setString(1, c.getTitulo());
            ps.setFloat(2, c.getMonto());
            ps.setString(3, c.getEntidad());
            ps.setString(4, c.getDescripcion());
            ps.setString(5, c.getFechaPAgo());
            ps.setObject(6, c.getImg());
            
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorPagoDAO.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(administradorPagoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean update(administradorPagoDTO c, Object a) {
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Update);) {

            ps.setString(1, c.getTitulo());
            ps.setFloat(2, c.getMonto());
            ps.setString(3, c.getEntidad());
            ps.setString(4, c.getDescripcion());
            ps.setString(5, c.getFechaPAgo());
            ps.setObject(6, a);
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(administradorPagoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public administradorPagoDTO read(Object key) {
        
       
        administradorPagoDTO l = null;
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Read)){

            ps.setInt(1, (int) key);
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new administradorPagoDTO(res.getInt("idpagos"), res.getString("titulo"), res.getFloat("monto"), res.getString("entidad"), res.getString("descripcion"), res.getString("fecha_pago"), res.getBinaryStream("imagen"));
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(administradorPagoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
 
        return l;
    }

    @Override
    public administradorPagoDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<administradorPagoDTO> readAll() {
        
        
        administradorPagoDTO l = null;
        List<administradorPagoDTO> customerList = new ArrayList<>();
       
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_ReadAll)) {
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new administradorPagoDTO(res.getInt("idpagos"), res.getString("titulo"), res.getFloat("monto"), res.getString("entidad"), res.getString("descripcion"), res.getString("fecha_pago"));
                customerList.add(l);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(administradorPagoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        
        return customerList;
    }

    

   
    
}

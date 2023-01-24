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
import modelo.dto.CajeroVentasDTO;
import modelo.interfaces.crud;

/**
 *
 * @author Angel
 */
public class CajeroVentasDAO implements crud<CajeroVentasDTO>{//NOSONAR
    private static final String SQL_Insert="INSERT into ventas(num_ventas,fecha_ventas,monto,estado) VALUES (?,?,?,?)";//NOSONAR
    private static final String SQL_Delete="DELETE from ventas WHERE idventas=?";//NOSONAR
    private static final String SQL_Update="UPDATE ventas SET num_ventas=?,fecha_ventas=?,monto=?,estado=? WHERE idventas=?";//NOSONAR
    private static final String SQL_Read="SELECT *from ventas WHERE idventas=?";//NOSONAR
    private static final String SQL_ReadAll="SELECT *from ventas";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton
    @Override
    public boolean create(CajeroVentasDTO c) {
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)){
            
            
            ps.setInt(1, c.getNum_ventas());
            ps.setString(2, c.getFecha_venta());
            ps.setFloat(3, c.getMonto());
            ps.setString(4, c.getEstado());
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CajeroVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Delete)){
            
            
            ps.setInt(1, (int) key);
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

    @Override
    public boolean update(CajeroVentasDTO c, Object a) {
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Update)){
            
            
            ps.setInt(1, c.getNum_ventas());
            ps.setString(2, c.getFecha_venta());
            ps.setFloat(3, c.getMonto());
            ps.setString(4, c.getEstado());
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
    }

    @Override
    public CajeroVentasDTO read(Object key) {
        
        
        CajeroVentasDTO l = null;
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_Read)){
            
           
            ps.setInt(1, (int) key);
            try(ResultSet res=ps.executeQuery()){
               while(res.next()){
                l=new  CajeroVentasDTO(res.getInt("num_ventas"),res.getString("fecha_ventas"),res.getFloat("monto"));
                } 
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CajeroVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return l;
    }

    @Override
    public CajeroVentasDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CajeroVentasDTO> readAll() {
        
         
         ArrayList<CajeroVentasDTO> libros=new ArrayList();
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_ReadAll);){

            
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                    libros.add(new CajeroVentasDTO(res.getInt("num_ventas"),res.getString("fecha_ventas"),res.getFloat("monto")));
                }
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(CajeroVentasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();
            
        }
        return libros;
    }
}

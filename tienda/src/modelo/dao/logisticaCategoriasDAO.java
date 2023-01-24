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
import modelo.dto.logisticaCategoriasDTO;
import modelo.dto.logisticaProductosDTO;
import modelo.dto.logisticaProveedorDTO;
import modelo.interfaces.crud;

/**
 *
 * @author David
 */
public class logisticaCategoriasDAO implements crud<logisticaCategoriasDTO> {//NOSONAR
    
    private static final String SQL_Insert="INSERT into categoriaproducto(codigo, nombre, descripción) VALUES (?, ?, ?)";//NOSONAR
    private static final String SQL_Delete="DELETE from producto WHERE codigo=?";//NOSONAR
    private static final String SQL_Update="UPDATE producto SET stock=? WHERE codigo=?";//NOSONAR
    private static final String SQL_Read="SELECT * FROM producto WHERE codigo= ?";//NOSONAR
    private static final String SQL_ReadAll="SELECT * from categoriaproducto";//NOSONAR
    private static final Conexion con=Conexion.saberEstado();//singleton

   

    

    

    @Override
    public boolean create(logisticaCategoriasDTO c) {
        
        try(PreparedStatement ps=con.getCon().prepareStatement(SQL_Insert)) {
            
            ps.setString(1, c.getCodigo());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getDescripcion());
            
            
            
            if(ps.executeUpdate()>0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(logisticaCategoriasDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{//Es una clausula que se va a ejecutar siempre
            con.cerrarConexion();

        }
        return false;
    }

    @Override
    public boolean delete(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(logisticaCategoriasDTO c, Object a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public logisticaCategoriasDTO read(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public logisticaCategoriasDTO read(Object key, Object key2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<logisticaCategoriasDTO> readAll() {
        logisticaCategoriasDTO l = null;
        List<logisticaCategoriasDTO> customerList = new ArrayList<>();
        
        try (PreparedStatement ps=con.getCon().prepareStatement(SQL_ReadAll);){
            try(ResultSet res=ps.executeQuery()){
                while(res.next()){
                
                l=new logisticaCategoriasDTO(res.getString("nombre"));
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

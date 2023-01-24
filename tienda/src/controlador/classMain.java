/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.dao.CajeroVentasDAO;
import modelo.dao.administradorDAO;
import modelo.dao.administradorPagoDAO;
import modelo.dao.logisticaCategoriasDAO;
import modelo.dao.logisticaProductosDAO;
import modelo.dao.logisticaProveedorDAO;
import modelo.dao.loguinDAO;
import vista.CajeroVistas.cajeroRegistrarCotizacion;
import vista.CajeroVistas.cajeroRegistrarVenta;
import vista.CajeroVistas.usuarioCajero;
import vista.LogisticaVistas.logisticaCategoriasProd;
import vista.LogisticaVistas.logisticaModificarProd;
import vista.LogisticaVistas.logisticaModificarProv;
import vista.LogisticaVistas.logisticaRegistrarProd;
import vista.LogisticaVistas.logisticaRegistroProv;
import vista.administradorBuscar;
import vista.administradorModificar;
import vista.administradorPagoModificar;
import vista.administradorPagoRegistrar;
import vista.administradorRegistrar;
import vista.administradorSubPagoModificar;
import vista.administradordetallesPagoModificar;
import vista.logueo;

/**
 *
 * @author David
 */
public class classMain {//NOSONAR
    public static void main(String[] args){
        logueo lg=new logueo();  
        loguinDAO lDAO= new loguinDAO();
        administradorDAO a=new administradorDAO();
        administradorPagoDAO a1=new administradorPagoDAO();
        logisticaProveedorDAO lp=new logisticaProveedorDAO();
        logisticaProductosDAO lproductos=new logisticaProductosDAO();
        logisticaCategoriasDAO lcategorias= new logisticaCategoriasDAO();
        CajeroVentasDAO cajv= new CajeroVentasDAO();
        administradorRegistrar adm = new administradorRegistrar();
        administradorBuscar admB= new administradorBuscar(); 
        administradorModificar admM=new administradorModificar();
        administradorPagoRegistrar admPR=new administradorPagoRegistrar();
        administradorPagoModificar admPM=new administradorPagoModificar();
        administradordetallesPagoModificar adPM=new administradordetallesPagoModificar();
        administradorSubPagoModificar adSPM=new administradorSubPagoModificar();
        logisticaRegistrarProd lrprod= new logisticaRegistrarProd();
        logisticaModificarProd lmproducto= new logisticaModificarProd();
        
        //Logisitica
        logisticaRegistroProv lrp=new logisticaRegistroProv();
        logisticaModificarProv lmp=new logisticaModificarProv();
        logisticaCategoriasProd lcp=new logisticaCategoriasProd();
         //Cajero
         
         cajeroRegistrarCotizacion cajRegC=new cajeroRegistrarCotizacion();
         cajeroRegistrarVenta cajRegV= new cajeroRegistrarVenta();
         usuarioCajero cajU=new usuarioCajero();
        NewClass nc=new NewClass(lg,adm, lDAO, a, a1 , lp, lproductos, lcategorias,cajv,admB, admM, admPR, admPM, adPM, adSPM, lrp, lmp, lrprod, lmproducto, lcp, cajRegC,cajRegV,cajU);//aqui se van agregando las instanciaciones 
        nc.iniciar();
        
    }
}

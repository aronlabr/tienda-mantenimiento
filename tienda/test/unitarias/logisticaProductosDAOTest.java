/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import controlador.NewClass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.dao.CajeroVentasDAO;
import modelo.dao.administradorDAO;
import modelo.dao.administradorPagoDAO;
import modelo.dao.logisticaCategoriasDAO;
import modelo.dao.logisticaProductosDAO;
import modelo.dao.logisticaProveedorDAO;
import modelo.dao.loguinDAO;
import modelo.dto.logisticaProductosDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
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
 * @author Daniel
 */
public class logisticaProductosDAOTest {
    
    public logisticaProductosDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    /**
     * Test of update method, of class logisticaProductosDAO.
     */
    @Test
    public void testUpdate() {
        boolean result=false;
        boolean expResult=true;
        
        try {
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
            
            java.util.Date fechaParseada= new SimpleDateFormat("yyyy/MM/dd").parse("2022/5/30");//cambiar fecha
            
            //Setear buscador
            String cod="4444";//cambiar
            lmproducto.textBusquedaRucProducto.setText(cod);
            //setear formulario
            lmproducto.textcodigo.setText(cod);
            lmproducto.textRepresentante.setText("asd");//cambiar
            lmproducto.textPrecio.setText("25");//cambiar
            lmproducto.textAreaDescripcion.setText("asdasdas");//cambiar
            lmproducto.textVencimiento.setDate(fechaParseada);
            lmproducto.comboBoxProveedor.addItem("sur");//cambiar y coincidir
            lmproducto.comboBoxProveedor.setSelectedItem("sur");//cambiar y coincidir
            lmproducto.textCategorias.addItem("Verduras");//cambiar y coincidir
            lmproducto.textCategorias.setSelectedItem("Verduras");//cambiar y coincidir
            lmproducto.textCantidad.setText("14");//cambiar 
            lmproducto.textMarca.setText("asdasdasdasd");//cambiar
            
            System.out.println("codigo"+lmproducto.textcodigo.getText());
            System.out.println("Representante "+lmproducto.textRepresentante.getText());
            System.out.println("Precio "+lmproducto.textPrecio.getText());
            System.out.println("Descripcion "+lmproducto.textAreaDescripcion.getText());
            System.out.println("Vencimiento "+lmproducto.textVencimiento.getDate());
            System.out.println("Proveedor "+lmproducto.comboBoxProveedor.getSelectedItem());
            System.out.println("Categorias "+lmproducto.textCategorias.getSelectedItem());
            System.out.println("Cantidad "+lmproducto.textCantidad.getText());
            System.out.println("Marca "+ lmproducto.textMarca.getText());
            
            if (lmproducto.textcodigo.getText().isEmpty() || lmproducto.textRepresentante.getText().isEmpty() || lmproducto.textPrecio.getText().isEmpty() || lmproducto.textAreaDescripcion.getText().isEmpty() || lmproducto.textVencimiento.getDate() == null || lmproducto.comboBoxProveedor.getSelectedItem().equals("Ninguno")||lmproducto.textCategorias.getSelectedItem().equals("Ninguno")|| lmproducto.textCantidad.getText().isEmpty()||lmproducto.textMarca.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Existe por lo menos algun campo vacío");
                expResult= true;
                assertEquals(expResult, result);
            } else {
                java.util.Date date = lmproducto.textVencimiento.getDate();
                //permite cambiar el fotmato del componente fecha
                //dar formato a fecha 
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                String formatDate = dcn.format(date);
                
                //sssssssssssssssssssssssssssssssssss
                int caso = 0;
                Date fechaNoActual = null;
                Date fechaactual = new Date(System.currentTimeMillis());

                //Esto permite obtener el valor del componente fecha
                try {
                    fechaNoActual = dcn.parse(formatDate);
                } catch (ParseException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                int milisecondsByDay = 86400000;
                int dias = (int) ((fechaactual.getTime() - fechaNoActual.getTime()) / milisecondsByDay);
                if (lmproducto.textcodigo.getText().length() != 4 && lmproducto.textcodigo.getText().length() < 4) {

                    caso = 1;

                }
                if (lmproducto.textRepresentante.getText().length() <= 2) {
                    caso = 2;
                }
                if (Float.valueOf(lmproducto.textPrecio.getText()) <= 0 ||Float.valueOf(lmproducto.textPrecio.getText()) >= 100 ) {
                    caso = 3;
                }
                if (Integer.valueOf(lmproducto.textCantidad.getText()) <= 0 ||Integer.valueOf(lmproducto.textCantidad.getText()) >= 1000 ) {
                    caso = 4;
                }
                if(lmproducto.textMarca.getText().length()<=2){
                    caso=5;
                }
                if (fechaNoActual.before(fechaactual)) {
                    caso = 6;
                }

                //long numberOFDays = DAYS.(LocalDate.parse(myDate),  LocalDate.now());
                switch (caso) {
                    case 0:
                        //lproductos.create(new logisticaProductosDTO(lrprod.textcodigo.getText(), lrprod.textNombre.getText(), Float.valueOf(lrprod.textPrecio.getText()), lrprod.textAreaDescripcion.getText(), formatDate, String.valueOf(lrprod.comboBoxProveedor.getSelectedItem()), lrprod.textMarca.getText(), (String) lrprod.textCateogria.getSelectedItem(), Integer.valueOf(lrprod.textCantidad.getText())));
                        result = lproductos.update(new logisticaProductosDTO(lmproducto.textcodigo.getText(), lmproducto.textRepresentante.getText(), Float.valueOf(lmproducto.textPrecio.getText()), lmproducto.textAreaDescripcion.getText(), formatDate, String.valueOf(lmproducto.comboBoxProveedor.getSelectedItem()), lmproducto.textMarca.getText(), (String) lmproducto.textCategorias.getSelectedItem(), Integer.valueOf(lmproducto.textCantidad.getText())),lmproducto.textBusquedaRucProducto.getText());
                        expResult= true;
                        assertEquals(expResult, result);
                        JOptionPane.showMessageDialog(null, "Producto Actualizado Correctamente.");
                            
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "El codigo debe ser de 4 digitos");
                        expResult= true;
                        assertEquals(expResult, result);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El nombre debe tener mas de 2 caracteres.");
                        expResult= true;
                        assertEquals(expResult, result);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El campo de precio debe ser mayor a 0 y menor a 100.0 soles.");
                        expResult= true;
                        assertEquals(expResult, result);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "El campo de cantidad debe ser mayor a 0 y menor a 1000 unidades.");
                        expResult= true;
                        assertEquals(expResult, result);
                        break;
                    case 5: 
                        JOptionPane.showMessageDialog(null, "La marca debe ser mayor a 2 caracteres."); 
                        expResult= true;
                        assertEquals(expResult, result);
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "La fecha debe ser mayor a la fecha actual.");
                        expResult= true;
                        assertEquals(expResult, result);
                        break;

                }

            }
            
            /*
            //Esto permite obtener el valor del componente fecha
            java.util.Date date = lmproducto.textVencimiento.getDate();
            SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
            String formatDate = dcn.format(date);

            lproductos.update(new logisticaProductosDTO(lmproducto.textcodigo.getText(), lmproducto.textRepresentante.getText(), Float.valueOf(lmproducto.textPrecio.getText()), lmproducto.textAreaDescripcion.getText(), formatDate, String.valueOf(lmproducto.comboBoxProveedor.getSelectedItem()), lmproducto.textMarca.getText(), (String) lmproducto.textCategorias.getSelectedItem(), Integer.valueOf(lmproducto.textCantidad.getText())),lmproducto.textBusquedaRucProducto.getText());
            */
            
            /*System.out.println("update");
            logisticaProductosDTO c = null;
            Object a = null;
            logisticaProductosDAO instance = new logisticaProductosDAO();
            boolean expResult = false;
            boolean result = instance.update(c, a);
            assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            fail("The test case is a prototype.");
            */
        } catch (ParseException ex) {
            Logger.getLogger(logisticaProductosDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Test of read method, of class logisticaProductosDAO.
     */
    /*
    @Test
    public void testRead_Object() {
        System.out.println("read");
        Object key = null;
        logisticaProductosDAO instance = new logisticaProductosDAO();
        logisticaProductosDTO expResult = null;
        logisticaProductosDTO result = instance.read(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    }
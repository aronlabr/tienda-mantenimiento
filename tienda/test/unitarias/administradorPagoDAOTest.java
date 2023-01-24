/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import controlador.NewClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import modelo.dto.administradorPagoDTO;
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
 * @author David
 */
public class administradorPagoDAOTest {

    public administradorPagoDAOTest() {
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
     * Test of create method, of class administradorPagoDAO.
     */
    @Test
    public void testCreate() {
        boolean result=false;
        boolean expResult=true;

        try {
            //cargar archivo momentaneo
            String rutaArchivo = "C:\\Users\\David Pablo\\OneDrive\\cursos\\cursos\\7mo ciclo\\salvadofanny\\tienda\\tienda\\29.pdf";
            File file = new File(rutaArchivo);
            FileInputStream input = null;
            
            
            
            
            logueo lg = new logueo();
            loguinDAO lDAO = new loguinDAO();
            administradorDAO a = new administradorDAO();
            administradorPagoDAO a1 = new administradorPagoDAO();
            logisticaProveedorDAO lp = new logisticaProveedorDAO();
            logisticaProductosDAO lproductos = new logisticaProductosDAO();
            logisticaCategoriasDAO lcategorias = new logisticaCategoriasDAO();
            CajeroVentasDAO cajv = new CajeroVentasDAO();
            administradorRegistrar adm = new administradorRegistrar();
            administradorBuscar admB = new administradorBuscar();
            administradorModificar admM = new administradorModificar();
            administradorPagoRegistrar admPR = new administradorPagoRegistrar();
            administradorPagoModificar admPM = new administradorPagoModificar();
            administradordetallesPagoModificar adPM = new administradordetallesPagoModificar();
            administradorSubPagoModificar adSPM = new administradorSubPagoModificar();
            logisticaRegistrarProd lrprod = new logisticaRegistrarProd();
            logisticaModificarProd lmproducto = new logisticaModificarProd();
            
            //Logisitica
            logisticaRegistroProv lrp = new logisticaRegistroProv();
            logisticaModificarProv lmp = new logisticaModificarProv();
            logisticaCategoriasProd lcp = new logisticaCategoriasProd();
            //Cajero
            
            cajeroRegistrarCotizacion cajRegC = new cajeroRegistrarCotizacion();
            cajeroRegistrarVenta cajRegV = new cajeroRegistrarVenta();
            usuarioCajero cajU = new usuarioCajero();
            
            java.util.Date fechaParseada= new SimpleDateFormat("yyyy/MM/dd").parse("2022/5/20");//modificar
            
            //Setear datos
            admPR.tituloPago.setText("pr");//modificar
            admPR.montoPago.setText("15.0");//modificar
            admPR.entidadPago.setText("pruebanomabre");//modificar
            admPR.descripcionPago.setText("pruebanomabre");//modificar
            admPR.fechaPago.setDate(fechaParseada);
            
            
            
            int caso = 0;
            Date fechaNoActual = null;
            Date fechaactual = new Date(System.currentTimeMillis());
            
            if (admPR.tituloPago.getText().isEmpty() || admPR.montoPago.getText().isEmpty() || admPR.entidadPago.getText().isEmpty() || admPR.descripcionPago.getText().isEmpty() || admPR.fechaPago.getDate() == null ) {
                JOptionPane.showMessageDialog(null, "Existe por lo menos algun campo vacío");
            } else {
                //Esto permite obtener el valor del componente fecha
                java.util.Date date = admPR.fechaPago.getDate();
                //permite cambiar el fotmato del componente fecha
                //dar formato a fecha
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                String formatDate = dcn.format(date);
                try {
                    fechaNoActual = dcn.parse(formatDate);
                } catch (ParseException ex) {
                    Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                int milisecondsByDay = 86400000;
                int dias = (int) ((fechaactual.getTime() - fechaNoActual.getTime()) / milisecondsByDay);
                if (admPR.tituloPago.getText().length() < 3) {
                    caso = 1;
                }
                if (Float.parseFloat(admPR.montoPago.getText()) <= 0) {
                    caso = 2;
                }
                if (admPR.entidadPago.getText().length() <= 2) {
                    caso = 3;
                }
                if (admPR.descripcionPago.getText().length() <= 2) {
                    caso = 4;
                }
                if (file.length() > 840000) {
                    caso = 5;
                }
                if (fechaNoActual.after(fechaactual)) {
                    caso = 6;
                }
                if (dias > 10) {
                    caso = 7;
                }
                //long numberOFDays = DAYS.(LocalDate.parse(myDate),  LocalDate.now());
                switch (caso) {
                    case 0:
                        result=a1.create(new administradorPagoDTO(admPR.tituloPago.getText(), Float.valueOf(admPR.montoPago.getText()), admPR.entidadPago.getText(), admPR.descripcionPago.getText(), formatDate, input));
                        //Blanqueando
                        assertEquals(expResult, result);
                        System.out.println("Pago Registrado Correctamente.");
                        ;
                        break;
                    case 1:
                        result=false;
                        System.out.println("Titulo pago debe contener por lo menos 3 caracteres.");
                        assertEquals(expResult, result);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "El monto debe ser mayor a 0.");//cambiar
                        result=false;//copiar en cases
                        assertEquals(expResult, result);//copiar en cases
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "El campo entidad pago debe contener por los menos 3 caracteres.");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "La descripción del pago debe contener por los menos 3 caracteres.");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El archivo supera los 840 kb");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "La fecha no debe ser mayor a la actual.");
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "La fecha anterior debe debe estar en un margen de 10 días respecto a la fecha actual.");
                        break;
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(administradorPagoDAOTest.class.getName()).log(Level.SEVERE, null, ex);
        }

        }
    /*
                System.out.println("create");
                administradorPagoDTO c = null;
                administradorPagoDAO instance = new administradorPagoDAO();
                boolean expResult = false;
                boolean result = instance.create(c);
                assertEquals(expResult, result);
                // TODO review the generated test code and remove the default call to fail.
                fail("The test case is a prototype."); catch (FileNotFoundException ex) {
                Logger.getLogger(administradorPagoDAOTest.class.getName()).log(Level.SEVERE, null, ex);*/
    }



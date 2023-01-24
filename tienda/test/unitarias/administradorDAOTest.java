/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import modelo.dao.CajeroVentasDAO;
import modelo.dao.administradorDAO;
import modelo.dao.administradorPagoDAO;
import modelo.dao.logisticaCategoriasDAO;
import modelo.dao.logisticaProductosDAO;
import modelo.dao.logisticaProveedorDAO;
import modelo.dao.loguinDAO;
import modelo.dto.administradorDTO;
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
public class administradorDAOTest {

    public administradorDAOTest() {
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
     * Test of create method, of class administradorDAO.
     */
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
    @Test
    public void testCreate(){
        boolean result = false;
        boolean expResult;
        //Cargar formulario
        adm.textNombre.setText("Elias");
        adm.textApellido.setText("Cubas Gonzales");
        adm.textDNI.setText("21062494");
        adm.barraRol.setSelectedItem("Admin");
        adm.textCorreo.setText("");
        adm.textContraseña.setText("qweasdzxc");
        adm.textDireccion.setText("Urb. Santa Agustín 2da Etapa, Coma");
        adm.textTelefono.setText("987654321");
        int flag = 0;//NOSONAR
            if (!adm.textNombre.getText().isEmpty()) {//NOSONAR
                if (adm.textNombre.getText().length() < 3) {
                    System.out.println("Se requiere un minimo de 3 caracteres");
                    expResult = false;
                    assertEquals(true, result);
                } else {
                    if (!adm.textApellido.getText().isEmpty()) {//NOSONAR
                        if (adm.textApellido.getText().length() < 3) {
                            System.out.println("Se requiere un minimo de 3 caracteres");
                            expResult = false;
                            assertEquals(true, result);
                        } else {
                            if (!adm.textDNI.getText().isEmpty()) {//NOSONAR
                                if (adm.textDNI.getText().length() < 7) {
                                    System.out.println("El DNI requiere un minimo de 8 dígitos.");
                                    expResult = false;
                                    assertEquals(true, result);
                                } else {
                                    if (adm.barraRol.getSelectedItem() == "Admin" || adm.barraRol.getSelectedItem() == "Logistica" || adm.barraRol.getSelectedItem() == "Cajero") {//NOSONAR
                                        if (!adm.textCorreo.getText().isEmpty()) {//NOSONAR
                                            if (!adm.textContraseña.getText().isEmpty()) {//NOSONAR
                                                if (adm.textContraseña.getText().length() < 8) {
                                                    System.out.println("La contraseña debe contener mas de 7 caracteres.");
                                                    expResult = false;
                                                    assertEquals(true, result);
                                                } else {
                                                    if (!adm.textDireccion.getText().isEmpty()) {//NOSONAR
                                                        if (adm.textDireccion.getText().length() < 4) {
                                                            System.out.println("La dirección debe contener mas de 4 caracteres.");
                                                            expResult = false;
                                                            assertEquals(true, result);
                                                        } else {
                                                            if (!adm.textTelefono.getText().isEmpty()) {  //NOSONAR
                                                                Pattern p=Pattern.compile("[9]");
                                                                Matcher matcher=p.matcher(adm.textTelefono.getText().substring(0,1));
                                                                if (adm.textTelefono.getText().length() != 9 || !matcher.matches()) {
                                                                    System.out.println("El teléfono debe tener 9 dígitos y comenzar en 9.");
                                                                    expResult = false;
                                                                    assertEquals(true, result);
                                                                } else {
                                                                    flag = 1;//NOSONAR
                                                                }

                                                            } else {//NOSONAR
                                                                System.out.println("Por favor ingrese su teléfono.");
                                                                expResult = false;
                                                                assertEquals(true, result);
                                                            } //NOSONAR
                                                        }

                                                    } else {//NOSONAR
                                                        System.out.println("Por favor ingrese su dirección.");
                                                        expResult = false;
                                                        assertEquals(true, result);
                                                    } //NOSONAR
                                                }

                                            } else {//NOSONAR
                                                System.out.println("Porfavor ingrese su contraseña");
                                                expResult = false;
                                                assertEquals(true, result);
                                            }//NOSONAR
                                        } else {//NOSONAR
                                            System.out.println("Por favor ingrese su correo");
                                            expResult = false;
                                            assertEquals(true, result);
                                        }//NOSONAR

                                    } else {//NOSONAR
                                        System.out.println("Por favor ingrese su rol");
                                        expResult = false;
                                        assertEquals(true, result);
                                    } //NOSONAR
                                }

                            } else {//NOSONAR
                                System.out.println("Por favor ingrese su dni");
                                expResult = false;
                                assertEquals(true, result);
                            } //NOSONAR
                        }

                    } else {//NOSONAR
                        System.out.println( "Por favor ingrese sus apellidos");
                        expResult = false;
                        assertEquals(true, result);
                    } //NOSONAR 
                }

            } else {//NOSONAR
                System.out.println("Por favor ingrese su(s) nombre(s)");
                expResult = false;
                assertEquals(true, result);
            } //NOSONAR

            int rol = 3;//NOSONAR

            if (adm.barraRol.getSelectedItem() == "Admin") {
                rol = 1;
            }
            if (adm.barraRol.getSelectedItem() == "Logistica") {
                rol = 2;
            }
            if (adm.barraRol.getSelectedItem() == "Cajero") {
                rol = 3;
            }

            if (flag == 1) {

                Pattern pattern = Pattern
                        .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                Matcher mather = pattern.matcher(adm.textCorreo.getText());
                if (mather.find() != true) {

                    System.out.println("El email ingresado es invalido.");
                    expResult = false;
                    assertEquals(true, result);
                } else {
                    result = a.create(new administradorDTO(adm.textNombre.getText(), adm.textApellido.getText(),
                            Integer.valueOf(adm.textDNI.getText()), rol, adm.textCorreo.getText(),
                            adm.textContraseña.getText(), adm.textDireccion.getText(),
                            Integer.valueOf(adm.textTelefono.getText())));
                    expResult = true;
                    assertEquals(expResult, result);
                    if (!(result == expResult)) {
                        fail("The test case is a prototype.");
                    }
                }

            }
        
        /*
        System.out.println("create");

        administradorDTO c = new administradorDTO("David", "pablo",
                74227334, 1, "davidPe@gmail.com",
                "12345", "Jr la nada",
                987330113);
        administradorDAO instance = new administradorDAO();
        boolean expResult = false;
        boolean result = instance.create(c);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        if (!(result == expResult)) {
            fail("The test case is a prototype.");
        }*/
    }


}

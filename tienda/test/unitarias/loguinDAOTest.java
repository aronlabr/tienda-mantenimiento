/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import controlador.NewClass;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import modelo.dao.loguinDAO;
import modelo.dto.loginDTO;
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
public class loguinDAOTest {
    
    public loguinDAOTest() {
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

    @Test
    public void testRead_Object() {
        logueo lg=new logueo();  
        administradorRegistrar adm = new administradorRegistrar();
        //Logisitica
        logisticaRegistroProv lrp=new logisticaRegistroProv();
         //Cajero
        usuarioCajero cajU=new usuarioCajero();
        loginDTO l = null;
        loginDTO expResult = null;
        //variables a buscar
        lg.user.setText("maisestor4587@gmail.com");
        lg.password.setText("sd684");
        //Variable a predecir
        int keyPrimaryPred=2;
        String correoPred="david@gmail.com";
        String passPred="qwerty";
        int idPred=2;
        if (lg.user.getText().isEmpty() ||lg.password.getText().isEmpty()) {
                System.out.println("Existe por lo menos un campo vacio");
                if(l==null || expResult==null){
                fail("The test case is a prototype.");}} 
        else {
                loguinDAO login = new loguinDAO();
                l = login.read(lg.user.getText(), lg.password.getText());
                expResult = new loginDTO(keyPrimaryPred, correoPred, passPred, idPred);

                if (l != null) { //validar          
                    assertEquals(l.getRoles_idrol(), expResult.getRoles_idrol());
                        if(!(String.valueOf(l.getRoles_idrol()).equals(String.valueOf(expResult.getRoles_idrol())))){
                            fail("The test case is a prototype.");
                         }
                } else {
                    System.out.println("Correo o contraseña incorrecta");
                    fail("The test case is a prototype.");
                    
                }
            }
    }
    /*
    @Test
    public void testRead_Object_Object() {
        System.out.println("read");
        //cargar variables correo - contraseña
        Object key = "david@gmail.com";
        Object key2 = "qwerty";
        loguinDAO instance = new loguinDAO();
        loginDTO result = instance.read(key, key2);//buscador en bd
        //salida esperada - yp programo
        loginDTO expResult = new loginDTO(2, "david@gmail.com", "qwerty", 2);
        
        assertEquals(result.getRoles_idrol(), expResult.getRoles_idrol());
        
        
        if(!(String.valueOf(result.getRoles_idrol()).equals(String.valueOf(expResult.getRoles_idrol())))){
        fail("The test case is a prototype.");
        }
    }*/
}

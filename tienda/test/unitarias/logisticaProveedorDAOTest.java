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
import modelo.dao.logisticaProveedorDAO;
import modelo.dto.logisticaProveedorDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vista.LogisticaVistas.logisticaRegistroProv;


/**
 *
 * @author Moises
 */
public class logisticaProveedorDAOTest {
    
    public logisticaProveedorDAOTest() {
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
     * Test of create method, of class logisticaProveedorDAO.
     */
    @Test
    public void testCreate() {
        //Variable global
        boolean expResult=true;
        boolean result=false;
        logisticaProveedorDAO lp=new logisticaProveedorDAO();

        //Logisitica
        logisticaRegistroProv lrp=new logisticaRegistroProv();
        
        /*Pattern pattern = Pattern
            .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(lrp.textEmail.getText());*/
             int caso = 0;
            //cargar el formulario 
            lrp.textRazonSocial.setText("HYDRAULIC CENTER S.A.C.");
            lrp.textRepresentante.setText("ADRIANA CAROLINA");
            lrp.textTelefono.setText("987654321");
            lrp.textDistrito.setText("San Isidro");
            lrp.textRUC.setText("20547822171");
            lrp.comboBoxEstadoCivil.setSelectedItem("Activo");
            lrp.textEmail.setText("DanielRCarrasco@gmail.com");
            lrp.textDireccion.setText("Calle Almirante Guisse 205");
            lrp.textAreaDescripcion.setText("Representante legal");
            
            if (lrp.textRazonSocial.getText().isEmpty() || lrp.textRepresentante.getText().isEmpty() || lrp.textTelefono.getText().isEmpty() || lrp.textDistrito.getText().isEmpty() || lrp.textRUC.getText().isEmpty()|| lrp.comboBoxEstadoCivil.getSelectedItem()=="Ninguno" || lrp.textEmail.getText().isEmpty() || lrp.textDireccion.getText().isEmpty() || lrp.textAreaDescripcion.getText().isEmpty()) {

                System.out.println("Existe por lo menos algun campo vacío");                
                result=false;
                assertEquals(expResult, result);

                JOptionPane.showMessageDialog(null, "Existe por lo menos algun campo vacío");
                
                

            } else {
                
                if (lrp.textRazonSocial.getText().length() <= 3) {
                    caso = 1;
                }
                if (lrp.textRepresentante.getText().length() <= 3) {
                    caso = 2;
                }
                if (lrp.textTelefono.getText().length() !=9) {
                    caso = 3;
                }
                if (lrp.textDistrito.getText().length() <= 2) {
                    caso = 4;
                }
                if (lrp.textRUC.getText().length() !=11) {
                    caso = 5;
                }
                if (lrp.textDireccion.getText().length() <= 3) {
                    caso = 6;
                }
                if (lrp.textAreaDescripcion.getText().length() <= 3) {
                    caso = 7;
                }
                
                if (lrp.comboBoxEstadoCivil.getSelectedItem()=="Ninguno") {
                    caso = 8;
                }
                if (lrp.textEmail.getText().length() <= 3) {
                    caso = 9;
                }

                switch (caso) {
                    case 0:
                        result=lp.create(new logisticaProveedorDTO(lrp.textRazonSocial.getText(), lrp.textRepresentante.getText(), Integer.valueOf(lrp.textTelefono.getText()), lrp.textDistrito.getText(), lrp.textRUC.getText(), String.valueOf(lrp.comboBoxEstadoCivil.getSelectedItem()), lrp.textEmail.getText(), lrp.textDireccion.getText(), lrp.textAreaDescripcion.getText()));
                        System.out.println("-->"+result);
                        expResult = true;
                        assertEquals(expResult, result);   
                        if (!result){
                            fail("The test case is a prototype.");
                        }
                        System.out.println("Proveedor Registrado Correctamente.");
                        break;
                    case 1:
                        System.out.println("La razon social debe tener mas de 3 caracteres.");
                        result=false;//-->
                        assertEquals(expResult, result); //-->
                        break;
                    case 2:
                        System.out.println("El representante debe tener mas de 3 caracteres.");                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 3:
                        System.out.println("El teléfono debe ser de 9 dígitos.");                        
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 4:
                        System.out.println("El distrito debe tener mas de 2 caracteres.");                        
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 5:
                        System.out.println("El RUC debe contener 11 digitos.");
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 6:
                        System.out.println("La dirección debe contener mas de 3 caracteres.");                        
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 7:
                        System.out.println("La descripción debe contener mas de 3 caracteres.");                        
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 8:
                        System.out.println("Estado civil no seleccionado");                        
                        result=false;
                        assertEquals(expResult, result); 
                        break;
                    case 9:
                        System.out.println("El email es invalido o debe contener mas de 3 caracteres.");
                        result=false;
                        assertEquals(expResult, result); 
                    break;
                }
            }   
    }
}

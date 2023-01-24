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
import modelo.dao.logisticaModificarProvDAO;
import modelo.dao.logisticaModificarProvDAO;
import modelo.dto.logisticaModificarProvDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vista.LogisticaVistas.logisticaModificarProv;
import vista.LogisticaVistas.logisticaModificarProv;

/**
 *
 * @author JosephRoblesRubino
 */
public class logisticaModificarProvTest {
    
    public logisticaModificarProvTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class logisticaModificarProv.
     */
    @Test
    public void testCreate() {
        //Variable global
        boolean expResult=true;
        boolean result=false;
        logisticaModificarProvDAO lpp = new logisticaModificarProvDAO();

        //Logistica
        logisticaModificarProv lmp = new logisticaModificarProv();
        
             int caso = 0;
            //cargar el formulario CASOPRUEBA20
            lmp.textRazonSocial.setText("BAJF SPORT");
            lmp.textRepresentante.setText("JOSE VICO");
            lmp.textTelefono.setText("929875234");
            lmp.textDistrito.setText("me");
            lmp.textRUC.setText("20518036123");
            lmp.comboBoxEstadoCivil.setSelectedItem("Activo");
            lmp.textEmail.setText("fikimichal@omdiaco.com");
            lmp.textDireccion.setText("JR. SAN GERONIMO NRO. 284 URB. POP. SAN JUAN BAUTISTA");
            lmp.textAreaDescripcion.setText("Representante legal");
            
            if (lmp.textRazonSocial.getText().isEmpty() || lmp.textRepresentante.getText().isEmpty() || 
                    lmp.textTelefono.getText().isEmpty() || lmp.textDistrito.getText().isEmpty() || 
                    lmp.textRUC.getText().isEmpty()|| lmp.comboBoxEstadoCivil.getSelectedItem()=="Ninguno" || 
                    lmp.textEmail.getText().isEmpty() || lmp.textDireccion.getText().isEmpty() || 
                    lmp.textAreaDescripcion.getText().isEmpty()) {
                System.out.println("Existe por lo menos algun campo vacío");                
                result=false;
                assertEquals(expResult, result);
                JOptionPane.showMessageDialog(null, "Existe por lo menos algun campo vacío");
            }else {
                
                if (lmp.textRazonSocial.getText().length() <= 3) {
                    caso = 1;
                }
                if (lmp.textRepresentante.getText().length() <= 3) {
                    caso = 2;
                }
                if (lmp.textTelefono.getText().length() !=9) {
                    caso = 3;
                }
                if (lmp.textDistrito.getText().length() <= 2) {
                    caso = 4;
                }
                if (lmp.textRUC.getText().length() !=11) {
                    caso = 5;
                }
                if (lmp.textDireccion.getText().length() <= 3) {
                    caso = 6;
                }
                if (lmp.textAreaDescripcion.getText().length() <= 3) {
                    caso = 7;
                }
                
                if (lmp.comboBoxEstadoCivil.getSelectedItem()=="Ninguno") {
                    caso = 8;
                }
                if (lmp.textEmail.getText().length() <= 3) {
                    caso = 9;
                }

                switch (caso) {
                    case 0:
                        result=lpp.create(new logisticaModificarProvDTO(lmp.textRazonSocial.getText(), lmp.textRepresentante.getText(), Integer.valueOf(lmp.textTelefono.getText()), lmp.textDistrito.getText(), lmp.textRUC.getText(), String.valueOf(lmp.comboBoxEstadoCivil.getSelectedItem()), lmp.textEmail.getText(), lmp.textDireccion.getText(), lmp.textAreaDescripcion.getText()));
                        System.out.println("-->"+result);
                        expResult = true;
                        assertEquals(expResult, result);   
                        if (!result){
                            fail("The test case is a prototype.");
                        }
                        System.out.println("Proveedor Modificado Correctamente.");
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

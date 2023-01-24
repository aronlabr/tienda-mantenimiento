/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitarias;

import java.util.List;
import javax.swing.JOptionPane;
import modelo.dao.logisticaCategoriasDAO;
import modelo.dto.logisticaCategoriasDTO;
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
public class logisticaCategoriasDAOTest {
    
    public logisticaCategoriasDAOTest() {
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
     * Test of create method, of class logisticaCategoriasDAO.
     */
    @Test
    public void testCreate() {
        boolean result=false;
        boolean expResult=true;
        logisticaCategoriasDAO lcategorias= new logisticaCategoriasDAO();
        logisticaRegistrarProd lrprod= new logisticaRegistrarProd();
        logisticaCategoriasProd lcproducto=new logisticaCategoriasProd();
         //Setear valores
         lcproducto.textcodigo.setText("1234");
         lcproducto.textNombre.setText("caramelos");
         lcproducto.textAreaDescripcion.setText("");     
        if (lcproducto.textcodigo.getText().isEmpty() || lcproducto.textNombre.getText().isEmpty() || 
                lcproducto.textAreaDescripcion.getText().isEmpty() ) {
                System.out.println("Existe por lo menos algun campo vacío");
                assertEquals(expResult, result);
            } else {  
                int caso = 0;
                if (lcproducto.textcodigo.getText().length() != 4 && lrprod.textcodigo.getText().length() < 4) {
                    caso = 1;
                }
                if (lcproducto.textNombre.getText().length() <= 2) {
                    caso = 2;
                }
                switch (caso) {
                    case 0:
                        result=lcategorias.create(new logisticaCategoriasDTO(lcproducto.textcodigo.getText(), 
                                lcproducto.textNombre.getText(), lcproducto.textAreaDescripcion.getText()));
                        assertEquals(expResult, result);
                        System.out.println("Categoría creada correctamente.");

                        break;
                    case 1:
                        System.out.println("El codigo debe ser de 4 digitos");
                        assertEquals(expResult, result);
                        break;
                    case 2:
                        System.out.println("El nombre debe tener mas de 2 caracteres.");
                        assertEquals(expResult, result);
                        break;
                }
            }
     
    }
 
}

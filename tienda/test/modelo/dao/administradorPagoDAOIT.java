/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo.dao;

import java.util.List;
import modelo.dto.administradorPagoDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nickm
 */
public class administradorPagoDAOIT {
    
    public administradorPagoDAOIT() {
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
        System.out.println("create");
        administradorPagoDTO c = null;
        administradorPagoDAO instance = new administradorPagoDAO();
        boolean expResult = true;
        boolean result = instance.create(new administradorPagoDTO(null,(float)540.0,
                "Lighthouse Clothes","Pago de compra de paquetes de gaseosas","2022-06-03","PDF"));
        assertEquals(expResult, result);
        
        if(!(result==expResult)){
        fail("The test case is a prototype");
        }
   
    }

}



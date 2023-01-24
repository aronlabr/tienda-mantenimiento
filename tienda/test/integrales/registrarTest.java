/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrales;

import java.util.List;
import modelo.dao.administradorDAO;
import modelo.dao.administradorPagoDAO;
import modelo.dto.administradorDTO;
import modelo.dto.administradorPagoDTO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class registrarTest {

    public registrarTest() {
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

        administradorDTO c = new administradorDTO(null, "Cabrera Rodriguez",
                23847239, 1, "maeillanes@hotmail.com",
                "password123", "Urb. Santa Agustín 2da Etapa, Comas",
                987654321);
        administradorDAO instance = new administradorDAO();
        boolean expResult = true;
        boolean result = instance.create(c);
        assertEquals(expResult, result);
       
        // TODO review the generated test code and remove the default call to fail.
        if (!(result == expResult)) {
            fail("The test case is a prototype.");
        }

    }
}

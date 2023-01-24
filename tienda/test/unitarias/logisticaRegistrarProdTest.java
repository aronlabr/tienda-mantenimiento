package unitarias;

import java.util.Date;
import javax.swing.JOptionPane;
import junit.framework.TestCase;
import modelo.dao.logisticaProductosDAO;
import modelo.dao.logisticaProductosDAO;
import modelo.dto.logisticaProductosDTO;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.BeforeClass;
import org.junit.Test;
import vista.LogisticaVistas.logisticaRegistrarProd;

public class logisticaRegistrarProdTest extends TestCase{
    
    
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
        
        logisticaProductosDAO daoRegProductos = new logisticaProductosDAO();
        logisticaRegistrarProd vistaRegistrar = new logisticaRegistrarProd();

        //Logistica
        
             int caso = 0;
            //cargar el formulario CASOPRUEBA20
            vistaRegistrar.textcodigo.setText("BAJF SPORT");
            vistaRegistrar.textFechaVencimiento.setDate(new Date(2000, 10, 20));
            vistaRegistrar.textNombre.setText("929875234");
            vistaRegistrar.comboBoxProveedor.setSelectedItem("");
            vistaRegistrar.textPrecio.setText("20518036123");
            vistaRegistrar.textMarca.setText("Activo");
            vistaRegistrar.textCantidad.setText("fikimichal@omdiaco.com");
            vistaRegistrar.textCateogria.setSelectedItem("JR. SAN GERONIMO NRO. 284 URB. POP. SAN JUAN BAUTISTA");
            vistaRegistrar.textAreaDescripcion.setText("Representante legal");
            
            if (vistaRegistrar.textcodigo.getText().isEmpty() || vistaRegistrar.textFechaVencimiento.getDate() != null ||
                    vistaRegistrar.textNombre.getText().isEmpty() || vistaRegistrar.comboBoxProveedor.getSelectedItem()=="Ninguno" || 
                    vistaRegistrar.textPrecio.getText().isEmpty()|| vistaRegistrar.textMarca.getText().isEmpty() || 
                    vistaRegistrar.textCantidad.getText().isEmpty() || vistaRegistrar.textCateogria.getSelectedItem()=="Ninguno" || 
                    vistaRegistrar.textAreaDescripcion.getText().isEmpty()) {
                System.out.println("Existe por lo menos algun campo vacío");                
                result=false;
                assertEquals(expResult, result);
                JOptionPane.showMessageDialog(null, "Existe por lo menos algun campo vacío");
            }else {
                
                if (vistaRegistrar.textcodigo.getText().length() <= 3) {
                    caso = 1;
                }
                if (vistaRegistrar.textFechaVencimiento.getDate().compareTo(new Date(2022, 5, 30)) < 0) {
                    caso = 2;
                }
                if (vistaRegistrar.textNombre.getText().length() !=9) {
                    caso = 3;
                }
                if (vistaRegistrar.comboBoxProveedor.getSelectedItem() == "Ninguno") {
                    caso = 4;
                }
                if (Integer.parseInt(vistaRegistrar.textPrecio.getText()) < 0 || Integer.parseInt(vistaRegistrar.textPrecio.getText()) > 999) {
                    caso = 5;
                }
                if (vistaRegistrar.textMarca.getText().length() <= 3 || vistaRegistrar.textMarca.getText().length() >= 30) {
                    caso = 6;
                }
                if (vistaRegistrar.textCantidad.getText().length() <= 3 || vistaRegistrar.textCantidad.getText().length() > 500) {
                    caso = 7;
                }
                if (vistaRegistrar.textCateogria.getSelectedItem()=="Ninguno") {
                    caso = 8;
                }
                if (vistaRegistrar.textAreaDescripcion.getText().length() <= 3) {
                    caso = 9;
                }

                switch (caso) {
                    case 0:
                        result=daoRegProductos.create(new logisticaProductosDTO(
                                vistaRegistrar.textcodigo.getText(),
                                vistaRegistrar.textNombre.getText(),
                                Integer.valueOf(vistaRegistrar.textPrecio.getText()),
                                vistaRegistrar.textAreaDescripcion.getText(),
                                vistaRegistrar.textFechaVencimiento.getDate().toString(),
                                String.valueOf(vistaRegistrar.comboBoxProveedor.getSelectedItem()),
                                vistaRegistrar.textMarca.getText(),
                                String.valueOf(vistaRegistrar.textCateogria.getSelectedItem()),
                                Integer.valueOf(vistaRegistrar.textCantidad.getText())
                        )
                        );
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
                        System.out.println("El representante debe tener mas de 3 caracteres.");
                        result=false;
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

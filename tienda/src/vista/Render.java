//ESTA WEBADA ES PARA DAR FORMATO A TABLAS 
package vista;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Usuario
 */
public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if(o instanceof JButton)
            return (JButton)o;
    
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); 
    }
}

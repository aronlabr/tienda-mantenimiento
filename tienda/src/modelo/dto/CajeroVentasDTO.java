
package modelo.dto;

/**
 *
 * @author Angel
 */
public class CajeroVentasDTO {
    private int idventas;
//    private int vendedor_idvendedor;
    private int num_ventas;
    private String fecha_venta;
    private float monto;
    private String estado;
   /*private int ventascol;*/

    public CajeroVentasDTO() {
    }

    public CajeroVentasDTO(int num_ventas, String fecha_venta, float monto, String estado) {
        this.num_ventas = num_ventas;
        this.fecha_venta = fecha_venta;
        this.monto = monto;
        this.estado = estado;
    }

    public CajeroVentasDTO(int num_ventas, String fecha_venta, float monto) {
        this.num_ventas = num_ventas;
        this.fecha_venta = fecha_venta;
        this.monto = monto;
    }
    
 
    public CajeroVentasDTO(int idventas) {
       this.idventas=idventas;
    }

    public int getIdventas() {
        return idventas;
    }

    public void setIdventas(int idventas) {
        this.idventas = idventas;
    }
    
    
   /* public int getVendedor_idvendedor() {
        return vendedor_idvendedor;
    }

    public void setVendedor_idvendedor(int vendedor_idvendedor) {
        this.vendedor_idvendedor = vendedor_idvendedor;
    }
*/
    public int getNum_ventas() {
        return num_ventas;
    }

    public void setNum_ventas(int num_ventas) {
        this.num_ventas = num_ventas;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   /* public int getVentascol() {
        return ventascol;
    }

    public void setVentascol(int ventascol) {
        this.ventascol = ventascol;
    }*/
    
}

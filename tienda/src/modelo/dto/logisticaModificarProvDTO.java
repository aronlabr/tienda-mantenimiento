/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;
/**
 *
 * @author JosephRoblesRubino
 */
public class logisticaModificarProvDTO {//NOSONAR
    private String razonSocial;
    private String representante;
    private int telefono;
    private String distrito;
    private String ruc;
    private String estado;
    private String email;
    private String direccion;
    private String detalles;

    public logisticaModificarProvDTO(String razonSocial, String representante, int telefono, String distrito, String ruc, String estado, String email, String direccion, String detalles) {
        this.razonSocial = razonSocial;
        this.representante = representante;
        this.telefono = telefono;
        this.distrito = distrito;
        this.ruc = ruc;
        this.estado = estado;
        this.email = email;
        this.direccion = direccion;
        this.detalles = detalles;
    }

    public logisticaModificarProvDTO(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRepresentante() {
        return representante;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getRuc() {
        return ruc;
    }

    public String getEstado() {
        return estado;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
}

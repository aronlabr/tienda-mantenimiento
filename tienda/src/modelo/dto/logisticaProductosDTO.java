/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;
/**
 *
 * @author David
 */
public class logisticaProductosDTO {//NOSONAR
    private String codigo;
    private String nombre;
    private float precio;
    private String descripcion;
    private String fecha;
    private String proveedor;
    private String marca;
    private String estado;
    private String categoria;
    private int stock;

    public logisticaProductosDTO(String codigo, String nombre, float precio, String descripcion, String fecha, String proveedor, String marca, String categoria, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.marca = marca;
        this.categoria = categoria;
        this.stock=stock;
        
    }

    public String getEstado() {
        return estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }
    
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
 
}

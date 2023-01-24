/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

import java.io.InputStream;
/**
 *
 * @author MOISES
 */
public class administradorPagoDTO {//NOSONAR
    private int id;
    private String titulo;
    private float monto;
    private String entidad;
    private String descripcion;
    private String fechaPAgo;
    private Object img; 
    private InputStream is;
    public administradorPagoDTO(){
    }
    public administradorPagoDTO(String titulo, float monto, String entidad, String descripcion, String fechaPAgo, Object img) {
        this.titulo = titulo;
        this.monto = monto;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fechaPAgo = fechaPAgo;
        this.img = img;
    }
    public administradorPagoDTO(String titulo, float monto, String entidad, String descripcion, String fechaPAgo) {
        this.titulo = titulo;
        this.monto = monto;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fechaPAgo = fechaPAgo;
       
    }
    public administradorPagoDTO(int id, String titulo, float monto, String entidad, String descripcion, String fechaPAgo, Object img) {//se´puede borrar
        this.id = id;
        this.titulo = titulo;
        this.monto = monto;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fechaPAgo = fechaPAgo;
        this.img = img;
    }

    public administradorPagoDTO(int id, String titulo, float monto, String entidad, String descripcion, String fechaPAgo) {
        this.id = id;
        this.titulo = titulo;
        this.monto = monto;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fechaPAgo = fechaPAgo;
    }
    
    public administradorPagoDTO(int id, String titulo, float monto, String entidad, String descripcion, String fechaPAgo, InputStream is) {
        this.id = id;
        this.titulo = titulo;
        this.monto = monto;
        this.entidad = entidad;
        this.descripcion = descripcion;
        this.fechaPAgo = fechaPAgo;
        this.is = is;
    }
    
    public InputStream getIs() {
        return is;
    }

    public void setIs(InputStream is) {
        this.is = is;
    }

   

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public float getMonto() {
        return monto;
    }

    public String getEntidad() {
        return entidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaPAgo() {
        return fechaPAgo;
    }

    public Object getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaPAgo(String fechaPAgo) {
        this.fechaPAgo = fechaPAgo;
    }

    public void setImg(Object img) {
        this.img = img;
    }
    

   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;
/**
 *
 * @author MOISES
 */
public class administradorDTO {//NOSONAR
    private int id;
    private String nombre;
    private String apellido;
    private int DNI;
    private int roles_idrol;
    private String correo;
    private String contrasena;
    private String dirección;
    private int telefono; 
    public administradorDTO(){
    }

    public administradorDTO(int id, String correo, String contrasena, int roles_idrol) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.roles_idrol = roles_idrol;
    }
    
    public administradorDTO(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public administradorDTO(int id, String nombre, String apellido, int DNI, int roles_idrol, String correo, String contrasena, String dirección, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.roles_idrol = roles_idrol;
        this.correo = correo;
        this.contrasena = contrasena;
        this.dirección = dirección;
        this.telefono = telefono;
    }
    public administradorDTO(String nombre, String apellido, int DNI, int roles_idrol, String correo, String contrasena, String dirección, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.roles_idrol = roles_idrol;
        this.correo = correo;
        this.contrasena = contrasena;
        this.dirección = dirección;
        this.telefono = telefono;
    }

    public administradorDTO(int DNI) {
        this.DNI = DNI;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRoles_idrol() {
        return roles_idrol;
    }

    public void setRoles_idrol(int roles_idrol) {
        this.roles_idrol = roles_idrol;
    }
    
   
    
}

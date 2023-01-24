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
public class loginDTO {//NOSONAR
    private int id;
    private String correo;
    private String contrasena;
    private int roles_idrol;
    
    public loginDTO(){
    }

    public loginDTO(int id, String correo, String contrasena, int roles_idrol) {
        this.id = id;
        this.correo = correo;
        this.contrasena = contrasena;
        this.roles_idrol = roles_idrol;
    }
    
    public loginDTO(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
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

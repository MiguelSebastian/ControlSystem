/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.utp.entitys;

/**
 *
 * @author Miguel
 */
public class UsuarioBean {
     private Long idUsuario;
     private String coUsuario;
     private String dePassword;
     private Long idTrabajador;

    public UsuarioBean() {
        
    }

    public UsuarioBean(Long idUsuario, String coUsuario, String dePassword, Long idTrabajador) {
        this.idUsuario = idUsuario;
        this.coUsuario = coUsuario;
        this.dePassword = dePassword;
        this.idTrabajador = idTrabajador;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCoUsuario() {
        return coUsuario;
    }

    public void setCoUsuario(String coUsuario) {
        this.coUsuario = coUsuario;
    }

    public String getDePassword() {
        return dePassword;
    }

    public void setDePassword(String dePassword) {
        this.dePassword = dePassword;
    }

    public Long getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Long idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

}

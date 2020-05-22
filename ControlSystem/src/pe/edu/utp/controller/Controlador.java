package pe.edu.utp.controller;

import pe.edu.utp.dao.IUsuarioDao;
import pe.edu.utp.dao.UsuarioDao;
import pe.edu.utp.entitys.UsuarioBean;

/**
 *
 * @author Miguel
 */
public class Controlador {
    boolean existe = false;
    UsuarioDao usuarioDao;
    
    public boolean getUsuario(UsuarioBean usuarioBean){
        usuarioDao = new UsuarioDao();
        try {
            if (usuarioDao.getUsuario(usuarioBean) != null) {
                existe = true;
            }          
        } catch (Exception e) {
        }
         return existe;
    } 
}

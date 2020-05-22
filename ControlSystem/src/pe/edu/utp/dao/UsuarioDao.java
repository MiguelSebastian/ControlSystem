package pe.edu.utp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.edu.utp.controller.Conexion;
import pe.edu.utp.entitys.TrabajadorBean;
import pe.edu.utp.entitys.UsuarioBean;

/**
 *
 * @author Miguel
 */
public class UsuarioDao implements IUsuarioDao{
   Connection conn = null;
   Conexion conector;
   public boolean existe = false;
   private UsuarioBean usuarioBeanActual = null;

    @Override
    public UsuarioBean getUsuario(UsuarioBean usuarioBean) {
        PreparedStatement ps;        
        ResultSet rs;       
        try {
            conn = conector.getConection();

            String sql = ("SELECT * FROM usuario WHERE CO_USUARIO = '"+ usuarioBean.getCoUsuario() +"' " +" AND DE_PASSWORD = '" + usuarioBean.getDePassword() +"';");
            ps = conn.prepareStatement(sql);            
//            ps.setString(1, usuarioBean.getCoUsuario());
//            ps.setString(2, usuarioBean.getDePassword());
            
            rs = ps.executeQuery(sql);
            if (rs.next()) {               
                usuarioBeanActual = new UsuarioBean(rs.getLong("ID_USUARIO"), rs.getNString("CO_USUARIO"),rs.getNString("DE_PASSWORD"),rs.getLong("ID_TRABAJADOR"));
                existe = true;
                }
        } catch (Exception e) {
            System.out.println(e);
        }
        return usuarioBeanActual;
    }
    
    
}

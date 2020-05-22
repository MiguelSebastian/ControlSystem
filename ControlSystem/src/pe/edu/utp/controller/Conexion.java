package pe.edu.utp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class Conexion {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/controlsystem";
    public static final String USUAR = "root";
    public static final String CONTR = "12345";
    Connection conn = null;   
    //dbexrzm    
    
    public static Connection getConection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USUAR, CONTR);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }        
}

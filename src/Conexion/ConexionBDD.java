package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexionBDD {

    Connection con = null;

    public Connection conexion() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/holandabro", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
        }
        return con;
    }
}

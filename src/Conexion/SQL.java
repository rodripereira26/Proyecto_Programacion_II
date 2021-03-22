package Conexion;

import javax.sql.rowset.WebRowSet;
import Conexion.ConexionBDD;
import Conexion.ConexionBDD;
import Datos.Buscar;
import Datos.Ingrediente;
import Datos.ModificarRec;
import Datos.NuevoIngrediente;
import Datos.Pasos;
import Datos.RegistroBDD;
import Datos.RegistroReceta;
import Datos.UsuarioTemporal;
import Interfaz.AñadirReceta;
import Datos.recuperacionCorreo;
import Datos.recuperacionCorreo;
import Interfaz.AñadirPasos;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JComboBox;

public class SQL extends ConexionBDD {

    public boolean registro(RegistroBDD usr) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO registro (nombreUsuario, contraseña, nombre, apellido, correo) VALUES (?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombreUsuario());
            ps.setString(2, usr.getContraseña());
            ps.setString(3, usr.getNombre());
            ps.setString(4, usr.getApellido());
            ps.setString(5, usr.getCorreo());
            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int validacionUsuario(String usuario) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT count(nombreUsuario) FROM registro WHERE nombreUsuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }
    }

    public boolean validacionCorreo(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);

        return mather.find();

    }

    public boolean login(RegistroBDD usr) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT nombreusuario, contraseña, nombre FROM registro WHERE nombreusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombreUsuario());
            rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getContraseña().equals(rs.getString(2))) {

                    usr.setNombre(rs.getString(3));
                    return true;

                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public ArrayList<String> traerIngrediente() {

        ArrayList<String> lista = new ArrayList<String>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT * FROM ingrediente";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
        } catch (Exception e) {
        }
        try {
            while (rs.next()) {
                lista.add(rs.getString("nombreingrediente"));
            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public boolean añadirReceta(UsuarioTemporal usuario, RegistroReceta rec) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO recetas (nombreUsuario, nombre, descripcion, comentarioReceta, tiempoReceta, tipoReceta, dificultadReceta) VALUES (?, ?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getTexto());
            ps.setString(2, rec.getNombre());
            ps.setString(3, rec.getDescripcion());
            ps.setString(4, rec.getComentario());
            ps.setString(5, rec.getTiempo());
            ps.setString(6, rec.getTipo());
            ps.setString(7, rec.getDificultad());
            ps.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public boolean idReceta(RegistroReceta rec, UsuarioTemporal usu) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT id_receta FROM recetas WHERE nombre = ? and nombreusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rec.getNombre());
            ps.setString(2, usu.getTexto());
            rs = ps.executeQuery();

        } catch (Exception e) {
            return false;
        }
        try {
            while (rs.next()) {
                rec.setId(rs.getString("id_receta"));
                return true;
            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public ArrayList ingrediente() {

        Ingrediente ing = new Ingrediente();
        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        String sql = "SELECT * FROM ingrediente WHERE nombreingrediente = ?";

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < Ingrediente.getNombre().size(); i++) {
                ps.setObject(1, Ingrediente.getNombre().get(i));
                rs = ps.executeQuery();
            }

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("id_ingrediente"));

            }
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public boolean ingresarIngrediente(Ingrediente ing, RegistroReceta rec) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO recetas_has_ingrediente (id_receta, ingrediente, cantidad, unidad) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < Ingrediente.getId().size(); i++) {
                ps.setString(1, rec.getId());
                ps.setObject(2, Ingrediente.getId().get(i));
                ps.setObject(3, Ingrediente.getCantidad().get(i));
                ps.setObject(4, Ingrediente.getUnidad().get(i));
                ps.execute();
            }
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int buscarCosto_Calorias(RegistroReceta rec, String sql) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, rec.getId());
            rs = ps.executeQuery();

            while (rs.next()) {
                cantidad = rs.getInt(1);
                return cantidad;

            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public boolean updateCosto_Calorias(RegistroReceta rec, int valor, String sql) {

        Connection con = conexion();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, valor);
            ps.setString(2, rec.getId());
            ps.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int verificarReceta(String tm, String nombreReceta) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        RegistroReceta rec = new RegistroReceta();
        UsuarioTemporal usu = new UsuarioTemporal();

        String sql = "SELECT count(nombre) FROM recetas WHERE nombreusuario = ? and nombre = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tm);
            ps.setString(2, nombreReceta);
            rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }
    }

    public boolean updateContraseña(String contra, recuperacionCorreo cor) {

        Connection con = conexion();
        PreparedStatement ps = null;

        String sql = "UPDATE registro SET contraseña = ? WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setString(2, cor.getCorreo());
            ps.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public int existeCorreo(recuperacionCorreo cor) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT count(correo) FROM registro WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cor.getCorreo());
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public int existeCorreoRegistro(String correo) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT count(correo) FROM registro WHERE correo = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }

    }

    public boolean ingresarPasos(Pasos pas, RegistroReceta rec) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO pasos (id_receta, paso) VALUES (?,?)";

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < Pasos.getNombre().size(); i++) {
                ps.setString(1, rec.getId());
                ps.setObject(2, Pasos.getNombre().get(i));
                ps.execute();
            }
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public boolean insertarIngrediente(NuevoIngrediente ing) {

        PreparedStatement ps = null;
        Connection con = conexion();

        String sql = "INSERT INTO ingrediente (nombreingrediente, costo, proteinas, grasas, carbohidratos, calorias) VALUES (?, ?, ?, ?, ?, ?);";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, NuevoIngrediente.getNombre());
            ps.setInt(2, NuevoIngrediente.getCosto());
            ps.setInt(3, NuevoIngrediente.getProteinas());
            ps.setInt(4, NuevoIngrediente.getGrasas());
            ps.setInt(5, NuevoIngrediente.getCarbohidratos());
            ps.setInt(6, NuevoIngrediente.getCalorias());
            ps.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }
    }

    public int existeIngrediente(NuevoIngrediente ing) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "SELECT count(nombreingrediente) FROM ingrediente WHERE nombreingrediente = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, NuevoIngrediente.getNombre());
            rs = ps.executeQuery();

            while (rs.next()) {
                return rs.getInt(1);
            }
            return 1;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 1;

        }

    }

    public int cantidadNombres(String nom, String sql) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            rs = ps.executeQuery();

            while (rs.next()) {
                cantidad = rs.getInt(1);
                return cantidad;

            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public ArrayList dificultad(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("dificultadreceta"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList traerId(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("id_receta"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList usuario(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("nombreusuario"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList nombreIngredienteId(String sql) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Buscar.getIdpru());
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("nombreingrediente"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList duracionReceta(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("tiemporeceta"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList comentarioReceta(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("comentarioreceta"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList descripcionReceta(String sql, String busqueda) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("descripcion"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList caloriasReceta(String sql) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            for (int i = 0; i < Buscar.getId().size(); i++) {
                ps.setString(1, Buscar.getId().get(i));
                rs = ps.executeQuery();
            }

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getInt(1));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList cantidadIngrediente(String sql) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Buscar.getIdpru());
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("cantidad"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList unidadIngrediente(String sql) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Buscar.getIdpru());
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("unidad"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList traerPasos(String sql) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, Buscar.getIdpru());
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("paso"));
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public int busqueda(String busqueda, String sql) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            rs = ps.executeQuery();

            while (rs.next()) {
                cantidad = rs.getInt(1);
                return cantidad;

            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public ArrayList nombrePor(String sql, String busqueda, String columna) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, busqueda);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString(columna));
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public boolean updateReceta(String sql, String dato, String dato2) {

        Connection con = conexion();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dato);
            ps.setString(2, dato2);
            ps.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }

    public String modificarTipo() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        String tipo = "";

        String sql = "SELECT tiporeceta FROM recetas WHERE id_receta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ModificarRec.getId());
            rs = ps.executeQuery();

            if (rs.next()) {
                tipo = rs.getString("tiporeceta");
                return tipo;

            }
            return tipo;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return tipo;

        }
    }

    public String modificarDesc() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        String desc = "";

        String sql = "SELECT descripcion FROM recetas WHERE id_receta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ModificarRec.getId());

            rs = ps.executeQuery();

            if (rs.next()) {
                desc = rs.getString("descripcion");
                return desc;

            }
            return desc;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return desc;

        }
    }

    public String modificarCom() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        String com = "";

        String sql = "SELECT comentarioreceta FROM recetas WHERE id_receta = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ModificarRec.getId());

            rs = ps.executeQuery();

            if (rs.next()) {
                com = rs.getString("comentarioreceta");
                return com;

            }
            return com;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return com;

        }
    }
        public ArrayList modificarIng(String sql,String columna,String id ) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString(columna));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }
  public int traerIdIngrediene( String sql,String nomIng, int idRec) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ModificarRec.getNomIngrediente());
            ps.setString(2,ModificarRec.getId());
            
            rs = ps.executeQuery();

            while (rs.next()) {
                cantidad = rs.getInt(1);
                return cantidad;

            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }

    public int cantidadNombresRango(String nom, String nom2, String sql) {

        Connection con = conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        int cantidad = 0;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, nom2);
            rs = ps.executeQuery();

            while (rs.next()) {
                cantidad = rs.getInt("count(nombre)");
                return cantidad;

            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return 0;

        }

    }
    

    //***********BUSQUEDA POR COSTO***********
    public ArrayList duracionRecetaCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("tiemporeceta"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList comentarioRecetaCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("comentarioreceta"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList descripcionRecetaCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("descripcion"));
            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList dificultadCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("dificultadreceta"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList traerIdCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("id_receta"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList usuarioCosto(String sql, String busqueda, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, busqueda);
            ps.setString(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString("nombreusuario"));

            }
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }

    public ArrayList nombrePorCosto_Calorias(String sql, String busqueda, String columna, String busqueda2) {

        ArrayList ali = new ArrayList();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();

        try {
            ps = con.prepareStatement(sql);
            ps.setObject(1, busqueda);
            ps.setObject(2, busqueda2);
            rs = ps.executeQuery();

        } catch (Exception e) {

        }
        try {
            while (rs.next()) {
                ali.add(rs.getString(columna));
            }
            con.close();

        } catch (Exception ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ali;
    }
    
    public String modificarIng(String sql, String dato) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conexion();
        String com = "";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dato);

            rs = ps.executeQuery();

            if (rs.next()) {
                com = rs.getString("id_ingrediente");
                return com;

            }
            return com;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return com;

        }
    }
    
    public boolean updateIngrediente(String sql, String dato, String dato2, String dato3) {

        Connection con = conexion();
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dato);
            ps.setString(2, dato2);
            ps.setString(3, dato3);
            ps.execute();

            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQL.class.getName()).log(Level.SEVERE, null, ex);
            return false;

        }

    }
    
}

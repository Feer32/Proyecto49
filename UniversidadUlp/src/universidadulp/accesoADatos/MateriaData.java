package universidadulp.accesoADatos;

import java.sql.Connection;
import universidadulp.Entidades.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class MateriaData {

    private Connection conexion = null;

    public MateriaData() {

        conexion = Conexion.getConexion();

    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, año, activo) VALUES (?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                materia.setIdMateria(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia añadida con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de Materias");
        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = null;
        //CAMBIE EL NOMBRE DE ANIO POR AÑO PORQUE ASI LO TENEMOS EN EL SQL
        String sql = "SELECT nombre, año FROM materia WHERE idMateria=? AND activo=1";
        PreparedStatement ps = null;

        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(resultado.getString("nombre"));
                materia.setAnio(resultado.getInt("año"));
                materia.setActivo(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
            }
            ps.close();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla de materias");
        }
        return materia; 
    }
    
    public void modificarMateria(Materia materia) {
  //CAMBIE EL NOMBRE DE ANIO POR AÑO PORQUE ASI LO TENEMOS EN EL SQL
        String sql = "UPDATE materia SET nombre = ? , año = ?  WHERE idMateria = ?";
        PreparedStatement ps = null;

        try {
            //EL TERCER SIGNO DE PREGUNTA PASA SIEmPRE EL 1 Y NOSOTROS QUERESMOS PASAR EL ID
            ps = conexion.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
//            ps.setBoolean(3, materia.isActivo());
            ps.setInt(3, materia.getIdMateria());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de materias " + ex.getMessage());
        }
    }

    public void bajarMateria(int id) {

        try {
            //CAMBIE LA PALABRA ESTADO POR ACTIVO ASI ESTA EN EL SQL
            String sql = "UPDATE materia SET activo = 0 WHERE idMateria = ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se Cambio el estado de la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de las materias");
        }
    }
    
      public void eliminarMateira(int id) {

        try {
            String sql = "DELETE FROM `materia` WHERE idMateria = ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de las Materias");
        }
    }
      
        public List<Materia> listarMaterias() {

        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("activo"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla de las materias." + ex.getMessage());
        }
        return materias;
    }
}

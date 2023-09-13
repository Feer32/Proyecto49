package universidadulp.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadulp.Entidades.Alumno;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;

public class InscripcionData {

    private Connection conexion = null;
    private AlumnoData alumno = new AlumnoData();
    private MateriaData mate = new MateriaData();

    public InscripcionData() {

        conexion = Conexion.getConexion();
    }

    public void GuardarInscripcion(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion(idAlumno, idMateria, nota) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                insc.setIdInscripcion(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción realizada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Inscripcion", 0);
        }
    }

    public List<Inscripcion> obtenerInscripciones() {

        
        ArrayList<Inscripcion> cursada = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setNota(rs.getDouble("nota"));
                Alumno alum = alumno.buscarAlumnoPorId(rs.getInt("idAlumno"));
                Materia materia = mate.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(materia);
                cursada.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        return cursada;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {

        
        ArrayList<Inscripcion> cursada = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                insc.setNota(rs.getDouble("nota"));
                Alumno alum = alumno.buscarAlumnoPorId(rs.getInt("idAlumno"));
                Materia materia = mate.buscarMateria(rs.getInt("idMateria"));
                insc.setAlumno(alum);
                insc.setMateria(materia);
                cursada.add(insc);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        return cursada;
    }
    
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {

        
        ArrayList<Materia> cursada = new ArrayList<>();

        String sql = "SELECT* FROM materia" +
               " WHERE estado = 1 and idmateria not in" +
                "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                cursada.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        return cursada;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int idAlumno) {

        
        ArrayList<Materia> cursada = new ArrayList<>();

        String sql = "SELECT inscripcion.idmateria, nombre, año FROM inscripcion," +
                "materia WHERE inscripcion.idMateria =  materia.idmarteria"+
                "and inscripcion.idAlumno = ?";
        try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                cursada.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        return cursada;
    }
    
    
    

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? and idmateria = ?";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setDouble(3, idMateria);

            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Nota Actualizada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Inscripcion", 0);
        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        
        ArrayList<Alumno> alumnosMateria = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno, dni, nombre, apellido, fechaNacimiento, estado" +
                "FROM inscripcion, alumno WHERE inscripcion.idAlumno = alumno.idAlumno and" +
                "idMateria = ? and alumno.estado = 1";
        
         try {

            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Alumno alumnos= new Alumno();
                alumnos.setIdAlumno(rs.getInt("idAlumno"));
                alumnos.setDni(rs.getInt("dni"));
                alumnos.setApellido(rs.getString("apellido"));
                alumnos.setNombre(rs.getString("nombre"));
                alumnos.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumnos.setEstado(rs.getBoolean("estado"));
                alumnosMateria.add(alumnos);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Inscripcion" + ex.getMessage());
        }
        return alumnosMateria;
    }
    
    public void darBajaInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        try {
            String sql = "UPDATE inscripcion SET estado = 0 WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se Cambio el estado de la materia del alumno.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripción");
        }
    }
    
    public void eliminarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

        try {
            String sql = "DELETE FROM inscripcion WHERE idAlumno = ? and idMateria = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla inscripción");
        }
    }
    }


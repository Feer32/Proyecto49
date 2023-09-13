package universidadulp;

import java.time.LocalDate;
import java.time.Month;
import universidadulp.Entidades.Alumno;
import java.sql.SQLException;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;
import universidadulp.accesoADatos.*;

import universidadulp.accesoADatos.AlumnoData;

public class UniversidadUlp {

    public static void main(String[] args) throws SQLException {
       /* Alumno carlos = new Alumno(24141214, "Lalala", "Abuela", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        Alumno carlos1 = new Alumno(25141214, "Lalala", "Abuela1", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        Alumno carlos2 = new Alumno(43214333, "Lalala", "Abuela2", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        Alumno carlos3 = new Alumno(21444214, "Lalala", "Abuela3", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        Alumno carlos4 = new Alumno(55555214, "Lalala", "Abuela4", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        AlumnoData x = new AlumnoData();*/
        /*x.guardarAlumno(carlos);
        x.guardarAlumno(carlos1);
        x.guardarAlumno(carlos2);
        x.guardarAlumno(carlos3);
        x.guardarAlumno(carlos4);*/

 /* Alumno alumnoEncontrado = x.buscarAlumnoPorId(1);
        System.out.println("Nombre : "+alumnoEncontrado.getNombre());
        System.out.println("DNI : "+alumnoEncontrado.getDni());
        System.out.println("_____________________________");
        alumnoEncontrado = x.buscarAlumnoPorDni(24141214);
        System.out.println("Nombre : "+alumnoEncontrado.getNombre());
        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
        System.out.println("__________________________");
        for(Alumno alumno:x.listarAlumnos()){
            
            System.out.println("ID: "+alumno.getIdAlumno());
            System.out.println("Nombre: "+alumno.getNombre());
            System.out.println("DNI: "+alumno.getDni());
            System.out.println("___________________________________");
        }*/
        /*Alumno abuelo = new Alumno(4, 55555214, "Lalala", "Abuelo1", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        x.eliminarAlumno(4);
        x.modificarAlumno(abuelo);*/
        
        /*Materia mate = new Materia("Literatura", 1,true);
        Materia mate2 = new Materia("Matematicas", 2, true);
        Materia mate3 = new Materia("Ingles", 1, true);
        MateriaData ma = new MateriaData();
        ma.guardarMateria(mate);
        ma.guardarMateria(mate2);
        ma.guardarMateria(mate3);*/
        
       /* AlumnoData alu = new AlumnoData();
        for(Alumno alumno: alu.listarAlumnos()){
            
            System.out.println(alumno.getDni());
            System.out.println(alumno.getApellido());
            System.out.println(alumno.getNombre());
            System.out.println(alumno.getFechaNac());
        }*/
        
        AlumnoData aluData = new AlumnoData();
        MateriaData mateData = new MateriaData();
        InscripcionData inscData = new InscripcionData();
        
        Alumno Lalala = aluData.buscarAlumnoPorId(1);
        Materia Matematicas = mateData.buscarMateria(2);
        Inscripcion insc = new Inscripcion(Lalala, Matematicas, 9);
        
        inscData.GuardarInscripcion(insc);
    }

}

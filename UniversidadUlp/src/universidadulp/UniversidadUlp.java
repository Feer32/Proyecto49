package universidadulp;

import java.time.LocalDate;
import java.time.Month;
import universidadulp.Entidades.Alumno;
import java.sql.SQLException;
import java.util.ArrayList;
import universidadulp.Entidades.Inscripcion;
import universidadulp.Entidades.Materia;
import universidadulp.accesoADatos.*;

import universidadulp.accesoADatos.AlumnoData;
import universidadulp.vistas.Principal;

public class UniversidadUlp {

    public static void main(String[] args) throws SQLException {
//        Alumno carlos = new Alumno(24141214, "Lalala", "Abuela", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        /* Alumno carlos1 = new Alumno(25141214, "Lalala", "Abuela1", LocalDate.of(1997, Month.FEBRUARY, 17), true);
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
        System.out.println("_____________________________");*/
//        AlumnoData aluData1 = new AlumnoData();
//        Alumno alu = aluData1.buscarAlumnoPorId(4);
//        System.out.println(alu.getApellido());
//        System.out.println(alu.getNombre());
//        System.out.println(alu.getDni());
//        System.out.println(alu.isEstado());
//        System.out.println("_____________________________");
       /* alumnoEncontrado = x.buscarAlumnoPorDni(24141214);
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
//       AlumnoData alu = new AlumnoData();
//        for(Alumno alumno: alu.listarAlumnos()){
//            
//            System.out.println(alumno.getDni());
//            System.out.println(alumno.getApellido());
//            System.out.println(alumno.getNombre());
//            System.out.println(alumno.getFechaNac());
//            System.out.println("__________________");
//        }
////        
        AlumnoData aluData = new AlumnoData();
        MateriaData mateData = new MateriaData();

//        TODAS LOS METODOS DE MATERIADATA ANDAN
//        Materia ma= new Materia("Lengua", 3, true);
//        mateData.guardarMateria(ma);
//        System.out.println("____________");
//        Materia m = mateData.buscarMateria(2);
//         System.out.println("ID : "+m.getIdMateria());
//        System.out.println("NOMBRE : "+ m.getNombre());
//        System.out.println("AÑO: "+m.getAnio());
//        System.out.println("_______________");
//        Materia ma= new Materia(4,"Contabilidad", 2, true);
//        mateData.modificarMateria(ma);
//            System.out.println("____________________");
//           mateData.bajarMateria(4);
//        System.out.println("______________________");
//        mateData.eliminarMateira(4);
//        inscData.GuardarInscripcion(insc);
        InscripcionData inscData = new InscripcionData();
//        Alumno carlos = new Alumno(1, 24141214, "Lalala", "Abuela", LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        Materia ma = new Materia(5,"Lengua", 3, true);
//        Inscripcion i = new Inscripcion(carlos, ma, 7.9);
//        inscData.GuardarInscripcion(i);
//        System.out.println("______________________");
//        Materia materia = mateData.buscarMateria(3);
//        Alumno alum = aluData.buscarAlumnoPorId(1);
//        Inscripcion in = new Inscripcion(alum, materia, 9);
//        inscData.GuardarInscripcion(in);
//        System.out.println("___________________");

            
//            for (Inscripcion inscripcion : inscData.obtenerInscripciones()) {
//            System.out.println("ID : " + inscripcion.getIdInscripcion());
//            System.out.println("ALUMNO : " + inscripcion.getAlumno().toString());
//            System.out.println("MATERIA : " + inscripcion.getMateria().toString());
//            System.out.println("NOTA : " + inscripcion.getNota());
//            System.out.println("__________________");
//            }
            
//            for (Inscripcion inscripcion : inscData.obtenerInscripcionesPorAlumno(1)) {
//            
//            System.out.println("ALUMNO : " + inscripcion.getAlumno().toString());
//            System.out.println("MATERIA : " + inscripcion.getMateria().toString());
//            System.out.println("NOTA : " + inscripcion.getNota());
//            System.out.println("__________________"); 
//                }
//          
//                  }
//        for (Materia materia : inscData.obtenerMateriasNoCursadas(1)) {
//            System.out.println("Nombre de las materias que no esta cursando: " + materia.getNombre());
//
//        }
//        
//        for (Materia materia : inscData.obtenerMateriasCursadas(1)) {
//            System.out.println("Nombre de la materia que esta cursando: " + materia.getNombre());
//
//        }
//          
//          inscData.actualizarNota(5, 2, 9);

//           inscData.eliminarInscripcionMateriaAlumno(1, 3);
    
//         for (Alumno inscripcion : inscData.obtenerAlumnosXMateria(1)) {
//            System.out.println("ALUMNO : " + inscripcion.toString());
            
//                }
         
         Principal principal = new Principal();
         principal.setVisible(true);
         principal.setLocationRelativeTo(null);
    }
    

}

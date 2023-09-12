package universidadulp;

import java.time.LocalDate;
import java.time.Month;
import universidadulp.Entidades.Alumno;
import universidadulp.accesoADatos.AlumnoData;

public class UniversidadUlp {

    public static void main(String[] args) {
//        Alumno carlos = new Alumno(24141214, "Lalala", "Abuela", LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        Alumno carlos1 = new Alumno(25141214, "Lalala", "Abuela1", LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        Alumno carlos2 = new Alumno(43214333, "Lalala", "Abuela2", LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        Alumno carlos3 = new Alumno(21444214, "Lalala", "Abuela3", LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        Alumno carlos4 = new Alumno(55555214, "Lalala", "Abuela4", LocalDate.of(1997, Month.FEBRUARY, 17), true);
        AlumnoData x = new AlumnoData();
//      x.guardarAlumno(carlos);
//      x.guardarAlumno(carlos1);
//      x.guardarAlumno(carlos2);
//      x.guardarAlumno(carlos3);
//      x.guardarAlumno(carlos4);

//        Alumno alumnoEncontrado = x.buscarAlumnoPorId(1);

//        System.out.println("Nombre : "+alumnoEncontrado.getNombre());
//        System.out.println("DNI : "+alumnoEncontrado.getDni());
//        System.out.println("_____________________________");
//        alumnoEncontrado = x.buscarAlumnoPorDni(24141214);
//        System.out.println("Nombre : "+alumnoEncontrado.getNombre());
//        System.out.println("Apellido: "+alumnoEncontrado.getApellido());
//        System.out.println("__________________________");
//        for(Alumno alumno:x.listarAlumnos()){
//            
//            System.out.println("ID: "+alumno.getIdAlumno());
//            System.out.println("Nombre: "+alumno.getNombre());
//            System.out.println("DNI: "+alumno.getDni());
//            System.out.println("___________________________________");
//        }
       Alumno abuelo = new Alumno(4,55555214, "Lalala", "Abuelo1",    LocalDate.of(1997, Month.FEBRUARY, 17), true);
//        x.eliminarAlumno(4);
        x.modificarAlumno(abuelo);
    }

}

import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida {
    public static String mensaje(List<Estudiante> estudiantes){
        String mensaje = estudiantes.stream()
                .map(estudiante -> estudiante.getNombre() +
                        ",\nestudiante de la escuela de " +
                        estudiante.getSemestre() + " semestre de " +
                        estudiante.getEdad() + " años."
                )
                .collect(Collectors.joining(" y "));
        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));
        return "Hola, bienvenidos! Nosotros somos la pareja conformada por " +
                mensaje + "Nuestros correos institucionales son\n" +
                correos;
    }
}


void main() {
    List<Estudiante> estudiantes = List.of(new Estudiante(
                    "Brayan Loaiza",
                    20,
                    "brayan.loaiza-l@mail.escuelaing.edu.co",
                    7
            ),

            new Estudiante(
                    "Juan Esteban Cruz",
                    22,
                    "juan.cruz-r@mail.escuelaing.edu.co",
                    8
            ),
            new Estudiante(
                    "Juan Sebastián Guayazán",
                    21,
                    "juan.guayazan-c@mail.escuelaing.edu.co",
                    6
            )
    );

    System.out.println(MensajeBienvenida.mensaje(estudiantes));
}

public class Estudiante {
    private String nombre;
    private int edad;
    private String correo;
    private int semestre;

    public Estudiante(String nombre, int edad, String correo, int semestre ){
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getSemestre() {
        return semestre;
    }
}


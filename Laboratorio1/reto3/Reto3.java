<<<<<<< HEAD
<<<<<<< HEAD
import java.util.stream.IntStream;

public class Reto3 {

    public static String mensaje(String cadena) {
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, 3)
                .forEach(i -> sb.append(cadena).append(" "));
        return sb.toString().trim();
    }
}
=======
public class Reto3 {

    public static String mensajeReverse(String cadena) {
        StringBuffer men = new StringBuffer(cadena);
        return men.reverse().toString();
    }
} 
>>>>>>> ba1c2e7e6d820f535002b0a714c8c5df87fb6479
=======
public class Reto3 {

    public static String mensaje(String cadena) {
        StringBuffer men = new StringBuffer(mensaje);
        return men.reverse().toString();
    }
    public static void main(String[] args) {

        String mensaje = "Hola mundo";
        String resultado = EcoMisterioso.eco(mensaje);

        System.out.println(resultado);
    }
}

>>>>>>> feature/reto_numero_4

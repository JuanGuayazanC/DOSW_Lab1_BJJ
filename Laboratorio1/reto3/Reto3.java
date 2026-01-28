
import java.util.stream.IntStream;

public class Reto3 {

    // Repite el mensaje 3 veces
    public static String mensaje(String cadena) {
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, 3)
                .forEach(i -> sb.append(cadena).append(" "));
        return sb.toString().trim();
    }

    // Invierte el mensaje
    public static String mensajeReverse(String cadena) {
        StringBuffer men = new StringBuffer(cadena);
        return men.reverse().toString();
    }
}

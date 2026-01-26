import java.util.stream.IntStream;

public class Reto3 {

    public static String mensaje(String cadena) {
        StringBuilder sb = new StringBuilder();

        IntStream.range(0, 3)
                .forEach(i -> sb.append(cadena).append(" "));
        return sb.toString().trim();
    }
}
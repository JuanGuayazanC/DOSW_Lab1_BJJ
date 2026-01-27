import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(8, 3, 15, 2, 9, 4);


        Optional<Integer> minimo = numeros.stream()
                .reduce((a, b) -> a < b ? a : b);


        long cantidad = numeros.stream().count();

        minimo.ifPresent(m ->
                System.out.println("Numero más pequeño: " + m)
        );

        System.out.println("Cantidad de datos ingresados: " + cantidad);
    }
}


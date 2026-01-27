import java.util.List;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(4, 9, 2, 15, 7);

        Optional<Integer> maximo = numeros.stream()

                .reduce((a, b) -> a > b ? a : b);

        maximo.ifPresent(m -> System.out.println("El numero mayor es: " + m));

    }

}
 

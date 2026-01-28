import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    public static Set<Integer> crearTreeSet() {
        Set<Integer> set = new TreeSet<>(List.of(12, 3, 25, 10, 7, 30, 18, 4));
        return set.stream()
                  .filter(n -> n % 5 != 0)
                  .collect(Collectors.toSet());
    }
    
    public static void main(String[] args) {
        Set<Integer> resultado = crearTreeSet();
        System.out.println("Números que no son múltiplos de 5: " + resultado);
    }
} 

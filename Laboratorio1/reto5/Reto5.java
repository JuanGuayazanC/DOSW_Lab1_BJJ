package reto5;

import java.util.*;
import java.util.stream.Collectors;

public class Reto5 {

    public static Set<Integer> crearHashSet() {
        Set<Integer> set = new HashSet<>(List.of(4, 9, 15, 7, 18, 21, 10, 5));
        return set.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(crearHashSet());
    }
}

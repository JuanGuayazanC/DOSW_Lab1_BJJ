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
 
 
    public static Set<Integer> crearTreeSet() {
        Set<Integer> set = new TreeSet<>(List.of(12, 3, 25, 10, 7, 30, 18, 4));
        return set.stream()
                  .filter(n -> n % 5 != 0)
                  .collect(Collectors.toSet());
    }
 
 
    public static Set<Integer> unir(Set<Integer> a, Set<Integer> b) {
        Set<Integer> resultado = new TreeSet<>();
        resultado.addAll(a);
        resultado.addAll(b);
        return resultado;
    }
 
 
    public static void main(String[] args) {
        Set<Integer> hashSet = crearHashSet();
        Set<Integer> treeSet = crearTreeSet();
        Set<Integer> union = unir(hashSet, treeSet);
 
 
        union.forEach(n -> System.out.println("Número en arena: " + n));
    }
}
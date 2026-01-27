import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;

public class Reto4 {

    public static HashMap<String, Integer> guardarOrdenarEImprimir(
            List<Map.Entry<String, Integer>> lista) {

        HashMap<String, Integer> resultado = lista.stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));

        resultado.entrySet().stream()
                .map(e -> e.getKey() + " -> " + e.getValue())
                .forEach(System.out::println);

        return resultado;

    }
    public static Map<String, Integer> combinar(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> resultado = new HashMap<>(hashMap);
        resultado.putAll(hashTable);
        return resultado;
    }
}





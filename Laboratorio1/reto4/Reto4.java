
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {


    public static HashMap<String, Integer> guardarEnHashMap(
            List<Map.Entry<String, Integer>> lista) {

        return lista.stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        HashMap::new
                ));
    }


    public static Hashtable<String, Integer> guardarEnHashTable(
            List<Map.Entry<String, Integer>> lista) {

        return lista.stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (v1, v2) -> v1,
                        Hashtable::new
                ));
    }

    public static Map<String, Integer> combinarYProcesar(
            HashMap<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        return Stream.concat(
                        hashMap.entrySet().stream(),
                        hashTable.entrySet().stream()
                )

                .map(e -> Map.entry(e.getKey().toUpperCase(), e.getValue()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (vMap, vTable) -> vTable,
                        LinkedHashMap::new
                ));
    }


    
    public static void imprimir(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .map(e -> e.getKey() + " -> " + e.getValue())
                .forEach(System.out::println);
    }
}

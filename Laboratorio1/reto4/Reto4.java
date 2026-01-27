import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}


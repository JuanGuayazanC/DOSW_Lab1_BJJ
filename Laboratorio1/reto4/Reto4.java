import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reto4 {

    public static HashMap<String, Integer> guardarEnHashMap(
            List<Map.Entry<String, Integer>> lista) {

        HashMap<String, Integer> mapa = new HashMap<>();

        for (int i = 0; i < lista.size(); i++) {
            String clave = lista.get(i).getKey();
            Integer valor = lista.get(i).getValue();

            if (!mapa.containsKey(clave)) {
                mapa.put(clave, valor);
            }
        }

        return mapa;
    }
}


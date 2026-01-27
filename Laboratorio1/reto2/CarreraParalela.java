import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> lista1 = List.of(4, 9, 2, 15, 7);
        List<Integer> lista2 = List.of(8, 6, 10, 12);

        Resultados resultados = calcularEstadisticas(lista1, lista2);

        System.out.println("===== LISTA 1 =====");
        mostrarResultados(resultados.getResultadoLista1());

        System.out.println("\n===== LISTA 2 =====");
        mostrarResultados(resultados.getResultadoLista2());
    }

    private static void mostrarResultados(ResultadoEstadistico r) {
        System.out.println("Máximo: " + r.getMaximo());
        System.out.println("Mínimo: " + r.getMinimo());
        System.out.println("Cantidad de elementos: " + r.getCantidad());
        System.out.println("¿Máximo múltiplo de 2?: " + r.isMaximoMultiploDeDos());
        System.out.println("¿Máximo divisor de 2?: " + r.isMaximoDivisorDeDos());
        System.out.println("¿Cantidad impar?: " + r.isCantidadImpar());
    }

  
    public static Resultados calcularEstadisticas(List<Integer> lista1, List<Integer> lista2) {

        ResultadoEstadistico resultado1 = calcularPorLista(lista1);
        ResultadoEstadistico resultado2 = calcularPorLista(lista2);

        return new Resultados(resultado1, resultado2);
    }

    private static ResultadoEstadistico calcularPorLista(List<Integer> numeros) {

        int maximo = numeros.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElseThrow();

        int minimo = numeros.stream()
                .reduce((a, b) -> a < b ? a : b)
                .orElseThrow();

        long cantidad = numeros.stream().count();

        boolean maximoMultiploDeDos = (maximo % 2 == 0) ? true : false;
        boolean maximoDivisorDeDos = (2 % maximo == 0) ? true : false;
        boolean cantidadImpar = (cantidad % 2 != 0) ? true : false;

        return new ResultadoEstadistico(
                maximo,
                minimo,
                cantidad,
                maximoMultiploDeDos,
                maximoDivisorDeDos,
                cantidadImpar
        );
    }
}


class Resultados {

    private final ResultadoEstadistico resultadoLista1;
    private final ResultadoEstadistico resultadoLista2;

    public Resultados(ResultadoEstadistico resultadoLista1, ResultadoEstadistico resultadoLista2) {
        this.resultadoLista1 = resultadoLista1;
        this.resultadoLista2 = resultadoLista2;
    }

    public ResultadoEstadistico getResultadoLista1() {
        return resultadoLista1;
    }

    public ResultadoEstadistico getResultadoLista2() {
        return resultadoLista2;
    }
}
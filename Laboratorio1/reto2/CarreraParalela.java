import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(4, 9, 2, 15, 7);

        ResultadoEstadistico resultado = calcularEstadisticas(numeros);

        System.out.println("Máximo: " + resultado.getMaximo());
        System.out.println("Mínimo: " + resultado.getMinimo());
        System.out.println("Cantidad: " + resultado.getCantidad());
    }

    // FUNCIÓN ÚNICA (misma para ambos carriles)
    public static ResultadoEstadistico calcularEstadisticas(List<Integer> numeros) {

        int maximo = numeros.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElseThrow();

        int minimo = numeros.stream()
                .reduce((a, b) -> a < b ? a : b)
                .orElseThrow();

        long cantidad = numeros.stream().count();

        return new ResultadoEstadistico(maximo, minimo, cantidad);
    }
}

class ResultadoEstadistico {

    private final int maximo;
    private final int minimo;
    private final long cantidad;

    public ResultadoEstadistico(int maximo, int minimo, long cantidad) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
    }

    public int getMaximo() {
        return maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public long getCantidad() {
        return cantidad;
    }
}

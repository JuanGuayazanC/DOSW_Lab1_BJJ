import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = List.of(4, 9, 2, 15, 7);

        ResultadoEstadistico resultado = calcularEstadisticas(numeros);

        System.out.println("Maximo: " + resultado.getMaximo());
        System.out.println("Minimo: " + resultado.getMinimo());
        System.out.println("Cantidad: " + resultado.getCantidad());
        System.out.println("El máximo es multiplo de 2?: " + resultado.isMaximoEsMultiploDeDos());
        System.out.println("El máximo es divisor de 2?: " + resultado.isMaximoEsDivisorDeDos());
    }

    public static ResultadoEstadistico calcularEstadisticas(List<Integer> numeros) {

        int maximo = numeros.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElseThrow();

        int minimo = numeros.stream()
                .reduce((a, b) -> a < b ? a : b)
                .orElseThrow();

        long cantidad = numeros.stream().count();

        boolean esMultiploDeDos = (maximo % 2 == 0) ? true : false;

        
        boolean esDivisorDeDos = (2 % maximo == 0) ? true : false;

        return new ResultadoEstadistico(
                maximo,
                minimo,
                cantidad,
                esMultiploDeDos,
                esDivisorDeDos
        );
    }
}


class ResultadoEstadistico {

    private final int maximo;
    private final int minimo;
    private final long cantidad;
    private final boolean maximoEsMultiploDeDos;
    private final boolean maximoEsDivisorDeDos;

    public ResultadoEstadistico(int maximo, int minimo, long cantidad,
                                boolean maximoEsMultiploDeDos,
                                boolean maximoEsDivisorDeDos) {
        this.maximo = maximo;
        this.minimo = minimo;
        this.cantidad = cantidad;
        this.maximoEsMultiploDeDos = maximoEsMultiploDeDos;
        this.maximoEsDivisorDeDos = maximoEsDivisorDeDos;
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

    public boolean isMaximoEsMultiploDeDos() {
        return maximoEsMultiploDeDos;
    }

    public boolean isMaximoEsDivisorDeDos() {
        return maximoEsDivisorDeDos;
    }
}

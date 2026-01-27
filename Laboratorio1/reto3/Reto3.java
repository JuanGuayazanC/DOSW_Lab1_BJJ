public class Reto3 {

    public static String mensaje(String cadena) {
        StringBuffer men = new StringBuffer(cadena);
        return men.reverse().toString();
    }

    public static void main(String[] args) {

        String mensaje = System.out.readLine();
        String resultado = Reto3.mensaje(mensaje);

        System.out.println(resultado);
    }
}


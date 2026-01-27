public class Reto3 {

    public static String mensaje(String cadena) {
        StringBuffer men = new StringBuffer(mensaje);
        return men.reverse().toString();
    }
    public static void main(String[] args) {

        String mensaje = "Hola mundo";
        String resultado = EcoMisterioso.eco(mensaje);

        System.out.println(resultado);
    }
}


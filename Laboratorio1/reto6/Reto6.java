

public class Reto6 {

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "BROMEAR":
                System.out.println("¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
                break;
            case "GRITAR":
                System.out.println("¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("Shhh… los bugs están dormidos");
                break;
            case "ANALIZAR":
                System.out.println("Analizando datos… resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Comando no reconocido.");
        }
    }
}



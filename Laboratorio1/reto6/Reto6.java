
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto6B {

    static Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: \"¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…\""));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: \"¡¡¡ALERTA DE STACK OVERFLOW!!!\""));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: \"Shhh… los bugs están dormidos\""));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: \"Analizando datos… resultado: ¡Eres increíble programando!\""));
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) accion.run();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un comando (BROMEAR, GRITAR, SUSURRAR, ANALIZAR):");
        String comando = scanner.nextLine().toUpperCase();

        switch (comando) {
            case "BROMEAR":
                ejecutarComando("BROMEAR");
                break;
            case "GRITAR":
                ejecutarComando("GRITAR");
                break;
            case "SUSURRAR":
                ejecutarComando("SUSURRAR");
                break;
            case "ANALIZAR":
                ejecutarComando("ANALIZAR");
                break;
            default:
                System.out.println("Comando no reconocido.");
                break;
        }
        scanner.close();
    }
}


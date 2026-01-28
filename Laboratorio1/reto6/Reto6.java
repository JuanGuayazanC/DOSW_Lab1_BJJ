import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Reto6 {
    
    static Map<String, Runnable> comandos = new HashMap<>();
    
    static {
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: \"¡Saludos, viajero del tiempo y del código!\""));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: \"Que los bits te acompañen, hasta la próxima misión.\""));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: \"01010101\""));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: \"Girando en modo fiesta.\""));
    }
    
    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) accion.run();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un comando (SALUDAR, DESPEDIR, CANTAR, DANZAR):");
        String comando = scanner.nextLine().toUpperCase();
        
        switch (comando) {
            case "SALUDAR":
                ejecutarComando("SALUDAR");
                break;
            case "DESPEDIR":
                ejecutarComando("DESPEDIR");
                break;
            case "CANTAR":
                ejecutarComando("CANTAR");
                break;
            case "DANZAR":
                ejecutarComando("DANZAR");
                break;
            default:
                System.out.println("Comando no reconocido.");
                break;
        }
        
        scanner.close();
    }
} 

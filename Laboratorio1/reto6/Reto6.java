package edu.dosw.lab.solid;

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

        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: \"¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…\""));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: \"¡¡¡ALERTA DE STACK OVERFLOW!!!\""));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: \"Shhh… los bugs están dormidos\""));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: \"Analizando datos… resultado: ¡Eres increíble programando!\""));
    }

    public static void ejecutarComando(String comando) {
        Runnable accion = comandos.get(comando);
        if (accion != null) {
            accion.run();
        } else {
            System.out.println("Comando no reconocido.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un comando (SALUDAR, DESPEDIR, CANTAR, DANZAR, BROMEAR, GRITAR, SUSURRAR, ANALIZAR):");
        String comando = scanner.nextLine().toUpperCase();

        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                ejecutarComando(comando);
                break;
            default:
                System.out.println("Comando no reconocido.");
                break;
        }

        scanner.close();
    }
}


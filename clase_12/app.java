package clase_12;

import java.util.Arrays;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        // Declarar e inicializar el arreglo original
        int[] arregloOriginal = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        // Imprimir el arreglo original junto con sus índices
        System.out.println("Arreglo original:");
        for (int i = 0; i < arregloOriginal.length; i++) {
        System.out.println("Índice " + i + ": " + arregloOriginal[i]);
        }
        // Solicitar al usuario los índices inicial y final
        Scanner scanner = new Scanner(System.in);
        int indiceInicial, indiceFinal;
        do {
        System.out.print("Ingresa el índice inicial: ");
        indiceInicial = scanner.nextInt();
        System.out.print("Ingresa el índice final: ");
        indiceFinal = scanner.nextInt();
        // Validar los índices ingresados por el usuario
        if (indiceInicial < 0 || indiceInicial >= arregloOriginal.length
        
        || indiceFinal < 0
        
        || indiceFinal >= arregloOriginal.length ||
        
        indiceInicial > indiceFinal) {
        
        System.out.println("Los índices ingresados no son válidos. Por favor, inténtalo nuevamente.");
        
        }
        
        } while (indiceInicial < 0 || indiceInicial >=
        
        arregloOriginal.length || indiceFinal < 0
        
        || indiceFinal >= arregloOriginal.length || indiceInicial >
        
        indiceFinal);
        
        // Copiar la parte del arreglo comprendida entre los índices inicial y final
        
        int[] arregloNuevo = Arrays.copyOfRange(arregloOriginal,
        
        indiceInicial, indiceFinal + 1);
        // Imprimir el nuevo arreglo
        System.out.println("Nuevo arreglo copiado:");
        for (int i = 0; i < arregloNuevo.length; i++) {
        System.out.println("Índice " + i + ": " + arregloNuevo[i]);
        }
        // Cerrar el objeto Scanner
        scanner.close();
        }
}

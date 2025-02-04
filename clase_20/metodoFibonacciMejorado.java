package clase_20;

import java.util.Scanner;

public class metodoFibonacciMejorado {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarPrograma();
        sc.close(); // Cerrar Scanner después de su uso
    }

    // Método principal que ejecuta el flujo del programa
    public static void ejecutarPrograma() {
        int opcion = 0;
        do {
            int posicion = solicitarPosicion();
            if (posicion < 0) {
                System.out.println("La posición debe ser un número entero positivo.");
                continue; // Volver a solicitar la posición si es negativa
            }

            int resultado = calcularFibonacci(posicion);
            System.out.println("La posición " + posicion + " : " + resultado);

            opcion = preguntarOtraVez();
        } while (opcion == 1);

        System.out.println("¡Adiós!");
    }

    // Método para solicitar la posición de Fibonacci al usuario
    public static int solicitarPosicion() {
        System.out.print("Ingrese una posición para la serie de Fibonacci: ");
        return sc.nextInt();
    }

    // Método para calcular el número de Fibonacci en la posición dada
    public static int calcularFibonacci(int posicion) {
        if (posicion == 0) return 0;
        if (posicion == 1) return 1;

        int a = 0, b = 1, fibonacci = 0;
        for (int i = 2; i <= posicion; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
        return fibonacci;
    }

    // Método para preguntar si el usuario desea realizar otra operación
    public static int preguntarOtraVez() {
        System.out.println("¿Desea calcular otra posición? (1: Sí, 0: No): ");
        return sc.nextInt();
    }
}


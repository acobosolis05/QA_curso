package clase_20;

import java.util.Scanner;

public class metodoFactorial {
    // Scanner global
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarPrograma();
        sc.close(); // Cerrar Scanner al final
    }

    // Método principal para ejecutar el flujo del programa
    public static void ejecutarPrograma() {
        int respuesta = 0;

        do {
            int num = solicitarNumero();

            if (num < 0) {
                System.out.println("No se puede calcular el factorial de un número negativo.");
                continue;
            }

            // Calcula el factorial de forma iterativa
            int resultadoIterativo = factorialIterativo(num);
            System.out.println("Factorial (Iterativo) de " + num + " es: " + resultadoIterativo);

            // Calcula el factorial de forma recursiva
            int resultadoRecursivo = factorialRecursivo(num);
            System.out.println("Factorial (Recursivo) de " + num + " es: " + resultadoRecursivo);

            respuesta = preguntarOtraVez();
        } while (respuesta == 1);

        System.out.println("Gracias por utilizar el programa.");
    }

    // Método para solicitar un número al usuario
    public static int solicitarNumero() {
        System.out.print("Ingrese un número para calcular su factorial: ");
        return sc.nextInt();
    }

    // Método para calcular el factorial de forma iterativa
    public static int factorialIterativo(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Método para calcular el factorial de forma recursiva
    public static int factorialRecursivo(int num) {
        if (num == 0 || num == 1) return 1;
        return num * factorialRecursivo(num - 1);
    }

    // Método para preguntar si el usuario desea continuar
    public static int preguntarOtraVez() {
        System.out.println("¿Desea continuar? (1: Sí, 0: No): ");
        return sc.nextInt();
    }
}


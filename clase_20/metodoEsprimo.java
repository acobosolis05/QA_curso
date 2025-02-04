package clase_20;

import java.util.Scanner;

public class metodoEsprimo {
    // Scanner global
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejecutarPrograma();
        sc.close(); // Cerrar Scanner al final
    }

    // Método principal para ejecutar el flujo del programa
    public static void ejecutarPrograma() {
        int num;

        do {
            System.out.print("Introduzca un número o cero para salir: ");
            num = sc.nextInt();

            if (num == 0) {
                System.out.println("El programa ha finalizado");
                break;
            }

            // Verifica si el número es primo utilizando el método esPrimo
            boolean esPrimo = esPrimo(num);
            if (esPrimo) {
                System.out.println("El número " + num + " es primo");
            } else {
                System.out.println("El número " + num + " no es primo");
            }
        } while (true); // El bucle continuará hasta que se ingrese 0
    }

    // Método para verificar si un número es primo de forma iterativa
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false; // Los números menores que 2 no son primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si es divisible por cualquier número entre 2 y la raíz cuadrada de num, no es primo
            }
        }
        return true;
    }

    // Método para verificar si un número es primo de forma recursiva
    public static boolean esPrimoRecursivo(int num, int divisor) {
        if (num < 2) {
            return false; // Los números menores que 2 no son primos
        }
        if (divisor > Math.sqrt(num)) {
            return true; // Si no es divisible por ningún número hasta la raíz cuadrada, es primo
        }
        if (num % divisor == 0) {
            return false; // Si es divisible por divisor, no es primo
        }
        return esPrimoRecursivo(num, divisor + 1); // Llamada recursiva
    }
}


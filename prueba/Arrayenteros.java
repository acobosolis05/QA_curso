package prueba;

import java.util.Scanner;
// Dada un arreglo de enteros, devuelva los índices de los dos números de modo que se sume un número específico.
// Nota: Asuma que en cada entrada se tendrá exactamente una solución, y no puede usar el mismo elemento dos veces.

public class Arrayenteros {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = { 2, 7, 11, 15 };
        System.out.print("Ejercicio 1. suma de enteros ");
        System.out.print("Suma objetivo: ");
        int objetivo = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == objetivo) {
                    System.out.println("Índices: [" + i + ", " + j + "]");
                }
            }

        }
        sc.close();
    }
}
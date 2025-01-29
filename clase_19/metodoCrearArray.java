package clase_19;

import java.util.Scanner;

// Basándote en el ejercicio “Generación de números aleatorios” de este paso, crea un 
// programa que te permita generar un array de tipo "int" de manera aleatoria. El programa debe 
// solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.

public class metodoCrearArray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = sc.nextInt();

        System.out.print("Ingrese el valor mínimo del rango: ");
        int min = sc.nextInt();

        System.out.print("Ingrese el valor máximo del rango: ");
        int max = sc.nextInt();

        // Verificar que el rango sea válido
        if (min > max) {
            System.out.println("El valor mínimo no puede ser mayor que el máximo. Intente de nuevo.");
            return;
        }

        // Generar y mostrar el arreglo
        int[] array = generarArrayAleatorio(size, min, max);
        System.out.println("Arreglo generado: ");
        mostrarArray(array);
    }

    // Método para generar el arreglo con números aleatorios
    public static int[] generarArrayAleatorio(int size, int min, int max) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }

        return array;
    }

    // Método para mostrar el contenido del arreglo
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

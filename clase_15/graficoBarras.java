package clase_15;
// Creando un gráfico de barras:

import java.util.Scanner;

// Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, 
// imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos.
//  Cada número ingresado corresponderá a la longitud de una barra en
//  el gráfico, donde cada asterisco representa una unidad en la escala. A modo de ejemplo:
// Define la clase principal llamada graficoBarras
public class graficoBarras {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer las entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Define un array de 4 elementos para almacenar los números ingresados por el usuario
        int[] numeros = new int[4];

        // Solicita al usuario que ingrese números entre 1 y 20
        System.out.println("Ingrese un número entre 1 y 20");

        // Bucle para leer los 4 números ingresados por el usuario
        for (int i = 0; i < 4; i++) {
            while (true) { // Bucle para validar la entrada del usuario
                // Solicita al usuario ingresar un número
                System.out.print("Ingrese el número " + (i + 1) + ": ");

                // Lee el número ingresado por el usuario
                numeros[i] = sc.nextInt();

                // Verifica si el número está entre 1 y 20
                if (numeros[i] >= 1 && numeros[i] <= 20) {
                    break; // Sale del bucle si el número es válido
                } else {
                    // Muestra un mensaje de error si el número no es válido
                    System.out.println("Número incorrecto. Por favor, ingrese un número entre 1 y 20");
                }
            }
        }

        // Bucle para imprimir el gráfico de barras
        for (int i = 0; i < 4; i++) {
            // Agrega un salto de línea para separar cada barra
            System.out.println("");

            // Imprime el número ingresado
            System.out.print(numeros[i] + " ");

            // Bucle interno para imprimir las barras en forma de asteriscos
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*"); // Imprime un asterisco por cada unidad del número
            }

            // Salto de línea después de cada barra
            System.out.println("");
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
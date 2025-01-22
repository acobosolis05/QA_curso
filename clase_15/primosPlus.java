package clase_15;

import java.util.Scanner;

// Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío es que
//  desarrolles un programa que te solicite la cantidad deseada de números primos que deseas obtener.
// Tu programa deberá generar y mostrar la cantidad de números primos que hayas solicitado.

// Define la clase principal llamada primosPlus
public class primosPlus {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable para almacenar la cantidad de números primos que el usuario desea obtener
        int cantidad;

        // Variable booleana para verificar si un número es primo
        boolean esPrimo;

        // Solicita al usuario la cantidad de números primos que desea calcular
        System.out.print("¿Cuántos números primos deseas obtener?: ");

        // Lee la cantidad ingresada por el usuario
        cantidad = sc.nextInt();

        // Verifica si la cantidad ingresada es menor o igual a 0
        if (cantidad <= 0) {
            // Muestra un mensaje indicando que el número debe ser mayor a 0
            System.out.println("Por favor, ingrese un número mayor a 0.");
        } else {
            // Crea un array para almacenar los números primos encontrados
            int[] primos = new int[cantidad];

            // Variable para el número que será evaluado si es primo, comienza en 2
            int num = 2;

            // Contador para llevar la cantidad de números primos encontrados
            int contador = 0;

            // Bucle while que se ejecuta hasta encontrar la cantidad de números primos deseada
            while (contador < cantidad) {
                // Se asume inicialmente que el número es primo
                esPrimo = true;

                // Bucle para verificar si el número actual es divisible por algún número menor a su raíz cuadrada
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    // Si el número es divisible por 'i', no es primo
                    if (num % i == 0) {
                        esPrimo = false;
                        break; // Salir del bucle ya que no es necesario continuar
                    }
                }

                // Si el número es primo, se agrega al array
                if (esPrimo) {
                    primos[contador] = num; // Almacena el número en el array
                    contador++; // Incrementa el contador de números primos encontrados
                }

                // Incrementa el número para verificar el siguiente
                num++;
            }

            // Muestra los números primos almacenados en el array
            System.out.println("Los números primos son: ");
            for (int i = 0; i < cantidad; i++) {
                // Imprime cada número primo del array
                System.out.print(primos[i] + " ");
            }
            System.out.println(); // Agrega un salto de línea final
        }

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}
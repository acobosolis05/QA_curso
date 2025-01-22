package clase_15;

import java.util.Scanner;

// En esta actividad, te propongo un desafío adicional relacionado con la serie de Fibonacci.
// La tarea consiste en crear un programa que te permita ingresar la posición de un número 
// en la serie de 
// Fibonacci y, a continuación, mostrar el valor correspondiente a esa posición.
// Define la clase principal llamada fibonacciMejorada
public class fibonacciMejorada {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable que controla si el usuario desea continuar ejecutando el programa
        int num;

        // Bucle do-while para repetir el cálculo de Fibonacci hasta que el usuario
        // decida salir
        do {
            // Solicita al usuario una posición para la serie de Fibonacci
            System.out.print("Ingrese una posición para la serie de Fibonacci: ");

            // Lee la posición ingresada por el usuario
            int posicion = sc.nextInt();

            // Verifica si la posición ingresada es negativa
            if (posicion < 0) {
                System.out.println("La posición debe ser un número entero positivo.");
            }

            // Inicializa las variables para calcular la serie de Fibonacci
            int a = 0, b = 1, fibonacci = 0;

            // Si la posición es 0, el valor de Fibonacci es el primer número de la serie
            // (0)
            if (posicion == 0) {
                fibonacci = a;
            }
            // Si la posición es 1, el valor de Fibonacci es el segundo número de la serie
            // (1)
            else if (posicion == 1) {
                fibonacci = b;
            }
            // Para posiciones mayores a 1, calcula el valor de Fibonacci usando un bucle
            else {
                // Bucle para iterar desde 2 hasta la posición solicitada
                for (int i = 2; i <= posicion; i++) {
                    // Calcula el siguiente número de la serie sumando los dos anteriores
                    fibonacci = a + b;

                    // Almacena temporalmente el valor de 'a' para actualizarlo
                    int temp = a;

                    // Actualiza 'a' con el valor actual de 'b'
                    a = b;

                    // Actualiza 'b' con el nuevo valor calculado de Fibonacci
                    b = temp + b;
                }
            }

            // Muestra el valor calculado de la posición solicitada en la serie de Fibonacci
            System.out.println("La posición " + posicion + " : " + fibonacci);

            // Pregunta al usuario si desea calcular otra posición
            System.out.println("¿Desea calcular otra posición? (1: Sí, 0: No): ");

            // Lee la opción del usuario para continuar o salir
            num = sc.nextInt();

            // Repite el bucle si el usuario ingresa '1'
        } while (num == 1);

        // Mensaje de despedida al salir del programa
        System.out.println("Adios¡¡¡¡");

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}

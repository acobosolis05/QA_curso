package clase_15;

import java.util.Scanner;

// El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar
//  un número y posteriormente calcule su factorial mediante un bucle do-while. 
// El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número.
// Define la clase principal llamada factorial
public class factorial {

    // Método principal que ejecuta el programa
    public static void main(String[] args) {

        // Crea un objeto Scanner para leer las entradas del usuario
        Scanner sc = new Scanner(System.in);

        // Variable que almacena la respuesta del usuario para continuar o salir del
        // programa
        int respuesta;

        // Bucle do-while para permitir al usuario calcular factoriales repetidamente
        do {
            // Solicita al usuario un número para calcular su factorial
            System.out.print("Ingrese un número para calcular su factorial: ");

            // Lee el número ingresado por el usuario
            int num = sc.nextInt();

            // Verifica si el número ingresado es negativo
            if (num < 0) {
                // Muestra un mensaje de error porque no se puede calcular el factorial de
                // números negativos
                System.out.println("No se puede calcular el factorial de un número negativo");
            }

            // Inicializa la variable que almacenará el resultado del factorial
            int factorial = 1;

            // Calcula el factorial del número utilizando un bucle for
            for (int i = 1; i <= num; i++) {
                // Multiplica acumulativamente los números desde 1 hasta el número ingresado
                factorial *= i;
            }

            // Muestra el resultado del factorial del número ingresado
            System.out.println("El factorial del número " + num + " ingresado es: " + factorial);

            // Pregunta al usuario si desea realizar otra operación
            System.out.println("¿Desea continuar? (1) si / (0) no: ");

            // Lee la respuesta del usuario
            respuesta = sc.nextInt();

            // El bucle continúa mientras el usuario ingrese '1'
        } while (respuesta == 1);

        // Mensaje de despedida cuando el usuario decide salir del programa
        System.out.println("Gracias por utilizar el programa");

        // Cierra el objeto Scanner para liberar recursos
        sc.close();
    }
}

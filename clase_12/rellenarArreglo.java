package clase_12;


import java.util.Scanner;

// El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, 
// desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) 
// y devuelve el arreglo modificado. Vamos a escribir un programa que solicite al usuario el
//  tamaño para un arreglo y un número entero con el que quiera rellenarlo.
//  Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
public class rellenarArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int size = sc.nextInt();

        // Crear el arreglo con el tamaño ingresado
        int[] array = new int[size];

        // Rellenar el arreglo con números proporcionados por el usuario
        for (int i = 0; i < array.length; i++) {
            int numero;
            do {
                System.out.print("Ingrese un número entero positivo para la posición " + (i + 1) + ": ");
                numero = sc.nextInt();
                if (numero < 0) {
                    System.out.println("El número debe ser positivo. Inténtelo de nuevo.");
                }
            } while (numero < 0);

            // Asignar el número ingresado al arreglo
            array[i] = numero;
        }

        // Mostrar el arreglo completo
        System.out.println("Arreglo rellenado: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Cerrar el escáner
        sc.close();
    }
}
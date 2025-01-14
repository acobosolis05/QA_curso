package clase_10;

import java.util.Scanner;

// Escribe un programa que cree un array de 50 elementos de tipo carácter, 
// inicializándolo con una frase elegida. Luego, solicita al usuario un carácter
//  objetivo y cuenta cuántas
//  veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.
public class contarOcurrencias {
    public static void main(String[] args) {
        // Inicializar el array con una frase
        char[] array = new char[50];
        String frase = "aprendiendo java";
        int i = 0;
        for (char c : frase.toCharArray()) {
            array[i++] = c;
        }
        // Solicitar al usuario un carácter objetivo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un carácter: ");
        char objetivo = scanner.next().charAt(0);
        // Contar cuántas veces aparece el carácter objetivo en el array
        int contador = 0;
        for (char c : array) {
            if (c == objetivo) {
                contador++;
            }
        }
        // Imprimir el resultado por consola
        System.out.println("El carácter '" + objetivo + "' aparece " + contador + " veces");
        scanner.close();

    }
}

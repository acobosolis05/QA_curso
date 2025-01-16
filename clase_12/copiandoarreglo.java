package clase_12;

import java.util.Scanner;

// Crea un programa en Java que declare y muestre un arreglo de enteros junto
//  con sus índices. Luego, solicita al usuario dos índices: un índice inicial 
//  y un índice final. Con estos dos índices, copia la parte del arreglo original 
//  comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange().
//   Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice 
//   final y que ambos índices están dentro del 
// rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
public class copiandoarreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Arreglo original: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Índice: " + i + " Valor: " + array[i]);
        }
        System.out.println("Ingrese el índice inicial: ");
        int inicio = sc.nextInt();
        System.out.println("Ingrese el índice final: ");
        int fin = sc.nextInt();
        if (inicio < fin && inicio >= 0 && fin < array.length) {
            int[] nuevo = java.util.Arrays.copyOfRange(array, inicio, fin);
            System.out.println("Arreglo copiado: ");
            for (int i = 0; i < nuevo.length; i++) {
                System.out.println("Índice: " + i + " Valor: " + nuevo[i]);
            }
        } else {
            System.out.println("Índices inválidos");
        }
        sc.close();
    }
}

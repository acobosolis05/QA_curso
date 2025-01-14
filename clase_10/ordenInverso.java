package clase_10;

import java.util.Arrays;

// Escribe un programa que recorra un array de enteros y los imprima en orden inverso, 
// comenzando desde el último elemento.
// . El tamaño y los números  a contener pueden ser de tu elección.
public class ordenInverso {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("El array es: " + Arrays.toString(array));
        System.out.println("El array en orden inverso es: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}

package clase_12;

import java.util.Arrays;


// Escribe un programa en el que declares una variable de tipo array que
//  contenga 10 elementos de tipo entero. Inicializa el arreglo con valores
//  aleatorios entre 1 y 100, imprime por consola el arreglo inicial y
//   luego ordenalo en forma descendente utilizando el método
// Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
public class ordenarDesendente {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100) + 1;
            }
            System.out.println("Arreglo inicial: " + Arrays.toString(array));
            Arrays.sort(array);

            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            System.out.println("Arreglo ordenado en forma descendente: " + Arrays.toString(array));
            
            
    }

}

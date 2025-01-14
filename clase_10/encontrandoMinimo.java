package clase_10;

// Escribe un programa que recorra un array de enteros y encuentre el 
// valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.
public class encontrandoMinimo {
    public static void main(String[] args) {
        int[] array = { 5, 2, 8, 10, 9 };
        // Inicializar el valor mínimo con el primer elemento del array
        int minimo = array[0];

        // Recorrer el array para encontrar el valor mínimo
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        ;

        // Imprimir el resultado
        System.out.println("El valor mínimo en el array es: " + minimo);

    }
}
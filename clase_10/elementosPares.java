package clase_10;

// Escribe un programa que genere un array de 10 elementos de tipo entero. 
// Inicializa cada elemento con un número aleatorio menor a 100 
// y luego imprime todos los elementos del array en una única línea. Posteriormente, 
// recorre el array para contar los elementos pares y muestra el total en la consola.
public class elementosPares {
    public static void main(String[] args) {
        // Declarar un array de 10 elementos de tipo entero
        int[] array = new int[10];
        // Inicializar cada elemento con un número aleatorio menor a 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        // Imprimir todos los elementos del array en una única línea
        System.out.println("Elementos del array: " + java.util.Arrays.toString(array));
        // Recorrer el array para contar los elementos pares
        int contadorPares = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contadorPares++;
            }
        }
        // Mostrar los elementos pares en la consola

        // Mostrar el total de elementos pares en la consola
        System.out.println("Total de elementos pares: " + contadorPares);

    }
}

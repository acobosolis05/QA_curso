package clase_10;

// Genera un array de 20 elementos de tipo float, inicializándolo con los números de tu elección. 
// Luego, suma todos los elementos del array y calcula su promedio. Finalmente, muestra por consola 
// tanto el resultado de la suma 
// como el promedio de los elementos.Te sugerimos implementar el uso de la sintaxis de for-each.
public class promedio {
    public static void main(String[] args) {
        float[] array = new float[20];
        // Inicializar cada elemento con un número aleatorio menor a 100
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) Math.random() * 5;
        }
        // Imprimir todos los elementos del array en una única línea
        System.out.print("Elementos del array: " + java.util.Arrays.toString(array));
        // Sumar todos los elementos del array
        float suma = 0;
        for (float i : array) {
            suma += i;
        }
        // promedio
        float promedio = suma / array.length;

        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }
}

package clase_10;

// Escribe un programa que recorra un array de enteros y  calcule la suma 
// acumulada de los elementos, reemplazando cada elemento por 
// la suma acumulada hasta ese punto.El tamaño y los números  a contener pueden ser de tu elección.
public class sumaCalculada {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int[] arraySuma = new int[array.length];
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
            arraySuma[i] = suma;
        }
        System.out.println("El array original es: " + java.util.Arrays.toString(array));
        System.out.println("El array con la suma acumulada es: " + java.util.Arrays.toString(arraySuma));
    }

}

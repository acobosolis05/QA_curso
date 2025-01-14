package clase_10;
// Escribe un programa que recorra un array de enteros y lo invierta, 

// es decir, que el primer elemento se convierta en el último y viceversa, 
// luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden 
// ser de tu elección.

// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. 
// Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 

public class invertirarray {
    public static void main(String[] args) {
        int[] array = { 3, 4, 5, 6, 7, 8 };
        int tam = array.length;
        int[] arrayinverso = new int[tam];
        for (int i = 0; i < tam; i++) {
            arrayinverso[i] = array[tam - i - 1];
        }
        for (int i = 0; i < tam; i++) {
            System.out.print(arrayinverso[i] + " ");
        }
    }
}

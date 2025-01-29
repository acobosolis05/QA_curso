package clase_19;



// Imprimir array: Crea un programa que utilice un método "imprimirArray(int[] array)"
//  que se encargue de imprimir un array por consola. 
//  El método debe recibir como parámetro un arreglo de tipo "int" y no devolver nada. 
//  Luego, crea una sobrecarga del método para que acepte arrays de tipo 
// String y arreglos bidimensionales de tipo "int" y de tipo "String".
public class metodoImprimirAr {
    public static void main(String[] args) {
        int[] arrayInt = { 1, 2, 3, 4, 5 };
        String[] arrayStr = { "Hola", "Mundo", "animal" };
        int[][] arrayInt2D = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        String[][] arrayStr2D = { { "Hola", "Mundo" }, { "Programación", "egg" } };

        // Llamadas a los métodos
        System.out.println("Arreglo de enteros:");
        imprimirArray(arrayInt);

        System.out.println("Arreglo de cadenas:");
        imprimirArray(arrayStr);

        System.out.println("Arreglo bidimensional de enteros:");
        imprimirArray(arrayInt2D);

        System.out.println("Arreglo bidimensional de cadenas:");
        imprimirArray(arrayStr2D);

    }

    public static void imprimirArray(int[] arrayInt) {
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

    }

    public static void imprimirArray(String[] arrayStr) {
        for (String str : arrayStr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Método para imprimir un arreglo bidimensional de enteros
    public static void imprimirArray(int[][] array) {
        for (int[] fila : array) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Método para imprimir un arreglo bidimensional de cadenas
    public static void imprimirArray(String[][] array) {
        for (String[] fila : array) {
            for (String str : fila) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}

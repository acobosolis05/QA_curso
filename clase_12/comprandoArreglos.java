package clase_12;

import java.util.Arrays;

// Escribe un programa que compare dos arreglos de enteros utilizando 
// el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
public class comprandoArreglos {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        boolean isEqual = Arrays.equals(array, array2);
        if (isEqual) {  
            System.out.println("Los arreglos son iguales");
            } else {
                System.out.println("Los arreglos no son iguales");
                }

    }
    

}

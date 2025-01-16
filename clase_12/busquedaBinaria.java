package clase_12;

import java.util.Arrays;
import java.util.Scanner;

// La búsqueda binaria es un algoritmo eficiente para encontrar un 
// elemento en una lista ordenada de elementos. La clase Arrays ya incluye su implementación 
// mediante el método binarySearch(). Escribe un programa que realice una búsqueda binaria 
// en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). 
// El programa debe imprimir el arreglo generado originalmente, solicitar al usuario
//  el valor buscado e imprimir el índice del valor buscado si está presente en el arreglo.
public class busquedaBinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Arreglo original: " + Arrays.toString(array));
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = sc.nextInt();
        int indice = Arrays.binarySearch(array, valorBuscado);
        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el arreglo" + "en el índice " + indice);
        }else{
                System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo");
            }
        sc.close();
    }

}

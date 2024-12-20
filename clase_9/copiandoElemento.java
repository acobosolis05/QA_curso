package clase_9;
// Desarrolla un programa que inicie creando un array de 3 enteros, 
// con valores predeterminados. Posteriormente, genera una copia del mismo con 
// una extensión de 2 elementos adicionales.

import java.util.Scanner;

// Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.

// Finalmente, muestra por consola el contenido del nuevo array.

// Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, 
// evitando el uso de bucles en el proceso
public class copiandoElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3};
        int[] array2 = new int[array.length + 2];
        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];

        System.out.println("por favor ingrese el primer valor: ");
        int array3 = sc.nextInt();
        System.out.println("por favor ingrese el segundo valor: ");
        int array4 = sc.nextInt();

        // Almacenar los dos nuevos números en las últimas dos posiciones del nuevo array
        array2[array.length] = array3;
        array2[array.length + 1] = array4;

        System.out.println("el contenido del nuevo array");
        System.out.println(array2[0] + "");
        System.out.println(array2[1] + "");
        System.out.println(array2[2] + "");
        System.out.println(array2[3] + "");
        System.out.println(array2[4]);

        sc.close();
        
    }
}

package clase_9;

import java.util.Scanner;

// Escribe un programa en el cual se cree una variable de tipo array
// que contenga cinco elementos de tipo entero, ingresados por el usuario.
// El programa debe buscar el máximo e imprimir por consola el resultado utilizando 
// solamente las herramientas adquiridas hasta el momento.
public class encontrandoMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.print("por favor ingrese el primer numero: ");
        array[0] = sc.nextInt();
        System.out.print("por favor ingrese el segundo numero: ");
        array[1] = sc.nextInt();
        System.out.print("por favor ingrese el tercer numero: ");
        array[2] = sc.nextInt();
        System.out.print("por favor ingrese el cuarto numero: ");
        array[3] = sc.nextInt();
        System.out.print("por favor ingrese el quinto numero: ");
        array[4] = sc.nextInt();
        int max = array[0];
        max = (array[1] > max) ? array[1] : max;
        max = (array[2] > max) ? array[2] : max;
        max = (array[3] > max) ? array[3] : max;
        max = (array[4] > max) ? array[4] : max;
        System.out.println("el maximo es: "+ max);

        sc.close();
    }

}

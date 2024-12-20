package clase_9;

import java.util.Scanner;

// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, 
// solicita un número al usuario y muestra por consola si ese número está presente en el array o no. 
// Es importante utilizar
//  únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.
public class buscandoElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("por favor ingrese un dato: ");
        array[0] = sc.nextInt();
        System.out.print("por favor ingrese un dato: ");
        array[1] = sc.nextInt();
        System.out.print("por favor ingrese un dato: ");
        array[2] = sc.nextInt();
        System.out.print("por favor ingrese un dato para buscar: ");
        int datoBuscado = sc.nextInt();
        if (array[0] == datoBuscado || array[1] == datoBuscado|| array[2] == datoBuscado){
            System.out.println("el dato "+datoBuscado+ " se encuentra en el array");
        }
        else{
            System.out.println("el dato "+datoBuscado+ " no se encuentra en el array");
            }
        sc.close();

    }
}

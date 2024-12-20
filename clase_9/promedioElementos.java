package clase_9;
// Escribe un programa en el cual se cree una variable de tipo array que contenga 
// cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. 
// El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola 
// el resultado, utilizando solamente las herramientas adquiridas hasta el momento.

import java.util.Scanner;

public class promedioElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        System.out.print("por favor ingrese el primer numero: ");
        array[0] = sc.nextInt();
        System.out.print("por favor ingrese el segundo numero: ");
        array[1] = sc.nextInt();
        System.out.print("por favor ingrese el tercer numero: ");
        array[2] = sc.nextInt();
        System.out.print("por favor ingrese el cuarto numero: ");
        array[3] = sc.nextInt();
        int sum = array[0] + array[1] + array[2] + array[3];
        double avg = sum / 4.0;
        System.out.println("la suma: " + sum + " y el promedio: "+ avg);
        
        sc.close();
    }
}

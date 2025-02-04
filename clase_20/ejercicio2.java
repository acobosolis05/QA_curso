package clase_20;

import java.util.Scanner;

public class ejercicio2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingresa la posición de Fibonacci que quieres: ");
        int posicion = sc.nextInt();

        int resultado = calcularFibonacci(posicion);
        System.out.println("El número de Fibonacci en la posición " + posicion + " es: " + resultado);

        sc.close();
    }

    public static int calcularFibonacci(int posicion) {
        if (posicion < 0) {
            throw new IllegalArgumentException("La posición no puede ser negativa.");
        }
        if (posicion == 0) return 0;
        if (posicion == 1) return 1;
        return calcularFibonacci(posicion - 1) + calcularFibonacci(posicion - 2);
    }
}

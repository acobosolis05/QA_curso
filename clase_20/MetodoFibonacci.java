package clase_20;

import java.util.Scanner;

public class MetodoFibonacci {
    public static Scanner sc = new Scanner(System.in);// Declaración de la variable Scanner

    public static void main(String[] args) {
        System.out.print("por favor ingrese cuantos numeros quiere");
        int n = sc.nextInt();
        System.out.println("La secuencia de Fibonacci es:");
        fibonacci(n); // Llamar al método para imprimir la secuencia
        
        sc.close();
        
    }

    public static void fibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }

}

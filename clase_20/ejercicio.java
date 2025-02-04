package clase_20;

import java.util.Scanner;

public class ejercicio {
    public static Scanner sc = new Scanner(System.in);// Declaración de la variable Scanner

    public static void main(String[] args) {
        System.out.print("por favor ingrese cuantos numeros quiere");
        int n = sc.nextInt();
        System.out.println("La secuencia de Fibonacci es:");
        for(int i = 0; i < n; i++){
            System.out.println(fibonaccirecursivo(i));
        }
         // Llamar al método para imprimir la secuencia
        
        sc.close();
        
    }

    public static int fibonaccirecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonaccirecursivo(n - 1) + fibonaccirecursivo(n-2);
        
        }
        
    }


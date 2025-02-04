package clase_20;

import java.util.Scanner;

public class ejercicio3 {


    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        System.out.println("Factorial de " + num + " es: " + factorial(num));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}



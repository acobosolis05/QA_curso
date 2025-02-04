package clase_20;

public class metodoFibonacciR {
    public static void main(String[] args) {
        System.out.println("Recursivo");
        int n = 8; // Número de términos de Fibonacci
        
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciRecursivo(i)); // Llamamos con 'i' para imprimir la secuencia
        }
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Llamada recursiva para calcular Fibonacci
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }
}


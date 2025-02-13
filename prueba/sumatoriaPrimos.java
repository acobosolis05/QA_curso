import java.util.Scanner;

public class sumatoriaPrimos {
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();

        int suma = 0;
        StringBuilder primosStr = new StringBuilder(); // Para almacenar los primos en formato (2 + 3 + ...)

        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                suma += i;
                if (primosStr.length() > 0) {
                    primosStr.append(" + ");
                }
                primosStr.append(i);
            }
        }

        System.out.println("Salida: " + suma + " (" + primosStr + ")");
        sc.close();
    }
}

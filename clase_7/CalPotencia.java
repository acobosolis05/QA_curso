package clase_7;

import java.util.Locale;
import java.util.Scanner;

// Escribe un programa que pida al usuario dos números enteros, representando la base
//  y el exponente, y calcula el resultado de elevar la base al exponente 
// utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
public class CalPotencia {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        int base = sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente = sc.nextInt();
        double resultado = Math.pow(base, exponente);
        System.out.println("El resultado de elevar la base al exponente es: " + resultado);

        sc.close();
}
}
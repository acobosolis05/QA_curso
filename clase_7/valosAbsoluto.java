package clase_7;

import java.util.Scanner;

// Escribe un programa que  pida al usuario un número entero 
// y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math
public class valosAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = sc.nextInt();
        System.out.println("El valor absoluto de " + num + " es " + Math.abs(num));
        sc.close();
    }
}

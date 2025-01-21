package clase_14;

import java.util.Scanner;

// Escribe un programa que solicite al usuario que introduzca un número y verifique 
// si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al 
// usuario que introduzca otro número 
// hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).
public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("El programa ha finalizado");
                break;
            }
            boolean primo = true;

            if (num < 2) {
                primo = false; // Los números menores que 2 no son primos
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        primo = false; // Si es divisible por cualquier número entre 2 y la raíz cuadrada de num, no es primo
                        break;
                    }
                }
            }
            if (primo) {
                System.out.println("El número " + num + " es primo");
            } else {
                System.out.println("El número " + num + " no es primo");
            }

        } while (true); // El bucle continuará hasta que se ingrese 0
        sc.close();
    }
}

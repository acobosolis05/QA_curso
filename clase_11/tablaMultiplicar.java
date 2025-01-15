package clase_11;

import java.util.Scanner;

// Escribe un programa que solicite al usuario un número entero y muestre la tabla de 
// multiplicar de ese número utilizando un bucle while. El programa debe seguir solicitando 
// números hasta 
// que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.
public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un número entero para ver su tabla de multiplicar o 0 para salir del programa: ");
            numero = sc.nextInt();
            if (numero != 0) {
                System.out.println("Tabla de multiplicar del número " + numero + ":");
                for (int i = 1; i <= 12; i++) {
                    System.out.println(numero + " x " + i + " = " + numero * i);
                }
            } else {
                System.out.println("Ha salido del programa");
            }
        } while (numero != 0);
        sc.close();

    }
}
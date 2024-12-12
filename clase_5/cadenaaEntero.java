// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que 
// represente un número entero. Utiliza el método Integer.parseInt() para convertir 
// la cadena en un número entero. Implementa un bloque "try-catch" para manejar 
// la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. 
// En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.

import java.util.Scanner;

public class cadenaaEntero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Por favor ingrese un numero: ");
            String cadena = sc.nextLine();
            int entero = Integer.parseInt(cadena);
            System.out.println("La cadena ingresada es un número entero: " + entero);
            }
            catch (NumberFormatException e) {
                System.out.println("La cadena ingresada no es un número entero");
        }

        sc.close();
    }
}

// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza 
// la resta del primer número menos el segundo número. Implementa un bloque "try-catch" 
// para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números.
//  En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla.
//  Si no se produce ninguna excepción, muestra el resultado de la resta.

package clase_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class restaExcepciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Por favor ingrese el primer numero: ");
            double num1 = sc.nextDouble();
            System.out.print("Por favor ingrese el segundo numero: ");
            double num2 = sc.nextDouble();
            double resultado = num1 - num2;
            System.out.println("El resultado de la resta es: "+ resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
            } 
    sc.close();
}
}
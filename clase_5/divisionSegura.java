// Escribe un programa que pida al usuario que ingrese dos números enteros y 
// realice la división del primer número entre el segundo número. Implementa 
// un bloque "try-catch" para manejar la excepción en caso de que se intente realizar 
// una división por cero. 
// En caso de que ocurra la excepción, muestra un mensaje apropiado en la pantalla.

package clase_5;

import java.util.Scanner;

public class divisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("por favor ingrese el primer numero: ");
        double num1 = sc.nextDouble();
        System.out.print("por favor ingrese el segundo numero: ");
        double num2 = sc.nextDouble();
        try {
            double resultado = num1 / num2;
            System.out.println("el resultado de la division es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("no se puede dividir por cero");
                }

        sc.close();
    }
    
}

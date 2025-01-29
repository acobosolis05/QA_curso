package clase_19;

import java.util.InputMismatchException;
import java.util.Scanner;

// Ejercicio de calificación: Basándote en el siguiente ejercicio que ya has realizado, 
// crea un método "obtenerNota()" que reciba por parámetro un "int" y devuelva un "String".
//  El método debe utilizar la estructura de control "switch expression".
// - Si la puntuación está entre 90 y 100, se mostrará "A".

// - Si la puntuación está entre 80 y 89, se mostrará "B".

// - Si la puntuación está entre 70 y 79, se mostrará "C".

// - Si la puntuación está entre 60 y 69, se mostrará "D".

// - Si la puntuación es menor a 60, se mostrará "F".
public class metodoCalificaciones {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Por favor ingrese un número entre 0 y 100: ");
            int nota = sc.nextInt(); // Validación ocurre aquí
            String resultado = obtenerNota(nota);
            System.out.println("La calificación es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: No es un valor válido. Por favor, ingrese un número entero.");
        }
    }

    public static String obtenerNota(int nota) {
        if (nota >= 90 && nota <= 100) {
            return "A";
        } else if (nota >= 80 && nota < 90) {
            return "B";
        } else if (nota >= 70 && nota < 80) {
            return "C";
        } else if (nota >= 60 && nota < 70) {
            return "D";
        } else if (nota < 60) {
            return "F";
        } else {
            return "Calificación fuera de rango";
        }
    }
}
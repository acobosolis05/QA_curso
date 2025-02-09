package prueba;

import java.util.Scanner;

public class funcionalidadDos {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese el tamaño de la escalera (0 < n < 100): ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("El número debe estar entre 1 y 99.");
            return;
        }

        System.out.println("\nEscalera Alineada a la Derecha (Agente A):");
        getStaircaseRight(n);

        System.out.println("\nEscalera Alineada a la Izquierda (Agente B):");
        getStaircaseLeft(n);

        System.out.println("\nEscalera Centrada (Agente C):");
        getStaircaseCentered(n);
    }

    // Agente A: Escalera alineada a la derecha
    public static void getStaircaseRight(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print("#");
            System.out.println();
        }
    }

    // Agente B: Escalera alineada a la izquierda
    public static void getStaircaseLeft(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 0; k < i; k++)
                System.out.print("#");
            System.out.println();
        }
        }

    public static void getStaircaseCentered(int n) {
        int incremento = 2;
        int maxAncho = n + (incremento * (n - 1)); // Ancho máximo para centrar la pirámide
        
        // Parte superior: n filas
        for (int fila = 0; fila < n; fila++) {
            int ancho = n + (fila * incremento); // Incremento progresivo del ancho
            int espacios = (maxAncho - ancho) / 2; // Espacios necesarios para centrar
        
            // Espacios iniciales
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
        
            // Caracteres #
            for (int k = 0; k < ancho; k++) {
                System.out.print("#");
            }
        
            System.out.println();
        }
        
        // Parte inferior: n filas
        for (int fila = n - 2; fila >= 0; fila--) {
            int ancho = n + (fila * incremento); // Decremento progresivo del ancho
            int espacios = (maxAncho - ancho) / 2; // Espacios necesarios para centrar
        
            // Espacios iniciales
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }
        
            // Caracteres #
            for (int k = 0; k < ancho; k++) {
                System.out.print("#");
            }
        
            System.out.println();
        }
} 
} 
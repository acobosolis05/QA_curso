package com.airam;

import java.util.Scanner;

public class Application {

    private static Scanner lecturaDato = new Scanner(System.in);

    public static void setScanner(Scanner scanner) {
        lecturaDato = scanner;
    }

    public static Integer obtenerPuntuacion() {
        System.out.println("Ingrese una puntuación para calificar");
        try {
            return Integer.parseInt(lecturaDato.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero.");
            return obtenerPuntuacion();
        }
    }
}

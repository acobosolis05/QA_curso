package clase_8;

import java.util.Scanner;

public class validacionContra2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            boolean esValida = false; // Bandera para validar la contraseña
            String contraseña;

            // Repetir hasta que la contraseña cumpla con todos los criterios
            do {
                System.out.print("Ingrese la contraseña: ");
                contraseña = sc.nextLine();

                // Validar los criterios
                boolean longitud = contraseña.length() >= 8;
                boolean mayuscula = contraseña.chars().anyMatch(Character::isUpperCase);
                boolean minuscula = contraseña.chars().anyMatch(Character::isLowerCase);
                boolean numero = contraseña.chars().anyMatch(Character::isDigit);
                boolean especial = contraseña.chars().anyMatch(c -> !Character.isLetterOrDigit(c));

                if (longitud && mayuscula && minuscula && numero && especial) {
                    esValida = true; // Contraseña válida, salir del bucle
                    System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
                } else {
                    System.out.println("Contraseña no segura. Debe cumplir con los siguientes criterios:");
                    if (!longitud) System.out.println("- Al menos 8 caracteres.");
                    if (!mayuscula) System.out.println("- Al menos una letra mayúscula.");
                    if (!minuscula) System.out.println("- Al menos una letra minúscula.");
                    if (!numero) System.out.println("- Al menos un número.");
                    if (!especial) System.out.println("- Al menos un carácter especial (!, @, #, $, etc.).");
                }
            } while (!esValida);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}




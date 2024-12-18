package clase_8;

import java.util.Scanner;

public class validacionC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validarContrasena(sc);
        sc.close();
    }

    public static void validarContrasena(Scanner sc) {
        System.out.print("Ingrese la contraseña: ");
        String contraseña = sc.nextLine();

        // Validar los criterios
        boolean longitud = contraseña.length() >= 8;
        boolean mayuscula = contraseña.chars().anyMatch(Character::isUpperCase);
        boolean minuscula = contraseña.chars().anyMatch(Character::isLowerCase);
        boolean numero = contraseña.chars().anyMatch(Character::isDigit);
        boolean especial = contraseña.chars().anyMatch(c -> !Character.isLetterOrDigit(c));

        if (longitud && mayuscula && minuscula && numero && especial) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe tener al menos una letra mayúscula y un carácter especial.");
            
            // Llamada recursiva para volver a pedir la contraseña
            validarContrasena(sc);
        }
    }
}


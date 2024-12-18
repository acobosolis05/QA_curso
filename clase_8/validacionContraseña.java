package clase_8;
// La contraseña debe tener al menos 8 caracteres.

import java.util.Scanner;

// La contraseña debe contener al menos una letra mayúscula y una letra minúscula.

// La contraseña debe contener al menos un número.

// La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
public class validacionContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese la contraseña: ");
            String contraseña = sc.nextLine();
            boolean longitud = contraseña.length() >= 8;
            boolean mayuscula = contraseña.chars().anyMatch(Character::isUpperCase);
            boolean minuscula = contraseña.chars().anyMatch(Character::isLowerCase);
            boolean numero = contraseña.chars().anyMatch(Character::isDigit);
            boolean especial = contraseña.chars().anyMatch(c -> !Character.isLetterOrDigit(c));

            String resultado = (longitud == false)? "la contraseña tiene menos de 8 caracteres\n":""; 
            resultado += (mayuscula == false)? "la contraseña no tiene mayusculas\n": "";
            resultado += (minuscula == false)? "la contraseña no tiene minusculas\n": "";
            resultado += (numero == false)? "la contraseña no tiene numeros\n": "";
            resultado += (especial == false)? "la contraseña no tiene caracteres especiales": "";
            System.out.println(resultado);

            if (longitud && mayuscula && minuscula && numero && especial) {
                System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
            } else {
                System.out.println("Contraseña no segura.");
            }
        } catch (Exception e) {
            System.out.println("Error: ");
        }
        
        sc.close();
    }
}
//counter += !password.matches("^.{8,}$") ? imprimir("La contraseña debe tener al menos 8 caracteres.") : 0;
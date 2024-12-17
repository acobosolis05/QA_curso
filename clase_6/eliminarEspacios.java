package clase_6;

import java.util.Scanner;

// Crea un programa que solicite al usuario ingresar una frase con 
// espacios en blanco al principio y al final. Utiliza el método trim() de la
//  clase String para eliminar los espacios en blanco y luego muestra la frase resultante en pantalla.
public class eliminarEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
        String frase = sc.nextLine();
        String fraseSinEspacios = frase.trim();
        System.out.println("La frase sin espacios es: " + fraseSinEspacios);

        sc.close();
        }
    
}

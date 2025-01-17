package clase_13;

import java.util.Scanner;

// Pídele al usuario que introduzca una cadena. Crea un bucle que 
// recorra cada carácter en la cadena y utiliza Character.isWhitespace() para contar el 
// número de espacios en blanco en la cadena. Muestra el recuento al usuario.
public class contadorEspacios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isWhitespace(caracter)) {
                contador++;
            }
        }
        System.out.println("El número de espacios en blanco en la cadena es: " + contador);

        sc.close();
    }
}

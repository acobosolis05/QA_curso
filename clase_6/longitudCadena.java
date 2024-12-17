// Actividad: Longitud de Cadena
// Escribe un programa que pida al usuario ingresar una cadena de texto y 
// muestre en pantalla su longitud utilizando el método length() de la clase String.

package clase_6;

import java.util.Scanner;

public class longitudCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.println("la palabra " + palabra + " tiene "+ palabra.length() +" caracteres de longitud.");


        sc.close();
    }
}

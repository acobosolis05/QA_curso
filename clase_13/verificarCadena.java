package clase_13;

import java.util.Scanner;

// Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en 
// la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras.
//  Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.
public class verificarCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = sc.nextLine();

        boolean sololetras = true;
            for (int i = 0; i < cadena.length(); i++) {
                if (!Character.isLetter(cadena.charAt(i))) {
                    sololetras = false;}
                    }
        if (sololetras) {
            System.out.println("La cadena contiene solo letras.");
            } else {
                System.out.println("La cadena no contiene solo letras.");
                }
                sc.close();
    
}
}

package clase_13;

import java.util.Scanner;

// Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego utiliza un
//  bucle y Character.isDigit() para contar el número de dígitos en el número.
public class contandoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        String num = sc.nextLine();
        String cadena = String.valueOf(num);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isDigit(caracter)) {
                contador++;
                
    }
                }
    System.out.println("el numero "+num+ " ingresado tiene " + contador);
                
    sc.close();
}
}

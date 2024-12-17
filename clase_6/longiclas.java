package clase_6;

import java.util.Scanner;

public class longiclas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("por favor ingrese una cadena de texto: ");
        String palabra = sc.nextLine();
        System.out.println("la frase contiene: " + palabra + " tiene: " + palabra.length()+ " caracteres");
        sc.close();
    }
}

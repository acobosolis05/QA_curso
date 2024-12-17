package clase_6;
// Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() 
// de la clase String para comparar si las dos palabras son iguales. 
// Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
import java.util.Scanner;

public class comparacionCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una palabra: ");
        String palabra = sc.nextLine();
        System.out.print("Por favor ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        if (palabra.equals(palabra2)) {
            System.out.println("Las palabras ingresadas son iguales.");
            } else {
                System.out.println("Las palabras ingresadas son diferentes.");
                }


        sc.close();
}
}

// Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, 
// que representen un índice inicial y un índice final. Utiliza el método substring() 
// de la clase String para extraer la subcadena que se encuentra entre los 
// índices ingresados por el usuario, y muestra la subcadena resultante en pantalla.

package clase_6;

import java.util.Scanner;

public class extraccionSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
        String palabra = sc.nextLine();

        System.out.print("Ingrese el índice inicial: ");
        int inicio = sc.nextInt();
        

        System.out.print("Ingrese el índice final: ");
        int fin = sc.nextInt();
        

        String subcadena = palabra.substring(inicio, fin);
        System.out.println("La subcadena es: " + subcadena);

        sc.close();
    }
}
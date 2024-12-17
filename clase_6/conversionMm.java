package clase_6;
// Escribe un programa que pida al usuario ingresar una 
// cadena de texto y muestre en pantalla la misma cadena, 
// pero con todos los caracteres en mayúsculas o minúsculas. 
// Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.

import java.util.Scanner;

public class conversionMm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
            String palabra = sc.nextLine();
    
            String  minuscula = palabra.toLowerCase();
            String mayuscula = palabra.toUpperCase();
            
            System.out.println("La palabra en mayuscula es: " + mayuscula);
            System.out.println("La palabra en minuscula es: " + minuscula);
        
        sc.close();
    }
}


package clase_6;

import java.util.Scanner;

// Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. 
// Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias 
// del primer carácter con el segundo carácter 
// en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.
public class reemplazarCaracteres {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.print("Por favor ingrese un caracter a reemplazar: ");
        String caracterReemplazar = sc.nextLine();

        System.out.print("Por favor ingrese el caracter de reemplazo: ");
        String caracterReemplazo = sc.nextLine();

        String palabraReemplazada = frase.replace(caracterReemplazar, caracterReemplazo);
        System.out.println("La frase resultante es: " + palabraReemplazada);

        sc.close();
}
}

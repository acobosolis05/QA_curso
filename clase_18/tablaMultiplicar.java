package clase_18;

import java.util.InputMismatchException;
import java.util.Scanner;

// En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número
//  (incluida la lógica en un método llamado pedirNumero())  
//  y luego imprime la tabla de multiplicar de ese número del 1 al 10 
//  (incluida la lógica en un método llamado imprimirTablaMultiplicar()). 
//  Para ello, implementarás un método que reciba 
// el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente
public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = pedirNumero(sc);
        
        
        imprimirTablaMultiplicar(numero);
        sc.close();
        }

    public static int pedirNumero(Scanner sc) {
        int numero;
        while (true) {
        try {
            System.out.print("por favor ingrese un numero entero: ");
            numero = sc.nextInt();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("Error el numero ingresado no es valido");
            sc.next(); // para limpiar el buffer
        }
        }
    }

    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("la tabla de multiplicar del numero " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

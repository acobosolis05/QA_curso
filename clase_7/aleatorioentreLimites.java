package clase_7;

import java.util.Scanner;

// Escribe un programa que pida al usuario ingresar dos números enteros:
//  un límite inferior y un límite superior. Luego, utiliza el método random()
//   de la clase Math para generar y mostrar 
// en pantalla un número aleatorio dentro del rango especificado por los límites ingresados
public class aleatorioentreLimites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un límite inferior: ");
        int inferior = sc.nextInt();
        System.out.print("Ingrese un límite superior: ");
        int superior = sc.nextInt();
        int aleatorio = (int) (Math.random() * (superior+1-inferior)) + inferior;
        System.out.println("El número aleatorio es: "+ aleatorio);

        sc.close();
    }
}

package clase_18;

import java.util.Scanner;

public class actividadUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre:");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese su edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        imprimirNombre(nombre);
        imprimeNombreYEdad(nombre, edad);

        sc.close();

    }
    public static void imprimirNombre(String nombre) {
        System.out.println("Mi nombre es: " + nombre);
        
    }
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
        
    }
}

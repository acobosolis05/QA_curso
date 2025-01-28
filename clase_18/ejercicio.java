package clase_18;

import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = recibeNombre(sc);
        int edad = recibeEdad(sc);
        imprimenombre(nombre, edad);
        sc.close();
    }
    public static String recibeNombre(Scanner sc){
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }
    public static int recibeEdad(Scanner sc){
        System.out.print("Por favor ingrese su edad: ");
        int edad = sc.nextInt();
        return edad;
        }
    public static void imprimenombre(String nombre, int edad){
        System.out.println("Mi nombre es: " + nombre + " y mi edad es " + edad);
    }
}

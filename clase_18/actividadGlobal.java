package clase_18;


import java.util.Scanner;

public class actividadGlobal {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = imprimeNombre();
        int edad = imprimeEdad();
        

        imprimeNombreYEdad(nombre, edad);

        sc.close();
    }
    public static String imprimeNombre() {
        System.out.print("Ingrese su nombre: ");
        String Nombre = sc.nextLine();
        return Nombre;
        
    }
    public static int imprimeEdad() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        return edad;
    }
    
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
}
}

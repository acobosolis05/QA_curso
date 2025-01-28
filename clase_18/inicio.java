package clase_18;
// Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre 
// y luego imprima el mensaje "Mi nombre es [nombre]". 
// Invocar dicho método desde el método main para ver el mensaje por consola

import java.util.Scanner;

// Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) 
// que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".
public class inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = imprimeEdad(sc);
        String nombre = imprimeNombre(sc);

        imprimeNombreYEdad(nombre, edad);

        sc.close();
        
        
    }
    public static String imprimeNombre(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        return nombre;
                
        
    }
    public static int imprimeEdad(Scanner sc) {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        return edad;
        
        }
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
        
    }
}

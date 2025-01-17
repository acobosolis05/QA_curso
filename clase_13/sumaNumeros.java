package clase_13;

import java.util.Scanner;

// Pídele al usuario que introduzca una cadena que represente un número 
// entero y luego otra cadena que represente un número decimal. Convierte cada 
// cadena al tipo de dato correspondiente
//  utilizando los métodos valueOf, suma sus valores e imprímelos por consola.
public class sumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        String entero = sc.nextLine();
        System.out.print("Introduce un número decimal: ");
        String decimal = sc.nextLine();
        try{
            int enteroInt = Integer.valueOf(entero);
            double decimalDouble = Double.valueOf(decimal);
            double suma = enteroInt +  decimalDouble;
            System.out.println("La suma de los dos números es: "+ suma);
        } catch (NumberFormatException e){
            System.out.println("Error: No se pudo convertir el valor a un número");
            }
        
        sc.close();
    }
}

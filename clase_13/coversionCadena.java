package clase_13;
// Escribe un programa que lea una cadena que represente un número entero
//  como entrada utilizando la clase Scanner. Luego, convierte la cadena en
//   un número entero utilizando la clase de envoltura Integer.

import java.util.Scanner;

public class coversionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero como cadena: ");
        String cadena = sc.nextLine();
        try{
            int entero = Integer.parseInt(cadena);
            System.out.println("El número entero es: "+entero);
        }
        catch (NumberFormatException e){
            System.out.println("Error: La cadena no es un número entero");
            }
        
        sc.close();
    }    
}

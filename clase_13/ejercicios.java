package clase_13;
// Pídele al usuario que introduzca una cadena. Intenta convertir la cadena 
// a un número decimal usando Double.valueOf(). Si la cadena no representa 
// un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción 
// y muestra un mensaje al usuario indicando que la entrada no es un número válido

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena:  ");
        String cadena = sc.nextLine();
        try{
            double numero = Double.valueOf(cadena); 
            System.out.println("la cadena introducida es valida: "+ numero);
        } catch (NumberFormatException e){
            System.out.println("La cadena introducida no es un número");
        }
        sc.close();

    }
}

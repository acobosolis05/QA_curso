package clase_11;
// Escribe un programa que solicite al usuario ingresar 
// una serie de números enteros. Utiliza un bucle while para contar la cantidad 
// de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números.
//  Al finalizar, muestra la cantidad de números pares e impares ingresados

import java.util.Scanner;

public class pareseimpares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, num, ingreso;
        System.out.print("Cuantos numeros desea ingresar: ");
        ingreso = sc.nextInt();
        while (ingreso > 0) {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                pares++;
                } else {
                    impares++;
                    }
                    ingreso--;// Reducir los registros pendientes
                    
                    }
                    System.out.println("Pares: " + pares + " Impares: " + impares);
        
        
                        sc.close();
                        }

}

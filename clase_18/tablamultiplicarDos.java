package clase_18;

import java.util.InputMismatchException;
import java.util.Scanner;

// En esta actividad, vas a crear un programa que solicita al usuario que ingrese 
// 3 números (incluida la lógica en un método llamado pedirNumeros()) 
//  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 
//  (incluida la lógica en un método llamado imprimirTablasMultiplicar(int[] numeros)).
//   Para ello, implementarás un  un array para 
// almacenar los números ingresados y luego invocarás el método para cada uno de ellos.
public class tablamultiplicarDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[3];
        pedirNumero(sc, numeros);
        
        for(int numero: numeros){
            System.out.println("La tabla de multiplicar del número "+ numero +" es:");
            imprimirTablaMultiplicar(numero);
        }
        
        sc.close();
        }

    public static void pedirNumero(Scanner sc, int[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            while (true) {
                try{
                    System.out.print("Ingrese el número: " );
                    numeros[i] = sc.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debe ingresar un número entero.");
                    sc.next(); // Limpiar el buffer
                    }
                    }
            }
            }
            public static void imprimirTablaMultiplicar(int numero) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " x " + i + " = " + (numero * i));
                    }
                    }
        }



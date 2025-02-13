

import java.util.Scanner;

public class fizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("por favor ingrese un numero del 1 al 100: ");
            int numero = sc.nextInt();
            if (numero >= 1 && numero <= 100) {
                // Si es múltiplo de ambos (3 y 5), imprime "Fizzbuz
                if(numero % 3 == 0 && numero % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                // Si el número es múltiplo de 3, imprime "Fizz".
                else if(numero % 3== 0){
                    System.out.println("Fizz");
                }
                // Si es múltiplo de 5, imprime "Buzz".
                else if(numero % 5 == 0){
                    System.out.println("Buzz");
                    }
                    else{
                        System.out.println(numero);
                        }
                } else {
                    System.out.println("el valor ingresado no es el indicado");
                        }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
    
}

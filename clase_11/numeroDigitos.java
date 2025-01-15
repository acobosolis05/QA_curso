package clase_11;

import java.util.Scanner;

// Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para 
// calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. 
// El programa debe tener 
// en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.
public class numeroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        int contador = 0;
        if(numero == 0){
            contador = 1;
        }
        else if(numero < 0){
            numero = Math.abs(numero);
        }
        while (numero > 0) {
            numero = numero / 10;
            contador++;
            }
            System.out.println("El número ingresado tiene " + contador + " dígitos");
            sc.close();
    }
}

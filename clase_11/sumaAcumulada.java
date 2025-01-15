package clase_11;

import java.util.Scanner;

// Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. 
// Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después de 
// cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario responde
//  afirmativamente, continúa solicitando números; de lo contrario, 
// muestra la suma acumulada de todos los números ingresados y termina el programa.
public class sumaAcumulada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        boolean seguir = true;
        do {
            System.out.print("Ingrese un número entero positivo: ");
            int num = sc.nextInt();
            suma += num;
            System.out.print("¿Desea ingresar otro número? (s/n): ");
            String respuesta = sc.next();
            if (respuesta.equalsIgnoreCase("n")) {
                seguir = false;
                }
                } while (seguir);
                System.out.println("La suma acumulada de los números ingresados es: " + suma);
                sc.close();
    }
}

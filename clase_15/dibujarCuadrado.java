package clase_15;
// Dibujando cuadrados

import java.util.Scanner;

// Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.

// Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N 
// veces para completar el cuadrado. 

// Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
public class dibujarCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Imprimir '*' solo en los bordes del cuadrado
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio en el interior
                }
            }
            System.out.println(); // Salto de línea para la siguiente fila
            }
                sc.close();
    }
    
}

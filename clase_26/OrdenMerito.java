package clase_26;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// Objetivo: Practicar el uso de ArrayList en Java para almacenar y manipular
//  datos dinámicos, en este caso, notas de estudiantes. Practicarás la validación 
//  de la entrada del usuario, asegurando que los datos ingresados sean correctos, 
//  e implementarás el ordenamiento de elementos en orden ascendente y descendente.
// Instrucciones: 
// Inicializa un ArrayList: Crea un ArrayList de tipo Integer para almacenar
//  las notas enteras en el rango del 1 al 10. 


// Solicita la entrada del usuario: Implementa un bucle (puede ser while o for) 
// que pida al usuario ingresar las notas de los estudiantes. En cada iteración,
//  pregunta si desea agregar más notas. Si la respuesta es sí, agrega la nota al 
//  ArrayList utilizando el método add. Asegúrate de que el número ingresado esté en 
//  el rango de 1 a 10. Si no está dentro de este rango, informa al usuario que la entrada
//   no es válida y vuelve a solicitar la nota. 

// Finaliza la entrada de datos: El bucle debe continuar hasta que el usuario decida no
//  ingresar más notas

// Ordenar y mostrar en orden ascendente: Una vez que el usuario haya ingresado todas
//  las notas, primero ordena la lista en orden ascendente. Imprime por consola la colección 
//  ordenada.

// Ordenar y mostrar en orden descendente: Una vez que el usuario haya ingresado todas 
// las notas, ordena la lista en orden descendente. Imprime por consola la colección ordenada.
public class OrdenMerito {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();
        int calificacion;
        boolean continuar = true;
        while (continuar) {
            try {
                System.out.print("\nIngrese la nota del estudiante (1-10):");
                calificacion = sc.nextInt();
                if (calificacion >= 1 && calificacion <= 10) {
                    notas.add(calificacion);
                    System.out.print("¿Desea agregar más notas? (Si=1/No=0): " );
                    int respuesta = sc.nextInt();
                    if (respuesta == 0) {
                        continuar = false;
                        } 
                    } else {
                        System.out.println("Error: La nota debe estar entre 1 y 10.");
                        }
            } catch (Exception e) {
                System.out.println("Nota no válida. Por favor, ingrese un número entre 1 y 10");
                sc.nextLine(); // Limpiar buffer para evitar el bucle infinito
            }
            }
            // Ordena la lista en orden ascendente
            java.util.Collections.sort(notas);
            System.out.println("\nNotas en orden ascendente: -" + notas);
            // Ordena la lista en orden descendente
            java.util.Collections.sort(notas, Collections.reverseOrder());
            System.out.println("Notas en orden descendente: -" + notas);
            
            sc.close();
    }
}

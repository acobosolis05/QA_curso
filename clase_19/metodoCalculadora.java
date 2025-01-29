package clase_19;

import java.util.Scanner;

// Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" 
// que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de opciones
//  y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir".
//   Solicita dos números al usuario y realiza la operación matemática seleccionada, 
// teniendo en cuenta las validaciones necesarias como la división por cero.
public class metodoCalculadora {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        int opcion;
        do {
            // Mostrar el menú
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de la opción: ");
            // Leer la opción seleccionada
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                // Solicitar los dos números
                System.out.print("Ingrese el primer número: ");
                int num1 = sc.nextInt();
                System.out.print("Ingrese el segundo número: ");
                int num2 = sc.nextInt();
                // Realizar la operación matemática
                switch (opcion) {
                    case 1:
                        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma(num1, num2));
                        break;
                    case 2:
                        System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta(num1, num2));
                        break;
                    case 3:
                        System.out.println(
                                "La multiplicación de " + num1 + " * " + num2 + " = " + multiplicacion(num1, num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("La división de " + num1 + " / " + num2 + " = " + division(num1, num2));
                        } else {
                            System.out.println("No se puede dividir por cero");
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            }
        } while (opcion != 5);
        System.out.println("Adios¡¡¡¡¡¡");
        ; // Repetir hasta que el usuario elija salir

    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;

    }

    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;

    }

    public static int division(int num1, int num2) {
        return num1 / num2;

    }
}

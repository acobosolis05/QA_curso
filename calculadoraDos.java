import java.util.Scanner;

public class calculadoraDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            
            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Realizar la operación según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido Suma.");
                    System.out.print("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Has elegido Resta.");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Has elegido Multiplicación.");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("Has elegido División.");
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " + (num1 / (double) num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
            }

            System.out.println(); // Línea en blanco para separar iteraciones

        } while (opcion != 5); // Repetir hasta que el usuario elija salir

        scanner.close(); // Cerrar el Scanner
    }
}

package prueba;

import java.util.Arrays;
import java.util.Scanner;

public class Funcionalidades {
    public static Scanner sc = new Scanner(System.in);
    public static double[] datos = {}; // arreglo global para almacenar datos una vez

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("Menu de opciones");
            System.out.println("1. Ingresar datos: ");
            System.out.println("2. Media");
            System.out.println("3. Media Armonica");
            System.out.println("4. Mediana");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> ingresarDatos();
                case 2 -> {
                    if (datos.length == 0) {
                        System.out.println("Primero ingrese los datos (opción 1).");
                    } else {
                        System.out.println("La media aritmética es: " + calcularMedia());
                    }
                }
                case 3 -> {
                    if (datos.length == 0) {
                        System.out.println("Primero ingrese los datos (opción 1).");
                    } else {
                        System.out.println("La media armónica es: " + mediaArmonica());
                    }
                }
                case 4 -> {
                    if (datos.length == 0) {
                        System.out.println("Primero ingrese los datos (opción 1).");
                    } else {
                        System.out.println("La mediana es: " + calcularMediana());
                    }
                }
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 5);
    }

    public static void ingresarDatos() {
        System.out.print("Ingrese la cantidad de datos: ");
        int cantidad = sc.nextInt();
        datos = new double[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el dato " + (i + 1) + ": ");
            datos[i] = sc.nextDouble();
        }
        System.out.println("Datos almacenados correctamente: " + Arrays.toString(datos));

    }

    public static double calcularMedia() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }

    public static double mediaArmonica() {
        // CALCULAR LA MEDIA ARMONICA
        double sumaInversa = 0;
        for (double num : datos) {
            if(num == 0){
                System.out.println("Error: No se puede calcular la media armónica con valores 0.");
                return 0;
            }
            sumaInversa += 1 / num;
        }
        return  datos.length / sumaInversa ;
    }

    public static double calcularMediana() {
        // Calcula la mediana
        // Ordenamos la lista
        Arrays.sort(datos);
        int longitud = datos.length;
        if (longitud % 2 == 1) {
            return datos[longitud / 2];
        } else {
            return (datos[longitud / 2 - 1] + datos[longitud / 2]) / 2;
        }
    }
}

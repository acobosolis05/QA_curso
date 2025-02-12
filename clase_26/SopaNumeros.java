package clase_26;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class SopaNumeros {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = leerValores();
        // Mostrar valores ingresados
        // System.out.println("Valores ingresados: " + listaNumeros);
        // Calcular suma y promedio
        int suma = calcularSuma(listaNumeros);
        double promedio = calcularPromedio(listaNumeros);
        // Mostrar resultados
        // System.out.println("Suma total: " + suma);
        // System.out.println("Promedio: " + promedio);
        // Mostrar resultados finales
        mostrarResultados(listaNumeros, suma, promedio);

        // Eliminar todas las ocurrencias de un valor
        System.out.print("\nIngrese el valor que desea eliminar de la lista: ");
        int valorAEliminar = sc.nextInt();

        if (listaNumeros.contains(valorAEliminar)) {
            ArrayList<Integer> listaActualizada = eliminarValor(listaNumeros, valorAEliminar);
            System.out.println("Lista después de eliminar todas las ocurrencias del valor " + valorAEliminar + ": " + listaActualizada);
        } else {
            System.out.println("El valor " + valorAEliminar + " no se encuentra en la lista.");
        }


        sc.close();
    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        while (true) {
            try {
                System.out.print("\nIngrese un valor (-99 para terminar): ");
                int valor = sc.nextInt();

                if (valor == -99) {
                    System.out.println("Fin del ingreso de valores.");
                    break; // Salir del bucle si el usuario ingresa -99
                }

                listaNumeros.add(valor);
                System.out.println("Valor agregado a la lista.");

                // Preguntar si desea ingresar otro valor
                System.out.print("¿Desea ingresar otro valor? (Sí = 1 / No = 0): ");
                int respuesta = sc.nextInt();

                if (respuesta == 0) {
                    System.out.println("Finalizando ingreso de valores.");
                    break; // Salir si el usuario no quiere agregar más números
                }

            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingrese solo números.");
                sc.nextLine(); // Limpiar el buffer para evitar bucles infinitos
            }
        }

        return listaNumeros;
    }

    public static int calcularSuma(ArrayList<Integer> listaNumeros) {
        int suma = 0;
        Iterator<Integer> it = listaNumeros.iterator();// Iterador para recorrer la lista
        while (it.hasNext()) {
            suma += it.next();
        }
        return suma;
    }

    public static double calcularPromedio(ArrayList<Integer> listaNumeros) {
        int suma = calcularSuma(listaNumeros);
        int cantidad = listaNumeros.size();
        return (double) suma / cantidad;

    }

    public static ArrayList<Integer> eliminarValor(ArrayList<Integer> listaNumeros, int valor) {
        Iterator<Integer> it = listaNumeros.iterator();
        while (it.hasNext()) {
            if (it.next() == valor) {
                it.remove();
            }
        }
        return listaNumeros;
    }

    public static void mostrarResultados(ArrayList<Integer> listaNumeros, int suma, double promedio) {
        int mayores = 0;
        for (int num : listaNumeros) {
            if (num > promedio) {
                mayores++;
            }
        }
        System.out.println("\nResultados:");
        System.out.println("Lista de números: " + listaNumeros);
        System.out.println("Suma de los números: " + suma);
        System.out.println("Promedio de los números: " + promedio);
        System.out.println("Números mayores al promedio: " + mayores);
    }
}

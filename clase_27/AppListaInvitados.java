// Desarrollar una aplicación en Java que permita gestionar una lista de invitados para una fiesta, asegurando que los nombres no se repitan y ofreciendo opciones
//  para agregar, eliminar y visualizar invitados de manera eficiente.

import java.util.Scanner;

import models.RegistroDeInvitados;

public class AppListaInvitados {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        int opcion;
        do {
            System.out.println("\n REGISTRO INVITADOS");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.print("\nIngrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // para leer el salto de línea
            switch (opcion) {
                case 1 -> {
                    do{
                    System.out.print("Ingrese el nombre del invitado: ");
                    String nombre = formatoTitulo(sc.nextLine());
                    registro.agregarInvitado(nombre);
                    System.out.println("Invitado agregado con éxito");
                    System.out.print("Desea agregar otro invitado S/N: ");
                    } while(sc.nextLine().equalsIgnoreCase("S"));
                    
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del invitado a eliminar: ");
                    String nombre = sc.nextLine();
                    registro.eliminarInvitado(nombre);
                    
                }
                case 3 -> {
                    registro.mostrarInvitados();
                }
                case 4 -> {
                    System.out.println("Hasta luego!");
                }

                default ->
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);
    }
    // Asegurar uniformidad en los nombres ingresados: Para evitar que variaciones en mayúsculas/minúsculas generen duplicados, implementa un método interno que normalice los nombres al formato deseado
    // (por ejemplo, convirtiéndolos a minúsculas o ajustándolos a Title Case).
    private static String formatoTitulo(String nombre) {
        return nombre.substring(0, 1).toUpperCase() +
        nombre.substring(1).toLowerCase();
        }
}



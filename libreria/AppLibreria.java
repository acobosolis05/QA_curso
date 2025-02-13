// Crea el programa principal: Diseña un menú interactivo que permita al usuario realizar las siguientes acciones:

// Agregar libros: Solicita el título, autor y número de ISBN y llama al método agregarLibro.

// Eliminar libros: Solicita el número de ISBN y llama al método eliminarLibro.

// Mostrar catálogo: Muestra los libros actuales del catálogo utilizando el método mostrarCatalogo.

import java.util.Scanner;

import models.Libreria;
import models.Libro;

public class AppLibreria {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        while (true) {
            System.out.println("\nMenú principal");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("\nIngrese su opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); // Consume el salto de línea
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.print("Ingrese el título del libro: ");
                        String titulo = formatoTitulo(sc.nextLine());
                        System.out.print("Ingrese el autor del libro: ");
                        String autor = formatoAutor(sc.nextLine());
                        System.out.print("Ingrese el número de ISBN del libro: ");
                        String isbn = formatoIsbn(sc.nextLine());
                        libreria.agregarLibro(new Libro(titulo, autor, isbn));
                        System.out.print("¿Desea agregar otro libro? (s/n): ");
                    } while (sc.nextLine().equalsIgnoreCase("s"));
                }
                case 2 -> {
                    System.out.print("Ingrese el número de ISBN del libro a eliminar: ");
                    String isbn = formatoIsbn(sc.nextLine());
                    libreria.eliminarLibro(isbn);
                }
                case 3 -> {
                    libreria.mostrarCatalogo();
                }
                case 4 -> {
                    System.out.println("¡Hasta luego!");
                }
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo");
            }

        }
    }

    public static String formatoTitulo(String titulo) {
        return titulo.substring(0, 1).toUpperCase() + titulo.substring(1).toLowerCase();
    }

    public static String formatoAutor(String autor) {
        return autor.substring(0, 1).toUpperCase() + autor.substring(1).toLowerCase();
    }

    public static String formatoIsbn(String isbn) {
        return isbn.substring(0).toUpperCase();
    }
}
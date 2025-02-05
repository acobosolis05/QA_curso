package clase_23POO3;


import java.util.Scanner;

import clase_23POO3.modelos.Libro;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear un libro
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        // Crear la instancia de Libro
        Libro nuevoLibro = new Libro(titulo, autor);

        // Solicitar el número de páginas (multiplicado por 7)
        System.out.print("Ingrese el número base de páginas (para multiplicar por 7): ");
        Integer basePaginas = scanner.nextInt();
        nuevoLibro.establecerPaginas(basePaginas);

        // Agregar el libro al arreglo estático en la clase Libro
        Libro.agregarLibro(nuevoLibro);

        // Imprimir los detalles de todos los libros
        Libro.imprimirDetalles();
        scanner.close();
    }
}

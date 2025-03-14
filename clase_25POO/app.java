package clase_25POO;

import java.util.Scanner;

// import clase_25POO.Biblioteca;
// import clase_25POO.Libro;

public class app {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", 10); // Biblioteca con 10 espacios
        
        int opcion;
        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese título del libro: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ingrese año de publicación: ");
                    int anio = sc.nextInt();
                    System.out.print("Ingrese cantidad de ejemplares: ");
                    int cantidad = sc.nextInt();

                    Libro nuevoLibro = new Libro(titulo, autor, anio, cantidad);
                    biblioteca.agregarLibro(nuevoLibro);
                }
                case 2 -> {
                    System.out.println("\nLibros disponibles:");
                    biblioteca.mostrarLibros();
                }
                case 3 -> {
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String titulo = sc.nextLine();
                    biblioteca.prestarLibro(titulo);
                }
                case 4 -> {
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String titulo = sc.nextLine();
                    biblioteca.devolverLibro(titulo);
                }
                case 5 -> System.out.println("\nGracias por utilizar la biblioteca.");
                default -> System.out.println("Opción no válida");
            }
        } while (opcion != 5);
    }
}

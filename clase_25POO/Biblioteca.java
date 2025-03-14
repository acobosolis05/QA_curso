package clase_25POO;



public class Biblioteca {
    // private String nombre;
    private Libro[] libros;
    private int cantidadLibros;

    public Biblioteca(String nombre, int capacidad) {
        // this.nombre = nombre;
        this.libros = new Libro[capacidad];
        this.cantidadLibros = 0;
    }

    public void agregarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            for (int i = 0; i < cantidadLibros; i++) {
                if (libros[i].getTitulo().equalsIgnoreCase(libro.getTitulo()) &&
                    libros[i].getAutor().equalsIgnoreCase(libro.getAutor())) {
                    System.out.println("El libro ya existe en la biblioteca.");
                    return;
                }
            }
            libros[cantidadLibros] = libro;
            cantidadLibros++;
            System.out.println("Libro agregado con éxito.");
        } else {
            System.out.println("No hay espacio disponible.");
        }
    }

    public void mostrarLibros() {
        if (cantidadLibros == 0) {
            System.out.println("No hay libros disponibles.");
            return;
        }
        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println(libros[i].getTitulo() + " - " +
                            libros[i].getCantidadEjemplares() + " ejemplares - " +
                            libros[i].getAutor());
        }
    }

    public void prestarLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo) && libros[i].getCantidadEjemplares() > 0) {
                libros[i].setCantidadEjemplares(libros[i].getCantidadEjemplares() - 1);
                System.out.println("Libro prestado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró el libro o no hay ejemplares disponibles.");
    }

    public void devolverLibro(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                libros[i].setCantidadEjemplares(libros[i].getCantidadEjemplares() + 1);
                System.out.println("Libro devuelto con éxito.");
                return;
            }
        }
        System.out.println("No se encontró el libro.");
    }
}

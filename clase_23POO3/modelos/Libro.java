package clase_23POO3.modelos;
// La clase "Libro" debe tener tres atributos privados: "titulo", "autor" y "paginas".

// Debes proporcionar métodos públicos para establecer y obtener el título y el autor.

// Crea un método para establecer el número de páginas, teniendo en cuenta que este número surge del cálculo entre un número ingresado por el usuario multiplicado por 7. Ej: Si el usuario ingresa 20, la cantidad de páginas que tendrá ese libro es 140 (7*20).

// Además, la clase debe tener un método público llamado "imprimirDetalles" que imprime por consola todos los detalles del libro, incluyendo el título, el autor y el número de páginas.

// Almacena cada instancia creada  de Libro en un array.


public class Libro {
    private String titulo;
    private String autor;
    private Integer paginas;
    private static Libro[] libros = new Libro[0];
    public Libro() {
        }
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    
        
        }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }


    public void establecerPaginas(Integer numPaginas) {
        this.paginas = numPaginas * 7; // Multiplica el número ingresado por 7
    }

    public static Libro[] getLibros() {
        return libros;
    }

    public static void setLibros(Libro[] libros) {
        Libro.libros = libros;
    }

    public static void agregarLibro(Libro libro) {
        Libro[] librosNuevos = new Libro[libros.length + 1];
        System.arraycopy(libros, 0, librosNuevos, 0, libros.length);
        librosNuevos[librosNuevos.length - 1] = libro;
        libros = librosNuevos;
    }

    public static void imprimirDetalles() {
        for (Libro libro : libros) {
            System.out.println("Titulo: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Paginas: " + libro.getPaginas());
            System.out.println(" ");
        }
        }
    
}

package clase_25POO;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadEjemplares;

    public Libro(String titulo, String autor, int anioPublicacion, int cantidadEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.cantidadEjemplares = cantidadEjemplares;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anioPublicacion + ") - Ejemplares: " + cantidadEjemplares;
    }
}


package models;

import java.util.HashSet;


public class Libreria {
    private HashSet<Libro> catalogo = new HashSet<>();

    public Libreria() {
        this.catalogo = new HashSet<>();
    }

    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }
    public void eliminarLibro(String isbn){
        if(catalogo.removeIf(libro -> libro.getIsbn().equals(isbn))){
            System.out.println("El libro con ISBN " + isbn + " ha sido eliminado del catalogo");
        }else{
            System.out.println("No se encontró el libro con ISBN " + isbn);
        }
        }

    public void mostrarCatalogo(){
        for (Libro libro : catalogo) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " +
            libro.getAutor() + ", ISBN: " + libro.getIsbn());
            }
            }
}

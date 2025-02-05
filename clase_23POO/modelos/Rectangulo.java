package clase_23POO.modelos;
// Define dos atributos privados: ancho y alto. Pueden ser números decimales o enteros.

// Diseña dos constructores:

// Uno que reciba todos los parámetros para inicializar los atributos.

// Otro sin parámetros (constructor por defecto).

// Implementa los métodos getter y setter para acceder y modificar los atributos de forma controlada.

//  Crea los siguientes métodos:

// area(): Calcula y devuelve el área del rectángulo.

// perimetro(): Calcula y devuelve el perímetro del rectángulo.

// imprimirDatos(): Muestra en consola los atributos, el área y el perímetro del rectángulo.

public class Rectangulo {
    private Double alto;
    private Double ancho;

    public Rectangulo() {
    }

    public Rectangulo(Double alto, Double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double area() {
        return alto * ancho;
    }

    public Double perimetro() {
        return 2 * (alto + ancho);
    }

    public void imprimirDatos() {
        System.out.println("Alto: " + alto + " Ancho: " + ancho
                + "\n Área: " + area() + " \n Perímetro: " + perimetro());
    }

}

package clase_23POO.modelos;
// En la misma carpeta modelos, crea una clase llamada Triangulo.



// Define los atributos necesarios para calcular su área (por ejemplo, base y altura).

// Usa modificadores de acceso privados para proteger los atributos y crea sus respectivos getters y setters.

// Implementa los métodos:

// area(): Calcula y devuelve el área del triángulo.

// imprimirDatos(): Muestra en consola los atributos y el área del triángulo.
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(Double base, Double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public Double area() {
        return (base * altura) / 2;
    }

    public Double perimetro() {
        double lado = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return base + (2 * lado);
    }

    public void imprimirDatos() {
        System.out.println("Base: " + base + " Altura: " + altura
                + "\n Área: " + area() + "\n Perímetro: " + perimetro());
    }

    
}

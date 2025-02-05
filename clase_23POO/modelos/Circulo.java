package clase_23POO.modelos;
// Crea una clase llamada Circulo en la carpeta modelos.

// Define los atributos necesarios para calcular su área y perímetro (por ejemplo, radio).

// Asegúrate de usar modificadores de acceso privados y de implementar getters y setters.

// Desarrolla los métodos:

// area(): Calcula y devuelve el área del círculo.

// perimetro(): Calcula y devuelve el perímetro del círculo.

// imprimirDatos(): Muestra en consola el radio, el área y el perímetro del círculo.
public class Circulo {
    private double radio;
    
    public Circulo() {
    }

    public Circulo(Double radio){
        this.radio = radio;
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    // Método para calcular el área
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro (circunferencia)
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
    public void imprimirDatos() {
        System.out.println("Radio: " + radio
                + " \n Área: " + area() + " \n Perímetro: " + perimetro());
    }
    
}

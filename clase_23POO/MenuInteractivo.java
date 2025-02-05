package clase_23POO;

import java.util.Scanner;
// Crea un menú en el que el usuario pueda:

import clase_23POO.modelos.Circulo;
import clase_23POO.modelos.Rectangulo;
import clase_23POO.modelos.Triangulo;

// Seleccionar una figura geométrica (rectángulo, triángulo o círculo).

// Ingresar los datos necesarios para la figura seleccionada.

// Visualizar en consola los datos y cálculos correspondientes a la figura creada.
public class MenuInteractivo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("Menú interactivo de figuras geométricas");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> manejarRectangulo();
                case 2 -> manejarTriangulo();
                case 3 -> manejarCirculo();
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida");
                }
                } while (opcion != 4);
                }

    // Método para manejar Cuadrado
    public static void manejarRectangulo() {
        System.out.print("Ingrese el alto del rectangulo: ");
        double alto = sc.nextDouble();
        System.out.print("Ingrese el ancho del rectangulo: ");
        double ancho = sc.nextDouble();

        Rectangulo rectangulo = new Rectangulo(alto, ancho);
        rectangulo.imprimirDatos();;
    }

    // Método para manejar Triángulo
    public static void manejarTriangulo() {
        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.imprimirDatos();
    }

    // Método para manejar Círculo
    public static void manejarCirculo() {
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        Circulo circulo = new Circulo(radio);
        circulo.imprimirDatos();
    }
}

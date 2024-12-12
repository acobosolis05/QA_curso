package clase_4;

import java.util.Scanner;

public class areaPerimetro {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("MENÚ");
        System.out.println("1. Círculo");
        System.out.println("2. Rectangulo");
        System.out.print("por favor seleccione la figura geormetrica: ");
        String figura = sc.nextLine();
        

        switch (figura) {
            case "1":
            System.out.println("la figura seleccionada es el circulo");
            System.out.print("por favor ingrese el radio del círculo: ");
            double radio = sc.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            double perimetro = 2 * Math.PI * radio;
            System.out.println("el area del círculo es: " + area + " y el perimetro es: " + perimetro);
            break;
            case "2":
            System.out.println("la figura seleccionada es el rectangulo");
            System.out.print("por favor ingrese la base del rectangulo: ");
            double base = sc.nextDouble();
            System.out.print("por favor ingrese la altura del rectangulo: ");
            double altura = sc.nextDouble();
            double areaRectangulo = base * altura;
            double perimetroRectangulo = 2 * (base + altura);
            System.out.println("el area del rectangulo es: " + areaRectangulo + " y el perimetro es: " + perimetroRectangulo);
            break;
        
        
            default:
            System.out.println("la figura seleccionada no es válida");
                break;
        }

    sc.close();
}
}


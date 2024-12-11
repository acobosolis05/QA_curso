// Mediante una estructura switch, desarrollarás un programa que pida al usuario ingresar un 
// número del 1 al 3 para seleccionar una figura geométrica: 1 para círculo, 2 para cuadrado y 3
//  para triángulo. Después, solicitará al usuario los datos necesarios para calcular el área 
//  de la figura seleccionada. Estos datos serán:
// Para el círculo: el radio.
// Para el cuadrado: el lado.
// Para el triángulo: la base y la altura.
// Finalmente, el programa mostrará en pantalla el área correspondiente a la figura seleccionada.


package clase_4;

import java.util.Scanner;

public class figuraGeometrica {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        System.out.println("MENÚ");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");
        System.out.print("por favor seleccione la figura geormetrica: ");
        int figura = sc.nextInt();
        

        switch (figura) {
            case 1:
            System.out.println("la figura seleccionada es el circulo");
            System.out.print("por favor ingrese el radio del círculo: ");
                double radio = sc.nextDouble();
                double area = Math.PI * Math.pow(radio, 2);
                System.out.println("el área del círculo es: " + area);
            break;
            case 2:
            System.out.println("la figura seleccionada es el cuadrado");
            System.out.print("por favor ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                double areaCuadrado = Math.pow(lado, 2);
                System.out.println("el área del cuadrado es: " + areaCuadrado);
            break;
            case 3:
            System.out.println("la figura seleccionada es el triángulo");
            System.out.print("por favor ingrese la base del triángulo: ");
                double base = sc.nextDouble();
            System.out.print("por favor ingrese la altura del triángulo: ");
                double altura = sc.nextDouble();
                double areaTriangulo = (base * altura) / 2;
            System.out.println("el área del triángulo es: " + areaTriangulo);
            break;
        
            default:
            System.out.println("la figura seleccionada no es válida");
                break;
        }

    sc.close();
}
}
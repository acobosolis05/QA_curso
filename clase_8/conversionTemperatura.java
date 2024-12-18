package clase_8;
// Escribe un programa que cumpla con las siguientes condiciones:

import java.util.Scanner;

// 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).

// 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
public class conversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversión de unidades");
        System.out.println("1. Celsius (C)");
        System.out.println("2. Fahrenheit (F)");
        System.out.print("Ingrese la opción: ");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit + " F");
            break;
            case "2":
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit2 = sc.nextDouble();
            double celsius2 = (fahrenheit2 - 32) * 5 / 9;
            System.out.println("La temperatura en Celsius es: " + celsius2 +" C");
            break;
        
            default:
            System.out.println("Opción no válida");
                break;
        }
        sc.close();
    }
    
}

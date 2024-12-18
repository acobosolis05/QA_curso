package clase_8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class conversionTem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversión de unidades");
        try {
            System.out.print("Ingrese la temperatura: ");
            double temperatura = sc.nextDouble();
            System.out.print("Ingrese la unidad de medida (C/F): ");
            String unidad = sc.next();
            if (unidad.equalsIgnoreCase("C")) {
                double fahrenheit = (temperatura * 9 / 5) + 32;
                System.out.println(temperatura + " grados Celsius equivale a " + fahrenheit + " Fahrenheit");
            } else if (unidad.equalsIgnoreCase("F")) {
                double celsius = (temperatura - 32) * 5 / 9;
                System.out.println(temperatura + " grados Fahrenheit equivale a " + celsius + " Celsius");
            } else {
                System.out.println("Unidad de medida no válida, Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error por favor ingrese una temperatura númerica");
        }
        sc.close();
    }
}
//System.out.println((temp + "° Farenherit equivale a: " + result + "° Celcius").format("%.2f", result));
//System.out.println(String.format("%.2f", number));
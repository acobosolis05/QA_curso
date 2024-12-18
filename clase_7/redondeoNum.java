package clase_7;
import java.util.Locale;
// Escribe un programa que pida al usuario un número decimal y 
// muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
import java.util.Scanner;

public class redondeoNum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        double num = sc.nextDouble();
        System.out.println("El valor redondeado es: " + Math.round(num));
        
        sc.close();
}
}
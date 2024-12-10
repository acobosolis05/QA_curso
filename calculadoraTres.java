import java.util.Locale;
import java.util.Scanner;

public class calculadoraTres {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner dato = new Scanner(System.in);
        System.out.println("Calculadora");
        
        // Mostrar el menú
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Ingrese el número de la opción: ");
        
        int opcion = dato.nextInt();
        
        // Pedir números
        System.out.print("Ingrese un número: ");
        float num1 = dato.nextFloat();
        System.out.print("Ingrese un segundo número: ");
        float num2 = dato.nextFloat();

        // Usar String.format para limitar los decimales
        String resultado = (opcion == 1) ? "La suma es: " + String.format("%.2f", (num1 + num2)) :
                        (opcion == 2) ? "La resta es: " + String.format("%.2f", (num1 - num2)) :
                        (opcion == 3) ? "La multiplicación es: " + String.format("%.2f", (num1 * num2)) :
                        (opcion == 4) ? 
                        (num2 != 0 ? "La división es: " + String.format("%.2f", (num1 / num2)) : "Error: División por cero no permitida.") :
                        "Opción inválida.";

        // Mostrar el resultado
        System.out.println(resultado);

        // Cerrar el Scanner
        dato.close();
    }
}

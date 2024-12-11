import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.println("calculadora");
        
        System.out.println("seleccione una opción: ");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.division");
        System.out.print("Ingrese el número de la opción: ");
        
        int opcion = dato.nextInt();
        
        
        System.out.print("Ingrese un número: ");
        int num1 = dato.nextInt();
        
        
        System.out.print("Ingrese un segundo numero: ");
        int num2 = dato.nextInt();

        String resultado =(opcion == 1) ? "La suma es: " + (num1+ num2) :
                        (opcion == 2) ? "La resta es: " + (num1 - num2) :
                        (opcion == 3) ? "La multiplicación es: " + (num1 * num2) :
                        (opcion == 4) ? 
                        (num2 != 0 ? "La división es: " + (num1 / num2) : "Error: División por cero no permitida.") :
        "Opción inválida.";


        System.out.println(resultado);

        dato.close(); // Cerrar el Scanner
                        


    }
}

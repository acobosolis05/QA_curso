import java.util.Scanner;

public class MiSegundaClase {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = pepe.nextInt();
        pepe.nextLine();

        System.out.print("Ingrese un nombre: ");
        String nombre = pepe.nextLine();

        System.out.println("la persona: " + nombre + " ingreso el numero: " + numero);
        
    
    }
}
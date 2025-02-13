import java.util.Scanner;


public class capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int original = num;  // Guardamos el número original para la comparación
        int reverso = 0;
        
        while (num > 0) {
            int digito = num % 10;  // Extrae el último dígito
            reverso = reverso * 10 + digito;  // Construye el número invertido
            num /= 10;  // Reduce el número
        }

        if (original == reverso) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }

        sc.close();
    }
}

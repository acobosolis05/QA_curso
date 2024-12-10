
import java.util.Scanner;

public class clasificacionNumeros {
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);

        System.out.print("por favor ingrese un numero: ");

        double numero = dato.nextDouble();

        if (numero > 0)  {
            System.out.println("el numero es positvo");
            
            } 
            else if (numero < 0) {
                System.out.println("el numero es negativo");
            
            } else {

                System.out.println("el numero es igual a cero");
            }
        dato.close();
            }

}

package clase_19;

import java.util.Locale;
import java.util.Scanner;

public class metodoAdivinarNumero {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero = numeroAleatorio();
        adivinarNumero(numero);
        
        
    }  

    public static int numeroAleatorio(){
        return (int) (Math.random() * (20-1+1) + 1);

    }
    public static void adivinarNumero(int numero){
        int numero2;
        int intentos = 0;
        do {
            System.out.print("Adivina un número entre 1 y 20: ");
            numero2 = sc.nextInt();
            intentos++;
            if (numero2 == numero) {
                System.out.println("¡Lo has adivinado! has necesitado " + intentos +" intentos");
                } else if (numero2 < numero) {
                    System.out.println("El número que has introducido es menor que el número aleatorio");
                } else if (numero2 > numero) {
                    System.out.println("El número que has introducido es mayor que el número aleatorio");
                    }
        }while (numero2 != numero);
    }
}

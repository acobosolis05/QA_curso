import java.util.Scanner;

public class MiterceraClase {
    public static void main(String[] args) {
        // System.out.println("suma 5 + 5 = " +(5+5));
        // System.out.println("resta 5 - 5 = " +(5-5));
        // System.out.println("modulo 7 % 5 =" +(7%5));
        // System.out.println("division 7 / 5 =" +(7f/5f));
        Scanner pepe = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        float numero1 = pepe.nextFloat();


        System.out.print("Ingrese un segundo numero: ");
        float numero2 = pepe.nextFloat();

        System.out.println("la suma " + numero1 + " + "+ numero2 + " = " +(numero1+numero2) );
        System.out.println("la resta " + numero1 + " - "+ numero2 + " = " +(numero1-numero2) );
        System.out.println("la multiplicacion " + numero1 + " * "+ numero2 + " = " +(numero1*numero2) );
        System.out.println("la divison " + numero1 + " / "+ numero2 + " = " +(numero1/numero2));
        System.out.println("el modulo de la divison " + numero1 + " % "+ numero2 + " = " +(numero1%numero2));


    
    }
}
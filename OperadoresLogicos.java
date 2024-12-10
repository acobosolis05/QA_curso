import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero1 = pepe.nextInt();

        System.out.print("Ingrese un segundo numero: ");
        int numero2 = pepe.nextInt();

        //operadores de comparacion
        System.out.println("OPERADORES DE COMPARACION");
        System.out.println("si " + numero1 + " == "+ numero2 + " entonces " +(numero1==numero2));
        System.out.println("si " + numero1 + " != "+ numero2 + " entonces " +(numero1!=numero2));
        System.out.println("si " + numero1 + " > "+ numero2 + " entonces " +(numero1 > numero2));
        System.out.println("si " + numero1 + " < "+ numero2 + " entonces " +(numero1<numero2));
        System.out.println("si " + numero1 + " >= "+ numero2 + " entonces " +(numero1>=numero2));
        System.out.println("si " + numero1 + " <= "+ numero2 + " entonces " +(numero1<=numero2));
        System.out.println("si el numero " + numero1 + " es divisible por 2 entonces " +(numero1%2==0));



        //operadores logicos 

        System.out.println("OPERADORES LOGICOS");
        System.out.println("si " + numero1 + " <= "+ numero2 + " && " + numero1 + " < "+ numero2 + " entonces "+(numero1<=numero2 && numero1<numero2));
        System.out.println("si " + numero1 + " <= "+ numero2 + " || " + numero1 + " < "+ numero2 + " entonces "+(numero1<=numero2 || numero1<numero2));
        
        
        System.out.print("Ingrese un tercer numero: ");
        int numero3 = pepe.nextInt();
        System.out.print("Ingrese un cuarto numero: ");
        int numero4 = pepe.nextInt();
        
        System.out.println("si " + numero1 + " > "+ numero2 + " && " + numero3 + " > "+ numero4 + " entonces "+(numero1>numero2 && numero3>numero4));
        System.out.println("si " + numero1 + " > "+ numero2 + " || " + numero3 + " > "+ numero4 + " entonces "+(numero1>numero2 || numero3>numero4));
        


    }
}
    


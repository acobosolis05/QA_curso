package clase_19;

import java.util.Scanner;

public class metodoEspar {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int numero = solicitarNumero();
        boolean resultado = esPar(numero);
        System.out.println("El número " + numero + " - par: " + resultado);
        sc.close();

    }

    public static int solicitarNumero() {
        try {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            return numero;
        } catch (Exception e) {
            System.out.println("Error, debe ingresar un numero entero");
            return solicitarNumero();
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
}
}
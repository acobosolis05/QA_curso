package clase_19;

import java.util.Scanner;

public class ejercicio {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Integer numero = solicitarNumero();
        boolean resultado = esPar(numero);
        imprimirMensaje(resultado);
        sc.close();

    }

    public static int solicitarNumero() {

        try {
            System.out.println("Por favor ingrese un número:");
            int numero1 = sc.nextInt();
            return numero1;
        } catch (Exception e) {
            sc.nextLine();
            System.out.println("No ingresó un número, intente nuevamente:");
            return solicitarNumero();
        }

    }

    public static boolean esPar(int numero2) {
        return numero2 % 2 == 0;

    }

    public static void imprimirMensaje(boolean resultado) {

        if (resultado) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

    }
}

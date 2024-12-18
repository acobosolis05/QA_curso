package clase_7;

import java.util.Locale;
import java.util.Scanner;
// Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango 
// del 1 al 355  utilizando el método random() de la clase Math. 
// Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
public class GenerarAleatorios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) Math.floor(Math.random() * (355-1+1))+1;
        System.out.println("El número aleatorio es: " + aleatorio);

        sc.close();
}
}
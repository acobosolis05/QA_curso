package clase_4;

import java.util.Scanner;

public class conversionCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese la calificación de 1 a 5: ");
        String calificacion = sc.nextLine();

        switch (calificacion) {
            case "1" -> System.out.println("su calificaciones es: " + calificacion + " en letras muy deficiente");
            case "2" -> System.out.println("deficiente");
            case "3" -> System.out.println("suficiente");
            case "4" -> System.out.println("notable");
            case "5" -> System.out.println("sobresaliente");
            default -> System.out.println("calificación fuera de rango");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class Calificacion {
    public static Scanner lecturaDato = new Scanner(System.in);

    public static void main(String[] args) {
        Integer puntuacionIngresada = obtenerPuntuacion();
        System.out.println(mensajePuntuacion(puntuacionIngresada));
        lecturaDato.close();
    }

    public static Integer obtenerPuntuacion() {
        while (true) {
            System.out.println("Ingrese una puntuación para calificar:");
            try {
                return Integer.parseInt(lecturaDato.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número entero.");
            }
        }
    }

    public static String mensajePuntuacion(Integer puntuacionIngresada) {
        return "La clasificación correspondiente a la puntuación " + puntuacionIngresada +
                " corresponde a la letra " + obtenerNota(puntuacionIngresada);
    }

    public static String obtenerNota(Integer puntuacionIngresada) {
        return switch (puntuacionIngresada) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> "A";
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> "B";
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> "C";
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> "D";
            default -> {
                if (puntuacionIngresada < 0 || puntuacionIngresada > 100) {
                    yield ": Error - El número ingresado está fuera del rango válido.";
                } else {
                    yield "F";
                }
            }
        };
}

}

package clase_14;
import java.util.Random;
// Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. 
// Estas calificaciones se almacenarán en un arreglo de Strings.
// Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, 
// separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). 
// Necesitarás convertir los String a double para lograrlo.

// Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

// Por último, imprimiré los resultados en consola.
public class ejercicio {
    public static void main(String[] args) {
        String[] calificaciones = new String[10];
        Random random = new Random();
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(random.nextInt(10) + 1);
        }
        System.out.println("Arreglo original de calificaciones: " + java.util.Arrays.toString(calificaciones));
        // convertir
        int contAprobado = 0, contDesaprobado = 0, contExcelente = 0;
        double[] numero = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            numero[i] = Double.parseDouble(calificaciones[i]);
            if (numero[i] < 4) {
                contDesaprobado++;
            } else if (numero[i] < 10) {
                contAprobado++;
            } else {
                contExcelente++;
            }
        }
        double[] desaprobado = new double[contDesaprobado];
        double[] aprobado = new double[contAprobado];
        double[] excelente = new double[contExcelente];
        contAprobado = 0;
        contDesaprobado = 0;
        contExcelente = 0;
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < 4) {
                desaprobado[contDesaprobado] = numero[i];
                contDesaprobado++;
            } else if (numero[i] < 10) {
                aprobado[contAprobado] = numero[i];
                contAprobado++;
            } else {
                excelente[contExcelente] = numero[i];
                contExcelente++;
            }
        }
        System.out.println("desaprobado" + java.util.Arrays.toString(desaprobado));
        System.out.println("aprobado" + java.util.Arrays.toString(aprobado));
        System.out.println("excelente" + java.util.Arrays.toString(excelente));

        double promOriginal = 0, promDesaprobado = 0, promAprobado = 0, promExcelente = 0;
        for (int i = 0; i < numero.length; i++) {
            promOriginal = promOriginal + numero[i];
        }
        promOriginal = promOriginal / numero.length;

        for (int i = 0; i < contDesaprobado; i++) {
            promDesaprobado += desaprobado[i];
        }
        promDesaprobado /= contDesaprobado;

        for (int i = 0; i < contAprobado; i++) {
            promAprobado += aprobado[i];
        }
        promAprobado /= contAprobado;

        for (int i = 0; i < contExcelente; i++) {
            promExcelente += excelente[i];
        }
        promExcelente /= contExcelente;
        // Imprimir resultados en consola
        System.out.println("Promedio de calificaciones originales: " + promOriginal);
        System.out.println("Promedio de calificaciones desaprobadas: " + promDesaprobado);
        System.out.println("Promedio de calificaciones aprobadas: " + promAprobado);
        System.out.println("Promedio de calificaciones excelente: " + promExcelente);
    }
}

package clase_14;


import java.util.Random;
// Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. 

// Estas calificaciones se almacenarán en un arreglo de Strings.
// Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, 
// separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10). 
// Necesitarás convertir los String a double para lograrlo.

// Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.

// Por último, imprimiré los resultados en consola.
public class estadisticaCalificaciones {
    public static void main(String[] args) {
        // Generar un arreglo de calificaciones de manera aleatoria
        String[] calificaciones = new String[10];
        Random random = new Random();
        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(random.nextInt(10) + 1);
        }
        System.out.println("Arreglo original de calificaciones: " + java.util.Arrays.toString(calificaciones));
        // Convertir calificaciones de String a double
        double[] calificacionesNumericas = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            calificacionesNumericas[i] = Double.parseDouble(calificaciones[i]);
        }
        // Separar calificaciones en desaprobado, aprobado y excelente
        double[] desaprobado = new double[calificaciones.length];
        double[] aprobado = new double[calificaciones.length];
        double[] excelente = new double[calificaciones.length];

        int desaprobadoCount = 0, aprobadoCount = 0, excelenteCount = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            if (calificacionesNumericas[i] < 4) {
                desaprobado[desaprobadoCount++] = calificacionesNumericas[i];
            } else if (calificacionesNumericas[i] >= 4 && calificacionesNumericas[i] < 10) {
                aprobado[aprobadoCount++] = calificacionesNumericas[i];
            } else {
                excelente[excelenteCount++] = calificacionesNumericas[i];
            }
        }
        // Calcular promedio de cada arreglo
        double promedioOriginal = 0, promedioDesaprobado = 0, promedioAprobado = 0, promedioExcelente = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            promedioOriginal += calificacionesNumericas[i];
        }
        promedioOriginal /= calificaciones.length;
        
        for (int i = 0; i < desaprobadoCount; i++) {
            promedioDesaprobado += desaprobado[i];
        }
        promedioDesaprobado /= desaprobadoCount;

        for (int i = 0; i < aprobadoCount; i++) {
            promedioAprobado += aprobado[i];
        }
        promedioAprobado /= aprobadoCount;
        for (int i = 0; i < excelenteCount; i++) {
            promedioExcelente += excelente[i];
        }
        promedioExcelente /= excelenteCount;
        // Imprimir resultados en consola
        System.out.println("Promedio de calificaciones originales: " + promedioOriginal);
        System.out.println("Promedio de calificaciones desaprobadas: " + promedioDesaprobado);
        System.out.println("Promedio de calificaciones aprobadas: " + promedioAprobado);
        System.out.println("Promedio de calificaciones excelente: " + promedioExcelente);

    }

}

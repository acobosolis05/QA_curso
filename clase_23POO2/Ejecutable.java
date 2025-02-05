package clase_23POO2;

import clase_23POO2.modelos.Punto;

public class Ejecutable {
    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        Punto p3 = new Punto(7, 10);
        // Calcular y mostrar la distancia de p2 desde el origen
        System.out.println("Distancia de p2 desde el origen: " + p2.distanciaDesdeOrigen());

        // Calcular y mostrar la distancia entre p1 y p2
        System.out.println("Distancia entre p1 y p2: " + Punto.calcularDistancia(p1, p2));

        // Verificar si tres puntos están alineados
        if (Punto.estanAlineados(p1, p2, p3)) {
            System.out.println("Los puntos p1, p2 y p3 están alineados.");
        } else {
            System.out.println("Los puntos p1, p2 y p3 NO están alineados.");
        }
    }
}

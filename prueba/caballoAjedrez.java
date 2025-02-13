// Escribe un programa que verifique si un caballo en ajedrez puede moverse de una casilla (x1, y1) a otra (x2, y2) en un solo movimiento. Recuerda que el caballo se mueve en forma de "L":
// 	• Dos casillas en una dirección (horizontal o vertical) y una casilla en la otra.
// Ejemplo:
// 	• Entrada: (1,1) -> (2,3)
// 	• Salida: "Movimiento válido"
// 	• Entrada: (1,1) -> (3,3)
// 	• Salida: "Movimiento inválido"

import java.util.Scanner;

public class caballoAjedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Introduce la coordenada x de la casilla de partida: ");
        int x1 = sc.nextInt();
        System.out.print("Introduce la coordenada y de la casilla de partida: ");
        int y1 = sc.nextInt();
        System.out.print("Introduce la coordenada x de la casilla de llegada: ");
        int x2 = sc.nextInt();
        System.out.print("Introduce la coordenada y de la casilla de llegada: ");
        int y2 = sc.nextInt();
        
        System.out.println(movimientoCaballo(x1, y1, x2, y2));
        sc.close();
        }
        public static String movimientoCaballo(int x1, int y1, int x2, int y2){
            int diferenciaX = Math.abs(x2 - x1);
            int diferenciaY = Math.abs(y2 - y1);
            if (diferenciaX == 2 && diferenciaY == 1 || diferenciaX == 1 && diferenciaY == 2) {
                return "Movimiento válido";
                } else {
                    return "Movimiento inválido";
                    
        }
    
    }
    
}

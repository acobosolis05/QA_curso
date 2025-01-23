package clase_16;

import java.util.Scanner;

public class puntoUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oracion;

        try {
            System.out.print("Ingrese la oración: ");
            oracion = sc.nextLine();

            if (oracion.isEmpty()) {
                System.out.println("Debe Crear oración");
            } else {
                System.out.println("Borrar oración");
                oracion = ""; // Vacía la oración
            }
        } catch (Exception e) {
            System.out.println("Error al ingresar la oración");
        } finally {
            sc.close(); // Asegura que el Scanner se cierre correctamente
        }
    }
}


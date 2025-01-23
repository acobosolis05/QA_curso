package clase_16;

import java.util.Scanner;

public class puntoDos {
    public class manipulandoOraciones {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String oracion = " ";
            int cantidadCaracteres = 0;
            
            boolean salir = false;
            while (!salir) {
                System.out.println("Menú de opciones: ");
                System.out.println("1. Crear oración o Borrar oración");
                int opcion = Integer.parseInt(System.console().readLine());
                switch (opcion) {
                    case 1:
                        try {
                            System.out.print("Ingrese la oración: ");
                            oracion = sc.nextLine();
                            if (oracion.isEmpty()) {
                                System.out.println("Debe Crear oración");
                            } else {
                                System.out.println("Borrar oración");
                                oracion = "";
                            }
                        } catch (Exception e) {
                            System.out.println("Error al ingresar la oración");
                        }
                        break;
                    case 2:
                        cantidadCaracteres = oracion.length();
                        System.out.println("La oración tiene " + cantidadCaracteres + " caracteres");
                        break;
                    }
                    sc.close();
            }
        }
    }
}

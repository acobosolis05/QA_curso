package clase_11;
// Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:

import java.util.Scanner;

// Comprar producto.

// Realizar devolución.

// Ver mis pedidos.

// Preguntas frecuentes.

// Salir.
public class menuInteractivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //con while crear un menu interactivo
        while (true) {
            System.out.println("MENU");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolución");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            //ingresar la opcion
            System.out.print("Por favor ingrese una opcion: ");
            int opcion = sc.nextInt();
            
            //switch para realizar la accion
            switch (opcion) {
                case 1:
                System.out.println("Has seleccionado la opción 1");
                break;
                case 2:
                System.out.println("Has seleccionado la opción 2");
                break;
                case 3:
                System.out.println("Has seleccionado la opción 3");
                break;
                case 4:
                System.out.println("Has seleccionado la opción 4");
                break;
                case 5:
                System.out.println("Has seleccionado la opción 5, hasta luego");
                sc.close();
                return;
                default:
                    System.out.println("Opción no válida, por favor ingrese una opción válida");
                break;
                }

                }
                
    
    }
    
}
        


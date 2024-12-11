package clase_4;
// En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
// Opción 1: "Guardar"
// Opción 2: "Cargar"
// Opción 3: "Salir"
// El programa solicitará al usuario que ingrese un número del 1 al 3 para seleccionar una opción. 
// Utilizarás la estructura "switch" para implementar este programa y mostrar en
//  pantalla el mensaje correspondiente a la opción seleccionada.

import java.util.Scanner;

public class seleccionOpcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor seleccione una de las siguientes opciones: ");
        System.out.println("Opción 1: Guardar");
        System.out.println("Opción 2: Cargar");
        System.out.println("Opción 3: Salir");
        System.out.print("Ingrese el número de la opción que desea seleccionar: ");
        String opcion = sc.nextLine();

        switch (opcion) {
            case "1":
            System.out.println("Ha seleccionado la opción 1: Guardar");               
                break;
            case "2":
            System.out.println("Ha seleccionado la opción 2: Cargar");
            break;
            case "3":
            System.out.println("Ha seleccionado la opción 3: Salir");
            break;
        
            default:
            System.out.println("Ha seleccionado una opción no válida");
                break;
        }

        sc.close();
    
}
}

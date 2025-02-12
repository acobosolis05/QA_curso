package clase_26;

import java.util.ArrayList;
import java.util.Scanner;
// Objetivo: Practicar el uso de ArrayList en Java para almacenar y 
// manipular datos dinámicos, permitiendo al usuario ingresar nombres de ciudades
//  y luego mostrar la lista completa de ciudades ingresadas.

// Instrucciones

// Inicializa un ArrayList: Crea un ArrayList de tipo String para almacenar 
// los nombres de las ciudades ingresadas por el usuario. Esto se puede hacer de 
// la siguiente manera: ArrayList<String> ciudades = new ArrayList<>();

// Solicita la entrada del usuario: Implementa un bucle (puede ser while o for)
//  que pida al usuario ingresar el nombre de una ciudad. En cada iteración, 
//  pregunta si el usuario desea agregar más ciudades. Si la respuesta es sí, agrega el nombre de la ciudad al ArrayList utilizando el método add. Por ejemplo: ciudades.add(nombreCiudad);

// Finaliza la entrada de datos: El bucle debe continuar hasta que el usuario
//  indique que no desea agregar más ciudades. Por ejemplo, podrías usar un mensaje 
//  como "¿Deseas agregar otra ciudad? (sí/no)" para decidir si continuar.

// Mostrar la lista de ciudades: Una vez que el usuario decida no agregar más
//  ciudades, muestra por consola la lista completa de ciudades almacenadas en el ArrayList.
public class NombreCiudades {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        String nombreCiudad;
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre de una ciudad: ");
            nombreCiudad = sc.nextLine();
            ciudades.add(nombreCiudad);
            System.out.println("¿Deseas agregar otra ciudad? (sí = 1/no = 0)");
            int respuesta = sc.nextInt();
            sc.nextLine(); // para limpiar el buffer
            if (respuesta == 0) {
                continuar = false;
            }
        }
        System.out.println("La lista de ciudades es: ");
        for (String ciudad : ciudades) {
            System.out.println("-" + ciudad);
        }
        sc.close();
    }
}
package clase_6;

import java.util.Scanner;

// Escribe un programa que pida al usuario ingresar una palabra y un carácter, 
// y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf()
// de la clase String. Muestra 
// un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.
public class busquedaCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try{
        System.out.print("Por favor ingrese una palabra: ");
        String palabra = sc.nextLine();

        System.out.print("Por favor ingrese un carácter: ");
        String caracter = sc.nextLine();

        int posicion = palabra.indexOf(caracter);

        if (posicion != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la palabra '"  + palabra + "'.");
            } else {
                System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra '" + palabra + "'.");
                }
                } catch (Exception e) {
                    System.out.println("No esta ingresando las condiciones dadas: " + e.getMessage());
    }

    sc.close();
    
}
}
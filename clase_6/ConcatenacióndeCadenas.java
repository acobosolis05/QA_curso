// Escribe un programa que solicite al 
// usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla
//  el nombre completo utilizando el método concat() de la clase String.

package clase_6;

import java.util.Scanner;

public class ConcatenacióndeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Por favor ingrese su apellido: ");
        String apellido = sc.nextLine();

        String nombreCompleto = nombre.concat(" ").concat(apellido);
        System.out.println("Su nombre completo es: " + nombreCompleto);



        sc.close();
}
}
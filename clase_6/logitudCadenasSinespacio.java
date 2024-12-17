package clase_6;
// En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, 
// pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el método length()
//  de la clase String y se realizará un proceso adicional para excluir los espacios de la cuenta.
import java.util.Scanner;

public class logitudCadenasSinespacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese una frase: ");
        String frase = sc.nextLine();
        
        String fraseSinEspacios = frase.replace(" ", "");
        int longitudSinEspacio = fraseSinEspacios.length();
        System.out.println("La longitud de la frase sin contar espacios es: " + longitudSinEspacio);



        sc.close();


}
}
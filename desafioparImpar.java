import java.util.Scanner;

public class desafioparImpar {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = dato.nextInt();

       // Determinar si el número es par o impar usando el operador ternario
    String resultado = (numero % 2 == 0) ? "es par" : "es impar";

       // Mostrar el resultado
    System.out.println("El número " + numero + " " + resultado);

    dato.close();

    
}

}

import java.util.Scanner;

public class NombreyEdad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = obtenerNombre(sc);
        int edad = obtenerEdad(sc);
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
        sc.close();
        
    }
    public static Integer obtenerEdad(Scanner objetoScanner) {
        return objetoScanner.nextInt();
    }
    public static String obtenerNombre(Scanner objetoScanner) {
        return objetoScanner.next();
        }

}

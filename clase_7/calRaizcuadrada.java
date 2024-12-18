package clase_7;

import java.util.Locale;
import java.util.Scanner;

public class calRaizcuadrada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Ingrese un número: ");
            double num = sc.nextDouble();
            if (num >= 0){
                double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es " + raiz);
            } else {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un negativo");
            }
            }catch (Exception e){
                System.out.println("Error debe ingresar un dato valido " + e.getMessage());
        }
        sc.close();
    }
}

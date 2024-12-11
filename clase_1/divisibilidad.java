import java.util.Scanner;

public class divisibilidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("por favor ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero%5 == 0 && numero%3 == 0) {
            System.out.println("el numero es divisible entre 5 y 3");
            } else if( numero%3 ==0){
                System.out.println("el numero es divisible entre 3");
                } else if (numero%5 == 0) {
                    System.out.println("el numero es divisible entre 5");
                    } else {
                        System.out.println("el numero no es divisible entre 3 ni 5");
        }
        sc.close();
}
}

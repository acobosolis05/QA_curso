import java.util.Scanner;

public class determinarEdades {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("por favor ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad < 18 && edad >= 0){
            System.out.println("usted es menor de edad");
        } else if (edad >= 18 && edad <= 64){
            System.out.println("usted es un adulto");
        } else if (edad > 64){
                System.out.println("usted es un adulto mayor");
        }
        else {
            System.out.println("edad invalida");
        }

        sc.close();
    }
}   

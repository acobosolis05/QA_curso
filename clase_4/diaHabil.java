package clase_4;

import java.util.Scanner;

public class diaHabil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1 -> System.out.println("El dia "+ dia + " es lunes y HABIL");
            case 2 -> System.out.println("El dia "+ dia + " es martes y HABIL");
            case 3 -> System.out.println("El dia "+ dia + " es miercoles y HABIL");
            case 4 -> System.out.println("El dia "+ dia + " es jueves y HABIL");
            case 5 -> System.out.println("El dia "+ dia + " es viernes y HABIL");
            case 6 -> System.out.println("El dia "+ dia + " es sabado y NO HABIL");
            case 7 -> System.out.println("El dia "+ dia + " es domingo y NO HABIL");
            
            
            default -> System.out.println("El dia ingresado no es valido");
            

        }

        sc.close();
    }
}


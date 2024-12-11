package clase_4;

import java.util.Scanner;

public class diaSemana {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7: ");
        int dia = sc.nextInt();

        
        switch (dia){
            case 1 -> System.out.println("El dia de la semana es lunes");
            case 2 -> System.out.println("El dia de la semana es martes");
            case 3 -> System.out.println("El dia de la semana es miercoles");
            case 4 -> System.out.println("El dia de la semana es jueves");
            case 5 -> System.out.println("El dia de la semana es viernes");
            case 6 -> System.out.println("El dia de la semana es sabado");
            case 7 -> System.out.println("El dia de la semana es domingo");
            
            default -> System.out.println("El dia ingresado no es valido");
            

        }

        sc.close();
    }
}

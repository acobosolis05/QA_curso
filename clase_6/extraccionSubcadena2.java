package clase_6;

import java.util.Scanner;

public class extraccionSubcadena2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingrese un frase: ");
            String texto = sc.nextLine();

            System.out.print("Ingrese la posición inicial: ");
            int posIni = sc.nextInt();

            System.out.print("Ingrese la posición final: ");
            int posFin = sc.nextInt();

            sc.nextLine();
            String subcadena = texto.substring(posIni,posFin);
            System.out.println("La subcadena es: "+subcadena);
            }catch(Exception e){
                System.out.println("La cedena no cumple con el indice ingresado: "+e.getMessage());
        }
        
        sc.close();
    }
}


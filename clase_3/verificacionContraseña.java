import java.util.Scanner;

public class verificacionContraseña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseñareal = "lareal123";

        System.out.print("por favor ingrese una contraseña: ");

        String contraseña = sc.nextLine();


        if (contraseña.equals(contraseñareal)){
            System.out.println("contraseña correcta");
            }
        else{
            System.out.println("contraseña incorrecta");
        }

        sc.close();
}
}
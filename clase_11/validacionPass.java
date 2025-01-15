package clase_11;

import java.util.Scanner;

// Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while.
//  La contraseña correcta es
//  "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.
public class validacionPass {
    public static void main(String[] args) {
        String password = "secreto";
        Scanner sc = new Scanner(System.in);
        boolean pass = false;
        while (!pass) {
            System.out.print("Ingrese su password: ");
            String ingreso = sc.nextLine();
            if (ingreso.equals(password)) {
                System.out.println("Password correcto");
                pass = true;
                } else {
                    System.out.println("Password incorrecto");
                    
                    }
                    }
                    sc.close();
    }
    
}

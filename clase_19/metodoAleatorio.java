package clase_19;


import java.util.Locale;


public class metodoAleatorio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int numero = numeroAleatorio();
        System.out.println("el numero aleatorio es: " + numero);
        
    }
    public static int numeroAleatorio() {
        int numero1 = (int) Math.floor(Math.random() * (355-1+1))+1;
        return numero1;
    }
}

package clase_7;
// Pide al usuario que ingrese un número entre 1 y 30. 
// Este número será almacenado en una variable llamada numeroLimite .

import java.util.Scanner;

// Utiliza la clase Math para generar un número aleatorio entre 1 y 
// el numeroLimite recibido del usuario.

// Utiliza el método Math.sqrt() para calcular la raíz cuadrada del 
// número aleatorio generado y muéstralo en pantalla.

// Analiza si el número aleatorio generado es primo y muestra un mensaje 
// en pantalla indicando si lo es o no.

// Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
public class aleatoriaRaiz {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Pide al usuario que ingrese un número entre 1 y 30
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese un número entre 1 y 30: ");
            int numeroLimite = sc.nextInt();
            if (numeroLimite < 1 || numeroLimite > 30) {
                System.out.println("El número ingresado no está entre 1 y 30");
                return;
                }
                // Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLim
                int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;
                // Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número
                double raizCuadrada = Math.sqrt(numeroAleatorio);
                // Analiza si el número aleatorio generado es primo
                boolean esPrimo = esPrimo(numeroAleatorio);
                                // Muestra un mensaje en pantalla indicando si el número es primo o no
                                System.out.println("El número aleatorio generado es: " + numeroAleatorio + " -el numero es primo: " + esPrimo + " -la raiz cuadrada es: "+ raizCuadrada);
                                
                                } catch (Exception e) {
                                    System.out.println("Error el dato ingresado no corresponde al pedido: " + e.getMessage());
                                    }
                                    sc.close();
                        }
                
                        private static boolean esPrimo(int numeroAleatorio) {
                            if (numeroAleatorio <= 1) {
                                return false; // Los números menores o iguales a 1 no son primos
                            }
                            for (int i = 2; i <= Math.sqrt(numeroAleatorio); i++) {
                                if (numeroAleatorio % i == 0) {
                                    return false; // Si el número es divisible por algún otro número, no es primo
                                }
                            }
                            return true; // Si no encontró divisores, el número es primo
                        }
        
                    }
        

        


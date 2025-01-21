package clase_14;
// Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.

// La serie de Fibonacci comienza de la siguiente manera:

// Posición 0: 0
public class fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, i = 0;
        while (i < 8) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
            i++;
            }
    }
}

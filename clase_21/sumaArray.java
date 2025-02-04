package clase_21;


import java.util.Arrays;
import java.util.Random;

public class sumaArray{
public static void main(String[] args) {
    int[] listaNumeros = new int[8];
    llenarArrayConAleatorios(listaNumeros);
    imprimirSumaArray(listaNumeros);
    
    }
    
    public static void llenarArrayConAleatorios(int[] lista) {
    Random random = new Random();
    for (int i = 0; i < lista.length; i++) {
    lista[i] = random.nextInt(10) + 1; // Genera números aleatorios del 1 al 10
    }
    System.out.println(Arrays.toString(lista));
    }
    
    public static void imprimirSumaArray(int[] listaNumeros) {
    int suma = 0;
    for (int num : listaNumeros) {
    suma += num;
    }
    System.out.println("La suma de los elementos del array es: " + suma);
    }
}


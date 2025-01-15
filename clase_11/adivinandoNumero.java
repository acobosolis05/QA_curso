package clase_11;

import java.util.Scanner;

// Escribe un programa que genere un número aleatorio entre 1 y 20, 
// y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while.
//  El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio,
//  y seguirá pidiéndote que adivines hasta que lo hagas correctamente.
public class adivinandoNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numeroAleatorio = (int) (Math.random() * (20-0+1) + 0);
        int numeroIntentos = 0;
        //System.out.println(numeroAleatorio);
        do {
            System.out.print("Adivina un número entre 1 y 20: ");
            numero = sc.nextInt();
            if (numero == numeroAleatorio) {
                System.out.println("¡Lo has adivinado! has necesitado " + numeroIntentos +" intentos");
                } else if (numero < numeroAleatorio) {
                    System.out.println("El número que has introducido es menor que el número aleatorio");
                } else if (numero > numeroAleatorio) {
                    System.out.println("El número que has introducido es mayor que el número aleatorio");
                    }
                    numeroIntentos++;
                    } 
                    while (numero != numeroAleatorio);
                    sc.close();
                    }

    }
    


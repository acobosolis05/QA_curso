package clase_14;


import java.util.Random;
// Vas a desarrollar un programa en Java que genere una contraseña aleatoria. 
// Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. 
// La contraseña será almacenada en un arreglo de caracteres.

// Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas 
// veces como la longitud de la contraseña especificada por el usuario.

// Para asegurarte de que la contraseña generada contenga al menos una letra 
// mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while
//  junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.

// Finalmente, convertirás el arreglo de caracteres en un String con un bucle 
// for y luego imprimirás la contraseña generada en la consola.
public class generandoContraseña {
    public static void main(String[] args) {
        int longitud = 10; // longitud de la contraseña
        char[] password = new char[longitud];
        int mayusculas = 0, minusculas = 0, digitos = 0;
        Random random = new Random();

        // Generar caracteres aleatorios para la contraseña
        for (int i = 0; i < longitud; i++) {
            char caracter = (char) (random.nextInt(95) + 32);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                digitos++;
            }
            password[i] = caracter;
        }

        // Asegurarse de que haya al menos una mayúscula, una minúscula y un dígito
        while (mayusculas == 0 || minusculas == 0 || digitos == 0) {
            int posicionAleatoria = random.nextInt(longitud);
            if (mayusculas == 0) {
                password[posicionAleatoria] = (char) (random.nextInt(26) + 65); // A-Z
                mayusculas++;
            } else if (minusculas == 0) {
                password[posicionAleatoria] = (char) (random.nextInt(26) + 97); // a-z
                minusculas++;
            } else if (digitos == 0) {
                password[posicionAleatoria] = (char) (random.nextInt(10) + 48); // 0-9
                digitos++;
            }
        }

        // Imprimir la contraseña generada
        // for (int i = 0; i < longitud; i++) {
        //     System.out.print("la contraseña generada es: "+ password[i]);

            String contrasena = new String(password);
            System.out.println("la contraseña generada es: "+ contrasena);
        }
    }

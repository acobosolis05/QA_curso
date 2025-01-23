package clase_16;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class manipulandoOraciones { // Declaración de la clase principal llamada "dos"
    public static void main(String[] args) { // Método principal que es el punto de entrada del programa

        Locale.setDefault(Locale.US); // Configura la localización predeterminada en inglés de EE. UU.
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer entradas desde la consola
        String oracion = ""; // Variable para almacenar la oración ingresada por el usuario
        boolean salir = false; // Controla la ejecución del bucle principal

        // Bucle principal que muestra el menú hasta que el usuario decida salir
        while (!salir) {
            // Imprime las opciones del menú
            System.out.println("Menú de opciones: ");
            System.out.println("1. Crear oración o Borrar oración");
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");
            System.out.print("Ingrese la opción que desee: ");

            int opcion = -1; // Variable para almacenar la opción seleccionada por el usuario
            try {
                // Intenta leer y convertir la entrada del usuario a un número entero
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) { // Captura el error si la entrada no es válida
                System.out.println("Entrada no válida. Por favor, ingrese un número entre 1 y 9.");
                continue; // Vuelve al inicio del bucle
            }

            // Estructura de control para ejecutar acciones basadas en la opción seleccionada
            switch (opcion) {
                case 1: // Opción 1: Crear o borrar una oración
                    System.out.print("Ingrese la oración: "); // Solicita al usuario ingresar una oración
                    oracion = sc.nextLine().trim(); // Lee y elimina espacios adicionales
                    if (oracion.isEmpty()) { // Verifica si la oración está vacía
                        System.out.println("Debe crear una oración.");
                    } else {
                        System.out.println("La oración ingresada es: " + oracion); // Muestra la oración ingresada
                        System.out.print("¿Desea borrar la oración? (1 = sí, 0 = no): ");
                        try {
                            int respuesta = Integer.parseInt(sc.nextLine().trim()); // Lee la respuesta del usuario
                            if (respuesta == 1) { // Si la respuesta es "1", borra la oración
                                oracion = "";
                                System.out.println("Oración borrada.");
                            } else { // Si la respuesta es diferente de "1", conserva la oración
                                System.out.println("Oración guardada.");
                            }
                        } catch (NumberFormatException e) { // Captura errores de entrada no válidos
                            System.out.println("Entrada no válida. Por favor, ingrese 1 o 0.");
                        }
                    }
                    break;

                case 2: // Opción 2: Contar caracteres en la oración
                    System.out.println("La oración tiene " + oracion.length() + " caracteres."); // Muestra el número de caracteres
                    break;

                case 3: // Opción 3: Contar palabras en la oración
                    if (oracion.isEmpty()) { // Verifica si no hay una oración ingresada
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+"); // Divide la oración en palabras
                        System.out.println("La oración tiene " + palabras.length + " palabras."); // Muestra el conteo de palabras
                    }
                    break;

                case 4: // Opción 4: Ordenar palabras alfabéticamente
                    if (oracion.isEmpty()) { // Verifica si no hay una oración ingresada
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+"); // Divide la oración en palabras
                        Arrays.sort(palabras, String.CASE_INSENSITIVE_ORDER); // Ordena las palabras alfabéticamente (sin importar mayúsculas/minúsculas)
                        System.out.println("Palabras ordenadas alfabéticamente:");
                        for (String palabra : palabras) { // Imprime cada palabra ordenada
                            System.out.println("- " + palabra);
                        }
                    }
                    break;

                case 5: // Opción 5: Mostrar palabra según el índice ingresado
                    if (oracion.isEmpty()) { // Verifica si no hay una oración ingresada
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+"); // Divide la oración en palabras
                        System.out.print("Ingrese un número (1 a " + palabras.length + "): "); // Solicita un índice al usuario
                        try {
                            int numero = Integer.parseInt(sc.nextLine().trim()); // Lee y convierte el número ingresado
                            if (numero < 1 || numero > palabras.length) { // Verifica si el número está fuera de rango
                                System.out.println("Número fuera de rango. Intente nuevamente.");
                            } else {
                                System.out.println("Palabra: " + palabras[numero - 1]); // Muestra la palabra correspondiente al índice
                            }
                        } catch (NumberFormatException e) { // Captura errores de entrada no válida
                            System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                        }
                    }
                    break;

                case 6: // Opción 6: Buscar una palabra en la oración
                    if (oracion.isEmpty()) { // Verifica si no hay una oración ingresada
                        System.out.println("No hay oración ingresada.");
                    } else {
                        System.out.print("Ingrese la palabra a buscar: "); // Solicita al usuario una palabra
                        String palabraBuscada = sc.nextLine().trim(); // Lee y elimina espacios adicionales
                        if (palabraBuscada.isEmpty()) { // Verifica si no se ingresó una palabra
                            System.out.println("No ha ingresado ninguna palabra.");
                        } else {
                            String[] palabras = oracion.trim().split("\\s+"); // Divide la oración en palabras
                            boolean encontrada = false; // Bandera para verificar si se encuentra la palabra
                            for (int i = 0; i < palabras.length; i++) { // Recorre las palabras
                                if (palabras[i].equalsIgnoreCase(palabraBuscada)) { // Compara ignorando mayúsculas/minúsculas
                                    System.out.println("La palabra '" + palabraBuscada + "' fue encontrada en la posición " + (i + 1));
                                    encontrada = true; // Marca que se encontró la palabra
                                    break;
                                }
                            }
                            if (!encontrada) { // Si no se encontró la palabra, muestra un mensaje
                                System.out.println("La palabra '" + palabraBuscada + "' no se encuentra en la oración.");
                            }
                        }
                    }
                    break;

                case 7: // Opción 7: Modificar una palabra en la oración
                    if (oracion.isEmpty()) { // Verifica si no hay una oración ingresada
                        System.out.println("No hay oración ingresada.");
                    } else {
                        System.out.print("Ingrese la palabra que desea modificar: "); // Solicita la palabra a modificar
                        String palabraOriginal = sc.nextLine().trim(); // Lee y elimina espacios adicionales
                        while (!oracion.contains(palabraOriginal)) { // Mientras no se encuentre la palabra en la oración
                            System.out.println("La palabra no se encuentra en la oración. Intente nuevamente.");
                            palabraOriginal = sc.nextLine().trim(); // Solicita nuevamente la palabra
                        }
                        System.out.print("Ingrese la nueva palabra o frase: "); // Solicita la nueva palabra
                        String nuevaPalabra = sc.nextLine().trim(); // Lee la nueva palabra
                        if (!nuevaPalabra.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) { // Valida que la nueva palabra contenga solo letras y espacios
                            System.out.println("Entrada no válida. Solo se permiten letras y espacios.");
                        } else {
                            // Reemplaza la palabra original por la nueva
                            oracion = oracion.replaceFirst("\\b" + palabraOriginal + "\\b", nuevaPalabra);
                            System.out.println("Oración modificada: " + oracion);
                        }
                    }
                    break;

                case 8: // Opción 8: Agregar contenido a la oración
                    System.out.print("Ingrese el contenido que desea agregar a la oración: "); // Solicita contenido adicional
                    String contenido = sc.nextLine().trim(); // Lee y elimina espacios adicionales
                    if (!contenido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) { // Valida que el contenido contenga solo letras y espacios
                        System.out.println("Entrada no válida. Solo se permiten letras y espacios.");
                    } else {
                        // Agrega el contenido al final de la oración
                        oracion = oracion.isEmpty() ? contenido : oracion + " " + contenido;
                        System.out.println("Oración actualizada: " + oracion);
                    }
                    break;

                case 9: // Opción 9: Salir del programa
                    salir = true; // Cambia la bandera para salir del bucle
                    System.out.println("Saliendo del programa."); // Mensaje de salida
                    break;

                default: // Opción inválida
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 9.");
                    break;
            }
        }

        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }
}

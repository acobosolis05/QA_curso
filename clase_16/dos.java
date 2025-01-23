package clase_16;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class dos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String oracion = "";
        boolean salir = false;

        while (!salir) {
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

            int opcion = -1;
            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entre 1 y 9.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la oración: ");
                    oracion = sc.nextLine().trim();
                    if (oracion.isEmpty()) {
                        System.out.println("Debe crear una oración.");
                    } else {
                        System.out.println("La oración ingresada es: " + oracion);
                        System.out.print("¿Desea borrar la oración? (1 = sí, 0 = no): ");
                        try {
                            int respuesta = Integer.parseInt(sc.nextLine().trim());
                            if (respuesta == 1) {
                                oracion = "";
                                System.out.println("Oración borrada.");
                            } else {
                                System.out.println("Oración guardada.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Por favor, ingrese 1 o 0.");
                        }
                    }
                    break;

                case 2:
                if (oracion.isEmpty()) {
                    System.out.println("No hay oración ingresada.");
                } else {
                    System.out.println("La oración tiene " + oracion.length() + " caracteres.");
                }
                    break;

                case 3:
                    if (oracion.isEmpty()) {
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+");
                        System.out.println("La oración tiene " + palabras.length + " palabras.");
                    }
                    break;

                case 4:
                    if (oracion.isEmpty()) {
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+");
                        Arrays.sort(palabras, String.CASE_INSENSITIVE_ORDER);
                        System.out.println("Palabras ordenadas alfabéticamente:");
                        for (String palabra : palabras) {
                            System.out.println("- " + palabra);
                        }
                    }
                    break;

                case 5:
                    if (oracion.isEmpty()) {
                        System.out.println("No hay oración ingresada.");
                    } else {
                        String[] palabras = oracion.trim().split("\\s+");
                        System.out.print("Ingrese un número (1 a " + palabras.length + "): ");
                        try {
                            int numero = Integer.parseInt(sc.nextLine().trim());
                            if (numero < 1 || numero > palabras.length) {
                                System.out.println("Número fuera de rango. Intente nuevamente.");
                            } else {
                                System.out.println("Palabra: " + palabras[numero - 1]);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                        }
                    }
                    break;

                case 6:
                    if (oracion.isEmpty()) {
                        System.out.println("No hay oración ingresada.");
                    } else {
                        System.out.print("Ingrese la palabra a buscar: ");
                        String palabraBuscada = sc.nextLine().trim();
                        if (palabraBuscada.isEmpty()) {
                            System.out.println("No ha ingresado ninguna palabra.");
                        } else {
                            String[] palabras = oracion.trim().split("\\s+");
                            boolean encontrada = false;
                            for (int i = 0; i < palabras.length; i++) {
                                if (palabras[i].equalsIgnoreCase(palabraBuscada)) {
                                    System.out.println("La palabra '" + palabraBuscada + "' fue encontrada en la posición " + (i + 1));
                                    encontrada = true;
                                    break;
                                }
                            }
                            if (!encontrada) {
                                System.out.println("La palabra '" + palabraBuscada + "' no se encuentra en la oración.");
                            }
                        }
                    }
                    break;

                case 7:
                    if (oracion.isEmpty()) {
                        System.out.println("No hay oración ingresada.");
                    } else {
                        System.out.print("Ingrese la palabra que desea modificar: ");
                        String palabraOriginal = sc.nextLine().trim();

                        // Validar que la palabra exista en la oración
                        while (!oracion.contains(palabraOriginal)) {
                            System.out.println("La palabra no se encuentra en la oración. Intente nuevamente.");
                            palabraOriginal = sc.nextLine().trim();
                        }

                        System.out.print("Ingrese la nueva palabra o frase: ");
                        String nuevaPalabra = sc.nextLine().trim();

                        // Validar que solo contenga letras y espacios
                        if (!nuevaPalabra.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                            System.out.println("Entrada no válida. Solo se permiten letras y espacios.");
                        } else {
                            oracion = oracion.replaceFirst("\\b" + palabraOriginal + "\\b", nuevaPalabra);
                            System.out.println("Oración modificada: " + oracion);
                        }
                    }
                    break;

                case 8:
                    System.out.print("Ingrese el contenido que desea agregar a la oración: ");
                    String contenido = sc.nextLine().trim();

                    // Validar que solo contenga letras y espacios
                    if (!contenido.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                        System.out.println("Entrada no válida. Solo se permiten letras y espacios.");
                    } else {
                        oracion = oracion.isEmpty() ? contenido : oracion + " " + contenido;
                        System.out.println("Oración actualizada: " + oracion);
                    }
                    break;

                case 9:
                    salir = true;
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 9.");
                    break;
            }
        }

        sc.close();
    }
}

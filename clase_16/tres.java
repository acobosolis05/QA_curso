package clase_16;


import java.util.*;

public class tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = "";
        boolean salir = false;

        while (!salir) {
            // Menú de opciones
            System.out.println("\n*** Menú de Opciones ***");
            System.out.println("1. Crear oración / Borrar oración");
            System.out.println("2. Cantidad de caracteres de la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después de un número

            switch (opcion) {
                case 1: // Crear oración o borrar oración
                    if (oracion.isEmpty()) {
                        System.out.print("Ingresa una nueva oración: ");
                        oracion = scanner.nextLine();
                        System.out.println("Oración creada.");
                    } else {
                        oracion = "";
                        System.out.println("Oración borrada.");
                    }
                    break;

                case 2: // Cantidad de caracteres de la oración
                    System.out.println("Cantidad de caracteres: " + oracion.length());
                    break;

                case 3: // Cantidad de palabras de la oración
                    String[] palabras = oracion.split("\\s+");
                    System.out.println("Cantidad de palabras: " + palabras.length);
                    break;

                case 4: // Mostrar palabras ordenadas alfabéticamente
                    String[] palabrasOrdenadas = oracion.split("\\s+");
                    Arrays.sort(palabrasOrdenadas);
                    System.out.println("Palabras ordenadas alfabéticamente: " + String.join(" ", palabrasOrdenadas));
                    break;

                case 5: // Ingresar un número y devolver la palabra correspondiente
                    System.out.print("Ingresa un número: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    String[] palabrasBusqueda = oracion.split("\\s+");
                    if (numero >= 1 && numero <= palabrasBusqueda.length) {
                        System.out.println("Palabra correspondiente: " + palabrasBusqueda[numero - 1]);
                    } else {
                        System.out.println("Número inválido. Intente nuevamente.");
                    }
                    break;

                case 6: // Buscar palabra dentro de la oración
                    System.out.print("Ingresa una palabra para buscar: ");
                    String palabraBuscar = scanner.nextLine();
                    String[] palabrasBusqueda2 = oracion.split("\\s+");
                    int indice = -1;
                    for (int i = 0; i < palabrasBusqueda2.length; i++) {
                        if (palabrasBusqueda2[i].equalsIgnoreCase(palabraBuscar)) {
                            indice = i;
                            break;
                        }
                    }

                    if (indice != -1) {
                        System.out.println("Palabra encontrada en la posición: " + (indice + 1));
                    } else {
                        System.out.println("La palabra no fue encontrada.");
                    }
                    break;

                case 7: // Modificar palabra dentro de la oración
                    System.out.print("Ingresa la palabra que deseas modificar: ");
                    String palabraModificar = scanner.nextLine();
                    String[] palabrasModificar = oracion.split("\\s+");
                    boolean palabraEncontrada = false;

                    for (int i = 0; i < palabrasModificar.length; i++) {
                        if (palabrasModificar[i].equalsIgnoreCase(palabraModificar)) {
                            palabraEncontrada = true;
                            System.out.print("Ingresa la nueva palabra: ");
                            String nuevaPalabra = scanner.nextLine();

                            // Validar que la nueva palabra solo contenga letras y espacios
                            if (nuevaPalabra.matches("[a-zA-Z\\s]+")) {
                                palabrasModificar[i] = nuevaPalabra;
                                oracion = String.join(" ", palabrasModificar);
                                System.out.println("Oración modificada: " + oracion);
                            } else {
                                System.out.println("La nueva palabra debe contener solo letras y espacios.");
                            }
                            break;
                        }
                    }

                    if (!palabraEncontrada) {
                        System.out.println("La palabra no se encontró en la oración.");
                    }
                    break;

                case 8: // Agregar contenido a la oración
                    System.out.print("Ingresa el contenido a agregar: ");
                    String contenido = scanner.nextLine();
                    oracion += " " + contenido;
                    System.out.println("Contenido agregado. Nueva oración: " + oracion);
                    break;

                case 9: // Salir
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }
    }
}
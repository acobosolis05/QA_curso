package clase_16;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Clase principal
public class ejercicio {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Configura la localización predeterminada en inglés de EE. UU.
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer entradas desde la consola
        OracionHandler oracionHandler = new OracionHandler(); // Instancia de la clase para manipular oraciones

        boolean salir = false; // Controla la ejecución del bucle principal

        while (!salir) {
            mostrarMenu(); // Muestra las opciones del menú
            int opcion = leerOpcion(sc); // Lee la opción seleccionada por el usuario

            // Ejecuta la acción correspondiente a la opción seleccionada
            switch (opcion) {
                case 1:
                    oracionHandler.crearOBorrarOracion(sc);
                    break;
                case 2:
                    oracionHandler.mostrarCantidadDeCaracteres();
                    break;
                case 3:
                    oracionHandler.mostrarCantidadDePalabras();
                    break;
                case 4:
                    oracionHandler.mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    oracionHandler.mostrarPalabraPorIndice(sc);
                    break;
                case 6:
                    oracionHandler.buscarPalabra(sc);
                    break;
                case 7:
                    oracionHandler.modificarPalabra(sc);
                    break;
                case 8:
                    oracionHandler.agregarContenido(sc);
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

        sc.close(); // Cierra el objeto Scanner para liberar recursos
    }

    // Método para mostrar el menú de opciones
    private static void mostrarMenu() {
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
    }

    // Método para leer y validar la opción del usuario
    private static int leerOpcion(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número entre 1 y 9.");
            return -1;
        }
    }
}

// Clase para manipular oraciones
class OracionHandler {
    private String oracion = ""; // Almacena la oración actual

    public void crearOBorrarOracion(Scanner sc) {
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
    }

    public void mostrarCantidadDeCaracteres() {
        System.out.println("La oración tiene " + oracion.length() + " caracteres.");
    }

    public void mostrarCantidadDePalabras() {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración ingresada.");
        } else {
            String[] palabras = oracion.trim().split("\\s+");
            System.out.println("La oración tiene " + palabras.length + " palabras.");
        }
    }

    public void mostrarPalabrasOrdenadas() {
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
    }

    public void mostrarPalabraPorIndice(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración ingresada.");
        } else {
            String[] palabras = oracion.trim().split("\\s+");
            System.out.print("Ingrese un número (1 a " + palabras.length + "): ");
            try {
                int indice = Integer.parseInt(sc.nextLine().trim());
                if (indice < 1 || indice > palabras.length) {
                    System.out.println("Número fuera de rango.");
                } else {
                    System.out.println("Palabra: " + palabras[indice - 1]);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
            }
        }
    }

    public void buscarPalabra(Scanner sc) {
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
    }

    public void modificarPalabra(Scanner sc) {
        if (oracion.isEmpty()) {
            System.out.println("No hay oración ingresada.");
        } else {
            System.out.print("Ingrese la palabra que desea modificar: ");
            String palabraOriginal = sc.nextLine().trim();
            if (!oracion.contains(palabraOriginal)) {
                System.out.println("La palabra no se encuentra en la oración.");
                return;
            }
            System.out.print("Ingrese la nueva palabra: ");
            String nuevaPalabra = sc.nextLine().trim();
            oracion = oracion.replaceFirst("\\b" + palabraOriginal + "\\b", nuevaPalabra);
            System.out.println("Oración modificada: " + oracion);
        }
    }

    public void agregarContenido(Scanner sc) {
        System.out.print("Ingrese el contenido que desea agregar: ");
        String contenido = sc.nextLine().trim();
        oracion = oracion.isEmpty() ? contenido : oracion + " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}


import java.util.HashMap;
import java.util.Scanner;

public class appCodigosPostales {
    public static Scanner sc = new Scanner(System.in);
    private static HashMap<Integer, String> codigosPostales = new HashMap<>();

    public static void main(String[] args) {
        int opcion;
        while (true) {
            System.out.println("\nMenú");
            System.out.println("1. Agregar datos");
            System.out.println("2. Buscar código postal");
            System.out.println("3. Agregar Código postal");
            System.out.println("4. Eliminar código postal");
            System.out.println("5. Mostrar");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> solicitarDatos();
                case 2 -> buscarPorCodigoPostal();
                case 3 -> agregarDatos();
                case 4 -> eliminarCodigosPostales();
                case 5 -> mostrarDatos();
                case 6 -> {
                    System.out.println("Gracias por utilizar el sistema");
                }
                default -> System.out.println("Opción no válida");
            }
            
        }
    }
        

    public static void solicitarDatos() {
        System.out.println("\nIngrese 10 pares de códigos postales y ciudades.");

        for (int i = 0; i < 4; i++) { // Cambia a 10 en producción
            int codigoPostal;
            String ciudad;

            // Validar código único
            while (true) {
                System.out.print("Ingrese el código postal #" + (i + 1) + ": ");
                codigoPostal = sc.nextInt();
                sc.nextLine(); // Limpiar buffer

                if (!codigosPostales.containsKey(codigoPostal)) {
                    break; // Sale del while si el código no existe
                }
                System.out.println("Código postal ya existe, ingrese otro.");
            }

            System.out.print("Ingrese la ciudad: ");
            ciudad = formatoTexto(sc.nextLine());

            codigosPostales.put(codigoPostal, ciudad);
            System.out.println("Datos ingresados exitosamente.");
        }
    }

    public static void mostrarDatos() {
        System.out.println("\nLista de códigos postales y ciudades:");
        for (int codigo : codigosPostales.keySet()) {
            System.out.println("Código: " + codigo + " - Ciudad: " + codigosPostales.get(codigo));
        }
    }

    public static void buscarPorCodigoPostal() {
        System.out.print("\nIngrese el código postal que desea buscar:");
        int codigoPostal = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        if (codigosPostales.containsKey(codigoPostal)) {
            System.out.println(
                    "Código postal encontrado: " + codigoPostal + " - Ciudad: " + codigosPostales.get(codigoPostal));
        } else{
            System.out.println("Código postal no encontrado.");
        }
    }

    public static void agregarDatos() {
        System.out.print("\nIngrese el código postal que desea agregar:");
        int codigoPostal = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        if (codigosPostales.containsKey(codigoPostal)) {
            System.out.println("Código postal ya existe, no se puede agregar.");
        } else {
            System.out.print("Ingrese la ciudad: ");
            String ciudad = formatoTexto(sc.nextLine());
            codigosPostales.put(codigoPostal, ciudad);
            System.out.println("Datos agregados exitosamente.");
        }
    }

    public static void eliminarCodigosPostales(){
        System.out.println("\nEliminación de 3 códigos postales existentes.");

    int eliminados = 0;
    while (eliminados < 3) { // Se ejecuta hasta eliminar 3 códigos
        System.out.print("\nIngrese el código postal que desea eliminar: ");
        int codigoPostal = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        if (codigosPostales.containsKey(codigoPostal)) {
            System.out.print("¿Desea eliminar el código postal " + codigoPostal + " y la ciudad asociada? (S/N): ");
            String respuesta = sc.nextLine().trim();

            if (respuesta.equalsIgnoreCase("S")) {
                codigosPostales.remove(codigoPostal);
                eliminados++; // Aumenta el contador solo si se elimina
                System.out.println("Código postal eliminado exitosamente.");
            } else {
                System.out.println("Operación cancelada.");
            }
        } else {
            System.out.println("Código postal no encontrado. Intente nuevamente.");
        }
    }

    System.out.println("\n Se han eliminado 3 códigos postales.");
}
    public static String formatoTexto(String ciudad){
        return ciudad.trim().replaceAll("\\s+", "").toUpperCase();

    }
}
package clase_24POO;

import java.util.List;
import java.util.Scanner;

// Importa la clase `Empleado` para utilizar sus métodos y propiedades
import clase_24POO.models.Empleado;

// Clase principal para el menú de administración de empleados
public class Menu {
    // Objeto Scanner para capturar la entrada del usuario
    public static Scanner sc = new Scanner(System.in);

    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        int opcion = 0; // Variable para almacenar la opción seleccionada por el usuario
        do {
            // Muestra el menú principal al usuario
            System.out.println("\n Administración de empleados");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver lista de empleados");
            System.out.println("3. Ordenar lista de empleados");
            System.out.println("4. Filtrar lista de empleados");
            System.out.println("5. Buscar empleado por nombre");
            System.out.println("6. Incrementar salario de un empleado");
            System.out.println("7. Salir");
            System.out.print("\n Ingrese una opción: ");
            opcion = sc.nextInt(); // Captura la opción ingresada por el usuario

            // Estructura `switch` para ejecutar la acción según la opción seleccionada
            switch (opcion) {
                case 1 -> agregarEmpleado(); // Llama al método para agregar un empleado
                case 2 -> Empleado.mostrarEmpleados(); // Llama al método para mostrar la lista de empleados
                case 3 -> menuOrdenamiento(); // Llama al submenú de ordenamiento
                case 4 -> menuFiltrado(); // Llama al submenú de filtrado
                case 5 -> buscarEmpleado(); // Nueva funcionalidad
                case 6 -> incrementarSalario(); // Nueva funcionalidad
                case 7 -> System.out.println("¡Hasta luego!"); // Opción para salir

                default -> System.out.println("Opción no válida"); // Mensaje si el usuario ingresa una opción
                                                                   // incorrecta
            }
        } while (opcion != 7); // El bucle se repite mientras la opción no sea 5 (Salir)
    }

    // Método para agregar un nuevo empleado
    private static void agregarEmpleado() {
        sc.nextLine(); // Limpia el buffer para evitar problemas con `nextLine()`
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine(); // Captura el nombre del empleado

        System.out.print("Ingrese la edad del empleado: ");
        int edad = sc.nextInt(); // Captura la edad del empleado

        System.out.print("Ingrese el salario del empleado: ");
        double salario = sc.nextDouble(); // Captura el salario del empleado
        sc.nextLine(); // Limpia el buffer

        System.out.print("Ingrese el departamento del empleado: ");
        String departamento = sc.nextLine(); // Captura el departamento del empleado

        // Llama al método estático para agregar un nuevo empleado a la lista
        Empleado.agregarEmpleado(nombre, edad, salario, departamento);
    }

    // Submenú para las opciones de ordenamiento
    private static void menuOrdenamiento() {
        int opcionOrdenar = 0; // Variable para almacenar la opción de ordenamiento seleccionada
        do {
            // Muestra las opciones de ordenamiento al usuario
            System.out.println("\n--- Ordenar empleados ---");
            System.out.println("1. Ordenar por nombre");
            System.out.println("2. Ordenar por edad");
            System.out.println("3. Ordenar por salario");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            opcionOrdenar = sc.nextInt(); // Captura la opción ingresada

            // Estructura `switch` para ejecutar el ordenamiento seleccionado
            switch (opcionOrdenar) {
                case 1 -> {
                    Empleado.ordenarPorNombreBurbuja(); // Ordena por nombre
                    System.out.println("Empleados ordenados por nombre.");
                    Empleado.mostrarEmpleados(); // Muestra la lista ordenada
                }
                case 2 -> {
                    Empleado.ordenarPorEdadBurbuja(); // Ordena por edad
                    System.out.println("Empleados ordenados por edad.");
                    Empleado.mostrarEmpleados();
                }
                case 3 -> {
                    Empleado.ordenarPorSalarioBurbuja(); // Ordena por salario
                    System.out.println("Empleados ordenados por salario.");
                    Empleado.mostrarEmpleados();
                }
                case 4 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcionOrdenar != 4); // El bucle se repite mientras la opción no sea 4 (Volver)
    }

    // Submenú para las opciones de filtrado
    private static void menuFiltrado() {
        int opcionFiltrar = 0; // Variable para almacenar la opción de filtrado seleccionada
        do {
            // Muestra las opciones de filtrado al usuario
            System.out.println("\n--- Filtrar empleados ---");
            System.out.println("1. Filtrar por nombre");
            System.out.println("2. Filtrar por edad");
            System.out.println("3. Filtrar por salario");
            System.out.println("4. Filtrar por departamento");
            System.out.println("5. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            opcionFiltrar = sc.nextInt(); // Captura la opción ingresada
            sc.nextLine(); // Limpia el buffer

            // Estructura `switch` para ejecutar el filtrado seleccionado
            switch (opcionFiltrar) {
                case 1 -> {
                    System.out.print("Ingrese el nombre a buscar: ");
                    String nombre = sc.nextLine(); // Captura el nombre a buscar
                    List<Empleado> empleadosFiltrados = Empleado.filtrarPorNombre(nombre); // Filtra por nombre
                    mostrarEmpleadosFiltrados(empleadosFiltrados); // Muestra los empleados filtrados
                }
                case 2 -> {
                    System.out.print("Ingrese la edad mínima: ");
                    int edadMin = sc.nextInt(); // Captura la edad mínima
                    System.out.print("Ingrese la edad máxima: ");
                    int edadMax = sc.nextInt(); // Captura la edad máxima
                    List<Empleado> empleadosFiltrados = Empleado.filtrarPorEdad(edadMin, edadMax); // Filtra por rango
                                                                                                   // de edad
                    mostrarEmpleadosFiltrados(empleadosFiltrados);
                }
                case 3 -> {
                    System.out.print("Ingrese el salario mínimo: ");
                    double salarioMin = sc.nextDouble(); // Captura el salario mínimo
                    System.out.print("Ingrese el salario máximo: ");
                    double salarioMax = sc.nextDouble(); // Captura el salario máximo
                    List<Empleado> empleadosFiltrados = Empleado.filtrarPorSalario(salarioMin, salarioMax); // Filtra
                                                                                                            // por
                                                                                                            // salario
                    mostrarEmpleadosFiltrados(empleadosFiltrados);
                }
                case 4 -> {
                    System.out.print("Ingrese el departamento a buscar: ");
                    String departamento = sc.nextLine(); // Captura el departamento a buscar
                    List<Empleado> empleadosFiltrados = Empleado.filtrarPorDepartamento(departamento); // Filtra por
                                                                                                       // departamento
                    mostrarEmpleadosFiltrados(empleadosFiltrados);
                }
                case 5 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcionFiltrar != 5); // El bucle se repite mientras la opción no sea 5 (Volver)
    }

    // Método para mostrar los empleados filtrados
    private static void mostrarEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
        if (empleadosFiltrados.isEmpty()) { // Verifica si la lista está vacía
            System.out.println("No se encontraron empleados con los criterios especificados.");
            return;
        }
        // Imprime la cabecera de la tabla
        System.out.printf("%-15s %-5s %-10s %-15s%n", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("---------------------------------------------");

        // Recorre y muestra cada empleado filtrado
        for (Empleado emp : empleadosFiltrados) {
            System.out.printf("%-15s %-5d %-10.2f %-15s%n", emp.getNombre(), emp.getEdad(), emp.getSalario(),
                    emp.getDepartamento());
        }
    }

    private static void buscarEmpleado() {
        sc.nextLine(); // Limpia el buffer
        System.out.println("Ingrese el nombre del empleado a buscar: ");
        String nombre = sc.nextLine();
        List<Empleado> empleadosBuscados = Empleado.buscarEmpleado(nombre);
        if (empleadosBuscados.isEmpty()) {
            System.out.println("No se encontró ningún empleado con ese nombre.");
            return;
        }
        // Imprime la cabecera de la tabla
        System.out.printf("%-15s %-5s %-10s %-15s%n", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("---------------------------------------------");
        // Recorre y muestra cada empleado encontrado
        for (Empleado emp : empleadosBuscados) {
            System.out.printf("%-15s %-5d %-10.2f %-15s%n", emp.getNombre(), emp.getEdad(), emp.getSalario(),
                    emp.getDepartamento());

        }
    }

    // Incrementar salario: Este método recibirá un objeto empleado y un porcentaje
    // de aumento salarial.
    // Devolverá el mismo objeto con su salario incrementado según el porcentaje
    // proporcionado.
    private static void incrementarSalario() {
        sc.nextLine();
        System.out.println("Ingrese el nombre del empleado para incrementar su salario: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el porcentaje de aumento (en %): ");
        double porcentaje = sc.nextDouble();
        sc.nextLine();

        List<Empleado> empleadosEncontrados = Empleado.buscarEmpleado(nombre);

        if (empleadosEncontrados.isEmpty()) {
            System.out.println("No se encontró ningún empleado con ese nombre.");
            return;
        }
        // Imprime la cabecera de la tabla
        System.out.printf("%-15s %-5s %-10s %-15s%n", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("---------------------------------------------");
        // Recorre y muestra cada empleado encontrado
        for (Empleado emp : empleadosEncontrados) {
            double salarioIncrementado = emp.getSalario() * (1 + porcentaje / 100);
            emp.setSalario(salarioIncrementado);
            System.out.printf("%-15s %-5d %-10.2f %-15s%n", emp.getNombre(), emp.getEdad(), emp.getSalario(),
                    emp.getDepartamento());


            }
            
    }
}


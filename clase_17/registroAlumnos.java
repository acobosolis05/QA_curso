package clase_17;

import java.util.Locale;
import java.util.Scanner;

public class registroAlumnos {
    public static void main(String[] args) { // Método principal que es el punto de entrada del programa

        Locale.setDefault(Locale.US); // Configura la localización predeterminada en inglés de EE. UU.
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer entradas desde la consola
        String[] alumno = new String[100]; // Array para almacenar lasnombres de los alumnos
        double[] notas = new double[100]; // Array para almacenar las notas de los alumnos
        int cont = 0; // Contador para saber cuántos alumnos se han registrado
        boolean salir = false; // Controla la ejecución del bucle principal
        String nombre;

        // Bucle principal que muestra el menú hasta que el usuario decida salir
        while (!salir) {
            // Imprime las opciones del menú
            System.out.println("Menú de opciones: ");
            System.out.println("1. Registrar alumno");
            System.out.println("2. Mostrar todos los alumnos");
            System.out.println("3. Mostrar promedio de notas");
            System.out.println("4. Buscar alumno por nombre");
            System.out.println("5. Modificar nota por nombre");
            System.out.println("6. Eliminar alumno por nombre");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción que desee: ");

            int opcion = -1; // Variable para almacenar la opción seleccionada por el usuario
            try {
                // Intenta leer y convertir la entrada del usuario a un número entero
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) { // Captura el error si la entrada no es válida
                System.out.println("Entrada no válida. Por favor, ingrese un número entre 1 y 7.");
                continue; // Vuelve al inicio del bucle
            }
            // Estructura de control para ejecutar acciones basadas en la opción
            // seleccionada
            switch (opcion) {
                case 1: // Opción 1: Crear o borrar una oración
                    while (true) { // Bucle principal para registrar alumnos
                        System.out.print("Ingrese el nombre del alumno: "); // Solicita el nombre
                        nombre = sc.nextLine().trim(); // Lee la entrada

                        if (nombre.isEmpty()) { // Verifica si está vacío
                            System.out.println("El nombre no puede estar vacío.");
                            continue; // Reinicia el bucle
                        }

                        System.out.print("Ingrese la nota del alumno: "); // Solicita la nota
                        double nota = -1; // Variable para la nota
                        try {
                            nota = Double.parseDouble(sc.nextLine().trim());
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Por favor, ingrese un número.");
                            continue; // Reinicia el bucle
                        }

                        if (nota < 0 || nota > 10) { // Valida el rango de la nota
                            System.out.println("La nota debe estar entre 0 y 10.");
                            continue; // Reinicia el bucle
                        }

                        // Almacena los datos del alumno
                        alumno[cont] = nombre;
                        notas[cont] = nota;
                        cont++;
                        System.out.println("Alumno registrado con éxito.");

                        // Preguntar si desea continuar
                        System.out.println("¿Desea registrar otro alumno? (1 = sí, 0 = no): ");
                        int respuesta = -1; // Inicializa la opción
                        try {
                            respuesta = Integer.parseInt(sc.nextLine().trim());
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Por favor, ingrese 1 para sí o 0 para no.");
                            continue; // Reinicia el bucle
                        }

                        if (respuesta == 0) {
                            System.out.println("Registro finalizado. Saliendo...");
                            break; // Sale del bucle principal
                        } else if (respuesta != 1) {
                            System.out.println("Opción inválida. Por favor, ingrese 1 para sí o 0 para no.");
                        }
                    }
                    break;

                case 2: // mostrar todos los alumonos

                    if (cont == 0) { // Verifica si no hay un nombre ingresado
                        System.out.println("No hay alumnos ingresados.");
                    } else {
                        System.out.println("Alumnos registrados:");
                        for (int i = 0; i < cont; i++) {
                            System.out.println((i + 1) + "- " + alumno[i] + " - " + notas[i]);
                        }
                    }
                    break;

                case 3: // mostrar el promedio de notas hasta el momento
                    if (cont == 0) { // Verifica si no hay un nombre ingresado
                        System.out.println("No hay alumnos ingresados.");
                    } else {
                        double suma = 0; // Inicializa la suma
                        for (int i = 0; i < cont; i++) {
                            suma += notas[i]; // Suma las notas
                        }
                        double promedio = suma / cont; // Calcula el promedio
                        System.out.println("Promedio de notas: " + promedio);
                    }
                    break;

                case 4: // buscar alumno por nombre
                    if (cont == 0) { // Verifica si no hay alumnos ingresados
                        System.out.println("No hay alumnos ingresados.");
                    } else {
                        boolean encontrado = false;

                        while (!encontrado) { // Repite hasta que se encuentre el alumno
                            System.out.println(
                                    "Ingrese el nombre del alumno a buscar (o escriba 'salir' para volver al menú):");
                            nombre = sc.nextLine().trim();

                            if (nombre.equalsIgnoreCase("salir")) { // Permitir al usuario salir del bucle
                                System.out.println("Saliendo al menú...");
                                break;
                            }

                            for (int i = 0; i < cont; i++) {
                                if (alumno[i].equalsIgnoreCase(nombre)) { // Compara ignorando mayúsculas y minúsculas
                                    System.out.println("Alumno encontrado: " + alumno[i] + " nota - " + notas[i]);
                                    encontrado = true; // Termina el bucle al encontrar el alumno
                                    break;
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Alumno no encontrado. Inténtelo nuevamente.");
                            }
                        }
                    }
                    break;

                case 5: // modificar nota por nombre
                    if (cont == 0) { // Verifica si no hay alumnos ingresados
                        System.out.println("No hay alumnos ingresados.");
                    } else {
                        System.out.println("Ingrese el nombre del alumno a buscar:");
                        nombre = sc.nextLine().trim();
                        boolean encontrado = false;

                        for (int i = 0; i < cont; i++) {
                            if (alumno[i].equals(nombre)) {
                                double nuevaNota = -1;
                                boolean notaValida = false;

                                // Repetir hasta que se obtenga una nota válida
                                while (!notaValida) {
                                    System.out.println("Ingrese la nueva nota (de 0 a 10):");

                                    try {
                                        nuevaNota = Double.parseDouble(sc.nextLine().trim());

                                        // Validar que la nota esté dentro del rango permitido
                                        if (nuevaNota < 0 || nuevaNota > 10) {
                                            System.out
                                                    .println("La nota debe estar entre 0 y 10. Inténtelo nuevamente.");
                                        } else {
                                            notaValida = true; // Salir del bucle si la nota es válida
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Entrada no válida. Por favor, ingrese un número.");
                                    }
                                }

                                // Asignar la nueva nota después de validarla
                                notas[i] = nuevaNota;
                                System.out.println("Nota modificada con éxito.");
                                encontrado = true;
                                break; // Salir del bucle de búsqueda después de modificar la nota
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Alumno no encontrado.");
                        }
                    }
                    break;

                case 6: // eliminar nombre
                    if (cont == 0) { // Verifica si no hay alumnos ingresados
                        System.out.println("No hay alumnos ingresados.");
                    } else {
                        boolean encontrado = false;

                        while (!encontrado) {
                            System.out.println("Ingrese el nombre del alumno a eliminar:");
                            nombre = sc.nextLine().trim();

                            for (int i = 0; i < cont; i++) {
                                if (alumno[i].equals(nombre)) {
                                    System.out.println("¿Desea eliminar definitivamente al alumno " + nombre
                                            + "? Ingrese 1 = sí o 0 = no:");
                                    int response;

                                    try {
                                        response = Integer.parseInt(sc.nextLine().trim());

                                        if (response == 1) {
                                            // Eliminar el alumno desplazando los elementos
                                            for (int j = i; j < cont - 1; j++) {
                                                alumno[j] = alumno[j + 1];
                                                notas[j] = notas[j + 1];
                                            }
                                            cont--; // Decrementar el contador de alumnos
                                            System.out.println("Alumno eliminado con éxito.");
                                            encontrado = true;
                                            break; // Salir del bucle de búsqueda
                                        } else if (response == 0) {
                                            System.out.println("Alumno no eliminado.");
                                            encontrado = true; // Salir del bucle sin eliminar ni mostrar "Alumno no
                                                               // encontrado"
                                            break;
                                        } else {
                                            System.out.println("Opción no válida. Inténtelo de nuevo.");
                                        }
                                    } catch (NumberFormatException e) {
                                        System.out.println("Entrada no válida. Por favor, ingrese 1 o 0.");
                                    }
                                }
                            }

                            if (!encontrado) {
                                System.out.println("Alumno no encontrado. Inténtelo nuevamente.");
                            }
                        }
                    }
                    break;

                case 7: // Opción 9: Salir del programa
                    salir = true; // Cambia la bandera para salir del bucle
                    System.out.println("Saliendo del programa."); // Mensaje de salida
                    break;

                default: // Opción inválida
                    System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 7.");
                    break;
            }

        }
        sc.close();
    }
}

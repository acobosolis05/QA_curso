
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import models.Contacto;


public class AppMenu {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayListContactos();
        HashSetContactos();
    }

    public static void ArrayListContactos() {
        ArrayList<Contacto> contactos = new ArrayList<>();
        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.print("Ingrese el nombre del contacto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el número de teléfono del contacto: ");
                        String telefono = sc.nextLine();
                        System.out.print("Ingrese el correo electrónico del contacto: ");
                        String correo = sc.nextLine();
                        contactos.add(new Contacto(nombre, telefono, correo));
                        System.out.println("¿Desea agregar otro contacto? (s/n):");
                    } while (sc.nextLine().equalsIgnoreCase("s"));
                    System.out.println("Contactos agregados con éxito");
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    contactos.removeIf(contacto -> contacto.getNombre().equals(nombreEliminar));
                    System.out.println("Contacto eliminado con éxito");
                }
                case 3 -> {
                    System.out.println("Contactos: ");
                    for (Contacto contacto : contactos) {
                        System.out.println(
                                contacto.getNombre() + " - " + contacto.getTelefono() + " - " + contacto.getCorreo());
                    }
                }
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        }

    }

    public static void HashSetContactos() {
        HashSet<Contacto> contactos = new HashSet<>();
        while (true) {
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto");
            System.out.println("3. Mostrar contactos");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1 -> {
                    do {
                        System.out.print("Ingrese el nombre del contacto: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el número de teléfono del contacto: ");
                        String telefono = sc.nextLine();
                        System.out.print("Ingrese el correo electrónico del contacto: ");
                        String correo = sc.nextLine();
                        contactos.add(new Contacto(nombre, telefono, correo));
                        System.out.println("¿Desea agregar otro contacto? (s/n):");
                    } while (sc.nextLine().equalsIgnoreCase("s"));
                    System.out.println("Contactos agregados con éxito");
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del contacto a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    contactos.removeIf(contacto -> contacto.getNombre().equals(nombreEliminar));
                    System.out.println("Contacto eliminado con éxito");
                }
                case 3 -> {
                    System.out.println("Contactos: ");
                    for (Contacto contacto : contactos) {
                        System.out.println(contacto.getNombre() + " - " + contacto.getTelefono() + " - "
                                + contacto.getCorreo());
                    }
                }
                case 4 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        }
    }
}

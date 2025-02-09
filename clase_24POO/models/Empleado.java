package clase_24POO.models;

import java.util.ArrayList;
import java.util.List;

// Clase principal que representa un empleado
public class Empleado {
    // Atributos privados de la clase (encapsulamiento)
    private String nombre; // Nombre del empleado
    private Integer edad; // Edad del empleado
    private Double salario; // Salario del empleado
    private String departamento; // Departamento del empleado

    // Lista estática que almacena todos los empleados creados
    private static List<Empleado> empleados = new ArrayList<>();

    // Constructor vacío (por defecto)
    public Empleado() {
    }

    // Constructor para inicializar un empleado con valores específicos
    public Empleado(String nombre, Integer edad, Double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Métodos getter y setter para acceder y modificar los atributos privados

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Métodos estáticos para gestionar la lista de empleados

    // Devuelve la lista completa de empleados
    public static List<Empleado> getEmpleados() {
        return empleados;
    }

    // Permite reemplazar la lista de empleados con una nueva lista
    public static void setEmpleados(List<Empleado> empleados) {
        Empleado.empleados = empleados;
    }

    public static void agregarEmpleado(String nombre, Integer edad, double salario, String departamento) {
        if (empleados.size() >= 10) {
            System.out.println("No se pueden agregar más empleados. Límite alcanzado (10 empleados).\n");
            return;
        }
        empleados.add(new Empleado(nombre, edad, salario, departamento));
        System.out.println("Empleado agregado con éxito.\n");
    }

    // Método para mostrar todos los empleados registrados
    public static void mostrarEmpleados() {
        // Verifica si la lista está vacía
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.\n");
            return;
        }

        // Imprime la cabecera de la tabla de empleados
        System.out.printf("%-5s %-15s %-5s %-10s %-15s%n", "ID", "Nombre", "Edad", "Salario", "Departamento");
        System.out.println("---------------------------------------------------------");

        // Recorre la lista y muestra los datos de cada empleado
        int id = 1; // Se utiliza un ID para numerar a los empleados
        for (Empleado emp : empleados) {
            System.out.printf("%-5d %-15s %-5d %-10.2f %-15s%n",
                    id++, emp.getNombre(), emp.getEdad(), emp.getSalario(), emp.getDepartamento() + "\n");
        }
    }

    // Métodos de ordenamiento usando el algoritmo de Burbuja

    // Ordena los empleados por nombre (alfabéticamente)
    public static void ordenarPorNombreBurbuja() {
        int n = empleados.size(); // Tamaño de la lista
        for (int i = 0; i < n - 1; i++) { // Bucle externo
            for (int j = 0; j < n - i - 1; j++) { // Bucle interno
                // Compara los nombres de empleados en posiciones adyacentes
                if (empleados.get(j).nombre.compareToIgnoreCase(empleados.get(j + 1).nombre) > 0) {
                    // Intercambia las posiciones si están en el orden incorrecto
                    Empleado temp = empleados.get(j);
                    empleados.set(j, empleados.get(j + 1));
                    empleados.set(j + 1, temp);
                }
            }
        }
    }

    // Ordena los empleados por edad (de menor a mayor)
    public static void ordenarPorEdadBurbuja() {
        int n = empleados.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara las edades de empleados en posiciones adyacentes
                if (empleados.get(j).edad > empleados.get(j + 1).edad) {
                    // Intercambia las posiciones si están en el orden incorrecto
                    Empleado temp = empleados.get(j);
                    empleados.set(j, empleados.get(j + 1));
                    empleados.set(j + 1, temp);
                }
            }
        }
    }

    // Ordena los empleados por salario (de menor a mayor)
    public static void ordenarPorSalarioBurbuja() {
        // Verifica si la lista está vacía
        int n = empleados.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara los salarios de empleados en posiciones adyacentes
                if (empleados.get(j).salario > empleados.get(j + 1).salario) {
                    // Intercambia las posiciones si están en el orden incorrecto
                    Empleado temp = empleados.get(j);
                    empleados.set(j, empleados.get(j + 1));
                    empleados.set(j + 1, temp);
                }
            }
        }
    }

    // Métodos de filtrado usando streams

    // Filtra los empleados por nombre
    public static List<Empleado> filtrarPorNombre(String nombre) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    // Filtra los empleados por rango de edad
    public static List<Empleado> filtrarPorEdad(int edadMin, int edadMax) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getEdad() >= edadMin && emp.getEdad() <= edadMax) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    // Filtra los empleados por rango de salario
    public static List<Empleado> filtrarPorSalario(double salarioMin, double salarioMax) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getSalario() >= salarioMin && emp.getSalario() <= salarioMax) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    // Filtra los empleados por departamento
    public static List<Empleado> filtrarPorDepartamento(String departamento) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getDepartamento().equalsIgnoreCase(departamento)) {
                resultado.add(emp);
            }
        }
        return resultado;
    }

    public static List<Empleado> buscarEmpleado(String nombre) {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            if (emp.getNombre().equalsIgnoreCase(nombre)) {
                resultado.add(emp);
            }
        }

        return resultado;

    }
    // Incrementar salario: Este método recibirá un objeto empleado y un porcentaje de aumento salarial.
    //  Devolverá el mismo objeto con su salario incrementado según el porcentaje proporcionado.
    public static List<Empleado> incrementarSalario() {
        List<Empleado> resultado = new ArrayList<>();
        for (Empleado emp : empleados) {
            double aumento = emp.getSalario() * 0.1;
            emp.setSalario(emp.getSalario() + aumento);
            resultado.add(emp);   
        }

        return resultado;

    }
}
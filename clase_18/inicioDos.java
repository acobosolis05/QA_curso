package clase_18;

public class inicioDos {
    public static void main(String[] args) {
        String nombre = "Juan";
        int edad = 25;
        imprimeNombre(nombre);
        imprimeNombreYEdad(nombre, edad);
    }

    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es: " + nombre);

    }

    public static void imprimeNombreYEdad(String nombre, int edad)  {
    System.out.println("Me llamo " + nombre + " y tengo " + edad + " años");
}
}
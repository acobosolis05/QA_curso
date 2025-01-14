package clase_10;

// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena
//  los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.
public class concatenando {
    public static void main(String[] args) {
        String[] array = { "Hola", "mundo", "esto", "es", "un", "mensaje" };
        String resultado = "";
        for (int i = 0; i < array.length; i++) {
            resultado = resultado + array[i] + " ";
        }
        System.out.println(resultado);
    }

}

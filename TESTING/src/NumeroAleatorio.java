public class NumeroAleatorio {
    public static void main(String[] args) {

    }

    public static Integer numeroAleatorioEnRango(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("El valor mínimo no puede ser mayor que el valor máximo.");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

}
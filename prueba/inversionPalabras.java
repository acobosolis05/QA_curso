public class inversionPalabras {
    public static void main(String[] args) {
        String[] palabras = {"hola", "mundo", "java", "programacion"};
        String[] palabrasInvertidas = new String[palabras.length];
        for (int i = 0; i < palabras.length; i++) {
            palabrasInvertidas[i]= palabras[palabras.length -1 -i];
    }
    System.out.println("Entrada: ");
    System.out.println(java.util.Arrays.toString(palabras));
    System.out.println("Salida: ");
    for(int i = 0; i < palabrasInvertidas.length; i++){
        System.out.print(palabrasInvertidas[i]);
        if (i < palabrasInvertidas.length - 1){
            System.out.print(", ");
        }

        
    }
}
}

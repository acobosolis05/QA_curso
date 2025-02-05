package clase_21POO;

public class EjecutableObjetos {
    public static void main(String[] args) {
        // Persona persona1 = new Persona();
        // persona1.nombre = "ANA";
        // persona1.edad = 25;
        // persona1.imprimirDatos();
        // //persona 2
        // Persona persona2 = new Persona();
        // persona2.nombre = "JUAN";
        // persona2.edad = 30;
        // persona2.imprimirDatos();

        //constructores
        Persona persona3 = new Persona( "Jorge");
        persona3.imprimirDatos();
        Persona persona4 = new Persona( "Jorge", 30);
        persona4.imprimirDatos();
    }
    
}

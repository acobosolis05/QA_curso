package clase_22POO;

public class Persona {
    String nombre;
    Integer edad;

    public Persona(){

    }
    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = 0;
    }
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
        }

        public void imprimirDatos (){
            System.out.println("datos de la persona:\n" +
                                "Nombre: " + this.nombre + "\n" +
                                "Edad: " + this.edad + "\n");
        }
}

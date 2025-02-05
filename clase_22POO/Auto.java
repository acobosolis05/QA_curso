package clase_22POO;

public class Auto {
    String marca;
    String modelo;
    Integer año;
    
    public Auto(){

    }
    public Auto(String marca, String modelo, Integer año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        
    }
    public Auto(String marca){
        this.marca = marca;
        
        
    }

    public void imprimirDatos (){
        System.out.println("datos del auto:\n" +
                            "Marca: " + this.marca + "\n" +
                            "Modelo: " + this.modelo + "\n" +
                            "Año: " + this.año + "\n");
    }
}

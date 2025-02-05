package clase_23POO2.modelos;
// // Crea un método para cálculos entre puntos, estático, llamado 
// 'calcularDistancia' en la clase 'Punto'. Este método recibe dos 
// objetos de la misma clase y calcula la distancia entre ellos.

// // Crea un método estático para cálculos entre puntos, llamado 'estanAlineados' 
// en la clase 'Punto'. Este método recibe tres objetos de la clase 'Punto' 
// y determina si los puntos dados están alineados en la misma recta
public class Punto {
    private Integer x;
    private Integer y;
    
    public Punto(){

    }
    public Punto(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public Integer getX() {
        return x;
    }
    public void setX(Integer x) {
        this.x = x;
    }
    public Integer getY() {
        return y;
    }
    public void setY(Integer y) {
        this.y = y;
    }
    // Método de instancia: distancia desde el origen
    public double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }
      // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    // Método estático para verificar si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        return (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) == 
               (p3.getY() - p2.getY()) * (p2.getX() - p1.getX());
    }

}

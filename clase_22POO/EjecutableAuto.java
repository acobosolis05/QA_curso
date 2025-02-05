package clase_22POO;

public class EjecutableAuto {
    public static void main(String[] args) {
    Auto auto1 = new Auto( "elprimero", "XVL", 2020);
        auto1.imprimirDatos();
    Auto auto2 = new Auto( "elsegundo", "MLXVL");
        auto2.imprimirDatos();
    Auto auto3 = new Auto( "eltercero");
        auto3.imprimirDatos();
    Auto auto4 = new Auto();
    auto4.imprimirDatos();
}
}
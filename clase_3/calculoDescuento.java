import java.util.Scanner;

public class calculoDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        if (precio >= 100){
            double descuento = precio * 0.9;
            System.out.println("El precio con descuento es: " + descuento);
            }else {
                System.out.println("No hay descuento el valor del producto es: " + precio);
            
            }
        
        sc.close();
    }
}
import java.util.Scanner;

public class work { 
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese el numero de productos comprados: ");
        cantidad = lectura.nextInt();
        int PrecioTotal = cantidad * 10000;
        System.out.println("La cantidad de productos es de:" + cantidad + " El total de los productos es de: " + PrecioTotal );
        int pagar; 
        
        lectura.close();
    }
    
}

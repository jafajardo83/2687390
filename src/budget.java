import java.util.Scanner;

public class budget {
    public static void main(String[] args) throws Exception {
        Scanner mano = new Scanner(System.in);
        int ancho;
        System.out.println("Ingrese los mentros del ancho");
        ancho = mano.nextInt();
        int largo;
        System.out.println("Ingrese los mentros del largo");
        largo = mano.nextInt();
        int area = ancho * largo; 
        int resultado = 45000 * area ;
        System.out.println("El total de la mano de obra es:" + resultado);
        System.out.println("Los metros en ancho son: " + ancho+ " Los metros en largo son: " + largo+ " La superficie a cubrir tiene: " + area+"m2," + " El total de la mano de obra es:" + resultado);

        
        


        mano.close();
    }
}

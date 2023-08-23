// Calcular la hipotenusa con su respectiva formula

import java.util.Scanner;

public class _p10_HipotenusaTriangulo {

    public static void main(String[] args) {
        
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        double long1, long2, hipotenusa;

        Scanner obj = new Scanner(System.in);

        System.out.println("Cual es la primer longitud ?"); long1 = obj.nextDouble();
        System.out.println("Cual es la segunda longitud?"); long2 = obj.nextDouble();

        hipotenusa = Math.sqrt(long1 * long1 + long2 * long2);

        System.out.println(String.format("La Hipotenusa es === %.2f ", hipotenusa ));


    }
}
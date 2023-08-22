// Efectua operaciones sobre un numero entero, usando los operadores de asignacion

import java.util.Scanner;

import javax.imageio.ImageIO;

public class _p07_OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        System.out.print("Dame un numero ?");
        float num=new Scanner(System.in).nextInt();

        System.out.printf("\nEl numero es :%.2f\n",num);
        System.out.printf("\nIncrementar  :%.2f\n",++num);
        System.out.printf("\nSumar 80     :%.2f\n",num+=80);
        System.out.printf("\nRestar 35    :%.2f\n",num-=35);
        System.out.printf("\nMult x 15    :%.2f\n",num*=15);
        System.out.printf("\nDiv / 4      :%.2f\n",num/=4);
        System.out.printf("\nDecrementar  :%.2f\n",--num);

    }
}

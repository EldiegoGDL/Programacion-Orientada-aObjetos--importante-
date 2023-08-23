// Cono ciendo 2 angulos de un trindulo calcular el tercero

import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        double angulo1, angulo2, angulo3;

        Scanner obj = new Scanner(System.in);

        System.out.println("Dame el primer angulo ");angulo1=obj.nextDouble();
        System.out.println("Dame el Segundo angulo");angulo2=obj.nextDouble();

        angulo3 = 180-(angulo1 + angulo2);

        System.out.println(String.format("\nEl valor del tercer angulo es === %.2f",angulo3));



    }
}

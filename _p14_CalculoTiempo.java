// Dada una cantidad en horas, calcular su equivalente en días, minutos y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        double dias, minutos, segundos, horas;
        Scanner obj =new Scanner(System.in);

        System.out.println("Dame las horas");horas=obj.nextDouble();

        dias = (horas/24);
        minutos = (horas/60);
        segundos = (minutos/60);

        System.out.println(String.format("\nCuantos dias equivale = %f",dias));
        System.out.println(String.format("\nCuantos minutos equivale = %f",minutos));
        System.out.println(String.format("\nCuantos segundos equivale = %f",segundos));
        
    }
}

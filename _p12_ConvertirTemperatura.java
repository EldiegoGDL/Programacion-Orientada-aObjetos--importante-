//Se desea convertir una temperatura de grados fahrenheit a grados celsius

import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        double celsius, fahrenheit;

        Scanner obj =new Scanner(System.in);

        System.out.println("Dame la temperatura en fahrenheit");fahrenheit=obj.nextDouble();

        celsius = 5 *(fahrenheit-32) /9;

        System.out.println(String.format("La temperatura en celsius seria === %.5f", celsius));


    }
}

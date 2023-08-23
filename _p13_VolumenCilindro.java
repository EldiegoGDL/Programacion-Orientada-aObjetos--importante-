//Se desea calcular el volumen de un cilindro dado su radio y altura

import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        double volumen, radio, altura;
        Scanner obj =new Scanner(System.in);

        System.out.println("Dame el radio  ");radio=obj.nextDouble();
        System.out.println("Dame el altura  ");altura=obj.nextDouble();

        volumen = Math.PI * (radio * radio) * altura;

        System.out.println(String.format("\nEl volumen es de === %.2f",volumen));

    }
}

import java.util.Scanner;

public class _p09_DividirEnCifras {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush(); // limpia la pantalla de la consola

        System.out.println("Dame un numero entero de 3 cifra: ");

        int num = new Scanner(System.in).nextInt();
        int centenas = num / 100 ;
        int decenas = ( num - centenas * 100) / 10 ;
        int unidades = ( num - (centenas * 100 + decenas * 10) );

        System.out.println("El nuemero introducido fue : " + num);
        System.out.println("Centenas : " + centenas);
        System.out.println("Decenas : " + decenas);
        System.out.println("Unidades : " + unidades);
    }
}

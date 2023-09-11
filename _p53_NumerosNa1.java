// imprime numeros del n a 1 con paso de p

import java.util.Scanner;

public class _p53_NumerosNa1 {
    public static void main(String[] args) {

        int n, i, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime numeros del n a 1\n");

        System.out.println("Desde Donde ?"); n = obj.nextInt();
        System.out.println("Paso ?"); p = obj.nextInt();

        for(i=n; i>=1; i = i - p) {
            System.out.printf("%d ",i);
        }

        System.out.println("\nProceso Terminado\n");

    }
}
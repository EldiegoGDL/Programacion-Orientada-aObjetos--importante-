// imprime numeros del 1 a n con paso de p

import java.util.Scanner;

public class _p52_Numeros1aN {
    public static void main(String[] args) {

        int n, i, p;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Imprime numeros del 1 a n\n");

        System.out.println("Hasta Donde ?"); n = obj.nextInt();
        System.out.println("Paso ?"); p = obj.nextInt();

        for(i=1; i<=n; i = i + p) {
            System.out.printf("%d ",i);
        }

        System.out.println("\nProceso Terminado\n");

    }
}

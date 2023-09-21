// imprimir la secuencia de términos armónicos el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {

        char resp;
        double n, resultado, i;

        Scanner obj = new Scanner(System.in);
        
        do {

            System.out.print("\033[H\033[2J");
            System.out.print("Cuantos Terminos ? ");n = obj.nextDouble();
            resultado= 0;

            for ( i = 1; i <= n; i++) {

                resultado = resultado + (1/i);
                System.out.printf("1/%.2f + ",i);
               
            }
            System.out.printf("\nSuma = %.4f",resultado);

            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}

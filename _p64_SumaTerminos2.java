// imprimir la secuencia de términos, el número de renglones que el usuario desee y su suma

import java.util.Scanner;

public class _p64_SumaTerminos2 {
    public static void main(String[] args) {

        char resp;
        int j, n, resultado, i;
        

        Scanner obj = new Scanner(System.in);
        
        do {

            System.out.print("\033[H\033[2J");
            System.out.print("Cuantos Terminos ? ");n = obj.nextInt();
            resultado= 0;
            String num="1";

            for ( i = 1; i <= n; i++) {
                if (i==1) {
                    resultado = resultado + 1 ;
                    System.out.printf("%d + ",i);
                    
                } else {
                       
                    num = num + "1";
                    int one=Integer.parseInt (num);
                    System.out.printf("%d + ",one);
                    resultado = resultado + one;
                }
               
            }
            System.out.printf("\nSuma = %d",resultado);

            System.out.print("\nDeseas continuar (S/N) ?");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp != 'N');
        System.out.println("\nProceso terminado ..");
    }
}

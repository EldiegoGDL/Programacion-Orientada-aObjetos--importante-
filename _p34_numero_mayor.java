//Dados tres números enteros, verificar cual es el mayor.

import java.util.Scanner;

public class _p34_numero_mayor {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int num1, num2, num3;
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Cual es el primer numero  ?"); num1 =obj.nextInt();
        System.out.println("Cual es el segundo numero ?"); num2 =obj.nextInt();
        System.out.println("Cual es el tercer numero  ?"); num3 =obj.nextInt();

        if (num1 <num2 ) {
            if (num2 < num3) {
                System.out.println(String.format("El NUMERO %d ES EL NUMERO MAYOR ",num3));
            }
            else
                System.out.println(String.format("El NUMERO %d ES EL NUMERO MAYOR ",num2));
        }
        else
            System.out.println(String.format("El NUMERO %d ES EL NUMERO MAYOR ",num1));    

    }
}

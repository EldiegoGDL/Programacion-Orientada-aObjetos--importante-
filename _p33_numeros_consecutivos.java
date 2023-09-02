//Dados tres números enteros, verificar si son consecutivos

import java.util.Scanner;

public  class _p33_numeros_consecutivos {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        int num1, num2, num3;
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Cual es el primer numero  ?"); num1 =obj.nextInt();
        System.out.println("Cual es el segundo numero ?"); num2 =obj.nextInt();
        System.out.println("Cual es el tercer numero  ?"); num3 =obj.nextInt();

        if (num1 <num2 ) {
            if (num2 < num3 ) {
                if (num1 < num3) {
                    System.out.println("LOS NUMEROS SON CONSECUTIVOS");
                }
            }
            else
                System.out.println("ERROR LOS NUMEROS NO SON CONSECUTIVOS");
        }
        else
            System.out.println("ERROR LOS NUMEROS NO SON CONSECUTIVOS");


    }
}
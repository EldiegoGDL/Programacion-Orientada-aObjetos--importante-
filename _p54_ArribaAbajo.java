// Imprime numeros del n a 1 o del 1 a n

import java.util.Scanner;

public class _p54_ArribaAbajo {
    public static void main(String[] args) {
        int n,op;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("[1] Numeros de 1 a n?");
            System.out.println("[2] Numeros de n a 1?");
            System.out.println("[3] Salir           ");
            System.out.println("Elije ?");op = obj.nextInt();

            switch (op) {
                case 1: System.out.print("Hasta donde deseas llegar ? ");n = obj.nextInt();
                    for(int i=1; i<=n; i = i + 1) 
                        System.out.printf("%d ",i);
                    
                        break;
            
                case 2: System.out.print("Desde donde deseas llegar ? ");n = obj.nextInt();
                    for(int i=n; i>=1; i = i - 1) 
                        System.out.printf("%d ",i);

                    break;
                case 3:
                    System.out.println("Te vas porque quieres, Adios\n");
                    break;
                default:
                    System.out.println("OPcion Invalida\n");
                    break;
            }
            System.out.println("\nPresiona <Enter> para continuar"); obj.nextLine();obj.nextLine();
        } while (op!=3);
            System.out.println("Te vas porque quieres, Adios\n");
    }
}

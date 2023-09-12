// imprimir los primeros n números de la serie de fibbonaci.

import java.util.Scanner;

public class _p51_SerieFibonaci {
    public static void main(String[] args) {
        int f1 , fn ,f2 , n;
        String Decicion;
    
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Cual es el valor maximo ?");n=obj.nextInt();
            fn = n;
            f1 = 0;
            f2 = 1;
            System.out.println("\n");
            while (f1 <= n) {
                System.out.printf("%d ",f1);
                
                fn = f1 + f2;
                
                f2= f1;
                
                f1 = fn;
                
            }

            System.out.println("\n\nDesea continuar (s/n)?");Decicion=obj.next();
            switch (Decicion) {
                case "s":
                    Decicion = "s";
                    break;
                case "n":
                    Decicion = "n";
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }
        } while (Decicion=="s");
        
    }


}

//imprimir los números impares de forma ascendente desde 1 hasta el número que el usuario decida (n)

import java.util.Scanner;

public class _p48_ImparesAscendente {
    public static void main(String[] args) {
        int A ,n ,i ;
        double promedio, suma;
        String Decicion;

        Scanner obj = new Scanner(System.in);


        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Hasta donde terminara ?"); n = obj.nextInt();
            A = 1 ;
            suma = 0 ;
            System.out.printf("\nNumeros impares entre 1 y %d \n",n);
            while (A <= n) {
                System.out.printf("%d ",A);
                i = A;
                if (A%2==0){
                    A = A + 1;
                    suma = suma + i ;
                }
                else 
                    A = A + 2;
                    suma = suma + i ;
            }
            promedio = suma / n;
            System.out.printf("\n\nLa suma es igual a : %.2f ",suma);

            System.out.printf("\nEl promedio es igual a : %.2f ", promedio);
            

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

        } while (Decicion =="s");
    }
}

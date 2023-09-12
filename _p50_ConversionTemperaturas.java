// calcular la temperatura convertida de grados centígrados a grados farenheit de un rango de valores

import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        int tempI, tempF;
        double c, farenheit;
        String Decicion;

        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J");System.out.flush();
            System.out.println("Cual es la temperatura inicial ?");tempI=obj.nextInt();
            System.out.println("\nCual es la temperatura final ?");tempF=obj.nextInt();
            c = tempI;
            System.out.println("------------------------------\nCentigrados   Farenheit\n------------------------------");
            while (tempI <= tempF) {
                farenheit = 32 + (9 * tempI / 5);
                System.out.printf("\n%d            %.2f",tempI ,farenheit);
                c = c + 1;
                tempI = tempI + 1;
            }
            System.out.println("\n------------------------------");
            
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

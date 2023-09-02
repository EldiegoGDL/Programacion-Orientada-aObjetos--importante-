//Dado un número entero entre 1 y 6 que corresponde a un continente del mundo

import java.util.Scanner;

public class _p35_continentes_mundo {
    public static void main(String[] args) {
        int n1;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Elije un numero para seleccionar un continente\nSabiendo que 1: Asia , 2: Africa, 3: America del Norte, 4: America del Sur, 5: Antartida, 6: Europa");n1=obj.nextInt();

        switch (n1) {
            case 1 :
                System.out.println("Asia");
                break;
            case 2 :
                System.out.println("Africa");
                break;
            case 3 :
                System.out.println("America del Norte");
                break;
            case 4 :
                System.out.println("America del Sur");
                break;
            case 5 :
                System.out.println("Antartida");
                break;
            case 6 :
                System.out.println("Europa");
                break;    
            default:
                System.out.println("ERROR OPCION INVALIDA");
                break;
        }

    }
    
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class _p129_ExcepcionDulces {
    public static void main(String[] args) {
        int niños;
        int dulces;

        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Cuantos niños son : ");niños = obj.nextInt();
            System.out.print("Cuantos dulces son : ");dulces = obj.nextInt();

            int distribucion = niños / dulces;

            System.out.printf("A cada niño le tocan %d dulces", distribucion);
        } catch (InputMismatchException e) {
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        }catch(ArithmeticException e){
            System.out.println("Los niños y los dulces, deben ser cantidades numéricas");
        }
    }
}

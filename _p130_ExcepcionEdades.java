import java.util.InputMismatchException;
import java.util.Scanner;;

public class _p130_ExcepcionEdades {
    public static void Mostrar(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int edad_1,edad_2,edad_3,edad_4,edad_5;

        Scanner obj = new Scanner(System.in);


        try {
            System.out.print("Edad del persona 1 = ");edad_1 =obj.nextInt();
            System.out.print("Edad del persona 2 = ");edad_2 =obj.nextInt();
            System.out.print("Edad del persona 3 = ");edad_3 =obj.nextInt();
            System.out.print("Edad del persona 4 = ");edad_4 =obj.nextInt();
            System.out.print("Edad del persona 5 = ");edad_5 =obj.nextInt();

            int [] arreglo = {edad_1,edad_2,edad_3,edad_4,edad_5};

            System.out.println("Captura terminada las edades son: ..."); Mostrar(arreglo);
        } catch (InputMismatchException e) {
            System.out.println("Introduce un número entero");
        }
    }
}

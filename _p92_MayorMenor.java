import java.util.Scanner;

public class _p92_MayorMenor {
    public static int Mayor(int[] t) {
        int m = t[0];
        for (int i = 0; i < t.length; i++)
            if (t[i] > m)
                m = t[i];

        return m;
    }
    public static int Menor(int[] t) {
        int m = t[0];
        for (int i = 0; i < t.length; i++)
            if (t[i] < m)
                m = t[i];

        return m;
    }
    public static void main(String[] args) {
        int n = 0;
        int suma = 0, promedio = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Cuantos elementos deseas procesar ? ");
        n = obj.nextInt();
        int[] califs = new int[n];
        System.out.printf("Introduce el elemento %d \n", n);
        for (int i = 0; i < califs.length; i++) {
            System.out.printf("Calificacion %d : ", i + 1);
            califs[i] = obj.nextInt();
        }
        System.out.println("\nEl arreglo de elementos capturadas es :");
        for (int cal : califs) {
            System.out.printf("%d ", cal);
            suma = suma + cal;
        }

        System.out.printf("\nEl elemento mayor es : %d",Mayor(califs));
        System.out.printf("\nEl elemento mayor es : %d",Menor(califs));

    }
}

import java.util.Random;

public class _p93_ParesImpares {
    public static void GeneraAleatorio(int[] nums) {
        int min = 0, max = 20;
        Random rnd = new Random();
        for (int i = 0; i < nums.length; i++)

            nums[i] = Math.abs(rnd.nextInt(max - min)) + min;
    }
    public static void Mostrar(int[] nums) {
        for (int n : nums)

            System.out.printf("%d ", n);

        System.out.println("\n");
    }
    public static void par(int[] nums) {
        int i=0;
        for (int n : nums)
            if (n==0) {
                
            } else {
                if ( n%2==0 ) {
                    System.out.printf("%d ", n);
                    i = i + 1;
                }
            }

        System.out.println("\n");
    }
    public static void impar(int[] nums) {
        for (int n : nums)
            if (n==0) {
                
            } else {
                if ( n%2==0 ) {
                    
                }
                System.out.printf("%d ", n);
            }

        System.out.println("\n");
    }
    public static void main(String[] args) {
        int MAX = 100;
        int[] A = new int[MAX];
        int[] B = new int[MAX];
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("El arreglo ya con aletorios generados:\n");
        GeneraAleatorio(A);
        GeneraAleatorio(B);
        Mostrar(A);
        Mostrar(B);
        System.out.println("\nLos elementos del areglo que son pares:");
        par(A);
        par(B);
        System.out.println("\nLos elementos del areglo que son impares:");
        impar(A);
        impar(B);
    }
}

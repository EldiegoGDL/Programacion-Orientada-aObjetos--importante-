// Mostrar un arreglo usando una funcion, lo eleva al cuadrado usando una funcion

public class _p86_ArregloMostrar {
    public static void Mostrar(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void cuadrado(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }
    }

    public static void main(String[] args) {
        int [] arr1 = {2,4,6,8,3,5,7};
        int [] arr2 = {1,3,5,7,9,11};

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("\nElementos del arreglo original arr1\n");
        Mostrar(arr1);
        System.out.println("\n\nElementos del arreglo arr2\n");
        Mostrar(arr2);
        
        System.out.println("\nElementos del arreglo original arr1 ahora al cuadrado\n");
        cuadrado(arr1); Mostrar(arr1);
        System.out.println("\n\nElementos del arreglo arr2 ahora al cuadrado\n");
        cuadrado(arr2); Mostrar(arr2);
    }
}
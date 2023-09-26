// Inicializa de forma manual arreglo de cadenas y lo imprime
public class _p82_InicializaArregloCadenas {
    public static void main(String[] args) {
        String[] munisipios = new String[10];
        munisipios[0] = "Apozol";
        munisipios[1] = "Apulco";
        munisipios[2] = "Cañitas";
        munisipios[3] = "Jerez";
        munisipios[4] = "Fresnillo";
        munisipios[5] = "Rio Grande";
        munisipios[6] = "Sain Alto";
        munisipios[7] = "Sombrerete";
        munisipios[8] = "Teul de Gonzalez Ortega";
        munisipios[9] = "Zacatecas";
        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.printf("Primer elemento del arreglo %s\n", munisipios[0]);
        System.out.printf("Ultimo elemento del arreglo %s\n", munisipios[9]);
        System.out.println("\nTodos los elementos del arreglo con ciclo for:");
        for (int i = 0; i < munisipios.length; i++) {

            System.out.printf("%s ", munisipios[i]);

        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each:");
        for (String m : munisipios) {

            System.out.printf("%s ", m.toUpperCase());

        }
        System.out.println("\n\nProceso terminado ");
    }
}
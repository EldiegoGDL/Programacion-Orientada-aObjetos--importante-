// elaborar un programa que muestre los arreglos menores a 10

public class _p90_Temperaturas {
    public static void Mostrar(Double[] t) {
        for (Double v : t)

            System.out.print(v + " ");

    }
    public static void Mostrar10(Double[] t) {
        for (Double v : t)
            if (v >= 10) {
                System.out.print("0" +" "); 
            } else {
                System.out.print(v + " ");    
            }
            

    }
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        
        Double[] temps={ 2.34, 44.56 ,7.89 ,0.5 ,2.5 ,4.67 ,40.3 ,22.35 ,56.22 };

        System.out.print("Primer elemento----> " + temps[0]);
        System.out.print("\nTercer elemento----> " + temps[2]);

        System.out.print("\nPrimer elemento----> ");
        Mostrar(temps);
        System.out.print("\nElementos menores a 10 ----->");
        Mostrar10(temps);
    }
}

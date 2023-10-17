package _p109_FormaV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
       // Forma f1 = new Forma("Azul"); //

       Circulo circulo = new Circulo("Rojo",true, 10.3);
        System.out.println(circulo);

        Rectangulo Rectangulo = new Rectangulo(20, 35);
        System.out.println(Rectangulo);
        System.out.println("Area de un Rectangulo :" + Rectangulo.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(Rectangulo);
        formas.add(new Circulo("Rosa",false ,33.45));

        System.out.println("\n\nTodas las formas");
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.print("El area del ");
            if(forma instanceof Rectangulo) {
            System.out.print("Rectangulo es :");
            System.out.print( ((Rectangulo)forma).getArea() );
            }
            else if(forma instanceof Circulo) {
            System.out.print("Circulo es :");
            System.out.print( ((Circulo)forma).getArea() );
            }
            System.out.println("\n");
            }
    }
}
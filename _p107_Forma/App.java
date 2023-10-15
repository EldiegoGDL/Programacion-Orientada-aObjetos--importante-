package _p107_Forma;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
       // Forma f1 = new Forma("Azul"); //

       Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);

        Triangulo triangulo = new Triangulo("Negro", 20, 35);
        System.out.println(triangulo);
        System.out.println("Area de un Triangulo :" + triangulo.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Rosa", 33.45));

        System.out.println("\n\nTodas las formas");
        for (Forma forma : formas) {
            System.out.println(forma);
            System.out.print("El area del ");
            if(forma instanceof Triangulo) {
            System.out.print("Triangulo es :");
            System.out.print( ((Triangulo)forma).getArea() );
            }
            else if(forma instanceof Circulo) {
            System.out.print("Circulo es :");
            System.out.print( ((Circulo)forma).getArea() );
            }
            System.out.println("\n");
            }
    }
}

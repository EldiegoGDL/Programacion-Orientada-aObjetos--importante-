package _p127_MiExeceptcion;

public class App {
    public static int sumar(int a, int b) throws FueradeRango {
        if (a > 100 | b > 100)
            throw new FueradeRango("Valores fuera de rango");
        return a + b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("La suma es " + sumar(10, 10));
            System.out.println("La suma es " + sumar(101, 10));
        } catch (FueradeRango e) {

            System.out.println(e.getMessage());

        }
    }
}

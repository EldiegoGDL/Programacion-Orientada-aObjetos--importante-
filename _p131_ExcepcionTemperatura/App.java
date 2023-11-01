package _p131_ExcepcionTemperatura;
import java.util.Scanner;

public class App {
    public static double exedente(double centigrados) throws TemperturaExcesiva {
        double farenheight_a_centigrados = 32 + (9 * centigrados / 5);
        if (farenheight_a_centigrados > 100)
            throw new TemperturaExcesiva("Temperatura demasiado alta, no se puede convertir");
        return farenheight_a_centigrados;
    }
    public static void main(String[] args) {
        double farenheight;
        double centigrados;
        double farenheight_a_centigrados;
    
        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Dame una temperatura en centigrados: "); centigrados = obj.nextDouble();
            System.out.printf("%.2f grados centigrados, equivale a %.2f grados farenheit",centigrados,exedente(centigrados));
        } catch (TemperturaExcesiva e) {
            System.out.println(e.getMessage());
        }
        
    }

    
}

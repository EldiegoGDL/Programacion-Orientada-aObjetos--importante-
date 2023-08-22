// realizar operaciones basicas

import java.util.Scanner;

import javax.imageio.ImageIO;

public class _p05_OperacionesMatematicas {

    public static void main(String[] args) {
        
        double x, y, suma, resta, multiplicacion, divicion, modulo, potencia;

        Scanner obj = new Scanner(System.in);

        System.out.println("valor de x      ? "); x = obj.nextFloat();
        System.out.println("valor de y      ? "); y = obj.nextFloat();

        suma = x + y;
        resta = x- y;
        multiplicacion = x * y;
        divicion = x / y;
        modulo = x % y;
        potencia =Math.pow(x, y);

        System.out.println("\nOperaciones basicas\n");

        System.out.println(String.format("la suma de X y Y es     = %.2f", suma));
        System.out.println(String.format("la resta de X y Y es     = %.2f", resta));
        System.out.println(String.format("la multiplicacion de X y Y es     = %.2f", multiplicacion));
        System.out.println(String.format("la divicion de X y Y es     = %.2f", divicion));
        System.out.println(String.format("el modulo de X y Y es     = %.2f", modulo));
        System.out.println(String.format("la potencia de X y Y es     = %.2f", potencia));
    }
}
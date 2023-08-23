//Dada una cantidad en pesos y la cotización del dólar, se desea obtener el equivalente en dólares.

import java.util.Scanner;

public class _p15_ConvertirADolares {
    public static void main(String[] args) {
        
        double pesos, dolares, cotizacion;

        Scanner obj =new Scanner(System.in);

        System.out.println("Dame la ccotizacion del dolar"); cotizacion=obj.nextDouble();

        System.out.println("Dame los pesos a convertir a dolar"); pesos=obj.nextDouble();

        dolares = (pesos/cotizacion);

        System.out.println(String.format("La cantidad agregada euivale en dolar a = %f", dolares));

    }
}

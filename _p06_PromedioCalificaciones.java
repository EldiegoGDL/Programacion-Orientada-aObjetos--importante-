// Calcula la suma y el promedio de tres calificaciones, calcula la mayor y la menor de ellas

import java.util.Scanner;

import javax.imageio.ImageIO;

public class _p06_PromedioCalificaciones {
    public static void main(String[] args) {
        
        float cal1, cal2, cal3, suma, prom, min, max;

        Scanner obj = new Scanner(System.in);

        cal1 = cal2 = cal3 = 0;

        System.out.println("calificacion 1      ? "); cal1 = obj.nextFloat();
        System.out.println("calificacion 2      ? "); cal2 = obj.nextFloat();
        System.out.println("calificacion 3      ? "); cal3 = obj.nextFloat();

        suma = cal1+cal2+cal3;
        prom=suma/3;
        min=Math.min(Math.min(cal1,cal2),cal3);
        max=Math.max(Math.max(cal1,cal2),cal3);

        System.out.printf("\nResumen de las Calificaciones =%.2f,%.2f,%.2f\n",cal1, cal2, cal3);
        System.out.printf("Suma    :%.2f\n", suma);
        System.out.printf("Prom    :%.2f\n", prom);
        System.out.printf("Min    :%.2f\n", min);
        System.out.printf("Max    :%.2f\n", max);


    }
}

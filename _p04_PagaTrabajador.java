// Calcula la paga de un trabajador

import java.util.Scanner;

import javax.imageio.ImageIO;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuestos, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.println("nombre del Trabajador ? "); nombre = obj.nextLine();
        System.out.println("Horas Trabajadas      ? "); horas = obj.nextInt();
        System.out.println("Paga x Hora           ? "); paga = obj.nextFloat();
        tasa = 0.03;

        pagabruta = horas * paga;
        impuestos = pagabruta * tasa;
        paganeta = pagabruta - impuestos;

        System.out.println("\nResuman de pagos\n");
        System.out.println(String.format("El Trabajador %s ,trabajo %d por horas ,a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));

        System.out.println(String.format("Paga Bruta      = %.2f",pagabruta));
        System.out.println(String.format("Paga Impuestos      = %.2f",impuestos));
        System.out.println(String.format("Paga Paganeta      = %.2f",paganeta));

    }
    
}

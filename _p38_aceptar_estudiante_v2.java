//La Universidad Kitty Kat SA es solo para mujeres mayores de 21 años con un promedio de entre 8 y 9.5.

import java.util.Scanner;

public class _p38_aceptar_estudiante_v2 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Scanner obj = new Scanner(System.in);

        String nombre,genero;

        int edad;

        double cal1, cal2, cal3, promedio;

        System.out.println("Cual es tu nombre  ?");nombre = obj.next();
        System.out.println("Cual es tu edad    ?");edad = obj.nextInt();
        System.out.println("Cual es tu sexo    ? (H/M)");genero = obj.next();

        System.out.println("Cual es tu primer calificacion  ?");cal1 = obj.nextDouble();
        System.out.println("Cual es tu segunda calificacion ?");cal2 = obj.nextDouble();
        System.out.println("Cual es tu tercer calificacion  ?");cal3 = obj.nextDouble();

        promedio = (cal1 + cal2 + cal3)/3;

        switch (genero) {
            case "M":
                if (Math.round(promedio)>= 8 ) {
                    if (edad>=21) {
                        System.out.println(String.format("Bienvenida %s a Universidad Kitty Kat SA has sido ACEPTADA", nombre));
                        
                    }
                    else
                        System.out.println(String.format("Lo sentimos %s has sido RECHAZADA no cumples con los requisitos es solo para mujeres mayores de 21 a\u00F1os con un promedio de entre 8 y 9", nombre));
                    
                }
                else
                    System.out.println(String.format("Lo sentimos %s has sido RECHAZADA no cumples con los requisitos es solo para mujeres mayores de 21 a\u00F1os con un promedio de entre 8 y 9", nombre));

                break;

            case "H":
                    System.out.println(String.format("Lo sentimos %s has sido RECHAZADO no cumples con los requisitos es solo para mujeres mayores de 21 a\u00F1os con un promedio de entre 8 y 9", nombre));
                break;
            default:
                System.out.println("|opcion invalida| opciones permitidas--> [(H)ombre/(M)ujer]");
                break;
        }


        
    }
    
}

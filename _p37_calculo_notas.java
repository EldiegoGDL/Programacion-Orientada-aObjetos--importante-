//calcular el promedio de 5 calificaciones introducidas por el usuario, luego evaluar el resultado e imprimir

import java.util.Scanner;

public class _p37_calculo_notas {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        double cal1, cal2, cal3, cal4, cal5, promedio;

        Scanner obj = new Scanner(System.in);

        System.out.println("Cual es la primer calificacion  ?\n"); cal1=obj.nextDouble();
        System.out.println("Cual es la segunda calificacion ?\n"); cal2=obj.nextDouble();
        System.out.println("Cual es la tercer calificacion  ?\n"); cal3=obj.nextDouble();
        System.out.println("Cual es la cuarta calificacion  ?\n"); cal4=obj.nextDouble();
        System.out.println("Cual es la quinta calificacion  ?\n"); cal5=obj.nextDouble();

        promedio = (cal1+cal2+cal3+cal4+cal5)/5;

        if (Math.round(promedio) <=6) {
            System.out.println(String.format("Quedas reprobado --> %.2f \nCalificacion Final = %d",promedio,Math.round(promedio)));
        }
        else
            if (Math.round(promedio) <=7) {
                System.out.println(String.format("Pasas de panzazo --> %.2f \nCalificacion Final = %d",promedio,Math.round(promedio)));
                
            }
            else
                if (Math.round(promedio) <= 8) {
                    System.out.println(String.format("Muy bien, pues mejorar --> %.2f \nCalificacion Final = %d",promedio,Math.round(promedio)));
                }
                else
                    if (Math.round(promedio) <= 9) {
                        System.out.println(String.format("Excelente sigue asi --> %.2f \nCalificacion Final = %d",promedio,Math.round(promedio)));
                        
                    }
                    else
                        if (Math.round(promedio) <=10) {
                            System.out.println(String.format("Perfecto tu esfuerzo valio la pena --> %.2f \nCalificacion Final = %d",promedio,Math.round(promedio)));
                        }
                
    }
}
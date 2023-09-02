//Un usuario puede elegir un tamaño de pizza

import java.util.Scanner;

public class _p36_compra_pizza {
    public static void main(String[] args) {
        String tamaño;
        double cantidad,total,descuento,TotalConDescuento;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");

        System.out.println("Elije el tamaño de tu piza\nMenu\n--------------\nchica - $5\nmediana $10\ngrande $20\n");tamaño=obj.next();

        switch (tamaño) {
            case "chica":
                System.out.println("Cuantas ordenes pizzas chicas seran  ?");cantidad=obj.nextDouble();
                total=cantidad*5;
                if (total > 2000) {
                    descuento = total * 0.15;
                    TotalConDescuento = total - descuento; 
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada: %f\nDescuento: %.2f\nTotal de compra con descuento: %.2f", tamaño,cantidad,descuento,TotalConDescuento));
                }
                else
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada: %f\nTotal de compra: %f", tamaño,cantidad,total));


                break;
            case "mediana":
                System.out.println("Cuantas ordenes pizzas medianas  seran  ?");cantidad=obj.nextDouble();
                total=cantidad*10;
                if (total > 2000) {
                    descuento = total * 0.15;
                    TotalConDescuento = total - descuento; 
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada:%f  \nDescuento: %.2f\nTotal de compra con descuento: %.2f", tamaño,cantidad,descuento,TotalConDescuento));
                }
                else
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada: %f\nTotal de compra: %f", tamaño,cantidad,total));


                break;
            case "grande":
                System.out.println("Cuantas ordenes pizzas grandes seran  ?");cantidad=obj.nextDouble();
                total=cantidad*20;
                if (total > 2000) {
                    descuento = total * 0.15;
                    TotalConDescuento = total - descuento; 
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada: %f\nDescuento: %.2f\nTotal de compra con descuento: %.2f", tamaño,cantidad,descuento,TotalConDescuento));
                }
                else
                    System.out.println(String.format("\nTamaño de la compra: %s\nCantidad comprada: %f\nTotal de compra: %f", tamaño,cantidad,total));

                break;

            default:
                System.out.println("Opcion invalida vea el menu :)");
                break;
        }
    }
 
}

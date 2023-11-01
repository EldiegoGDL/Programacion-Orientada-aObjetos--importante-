import java.util.Scanner;
import java.io.IOException;
import java.util.InputMismatchException;

public class _p128_ExcepcionRaiz {
    public static void main(String[] args) throws IOException {
        float num;

        Scanner obj = new Scanner(System.in);

        try {
            System.out.print("Dame un numero para sacar su raiz :" );num = obj.nextFloat();
            
            double NewNum = Math.sqrt(num);

            System.out.println("El resultado es = "+ NewNum);

        }catch(Exception e){
            System.out.println("Error no puedo calcular la raíz cuadrada");
        }
    }
}


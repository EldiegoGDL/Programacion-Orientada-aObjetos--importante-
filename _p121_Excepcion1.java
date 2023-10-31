public class _p121_Excepcion1 {
    public static void main(String[] args) {
        int a = 100;

        int b = 0;

        try {
            int c = a /b ;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("no se puede dividir entre 0");
        } finally {
            System.out.println("Aqui llegamos se produzca o no el error");
        }

        
        
        

    }
}
package _p119_Organismo;

public class App {
    public static void main(String[] args) {
        Perro miperro = new Perro("Taizon");
        System.out.println("Mi perro " + miperro.getNombre() + ", en acción:");
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.Multicelular();
        miperro.Sangrecaliente();
        miperro.Correr();
        miperro.Cuatropatas();
        System.out.println();

        Perico miperico = new Perico("Josefina !!!!");
        System.out.println("Mi perico " + miperico.getNombre() + ", en acción:");
        miperico.respiracion();
        miperico.movimiento();
        miperico.crecimiento();
        miperico.Multicelular();
        miperico.Sangrecaliente();
        miperico.Volar();
        miperico.Dospatas();
        System.out.println();
    }
}

package _p114_Animal;

public class App {
    public static void main(String[] args) {
        // Animal mAnimal = new Animal() {} no se puede instanciar una interfas

        Gato MiGato = new Gato();

        MiGato.dormir();
        MiGato.sonido();
        MiGato.comer();

        System.out.println("\n");

        Perro MiPerro = new Perro();

        MiPerro.dormir();
        MiPerro.sonido();
        MiPerro.comer();

    }
}


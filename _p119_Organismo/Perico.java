// Perico.java
package _p119_Organismo;

public class Perico extends Organismo implements Ave {
    public Perico(String nombre) {
        super(nombre);
    }

    @Override
    public void Multicelular() {
        System.out.println("Es un animal multicelular es un perico");
    }

    @Override
    public void Sangrecaliente() {
        System.out.println("Es un animal de sangre caliente es un perico");
    }

    @Override
    public void Dospatas() {
        System.out.println("Es un ave y camina en dos Patas es un perico");
    }

    @Override
    public void Volar() {
        System.out.println("Es un ave puede volar es un perico ");
    }
}
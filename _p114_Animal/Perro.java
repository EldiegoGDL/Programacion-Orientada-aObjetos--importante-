package _p114_Animal;

public class Perro implements Animal{

    @Override
    public void dormir() {
        System.out.println("El perro duerme en la casa para perro");
        
    }

    @Override
    public void sonido() {
        System.out.println("El perro hace guau");
    }

    @Override
    public void comer() {
        System.out.println("El perro come gatos .__."); 
        
    }
    
}

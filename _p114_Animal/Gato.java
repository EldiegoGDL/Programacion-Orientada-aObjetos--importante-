package _p114_Animal;
// una clase implementa una interfas, al hacerlo debe sobrecargar todos sus metodos
public class Gato implements Animal{

    @Override
    public void dormir() {
        System.out.println("El gato duerme en la caja");
        
    }

    @Override
    public void sonido() {
        System.out.println("el gato hace miau miau ...");        

    }

    @Override
    public void comer() {
        System.out.println("el gato come guiscas ..."); 
        
    }
    
}

package _p119_Organismo;

public class Perro extends Organismo implements Canino{

    public Perro(String nombre){
        super(nombre);
    }
    
    @Override
    public void Multicelular() {
        System.out.println("Es un animal multicelular es un Perro");
        
    }
    
    @Override
    public void Sangrecaliente() {
        System.out.println("Es un animal de sangre caliente es un Perro");
        
    }

    @Override
    public void Correr() {
        System.out.println("Es un canino que corre es un perro");
        
    }

    @Override
    public void Cuatropatas() {
        System.out.println("Es un canino que camnia en cuatro patas es un Perro");
        
    }


    
}

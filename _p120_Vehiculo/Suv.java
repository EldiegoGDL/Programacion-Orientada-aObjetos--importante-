package _p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno{
    public Suv (String name, String name2, int name1){
        super(name, name2, name1);
    }
    
    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es una Suv");
        
    }

    @Override
    public void conbustionInterna() {
        System.out.println("Es un automóvil de combustion interna es una Suv");
        
    }

    @Override
    public void traccion4x4() {
        System.out.println("Es un autómovil con tracción 4 x 4 es una Suv");
        
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Es un autómovil con chaisis independiente es una Suv");

    }




    public void Repostando(){
        System.out.println("Repostando ...");
    }
    public void Arrancando(){
        System.out.println("Arrancando ...");
    }
    public void Frenando(){
        System.out.println("Frenando ...");
    }

    
}

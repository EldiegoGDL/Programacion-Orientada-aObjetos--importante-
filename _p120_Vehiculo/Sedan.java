package _p120_Vehiculo;

public class Sedan extends Maquina implements Familiar{

    public Sedan (String name,String name2, int name1){
        super(name, name2, name1);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Es un autómovil con sistema eléctrico es un Sedan");
        
    }
    
    @Override
    public void conbustionInterna() {
        System.out.println("Es un automóvil de combustion interna es un Sedan");
        
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Es de tipo familiar con carroceria en tres partes es un Sedan");
        
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Es de tipo familiar con chasis monocasco es un Sedan");
        
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

package _p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        Sedan carro1 = new Sedan("Maquina de Guerra", "Carlitos" , 10);

        System.out.println("\n"+carro1.toString()+"\n");
        
        carro1.sistemaElectrico();
        carro1.conbustionInterna();
        carro1.carroceriaTres();
        carro1.chasisMonocasco();
        carro1.Repostando();
        carro1.Arrancando();
        carro1.Frenando();

        Suv carro2 = new Suv("The DeLorean","Diego" , 4);

        System.out.println("\n"+carro2.toString()+"\n");

        carro2.sistemaElectrico();
        carro2.conbustionInterna();
        carro2.traccion4x4();
        carro2.chasisIndependiente();
        carro2.Repostando();
        carro2.Arrancando();
        carro2.Frenando();
        
    }
}

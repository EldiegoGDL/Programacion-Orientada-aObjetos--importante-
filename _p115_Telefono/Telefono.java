package _p115_Telefono;

public class Telefono implements Gps,Radio,Conecta{

    @Override
    public void ObtenerCoordenadas() {
        System.out.println("Obteniendo coordenadas del satelite mas cercano ..."); 
        
    }

    @Override
    public void deteniendoRadio() {
        System.out.println("Detener Radio ..."); 
        
    }

    @Override
    public void iniciarRadio() {
        System.out.println("Iniciando Radio ..."); 
        
    }

    @Override
    public void Bluthuoot() {
        System.out.println("Iniciar el Bluthoot v3 .. cuidado con el FBI nos observa"); 
        
    }

    @Override
    public void Wi_fi() {
        System.out.println("Conectando el Wi-fi del canal 5 ghz si no te paso al de 2.4 ghz te falta barrio ..."); 
        
    }
    
    
}

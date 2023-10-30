package _p120_Vehiculo;

public class Maquina {
    private String Nombre;
    private String Propietario;
    private int Pasajeros;
    public Maquina() {
    }
    public Maquina(String nombre, String propietario, int pasajeros) {
        Nombre = nombre;
        Propietario = propietario;
        Pasajeros = pasajeros;
    }

    public void Repostando(){};
    public void Arrancando(){};
    public void Frenando(){};


    @Override
    public String toString() {
        return "Maquina [Nombre=" + Nombre + ", Propietario=" + Propietario + ", Pasajeros=" + Pasajeros + "]";
    }
    
}

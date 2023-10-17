package _p108_Vehiculo;

public class Compacto extends Vehiculo{
    private int Pasajeros;
    private int Puertas;

    public Compacto() {
    }
    public Compacto(int pasajeros, int puertas,Vehiculo vehiculo) {
        super(vehiculo.Serie, vehiculo.Marca, vehiculo.Año, vehiculo.Precio);
        Pasajeros = pasajeros;
        Puertas = puertas;
    }
    public int getPasajeros() {
        return Pasajeros;
    }
    public void setPasajeros(int pasajeros) {
        Pasajeros = pasajeros;
    }
    public int getPuertas() {
        return Puertas;
    }
    public void setPuertas(int puertas) {
        Puertas = puertas;
    }
    @Override
    public String toString() {
        return "Compacto [ "+ super.toString() +"Pasajeros=" + Pasajeros + ", Puertas=" + Puertas + "]";
    }
    
    
    

    
    

}

package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador{
    private int Partidos;
    private int Goles;

    

    public JugadorActivo(String nombre, char sexo, String string, double total, int partidos, int goles) {
        super(nombre, sexo, string, total);
        this.Partidos = partidos;
        this.Goles = goles;
    }
    
    

    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Partidos * 50)+ (Goles * 5);
        
        return bono;
    }
    
    
    
    public int getPartidos() {
        return Partidos;
    }

    
    
    public void setPartidos(int partidos) {
        Partidos = partidos;
    }
    
    
    
    public int getGoles() {
        return Goles;
    }

    

    public void setGoles(int goles) {
        Goles = goles;
    }

    @Override
    public String toString() {
        return "JugadorActivo ["+super.toString()+"Partidos=" + Partidos + ", Goles=" + Goles + "]";
    }
    
    
}

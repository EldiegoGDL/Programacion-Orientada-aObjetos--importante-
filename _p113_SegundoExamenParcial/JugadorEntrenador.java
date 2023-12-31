package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador{
    private int Subordinados;
    private int Proyectos;
    public JugadorEntrenador(String nombre, char sexo, String string, double total, int subordinados, int proyectos) {
        super(nombre, sexo, string, total);
        this.Subordinados = subordinados;
        this.Proyectos = proyectos;
    }
    
    
    

    @Override
    public double getBono() {
        double bono = (Salario * 0.15) + (Proyectos * 100)+ (Subordinados * 10);
        
        return bono;
    }
    @Override
    public String toString() {
        return "JugadorEntrenador ["+super.toString()+"Subordinados=" + Subordinados + ", Proyectos=" + Proyectos + "]";
    }




    public int getSubordinados() {
        return Subordinados;
    }




    public void setSubordinados(int subordinados) {
        Subordinados = subordinados;
    }




    public int getProyectos() {
        return Proyectos;
    }




    public void setProyectos(int proyectos) {
        Proyectos = proyectos;
    }

    
}

package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String Nombre;
    protected char Sexo;
    protected double Salario;
    protected double Total;
    public Jugador(String nombre, char sexo, String string, double salario) {
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Salario = salario;
    
    }
    public abstract double getBono();

    @Override
    public String toString() {
        return "Jugador [Nombre=" + Nombre + ", Sexo=" + Sexo + ", Salario=" + Salario + ", Total=" + Total + "]";
    }


    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double total) {
        Total = total;
    }
    public char getSexo() {
        return Sexo;
    }
    
    
}

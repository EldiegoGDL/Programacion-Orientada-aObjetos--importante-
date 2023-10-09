package _p101_Persona;

public class Trabajo {
    private int Id;
    private String Rol;
    private double Salario;
    
    public Trabajo(int id, String rol, double salario) {
        Id = id;
        Rol = rol;
        Salario = salario;
    }
    public Trabajo(){
    }

    public int getId() {
        return Id;
    }

    public String getRol() {
        return Rol;
    }

    public double getSalario() {
        return Salario;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajo [Id=" + Id + ", Rol=" + Rol + ", Salario=" + Salario + "]";
    }

    
    
}

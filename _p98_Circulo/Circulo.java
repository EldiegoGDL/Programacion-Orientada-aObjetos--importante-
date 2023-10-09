package _p98_Circulo;

public class Circulo {

    private double Area;
    private double Circunferencia;
    private double Radio;

    public Circulo(){
    }
    public Circulo(double radio){
        this.Radio = radio;
    }

    public double getRadio() {
        return Radio;
    }
    public void setRadio(double radio) {
        Radio = radio;
    }
    public double getArea() {
        Area = Math.PI * (Radio*Radio);
        return Area;
    }
    public void setArea(double area) {
        Area = area;
    }
    public double getCircunferencia() {
        Circunferencia = Math.PI * (Radio * 2);
        return Circunferencia;
    }
    public void setCircunferencia(double circunferencia) {
        Circunferencia = circunferencia;
    }
    
    @Override
    public String toString() {

        return "Circulo [Radio=" + Radio + "]";
    }
    
    
}

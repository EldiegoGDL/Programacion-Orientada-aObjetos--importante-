package _p99_Rectangulo;

public class Rectangulo {
    private float Largo;
    private float Ancho;
    private float Area;
    private float Perimetro;
    
    public Rectangulo(){
    }
    public Rectangulo(float largo,float ancho){
        this.Largo = largo;
        this.Ancho = ancho;
    }

    public float getLargo() {
        return Largo;
    }
    public void setLargo(float largo) {
        Largo = largo;
    }
    public float getAncho() {
        return Ancho;
    }
    public void setAncho(float ancho) {
        Ancho = ancho;
    }
    public float getArea() {
        Area = Largo * Ancho;
        return Area;
    }
    public void setArea(float area) {
        Area = area;
    }
    public float getPerimetro() {
        Perimetro = 2 * (Largo + Ancho) ;
        return Perimetro;
    }
    public void setPerimetro(float perimetro) {
        Perimetro = perimetro;
    }

    @Override
    public String toString() {

        return "Circulo [Largo=" + Largo + ", " + Ancho + "]";
    }


}

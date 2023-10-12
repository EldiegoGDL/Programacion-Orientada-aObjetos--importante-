package _p105_PuntoTriangulo;

public class Punto {
    private int x;
    private int y;

    public Punto() {
    }

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getDistancia (Punto punto){
        double distancia = Math.sqrt((Math.pow(x-punto.x,2)+Math.pow(y-punto.y,2)));
        
        return distancia;
    }


    @Override
    public String toString() {
        return "punto [x=" + x + ", y=" + y + "]";
    }
    
    
}

    

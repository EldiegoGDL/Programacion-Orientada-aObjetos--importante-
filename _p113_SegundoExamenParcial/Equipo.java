package _p113_SegundoExamenParcial;

import java.util.ArrayList;


public class Equipo {
    private String Nombre;
    private String Liga;
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        jugadores=new ArrayList<>();
    }

    public Equipo(String nombre, String liga) {
        this(); 
        Nombre = nombre;
        Liga = liga;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getLiga() {
        return Liga;
    }

    public void setLiga(String liga) {
        Liga = liga;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);

    }

    public double getTotalBono() {
        double Bono = 0;

        for (Jugador jugador : jugadores) {
            Bono += jugador.getBono();
        }

        return Bono;

    }

    public double getTotal() {
        double total = 0;
        for (Jugador jugador : jugadores) {
            total += jugador.getSalario();
        }
        return total;

    }

    public int getTotalH() {
        int totalH = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {

                totalH++;
            }
        }

        return totalH;
    }

    public double getTotalM() {
        int totalM = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalM++;
            }
        }

        return totalM;
    }

    public void reporte() {

        for (Jugador jugador : jugadores) {
            System.out.println(jugador.toString());
        }
    }

    @Override
    public String toString() {
        return "Equipo [Nombre=" + Nombre + ", Liga=" + Liga + ", jugadores=" + jugadores + "]";
    }

    

    

}

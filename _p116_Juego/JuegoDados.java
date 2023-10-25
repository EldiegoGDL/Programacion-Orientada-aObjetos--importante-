package _p116_Juego;

import java.util.Scanner;

public class JuegoDados implements Juego{
    private int dados1, dados2;
    private String Jugador1,Jugador2;
    private Scanner teclado;

    public JuegoDados(){
        teclado = new Scanner(System.in);
    }

    
    @Override
    public void iniciar() {
        System.out.println("Jugador 1:"); Jugador1 = teclado.nextLine();
        System.out.println("Jugador 2:"); Jugador2 = teclado.nextLine();
        
    }
    
    @Override
    public void jugar() {
        dados1 = 1 +(int) (Math.random() * 6 );
        dados2 = 1 +(int) (Math.random() * 6 );
        System.out.printf("\n" + Jugador1 + "le salio el valor de " + dados1 + "\n");
        System.out.printf(Jugador2 + "le salio el valor de " + dados2 + "\n");
    }
    
    @Override
    public void finalizar() {
        if( dados1> dados2) System.out.println("\n" + "Gano " + Jugador1 + " con un valor de " + dados1);
        else if( dados2 > dados1) System.out.println("\n" + "Gano " + Jugador2 + " con un valor de " + dados2);
        else System.out.println("\n" + "Empataron los jugadores con el valor de "+ dados1);
        
    }
}

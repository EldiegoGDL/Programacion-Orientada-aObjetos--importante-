import javax.swing.*;

import java.awt.Font;

public class _p140_HolaMundoGUI extends JFrame {

    private JLabel lblSaludo;
    private JLabel lblSaludo2;

    public _p140_HolaMundoGUI(){
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo GUI, Bienvenido");
        lblSaludo.setFont(new Font("Times New Roman",Font.BOLD, 30));
        lblSaludo.setBounds(10,20,500,30);
        add(lblSaludo);

        lblSaludo2 = new JLabel("prepara la mota azzazel");
        lblSaludo2.setFont(new Font("Times New Roman",Font.BOLD, 70));
        lblSaludo2.setBounds(10,20,800,200);
        add(lblSaludo2);
    }

    public static void main(String[] args) {
        _p140_HolaMundoGUI app = new _p140_HolaMundoGUI();
        app.setBounds(10, 10, 500, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

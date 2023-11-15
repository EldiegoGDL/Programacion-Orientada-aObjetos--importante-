import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class _p143_PagaTrabjador extends JFrame implements ActionListener{
    private JLabel Nombre;
    private JLabel Resultado;
    private JLabel componentes;
    private JLabel Horas;
    private JLabel Paga;
    private JButton BCalcular,BSalir;
    private JTextField txtnombre,txthoras,txtpaga;
    

    public _p143_PagaTrabjador(){
        super("Calcular la paga de un empleado");
        setLayout(null);

        Nombre = new JLabel("Nombre del Empleado");
        Nombre.setFont(new Font("Times New Roman",Font.BOLD,15));
        Nombre.setBounds(5, 0, 200, 30);add(Nombre);

        txtnombre = new JTextField();
        txtnombre.setBounds(5,25,200,30);
        add(txtnombre);


        Horas = new JLabel("Horas de Trabajo del Empleado");
        Horas.setFont(new Font("Times New Roman",Font.BOLD,15));
        Horas.setBounds(5, 70, 250, 30);add(Horas);

        txthoras = new JTextField();
        txthoras.setBounds(5,95,200,30);
        add(txthoras);



        Paga = new JLabel("Paga del Empleado");
        Paga.setFont(new Font("Times New Roman",Font.BOLD,15));
        Paga.setBounds(5, 140, 200, 30);add(Paga);

        txtpaga = new JTextField();
        txtpaga.setBounds(5,165,200,30);
        add(txtpaga);

        Resultado = new JLabel(" [Resultado Aqui]");
        Resultado.setBounds(400, 80, 800, 30);
        add(Resultado);

        componentes = new JLabel(" [Resultado Aqui]");
        componentes.setBounds(400, 200, 800, 30);
        add(componentes);

        BSalir = new JButton("Salir");
        BSalir.setBounds(150, 300, 100, 40);add(BSalir);
        BSalir.addActionListener(this);

        BCalcular = new JButton("Calcular Ingresos");
        BCalcular.setBounds(80,250,200,30);add(BCalcular);

        BCalcular.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == BCalcular) {
            try {
                String nombre = txtnombre.getText();

                double  horas = Double.parseDouble(txthoras.getText());
                double  paga = Double.parseDouble(txtpaga.getText());

                double tasa =  0.03;

                double pagabruta = horas * paga;
                double impuestos = pagabruta * tasa;
                double paganeta = pagabruta - impuestos;
            
                

                Resultado.setText(String.format("El Trabajador %s ,trabajo %f por horas ,a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
                componentes.setText(String.format("Paga Bruta      = ( %.2f ) Paga Impuestos      = ( %.2f ) Paga Paganeta      = ( %.2f )",pagabruta,impuestos,paganeta));
                
            } catch (Exception E) {
                JOptionPane.showMessageDialog(this,"Debes escribir numeros y ademas no deben de haber espacios vacios camara","Que paso Amigo",JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } else if (e.getSource() == BSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        }
    }


    public static void main(String[] args) {
        _p143_PagaTrabjador app = new _p143_PagaTrabjador();
        app.setBounds(10, 10, 1200, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

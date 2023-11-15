package _p146_EstudianteGUI_V2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import javax.swing.table.*;           // impormtamos librerias
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener {    // La App hereda JFrame e implementa ActionListener.
    ArrayList<Estudiante> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblPeso, lblCorreo;   // se crea el arreglo para los datos y los objetos de los componentes interfaz
    JTextField txtNombre, txtEdad, txtPeso, txtCorreo;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;          // JFileChooser es para mostrar los cuadros de dialogo y guardar
    JButton btnAgregar, btnGrabar;    // se cran 2 botones para la funcionalidad de agregar y grabar un estudiante
public App(){
    super("Datos de Estudiantes");menuBar=new JMenuBar();

    setJMenuBar(menuBar);
    mnuArchivo = new JMenu("Archivo");
    menuBar.add(mnuArchivo);
    smnAbrir = new JMenuItem("Abrir");
    smnAbrir.addActionListener(this);
    mnuArchivo.add(smnAbrir);
    smnSalir = new JMenuItem("Salir");
    smnSalir.addActionListener(this);                // se crea la barra de menu y sub menus y metodos para cuando recibe un click
    smnGuardar = new JMenuItem("Guardar");
    mnuArchivo.add(smnGuardar);
    smnGuardar.addActionListener(this);
    mnuArchivo.add(new JSeparator());
    mnuArchivo.add(smnSalir);
    mnuAyuda = new JMenu("Ayuda");
    menuBar.add(mnuAyuda);
    smnAcercade = new JMenuItem("Acerca de ..");
    mnuAyuda.add(smnAcercade);
    smnAcercade.addActionListener(this);
    jdlAcercaDe = new JDialog(this,"Acerca de ..");
    jdlAcercaDe.setSize(300,250);
    jdlAcercaDe.setLocationRelativeTo(null);
    lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Carlos Castañeda Ramírez</html>",JLabel.CENTER);   // creamos un cuadro de dialogo
    lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
    jdlAcercaDe.add(lblDatos);

    // Se agrega 1 renglón más al grid para agregar los botones
    setLayout(new GridLayout(3, 1, 0, 0));    // establecemos una distribucion grid para el jframe de app

    pnlTabla = new JPanel();
    pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS)); // para que extienda y muestre las baarras de desplazamiento
    getContentPane().add(pnlTabla);
    spane = new JScrollPane();
    spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // activa las barras de desplazamiento con metodo setVerticalScrollBarPolicy()
    pnlTabla.add(spane);
    table = new JTable();                         // creamos un panel de vista desplegable para contener la tabla y cambiamos el color del encabezado
    table.getTableHeader().setBackground(Color.yellow);
    table.getTableHeader().setForeground(Color.black);
    spane.setViewportView(table);

    modelo = new DefaultTableModel();
    modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});   // se crea el modelo de la tabla y las columnas y titulos
    table.setModel(modelo);

    table.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent e) {           // se agrega un evento de escucha a la tabla para que  cuando se hace click en un renglon este muestre su metodo
            int ren = table.rowAtPoint(e.getPoint());
            mostrarDatos(ren);
        }
    });
    
    pnlDatos=new JPanel();
    getContentPane().add(pnlDatos);
    pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
    lblNombre = new JLabel("Nombre");
    lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
    txtNombre = new JTextField();
    pnlDatos.add(lblNombre);
    pnlDatos.add(txtNombre);
    lblEdad = new JLabel("Edad");
    lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
    txtEdad = new JTextField();
    pnlDatos.add(lblEdad);                     // se crea unpanel para los datos en grid con columnas 4x2 donde se colocan etiquetas y cuadros de texto
    pnlDatos.add(txtEdad);
    lblPeso = new JLabel("Peso");
    lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
    txtPeso = new JTextField();
    pnlDatos.add(lblPeso);
    pnlDatos.add(txtPeso);
    lblCorreo = new JLabel("Correo:");
    lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
    txtCorreo = new JTextField();
    pnlDatos.add(lblCorreo);
    pnlDatos.add(txtCorreo);

    pnlBotones = new JPanel();
    btnAgregar = new JButton("Agregar");
    btnAgregar.addActionListener(this);
    pnlBotones.add(btnAgregar);
    btnGrabar = new JButton("Grabar");         // son los botones de agregar y grabar en el panel inferior
    btnGrabar.setEnabled(false);
    btnGrabar.addActionListener(this);
    pnlBotones.add(btnGrabar);
    add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
                fchArchivo = new JFileChooser();
                fchArchivo.setCurrentDirectory(new File("."));
                fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
                int res = fchArchivo.showOpenDialog(null);
                File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.desSerializarDatos(arch.getName());
                this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if(e.getSource()== smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                Util.serializarDatos(arch.getName(),datos);
                JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
            
                }
            }
        } else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if(e.getSource()==btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }
    
// se crea el metodo para responder los eventos de salir y acerca de
    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();  // el metodo es para borrar la tabla antes de cargar los datos
        while(dm.getRowCount()>0) dm.removeRow(0);
        Object[] obj = new Object[4];
        for(int i=0; i<datos.size() ; i++) {
        obj[0] = datos.get(i).getNombre();
        obj[1] = datos.get(i).getEdad();      // se crea el metodo que llena los datos de la tabla con los datos del arreglo
        obj[2] = datos.get(i).getPeso();
        obj[3] = datos.get(i).getCorreo();
        modelo.addRow(obj);
        }
    }    

    public void mostrarDatos(int ren) {
            txtNombre.setText(datos.get(ren).getNombre());
            txtEdad.setText(Integer.toString((datos.get(ren).getEdad()))); 
            txtPeso.setText(Double.toString((datos.get(ren).getPeso())));
            txtCorreo.setText(datos.get(ren).getCorreo());
        }

        public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if(cp instanceof JTextField)                      // habilita y deshabilita los cuadros de texto
                cp.setEnabled(actdes);
        
        }

        public void limpiarCampos() {
            for (Component cp : pnlDatos.getComponents())
                if(cp instanceof JTextField)                  // borra los cuadros de texto en el panel de datos
                ((JTextField)cp).setText("");
        
        }
        
        public void guardarCampos() {
            Estudiante est = new Estudiante();
            est.setNombre( txtNombre.getText() );
            est.setEdad( Integer.parseInt(txtEdad.getText() ));
            est.setPeso( Double.parseDouble(txtPeso.getText()) );       // crea un nuevo estudiante en base a la informacion capturada en los cuadros de texto y lo agrega a los datos y recarga la tabla
            est.setCorreo( txtCorreo.getText() );
            datos.add(est);
            cargarDatos();
        }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10,10,550, 400);
        app.setLocationRelativeTo(null);                       // aquí se crea una instancia de la app,se establecen sus dimensiones, se acomoda la pantalla y comienza el desarrollo de los datos y la carga
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos=Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false); // al iniciar el programa se desactiven los campos de edicion para no permitir edicion
        }
}
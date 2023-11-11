import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class _p137_ArchivoMunicipios {

    public static void main(String[] args) {
        String [] deportes = {"Fútbol","Béisbol","Ciclismo","Atletimso","Natación","Motociclismo"};
        File archivo = new File("deportes.txt");
        
        if (archivo.exists()) {
            System.out.println("--------------------------------------------------------------------->");
            System.out.println("Ruta absoluta : " + archivo.getAbsolutePath());
            System.out.println("Nombre archivoivo : " + archivo.getName());
            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                String linea;
                while ((linea = lector.readLine()) != null)
                    System.out.println(linea);
                lector.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivoivo..");
                System.out.println(e);
            }
            
        } else {
            
            try {
                BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));
                for (String nombre : deportes)
                    escribir.write(nombre + "\n");
                escribir.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivoivo..");
                System.out.println(e);
            }
        
        }
    }
}
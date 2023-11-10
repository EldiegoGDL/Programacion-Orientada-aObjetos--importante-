import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class _p137_ArchivoMunicipios {

    public static void main(String[] args) {
        String [] deportes = {"Fútbol","Béisbol","Ciclismo","Atletimso","Natación","Motociclismo"};
        File arch = new File("deportes.txt");
        
            
        if (arch.exists()){
            System.out.println("Ruta absoluta : " + arch.getAbsolutePath());
            System.out.println("Nombre archivo : " + arch.getName());
            
        }
            

        
            try {
                BufferedWriter fnombres = new BufferedWriter(new FileWriter(arch));
                for (String nombre : deportes)
                    fnombres.write(nombre + "\n");
                fnombres.close();
            } catch (Exception e) {
                System.out.println("Problemas al procesar el archivo..");
                System.out.println(e);
            }
    
    }
}
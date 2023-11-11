import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;


public class _p138_ArchivoMaterias {
    public static void main(String[] args) {
        int NumMaterias;
        Scanner obj = new Scanner(System.in);

        System.out.print("Agrega cuantas materias que quieres agregar ? "); NumMaterias = obj.nextInt();
        String [] Materias = new String[NumMaterias];
        int num = 0;
        
        for (int i = 0; i < NumMaterias; i++) {
            num ++;
            System.out.printf("intoduce %d materia = ",num);
            Materias[i] = obj.next();
        }
        String nomarch;
        System.out.println("\n\nComo quieres guardar tu expetiente de materias"); nomarch = obj.next();
        File ArchivoMaterias = new File(nomarch + ".txt");

        System.out.println("--------------------------------------------------------------------->");
        System.out.println("Ruta absoluta : " + ArchivoMaterias.getAbsolutePath());
        System.out.println("Nombre archivoivo : " + ArchivoMaterias.getName());
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter(ArchivoMaterias));
            System.out.println("\n contenido del archivo");
            for (String nombre : Materias)
            escribir.write(nombre + "\n");
            escribir.close();
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivoivo..");
            System.out.println(e);
        }
        try {
            BufferedReader lector = new BufferedReader(new FileReader(ArchivoMaterias));
            String linea;
            while ((linea = lector.readLine()) != null)
                System.out.println(linea);
            lector.close();
        } catch (Exception e) {
            System.out.println("Problemas al procesar el archivoivo..");
            System.out.println(e);
        }
        
        
        
    }
}

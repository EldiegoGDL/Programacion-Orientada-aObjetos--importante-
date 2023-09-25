import java.util.Scanner;

public class _p80_PrimerExamenParcial {
    public static void main(String[] args) {
        int  Alumnos, Docente, Trabajador;

        int Total_Alumnos,Total_Docentes,Total_Trabajadores,Total_general;

        int Total_Hombres,Total_Mujeres,Total_Participantes;

        double Promedio,Pr_edad,Edad;
        
        int Total_Recaudado_Alumnos,Total_Recaudado_Docentes,Total_Recaudado_Trabajadores;

        String nombre, tipo, sexo ;
        char resp;

        Scanner obj = new Scanner(System.in);

        Total_Alumnos = 0;
        Total_Docentes= 0;
        Total_Trabajadores= 0;
        Total_Participantes= 0;
        Total_Hombres= 0;
        Total_Mujeres= 0;
        Total_general= 0;
        Promedio = 0;
        Pr_edad = 0;


        do {
            Alumnos = 50;
            Docente = 80;
            Trabajador = 60;

            System.out.print("Nombre del Participante     ?"); nombre=obj.next();
            System.out.print("Edad del Participante       ?"); Edad=obj.nextDouble();
            System.out.print("Sexo del Participante (H/M) ?"); sexo=obj.next();
            System.out.print("Tipo del Participante (Alumnos/Docente/Trabajador)       ?"); tipo=obj.next();

            if (Edad >= 18) {
                Total_Participantes=Total_Participantes + 1;
            
                Pr_edad = Edad + Pr_edad;

                Promedio = Pr_edad/Total_Participantes;
                
                switch (tipo) {
                    case "Alumnos" :
                        Total_Alumnos = Total_Alumnos + 1;
        
                        switch (sexo) {
                            case "H":
                                Total_Hombres = Total_Hombres + 1;
                                
                                break;
                            case "M":
                                Total_Mujeres = Total_Mujeres + 1;
                                
                                break;
                        
                            default:
                                break;
                        }
                    
                    break;
                    
                    case "Trabajador":
                        Total_Trabajadores = Total_Trabajadores + 1;
                        
                        switch (sexo) {
                            case "H":
                                Total_Hombres = Total_Hombres + 1;
                                
                                break;
                            case "M":
                                Total_Mujeres = Total_Mujeres + 1;
                                
                                break;
                        
                            default:
                                break;
                        }
                    
                    break;

                    case "Docente":
                        Total_Docentes = Total_Docentes + 1;
                        switch (sexo) {
                            case "H":
                                Total_Hombres = Total_Hombres + 1;
                                
                                break;
                            case "M":
                                Total_Mujeres = Total_Mujeres + 1;
                                
                                break;
                        
                            default:
                                break;
                        }
                
                    break;
                    
                    default:
                    break;
                }

                
                
            } else {
                System.out.print("Lo Sentimos solo aceptamos a mayores de edad");
                
            }
            Total_Recaudado_Alumnos = Alumnos * Total_Alumnos;
            Total_Recaudado_Docentes = Docente * Total_Docentes;
            Total_Recaudado_Trabajadores = Trabajador * Total_Trabajadores;
            Total_general= Total_Recaudado_Alumnos + Total_Recaudado_Docentes + Total_Recaudado_Trabajadores;
             
            
            System.out.print("\nDeseas continuar (S/N) ?\n\n");
            resp = Character.toUpperCase(obj.next().charAt(0));
        } while (resp !='N');
        System.out.printf("\nTotal de Alumnos = %d",Total_Alumnos);
        System.out.printf("\nTotal de Docentes = %d",Total_Docentes);
        System.out.printf("\nTotal de Trabajadores = %d",Total_Trabajadores);
        System.out.printf("\nTotal de Hombres en general = %d",Total_Hombres);
        System.out.printf("\nTotal de Mujeres en general = %d",Total_Mujeres);
        System.out.printf("\nTotal de todos los participantes = %d",Total_Participantes);
        System.out.printf("\nPromedio de la edad de todos los participantes = %.2f",Promedio);
        
        System.out.printf("\nTotal dinero recaudado de Alumnos = %d",Total_Recaudado_Alumnos);
        System.out.printf("\nTotal dinero recaudado de Docentes = %d",Total_Recaudado_Docentes);
        System.out.printf("\nTotal dinero recaudado de Trabajadores = %d",Total_Recaudado_Trabajadores);
        System.out.printf("\nTotal dinero en general = %d",Total_general);
        
        if (Total_general < 100) {
            System.out.print("\nEl evento concluye con ganancias BAJAS");
        } else {
            if (Total_general >=100 && Total_general <200) {
                System.out.printf("\nEl evento concluye con ganancias MODERADAS");
                
            } else {
                System.out.printf("\nEl evento concluye con BUENAS ganancias");
            }
        }
       
       
      
    }
}

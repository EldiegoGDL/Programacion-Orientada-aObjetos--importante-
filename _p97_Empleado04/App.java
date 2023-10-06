package _p97_Empleado04;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados =new ArrayList<>();
        int suma = 0 ,th = 0,tm = 0,tc = 0,tnc = 0;

        empleados.add(new Empleado("Juan Perez", 35, 'H', true));
        empleados.add(new Empleado("Maria de los Angeles", 20, 'M', true));
        empleados.add(new Empleado("Mordekaiser", 10000, 'H', false));
        empleados.add(new Empleado("AMLO el grande y poderoso fundador de la cuarta transformacion", 70, 'H', true));

        System.out.println(empleados.get(2).toString());

        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());

        }

        for (int i = 0; i < empleados.size(); i++) {
            suma = suma + empleados.get(1).getEdad();
            if (empleados.get(i).getSexo()=='H')th++; else tm++;
            if (empleados.get(i).getCasado())tc++; else tnc++;
        }

        System.out.println("Promedio de edades: " + (suma/empleados.size()));
        System.out.println("Hombres : " + th);
        System.out.println("Mujeres : " + tm);
        System.out.println("Casados : " + tc);
        System.out.println("No Casado : " + tnc);

    }
}
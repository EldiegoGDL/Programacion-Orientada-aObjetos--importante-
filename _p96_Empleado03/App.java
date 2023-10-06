// clase para manejar objetos

package _p96_Empleado03;

public class App {
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        empleado.setNombre ("Juan Perez") ;
        empleado.setEdad (35) ;

        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.setNombre ("Maria de los Angeles");
        empleado2.setEdad (20);

        Empleado empleado3 = new Empleado("Peje Lagarto", 70);
        empleado3.setNombre("AMLO el grande y poderoso fundador de la cuarta transformacion ");

        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        System.out.println(empleado.getNombre());
        System.out.println(empleado2.getNombre());
        System.out.println(empleado3.getNombre());

    }
}
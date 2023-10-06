// clase para manejar objetos

package _p94_Empleado01;

public class App {
    public static void main(String[] args) {

        Empleado empleado = new Empleado();
        empleado.Nombre= "Juan Perez" ;
        empleado.Edad= 35 ;

        Empleado empleado2;
        empleado2 = new Empleado();
        empleado2.Nombre = "Maria de los Angeles";
        empleado2.Edad = 20;

        System.out.println(empleado.toString());
        System.out.println(empleado2.toString());

        System.out.println(empleado.Nombre);
        System.out.println(empleado2.Nombre);
    }
}

package _p106_Persona;

public class App{
    public static void main(String[] args) {
        Persona p1 = new Persona("Carlos Castañeda", "Av de Mexico 115");
        Persona p2 = new Persona("Alma Gonzales", "Primera de los Bolos 234");

        Apoyo apoyo = new Apoyo(p2,"Licenciatura",1300);
        Apoyo apoyo2 = new Apoyo(new Persona("Sra Tere", "Sierra Madre 22"), "Secundaria", 1000);

        Estudiante estudiante = new Estudiante(p1, "Ing. Software", 2023, 500);

        System.out.println(estudiante);
        estudiante.setNombre("Urbano");
        System.out.println("Nombre:        "+ estudiante.getNombre());
        System.out.println("Direccion:     "+ estudiante.getDireccion());
        System.out.println("Carrera:       "+ estudiante.getCarrera());
        System.out.println("Año:           "+ estudiante.getAño());
        System.out.println("Colegiatura:   "+ estudiante.getColegiatura());
        System.out.println(apoyo);
        System.out.println("Nombre: : " + apoyo.getNombre());
        System.out.println("Direccion : " + apoyo.getDireccion());
        System.out.println("Escolaridad : " + apoyo.getEscolaridad());
        System.out.println("Paga : " + apoyo.getPaga());
        System.out.println(apoyo2);
        System.out.println("Nombre: : " + apoyo2.getNombre());
        System.out.println("Direccion : " + apoyo2.getDireccion());
        System.out.println("Escolaridad : " + apoyo2.getEscolaridad());
        System.out.println("Paga : " + apoyo2.getPaga());

    }
}
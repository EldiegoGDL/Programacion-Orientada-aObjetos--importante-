package _p101_Persona;

public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        Trabajo trabajo = new Trabajo();
        trabajo.setId(1);
        trabajo.setRol("Chofer");
        trabajo.setSalario(2000);
        persona1.setNombre("Julia Urina");
        persona1.setTrabajo(trabajo);
        System.out.println(persona1);

        Persona persona2 = new Persona("Jose Perez", new Trabajo(2, "Cocinero", 2500));
        System.out.println(persona2);

        Persona TheChosenOne = new Persona("Diego Garcia", new Trabajo(10,"Nadador Olimpico", 500000));
        System.out.println(TheChosenOne);
    }
    
}

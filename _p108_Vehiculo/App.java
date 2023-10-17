package _p108_Vehiculo;

public class App {
    public static void main(String[] args) {
        Vehiculo carro1 = new Vehiculo("CP0100010122", "Ford", 2023, 125345.22);
        Compacto modelo1 = new Compacto(4, 2, carro1);
        
        Vehiculo carro2 = new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33);
        Compacto modelo2 = new Compacto(6, 4, carro1);
        
        Vehiculo carro3 = new Vehiculo("CP1000145555", "Nissan", 2010, 54500.33);
        Camioneta modelo3 = new Camioneta(carro3, 450.0, 4) ;
        
        Vehiculo carro4 = new Vehiculo("CA104014544", "Dina", 0, 0);
        Camioneta modelo4 = new Camioneta(carro3, 1200.0, 6) ;
        
        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);

        System.out.println("\nCalculando el total de precio de todos los vehículos ...");
        System.out.println(modelo1.getPrecio());
        System.out.println(modelo2.getPrecio());
        System.out.println(modelo3.getPrecio());
        System.out.println(modelo4.getPrecio());
        double Total = modelo1.getPrecio() + modelo2.getPrecio() + modelo3.getPrecio() + modelo4.getPrecio();
        System.out.println("\nLa suma de precios es:\n"+Total);
    }
}

package _p112_ControlVentas;

import static java.lang.System.out;

public class App {
    
    public static void main(String[] args) {
        
        //aqui creamos la tienda
        System.out.println("Reporte de clientes sin ventas : ");
        Tienda Latienda = new Tienda("Abarrotes", "juan carlos", "Callejon #494");

        //aqui creamos a los clientes
        Cliente c1 = new Cliente("fer", "beina", "fer@gmail.com");
        Cliente c2 = new Cliente("juares", "san francisco", "juares@gmail.com");
        Cliente c3 = new Cliente("pedro", "3 de bolos", "pedroo@gmail.com");
        Cliente c4 = new Cliente("mario", "el tanquesito", "mario@gmail.com");

        //aqui agregamos a los clientes en la tienda
        Latienda.agregarCliente(c1);
        Latienda.agregarCliente(c2);
        Latienda.agregarCliente(c3);
        Latienda.agregarCliente(c4);
        out.println(Latienda);

        out.println(" ");
        out.println(c1);
        out.println(c2);
        out.println(c3);
        out.println(c4);

        Latienda.getClientes().get(0).agregarVenta(new VentaContado("mazo", 10, 60.50, 10, "coca"));;
        Latienda.getClientes().get(0).agregarVenta(new VentaCredito("pico", 2, 1170.55, 3, 10));
        
        Latienda.getClientes().get(1).agregarVenta(new VentaCredito("clavo", 2.5, 160.34, 2, 20));
        Latienda.getClientes().get(1).agregarVenta(new VentaCredito("tubulares de 2x3", 5, 71.34, 6, 20));
        Latienda.getClientes().get(1).agregarVenta(new VentaContado("alicates", 10, 650.33, 20, "cafe"));;
        
        Latienda.getClientes().get(2).agregarVenta(new VentaContado("boiler", 50, 65, 10, "$50000"));;
        out.println(" ");
        System.out.println("\nReporte de ventas de los clientes : ");
        out.println(Latienda+"\n");
        Latienda.reporte();

    }

}

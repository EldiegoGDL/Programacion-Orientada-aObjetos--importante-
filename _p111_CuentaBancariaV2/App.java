package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        // Creamos un banco
        Banco Bacnco_Azteca = new Banco("Banco del norte SA de CV","Priva las Cumbres 123");
        System.out.print("\033[H\033[2J");System.out.flush();
        // Agregamos clientes al banco
        Bacnco_Azteca.agregarCliente(new Cliente("Carlos Fuentes"));
        Bacnco_Azteca.agregarCliente(new Cliente("Juan De La Fuente"));
        Bacnco_Azteca.agregarCliente(new Cliente("Rene Mayorga"));
        Bacnco_Azteca.agregarCliente(new Cliente("Maria Vazquez"));
        System.out.println("\n>>> Los clientes del banco son:\n");
        Bacnco_Azteca.reporte();
        // Agregamos cuentas de diferentes tipos a los clientes del Banco
        Bacnco_Azteca.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.10));
        Bacnco_Azteca.getClientes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.20));
        Bacnco_Azteca.getClientes().get(0).agregarCuenta(new CuentaDeCheques(1000,500));
        Bacnco_Azteca.getClientes().get(1).agregarCuenta(new CuentaDeCheques(2500,500));
        Bacnco_Azteca.getClientes().get(2).agregarCuenta(new CuentaDeCheques(2000,600));
        Bacnco_Azteca.getClientes().get(2).agregarCuenta(new CuentaDeAhorro(2000,0.40));
        System.out.println("\n>>> Los clientes con sus cuentas y saldos iniciales son:\n");
        Bacnco_Azteca.reporte();
        // Retiramos y depositamos a las diferentes cuentas de algunos clientes
        Bacnco_Azteca.getClientes().get(0).getCuentas().get(0).retira(500);
        Bacnco_Azteca.getClientes().get(0).getCuentas().get(1).retira(100);
        Bacnco_Azteca.getClientes().get(1).getCuentas().get(0).deposita(100);
        Bacnco_Azteca.getClientes().get(2).getCuentas().get(0).deposita(300);
        Bacnco_Azteca.getClientes().get(2).getCuentas().get(1).retira(1000);
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de los movimientos son: \n");
        Bacnco_Azteca.reporte();
        // Reporte de clientes del banco y el saldo de sus cuentas, despues del cálculo de interses 
        Bacnco_Azteca.calcularInteres();
        System.out.println("\n>>> Los clientes con sus cuentas y saldos despues de calcular intereses: \n");
        Bacnco_Azteca.reporte();
        }
}

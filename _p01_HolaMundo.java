 // Manda un saludo a la pantalla

 public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "lex";
        String hermano = "Daniel";
        String mensaje = String.format("tanto %s como %s desean aprender java",amigo,hermano);

        System.out.println("hola mundo");
        System.out.println("\nHola amigo " + amigo + " bienvenido a java");
        System.out.println("\nMi amigo es " + amigo + " mi hermano es " + hermano);
        System.out.println(mensaje);
    }
 }
 
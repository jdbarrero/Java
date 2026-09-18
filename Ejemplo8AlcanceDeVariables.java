public class Ejemplo8AlcanceDeVariables {

    // Variable de clase.
    // Su valor se conserva mientras el programa se ejecuta.
    static int contador = 0;

    static void registrarOperacion() {

        // Variable local del metodo.
        int incremento = 1;

        contador = contador + incremento;

        System.out.println("Operaciones realizadas: " + contador);
    }

    public static void main(String[] args) {

        // Variable local de main.
        String mensaje = "Inicio del registro";

        System.out.println(mensaje);

        registrarOperacion();
        registrarOperacion();
        registrarOperacion();

        System.out.println("Total final: " + contador);
    }
}

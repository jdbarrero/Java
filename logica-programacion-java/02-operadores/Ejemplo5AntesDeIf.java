public class Ejemplo5AntesDeIf {

    public static void main(String[] args) {

        boolean cuentaBloqueada = false;

        // El operador ! niega el valor booleano.
        // Si cuentaBloqueada es false, operacionPermitida sera true.
        boolean operacionPermitida = !cuentaBloqueada;

        System.out.println("Cuenta bloqueada: " + cuentaBloqueada);
        System.out.println("Operacion permitida: " + operacionPermitida);

        // Esta es una primera aproximacion a una condicion.
        // El bloque se ejecuta solamente cuando la expresion es true.
        if (operacionPermitida) {
            System.out.println("La operacion puede realizarse.");
        }
    }
}

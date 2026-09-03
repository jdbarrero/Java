public class Ejemplo5AntesDeIf {

    public static void main(String[] args) {

        double saldo = 50000;
        double valorCompra = 30000;
        boolean cuentaBloqueada = false;

        // Operador relacional:
        // verifica si hay dinero suficiente.
        boolean tieneSaldo = saldo >= valorCompra;

        // Operador lógico !:
        // niega el valor de cuentaBloqueada.
        boolean cuentaActiva = !cuentaBloqueada;

        // Operador lógico &&:
        // ambas condiciones deben ser verdaderas.
        boolean operacionPermitida = tieneSaldo && cuentaActiva;

        // También podemos negar el resultado final.
        boolean operacionNegada = !operacionPermitida;

        System.out.println("Tiene saldo: " + tieneSaldo);
        System.out.println("Cuenta activa: " + cuentaActiva);
        System.out.println("Operacion permitida: " + operacionPermitida);
        System.out.println("Operacion negada: " + operacionNegada);
    }
}

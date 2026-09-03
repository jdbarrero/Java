public class Ejemplo3OperadoresLogicos {

    public static void main(String[] args) {

        boolean tieneDocumento = true;
        boolean pagoRealizado = false;

        // && es verdadero solo si ambas condiciones son verdaderas.
        boolean puedeIngresar = tieneDocumento && pagoRealizado;

        // || es verdadero si al menos una condicion es verdadera.
        boolean requiereRevision = tieneDocumento || pagoRealizado;

        // ! niega un valor booleano: true pasa a false y false pasa a true.
        boolean pagoPendiente = !pagoRealizado;

        System.out.println("Puede ingresar: " + puedeIngresar);
        System.out.println("Requiere revision: " + requiereRevision);
        System.out.println("Pago pendiente: " + pagoPendiente);
    }
}

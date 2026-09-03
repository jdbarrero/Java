public class Ejemplo4OperadoresCombinados {

    public static void main(String[] args) {

        int precio = 50000;
        int cantidad = 3;
        boolean clienteFrecuente = true;

        // 1. Operador aritmetico: calcula el valor de la compra.
        int totalCompra = precio * cantidad;

        // 2. Operador relacional: compara el total con un valor minimo.
        boolean superaMontoMinimo = totalCompra >= 100000;

        // 3. Operador logico: relaciona dos condiciones booleanas.
        boolean aplicaBeneficio = superaMontoMinimo && clienteFrecuente;

        System.out.println("Total de la compra: " + totalCompra);
        System.out.println("Supera el monto minimo: " + superaMontoMinimo);
        System.out.println("Es cliente frecuente: " + clienteFrecuente);
        System.out.println("Aplica beneficio: " + aplicaBeneficio);
    }
}

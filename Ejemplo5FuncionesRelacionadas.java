public class Ejemplo5FuncionesRelacionadas {
    static double calcularSubtotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularImpuesto(double subtotal) {
        return subtotal * 0.19;
    }

    static double calcularTotal(double subtotal, double impuesto) {
        return subtotal + impuesto;
    }

    public static void main(String[] args) {
        double subtotal = calcularSubtotal(25000, 2);
        double impuesto = calcularImpuesto(subtotal);
        double total = calcularTotal(subtotal, impuesto);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Total: " + total);
    }
}

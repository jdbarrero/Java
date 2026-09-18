public class Ejemplo7VariablesLocalesYDeClase {

    // Variable de clase:
    // puede ser utilizada por los metodos static de esta clase.
    static double iva = 0.19;

    static double calcularTotal(double precio) {

        // Variable local:
        // solo existe dentro de este metodo.
        double impuesto = precio * iva;

        return precio + impuesto;
    }

    public static void main(String[] args) {

        // Estas variables son locales de main.
        double precioProducto = 50000;
        double totalCompra = calcularTotal(precioProducto);

        System.out.println("IVA: " + iva);
        System.out.println("Precio: " + precioProducto);
        System.out.println("Total: " + totalCompra);
    }
}

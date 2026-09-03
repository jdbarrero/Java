public class Ejemplo3TiposNumericos {

    public static void main(String[] args) {

        // byte se usa para valores enteros pequeños.
        byte numeroMaterias = 6;

        // short permite almacenar enteros de mayor rango que byte.
        short anioIngreso = 2026;

        // L indica que el literal numérico es de tipo long.
        long poblacion = 8000000000L;

        // f indica que el literal decimal es de tipo float.
        float temperatura = 23.5f;

        System.out.println("Número de materias: " + numeroMaterias);
        System.out.println("Año de ingreso: " + anioIngreso);
        System.out.println("Población: " + poblacion);
        System.out.println("Temperatura: " + temperatura);
    }
}

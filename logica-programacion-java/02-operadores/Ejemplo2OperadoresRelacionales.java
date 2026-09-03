public class Ejemplo2OperadoresRelacionales {

    public static void main(String[] args) {

        int edad = 18;
        int edadMinima = 18;

        // Los operadores relacionales comparan valores.
        // El resultado de cada comparacion siempre es boolean: true o false.
        boolean esMayor = edad > edadMinima;
        boolean esMenor = edad < edadMinima;
        boolean esMayorOIgual = edad >= edadMinima;
        boolean esMenorOIgual = edad <= edadMinima;
        boolean esIgual = edad == edadMinima;
        boolean esDiferente = edad != edadMinima;

        System.out.println("Mayor: " + esMayor);
        System.out.println("Menor: " + esMenor);
        System.out.println("Mayor o igual: " + esMayorOIgual);
        System.out.println("Menor o igual: " + esMenorOIgual);
        System.out.println("Igual: " + esIgual);
        System.out.println("Diferente: " + esDiferente);
    }
}

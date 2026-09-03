public class Ejemplo2StringYChar {

    public static void main(String[] args) {

        // char almacena un solo carácter y usa comillas simples.
        char inicial = 'L';

        // String almacena una cadena de caracteres y usa comillas dobles.
        // String no es un tipo primitivo: es un tipo por referencia.
        String nombre = "Laura";

        int semestre = 1;

        System.out.println("Inicial: " + inicial);
        System.out.println("Nombre: " + nombre);
        System.out.println("Semestre: " + semestre);

        // El operador + permite unir texto con otros datos.
        System.out.println(nombre + " está en semestre " + semestre);
    }
}

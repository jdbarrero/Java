public class Ejemplo1VariablesBasicas {

    public static void main(String[] args) {

        // int almacena números enteros.
        int edad = 18;

        // double almacena números con decimales.
        double promedio = 4.5;

        // char almacena un solo carácter entre comillas simples.
        char grupo = 'A';

        // boolean solo puede tomar los valores true o false.
        boolean matriculado = true;

        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Grupo: " + grupo);
        System.out.println("Matriculado: " + matriculado);

        // El valor de una variable puede cambiar durante el programa.
        edad = 19;
        System.out.println("Nueva edad: " + edad);
    }
}

public class Ejemplo6PracticaGuiada {
    public static void main(String[] args) {
        int temperatura = 28;

        /*
         * ACTIVIDAD:
         * Menor que 18       -> Hace frio.
         * Entre 18 y 25      -> Clima agradable.
         * Mayor que 25       -> Hace calor.
         */
        if (temperatura < 18) {
            System.out.println("Hace frio.");
        } else if (temperatura <= 25) {
            System.out.println("Clima agradable.");
        } else {
            System.out.println("Hace calor.");
        }
    }
}

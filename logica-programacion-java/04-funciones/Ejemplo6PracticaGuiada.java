public class Ejemplo6PracticaGuiada {
    static int convertirAMinutos(int horas) {
        return horas * 60;
    }

    public static void main(String[] args) {
        int horas = 3;
        int minutos = convertirAMinutos(horas);

        System.out.println(horas + " horas equivalen a " + minutos + " minutos.");

        /*
         * ACTIVIDAD:
         * 1. Cambia el valor de horas.
         * 2. Crea una funcion convertirASegundos.
         * 3. Haz que reciba minutos y devuelva segundos.
         */
    }
}

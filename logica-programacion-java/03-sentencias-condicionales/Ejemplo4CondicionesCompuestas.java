public class Ejemplo4CondicionesCompuestas {
    public static void main(String[] args) {
        int edad = 20;
        boolean tieneDocumento = true;
        boolean accesoBloqueado = false;

        // && exige que ambas condiciones sean verdaderas.
        boolean cumpleRequisitos = edad >= 18 && tieneDocumento;

        // ! invierte el valor booleano.
        boolean accesoDisponible = !accesoBloqueado;

        // || permite que al menos una de las dos expresiones sea verdadera.
        boolean puedeContinuar = cumpleRequisitos || accesoDisponible;

        if (puedeContinuar && accesoDisponible) {
            System.out.println("Ingreso autorizado.");
        } else {
            System.out.println("Ingreso no autorizado.");
        }
    }
}

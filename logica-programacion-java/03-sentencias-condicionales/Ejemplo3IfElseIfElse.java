public class Ejemplo3IfElseIfElse {
    public static void main(String[] args) {
        double nota = 3.8;

        // Se evaluan las condiciones de arriba hacia abajo.
        if (nota >= 4.0) {
            System.out.println("Desempeno alto.");
        } else if (nota >= 3.0) {
            System.out.println("Asignatura aprobada.");
        } else {
            System.out.println("Asignatura no aprobada.");
        }
    }
}

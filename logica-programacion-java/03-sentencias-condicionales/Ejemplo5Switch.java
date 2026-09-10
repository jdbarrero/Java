public class Ejemplo5Switch {
    public static void main(String[] args) {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Crear");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }
}

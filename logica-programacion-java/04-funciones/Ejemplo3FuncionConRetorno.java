public class Ejemplo3FuncionConRetorno {
    static int sumar(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        return resultado;
    }

    public static void main(String[] args) {
        int total = sumar(8, 5);
        System.out.println("Resultado: " + total);
    }
}

public class Ejemplo4FuncionConVariosParametros {
    static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void main(String[] args) {
        double promedio = calcularPromedio(4.0, 3.5, 4.5);
        System.out.println("Promedio: " + promedio);
    }
}

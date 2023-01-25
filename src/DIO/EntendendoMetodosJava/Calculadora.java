package DIO.EntendendoMetodosJava;

public class Calculadora {
    private static double soma (double a, double b){
        return a + b;
    }
    private static double subtracao (double a, double b){
        return a - b;
    }
    private static double multiplicacao (double a, double b){
        return a * b;
    }
    private static double divisao (double a, double b){
        return a / b;
    }

    public static void main(String[] args) {
        double a = 12.0f;
        double b = 3.0f;
        System.out.println(soma(a, b));
        System.out.println(subtracao(a, b));
        System.out.println(multiplicacao(a, b));
        System.out.println(divisao(a, b));
    }
}

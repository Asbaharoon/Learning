package DIO.EntendendoMetodosJava;

public class Calculadora {
    private static float soma (float a, float b){
        return a + b;
    }
    private static float subtracao (float a, float b){
        return a - b;
    }
    private static float multiplicacao (float a, float b){
        return a * b;
    }
    private static float divisao (float a, float b){
        return a / b;
    }

    public static void main(String[] args) {
        float a = 12.0f;
        float b = 3.0f;
        System.out.println(soma(a, b));
        System.out.println(subtracao(a, b));
        System.out.println(multiplicacao(a, b));
        System.out.println(divisao(a, b));
    }
}

package DIO.EntendendoMetodosJava;

public class Main {
    public static void main(String[] args){
        System.out.println("Área do quadrado é " + AreaDosQuadrilateros.area(6.0));
        System.out.println("Área do retângulo é " + AreaDosQuadrilateros.area(2.0,5.5));
        System.out.println("Área do trapézio é " + AreaDosQuadrilateros.area(10.0,5.0,2.50));

        double a = 12.0f;
        double b = 3.0f;
        System.out.println(Calculadora.soma(a, b));
        System.out.println(Calculadora.subtracao(a, b));
        System.out.println(Calculadora.multiplicacao(a, b));
        System.out.println(Calculadora.divisao(a, b));

        Emprestimo.emprestimo();

        Mensagem.mensagem();
    }



}

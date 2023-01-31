package DIO.ProgramacaoOrientadaAObjetos;

public class Calculadora implements OperacaoMatematica{
    @Override
    public void soma(double x, double y) {
        System.out.println(x + y);
    }

    @Override
    public void subtracao(double x, double y) {
        System.out.println(x - y);
    }

    @Override
    public void multiplicacao(double x, double y) {
        System.out.println(x * y);
    }

    @Override
    public void divisao(double x, double y) {
        System.out.println(x / y);
    }
}

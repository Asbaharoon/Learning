package DIO.EntendendoMetodosJava;

public class AreaDosQuadrilateros {
    protected static double area(double lado){ return lado * lado;}

    protected static double area(double largura, double comprimento){ return largura * comprimento;}

    protected static double area(double baseMaior, double baseMenor, double altura){ return (baseMaior+baseMenor)*altura/2;}


}

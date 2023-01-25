package DIO.EntendendoMetodosJava;

public class AreaDosQuadrilateros {
    public static double area(double lado){ return lado * lado;}

    public static double area(double largura, double comprimento){ return largura * comprimento;}

    public static double area(double baseMaior, double baseMenor, double altura){ return (baseMaior+baseMenor)*altura/2;}

    public static void main(String[] args){
        System.out.println("Área do quadrado é " + AreaDosQuadrilateros.area(6.0));
        System.out.println("Área do retângulo é " + AreaDosQuadrilateros.area(2.0,5.5));
        System.out.println("Área do trapézio é " + AreaDosQuadrilateros.area(10.0,5.0,2.50));
    }
}

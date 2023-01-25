package DIO.EntendendoMetodosJava;

public class AreaDosQuadrilateros {
    public static void area(double lado){
        System.out.println("Área do quadrado é " + (lado*lado));
    }

    public static void area(double largura, double comprimento){
        System.out.println("Área do retângulo é " + (largura*comprimento));
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio é " + ((baseMaior+baseMenor)*altura/2));
    }

    public static void main(String[] args){
        AreaDosQuadrilateros.area(6.0);
        AreaDosQuadrilateros.area(2.0,5.5);
        AreaDosQuadrilateros.area(10.0,5.0,2.5);
    }
}

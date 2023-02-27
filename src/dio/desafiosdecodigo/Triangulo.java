package dio.desafiosdecodigo;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        //double area;
        //double perimetro;
        //boolean triangulo;

        //TODO: Implemente a condição necessária para o cálculo do triângulo:
        //Dica: Você pode utilizar o String.format() na formatação do texto.
        String resposta;
        if (abs(B-C) < A && A < B + C && abs(A-C) < B && B < A+C && abs(A-B) < C && C < A+B){
            double perimetro = A + B + C;
            resposta = "Perimetro = ".concat(String.format("%.1f",perimetro));
        }
        else {
            double area = ((A + B) * C) / 2;
            resposta = "Area = ".concat(String.format("%.1f",area));
        }
        System.out.println(resposta);
    }

}


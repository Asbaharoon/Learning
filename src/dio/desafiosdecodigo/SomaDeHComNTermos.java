package dio.desafiosdecodigo;

import java.util.Scanner;
import static java.lang.Math.round;

public class SomaDeHComNTermos {
    public static void main(String[] Args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += (1.0/i);
        }
        long resposta = round(h);
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(resposta);
    }
}


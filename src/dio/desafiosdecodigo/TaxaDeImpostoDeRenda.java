package dio.desafiosdecodigo;

import java.io.IOException;
import java.util.Scanner;

public class TaxaDeImpostoDeRenda {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto = 0;

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        //int[] valores = {3000,4500};
        String resposta;
        if (renda >= 0) {
            if (renda <= 2000){
                resposta = "Isento";
            }
            else {
                if (renda > 4500){
                    imposto += (renda - 4500) * 0.28;
                    imposto += 1500 * 0.18;
                    imposto += 1000 * 0.08;
                }
                else if (renda <= 3000){
                    imposto += (renda - 2000) * 0.08;

                }
                else {
                    imposto += (renda - 3000) * 0.18;
                    imposto += 1000 * 0.08;
                }
                resposta = "R$ ".concat(String.format("%.2f", imposto));
            }
            System.out.println(resposta);
        }

    }
}

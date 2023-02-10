package dio.entendendometodosjava;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Emprestimo {

    protected static void emprestimo() {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Informe o valor a ser solicitado em reais (R$)");
            float valorSolicitado = leitor.nextFloat();
            while (valorSolicitado < 0){
                System.out.println("Informe o valor a ser solicitado em reais (R$)");
                valorSolicitado = leitor.nextFloat();
            }

            System.out.println("Informe o percentual da taxa");
            float taxa = leitor.nextFloat();
            while (taxa < 0 || taxa > 100){
                System.out.println("Informe o percentual da taxa");
                taxa = leitor.nextFloat();
            }

            System.out.println("Informe a quantidade de parcelas");
            int quantidadeParcelas = leitor.nextInt();
            while (quantidadeParcelas < 0 || quantidadeParcelas > 120){
                System.out.println("Informe a quantidade de parcelas");
                quantidadeParcelas = leitor.nextInt();
            }

            double valorFinal = valorSolicitado * pow((1 + (taxa)/100),quantidadeParcelas);

            System.out.printf("Valor final do empréstimo: R$ %.2f%n",valorFinal);
        }
    }
}

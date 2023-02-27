package dio.desafiosdecodigo;

import java.util.*;

public class QuitandaDoSeuZe {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

        //TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

        float valorMorango = morangos > 5 ? 2.2f : 2.5f;
        float valorMaca = macas > 5 ? 1.5f : 1.8f;

        float subtotal = (morangos * valorMorango) + (macas * valorMaca);

        float desconto = (morangos + macas > 8 || subtotal > 25) ? 0.9f : 1.0f;

        float total = subtotal * desconto;

        System.out.println(total);
    }
}

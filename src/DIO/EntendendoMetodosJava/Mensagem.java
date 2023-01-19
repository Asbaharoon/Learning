package DIO.EntendendoMetodosJava;
import java.util.Scanner;

public class Mensagem {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int hora = leitor.nextInt();
        while (hora < 0 || hora > 24){
            System.out.println("Informe hora válida");
            hora = leitor.nextInt();
        }
        if (hora > 5 && hora < 12) {
            System.out.println("Bom dia");
        }
        else if (hora >= 12 && hora < 18){
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
    }
}

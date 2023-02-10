package dio.desafiosdecodigo;
import java.util.Scanner;

/* Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o
número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está
aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.
 */
public class LeituraDaGertrudes {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            int paginas = leitor.nextInt();
            int paginasLidas = 3;

            // Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros
            System.out.println(paginas/paginasLidas + " dias");
        }
    }
}

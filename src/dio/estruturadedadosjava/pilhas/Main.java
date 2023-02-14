package dio.estruturadedadosjava.pilhas;

public class Main {
    public static void main(String[] args) {
        No no1 = new No( 123);
        No no2 = new No( 234);
        No no3 = new No( 345);
        No no4 = new No(456);
        No no5 = new No(567);
        No no6 = new No(678);

        Pilha pilha = new Pilha();

        System.out.println(pilha.isEmpty());

        pilha.push(no1);

        System.out.println(pilha);

        pilha.push(no2);
        pilha.push(no3);

        System.out.println(pilha);

        pilha.push(no4);
        pilha.push(no5);
        pilha.push(no6);

        System.out.println(pilha.isEmpty());
        System.out.println(pilha);

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
            System.out.println(pilha);
        }

        System.out.println(pilha.isEmpty());
    }
}

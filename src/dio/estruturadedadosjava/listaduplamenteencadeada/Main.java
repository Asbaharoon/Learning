package dio.estruturadedadosjava.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();

        System.out.println(lista.isEmpty());
        lista.get(0);
        System.out.println(lista);

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");
        lista.add("e");

        System.out.println(lista);
        //System.out.println(lista.size());

        lista.add(3,"foo");
        //lista.add("mega");

        System.out.println(lista);
        System.out.println(lista.get(2));

        System.out.println(lista.remove(3));
        //System.out.println(lista.get(3));
        System.out.println(lista);

    }
}

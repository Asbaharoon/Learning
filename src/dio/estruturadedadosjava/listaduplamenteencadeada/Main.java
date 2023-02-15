package dio.estruturadedadosjava.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        //System.out.println(lista.isEmpty());
        //lista.get(0);
        //System.out.println(lista);

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        System.out.println(lista);
        //System.out.println(lista.size());

        lista.add(1,"foo");//NÃO ESTÁ FUNCIONANDO
        //lista.add("mega");

        System.out.println(lista);
        //System.out.println(lista.get(1));

        System.out.println(lista.remove(1));//NÃO ESTÁ FUNCIONANDO
        //System.out.println(lista.get(3));
        System.out.println(lista);

    }
}

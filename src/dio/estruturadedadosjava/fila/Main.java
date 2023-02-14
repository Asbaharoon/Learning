package dio.estruturadedadosjava.fila;

public class Main {
    public static void main(String[] args) {
        No no1 = new No( 123);
        No no2 = new No( "abc");
        No no3 = new No( 3.45f);
        No no4 = new No( 'D');
        No no5 = new No( 567);
        No no6 = new No( "FGH");


        Fila fila = new Fila();

        System.out.println(fila.isEmpty());

        fila.enqueue(no1);

        System.out.println(fila);

        fila.enqueue(no2);
        fila.enqueue(no3);

        System.out.println(fila);

        fila.enqueue(no4);
        fila.enqueue(no5);
        fila.enqueue(no6);

        System.out.println(fila.isEmpty());
        System.out.println(fila);

        while (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
            System.out.println(fila);
        }

        System.out.println(fila.isEmpty());
    }
}

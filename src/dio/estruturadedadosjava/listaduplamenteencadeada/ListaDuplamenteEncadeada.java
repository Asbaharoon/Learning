package dio.estruturadedadosjava.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada <T> {
    private No noInicial;

    public ListaDuplamenteEncadeada () {
        this.noInicial = null;
    }

    public ListaDuplamenteEncadeada (T object) {
        this.noInicial = new No (object);
    }

    //TODO isEmpty - falta testar
    public boolean isEmpty(){ return noInicial == null ? true : false; }

    //TODO size - falta testar
    public int size(){
        int size;
        No tempNo = noInicial;
        size = tempNo == null ? 0 : 1;
        while (tempNo.getNoPosterior() != null){
            size ++;
            tempNo = tempNo.getNoPosterior();
        }
        return size;
    }

    //TODO add (adiciona elemento ao final da fila) - falta testar
    public void add (T object){
        if (isEmpty()){
            noInicial.setObject(object);
        } else {
            No tempNo = noInicial;
            while (tempNo.getNoPosterior() != null){
                tempNo = tempNo.getNoPosterior();
            }
            No novoNo = new No(object);
            tempNo.setNoPosterior(novoNo);
            novoNo.setNoAnterior(tempNo);
        }
    }

    public boolean checkIndex (int index){ return index > 0 && index <= size(); }

    //TODO add(index) (adiciona elemento no índice index) - implementado adição no começo e final, falta demais índices
    public void add (int index, T object){
        if (checkIndex(index)) {
            int size = size();
            if (index == size) {
                add(object);
            } else if (index == 0) {
                No tempNo = noInicial;
                noInicial.setObject(object);
                noInicial.setNoPosterior(tempNo);
                tempNo.setNoAnterior(noInicial);
            } else if (index < size) {



            }
        }
    }

    //TODO get
    public T get (int index){
        int size = size();
        if (index <= size) {
            add(object);
        } else if (index == 0){
            No tempNo = noInicial;
            noInicial.setObject(object);
            noInicial.setNoPosterior(tempNo);
            tempNo.setNoAnterior(noInicial);
        } else if (index < size){


        }
        return object;
    }

    //TODO getNo
    //TODO remove
    //TODO toString

}

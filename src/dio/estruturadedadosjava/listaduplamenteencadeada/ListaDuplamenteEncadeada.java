package dio.estruturadedadosjava.listaduplamenteencadeada;

public class ListaDuplamenteEncadeada <T> {
    private No<T> noInicial;

    public ListaDuplamenteEncadeada () {
        this.noInicial = null;
    }

    public ListaDuplamenteEncadeada (T object) {
        this.noInicial = new No<>(object);
    }

    //TODO isEmpty - concluído
    public boolean isEmpty(){ return noInicial == null; }

    private void isEmptyError() {
        if (isEmpty()){
            throw new RuntimeException ("Método inválido - Lista vazia");
        }

    }

    //TODO size - concluído
    public int size(){
        int size = this.isEmpty() ? 0 : 1;
        No<T> tempNo = noInicial;
        while (tempNo.getNoPosterior() != null){
            size ++;
            tempNo = tempNo.getNoPosterior();
        }
        return size;
    }

    //TODO add (adiciona elemento ao final da fila) - concluído
    public void add (T object){
        if (isEmpty()){
            noInicial = new No<>(object);
        } else {
            No<T> tempNo = noInicial;
            while (tempNo.getNoPosterior() != null){
                tempNo = tempNo.getNoPosterior();
            }
            No<T> novoNo = new No<>(object);
            tempNo.setNoPosterior(novoNo);
            novoNo.setNoAnterior(tempNo);
        }
    }

    //TODO add(index) (adiciona elemento no índice index) - não está funcionando 0 < index < size
    public void add (int index, T object){
        int size = this.size();

        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Índice inválido");
        }

        if (index == size) {
            add(object);
        } else if (index == 0) {//NÃO ESTÁ FUNCIONANDO
            No<T> tempNo = noInicial;
            noInicial.setValor(object);
            noInicial.setNoPosterior(tempNo);
            tempNo.setNoAnterior(noInicial);
        } else if (index < size) {//NÃO ESTÁ FUNCIONANDO
            No<T> noTemp = this.getNo(index);
            No<T> novoNo = new No<>(object);
            novoNo.setNoAnterior(noTemp.getNoAnterior());
            novoNo.setNoPosterior(noTemp);
            noTemp.setNoAnterior(novoNo);
            noTemp.getNoAnterior().setNoPosterior(novoNo);
        }
    }

    // função para validar se o índice é válido para a lista
    private void checkIndex (int index){
        if (index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException("Índice inválido");
        }
    }

    //TODO getNo - concluído
    private No<T> getNo(int index){
        isEmptyError();
        checkIndex(index);
        int contadorPosicao = index;
        No<T> noTemp = noInicial;
        while (contadorPosicao != 0){
            noTemp = noTemp.getNoPosterior();
            contadorPosicao --;
        }
        return noTemp;
    }

    //TODO get - concluído
    public T get (int index){
        return getNo(index).getValor();
    }

    //TODO remove - não está funcionando 0 < index < size -1
    public T remove (int index){
        checkIndex(index);
        No<T> noRemovido = this.getNo(index);
        if (index == 0){
            noInicial = noInicial.getNoPosterior();
        } else if (index == size() - 1){
            noRemovido.getNoAnterior().setNoPosterior(null);
        } else {//NÃO ESTÁ FUNCIONANDO
            noRemovido.getNoAnterior().setNoPosterior(noRemovido.getNoPosterior());
            noRemovido.getNoPosterior().setNoAnterior(noRemovido.getNoAnterior());
        }
        return noRemovido.getValor();
    }

    //TODO toString
    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No<T> tempNo = noInicial;
        while(tempNo != null){
            stringRetorno.append(tempNo.getValor()).append(" - ");
            tempNo = tempNo.getNoPosterior();
        }
        return stringRetorno.toString();
    }
}

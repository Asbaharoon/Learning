package dio.estruturadedadosjava.listaduplamenteencadeada;

public class No<T> {
    private T valor;
    private No<T> noAnterior;
    private No<T> noPosterior;

    public No(){
    }

    public No(T valor) {
        this.valor = valor;
        this.noAnterior = null;
        this.noPosterior = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No<T> noAnterior) {
        this.noAnterior = noAnterior;
    }

    public No<T> getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(No<T> noPosterior) {
        this.noPosterior = noPosterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "valor=" + valor +
                '}';
    }
}

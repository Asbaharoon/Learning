package dio.estruturadedadosjava.listaduplamenteencadeada;

public class No <T> {
    private T object;
    private No noAnterior;
    private No noPosterior;

    public No(){
    }

    public No(T object) {
        this.object = object;
        this.noAnterior = null;
        this.noPosterior = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getNoAnterior() {
        return noAnterior;
    }

    public void setNoAnterior(No noAnterior) {
        this.noAnterior = noAnterior;
    }

    public No getNoPosterior() {
        return noPosterior;
    }

    public void setNoPosterior(No noPosterior) {
        this.noPosterior = noPosterior;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}

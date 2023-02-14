package dio.estruturadedadosjava.fila;

public class No {
    private Object object;
    private No proximoNo;

    public No() {
    }

    public No(Object object) {
        this.object = object;
        this.proximoNo = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}

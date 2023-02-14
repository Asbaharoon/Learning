package dio.estruturadedadosjava.pilhas;

public class No {
    private int valor;
    private No proximoNo = null;

    public No() {
    }

    public No(int valor) {
        setValor(valor);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
                "valor=" + valor +
                '}';
    }
}

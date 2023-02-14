package dio.estruturadedadosjava.fila;

public class Fila {
    private No noInicial;

    public Fila() {
        this.noInicial = null;
    }

    public boolean isEmpty (){
        return noInicial == null;
    }

    public No first() { return isEmpty() ? null : noInicial; }

    public void enqueue (No novoNo){
        if (!isEmpty()){
            No tempNo = first();
            while (tempNo.getProximoNo() != null){
                tempNo = tempNo.getProximoNo();
            }
            tempNo.setProximoNo(novoNo);
        }
        else {
            noInicial = novoNo;
        }

    }

    public No dequeue(){
        if (!isEmpty()) {
            No tempNo = first();
            noInicial = noInicial.getProximoNo();
            return tempNo;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No tempNo = first();

        while(tempNo != null){
            stringRetorno.append(tempNo.getObject()).append("\n");
            tempNo = tempNo.getProximoNo();

        }
        return stringRetorno.toString();
    }
}

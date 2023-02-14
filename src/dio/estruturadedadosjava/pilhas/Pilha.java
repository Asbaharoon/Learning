package dio.estruturadedadosjava.pilhas;

public class Pilha {
    private No noInicial;

    public Pilha() {
        this.noInicial = null;
    }

    public No top (){
        return noInicial;
    }

    public boolean isEmpty (){
        return noInicial == null;
    }

    public void push (No novoNo){
        No tempNo = noInicial;
        noInicial = novoNo;
        noInicial.setProximoNo(tempNo);
    }

    public No pop(){
        if (!this.isEmpty()){
            No popedNo = noInicial;
            noInicial = noInicial.getProximoNo();
            return popedNo;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder();
        No tempNo = noInicial;

        while(true){
            if (tempNo == null) {
                break;
            }
            else {
                stringRetorno.append(tempNo.getValor()).append("\n");
                tempNo = tempNo.getProximoNo();
            }
        }
        return stringRetorno.toString();
    }
}

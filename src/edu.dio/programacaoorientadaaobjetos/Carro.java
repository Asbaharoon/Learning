package edu.dio.ProgramacaoOrientadaAObjetos;

public class Carro extends Veiculo {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro(){}

    Carro(String cor, String modelo, int capacidadeTanque){
        setCor(cor);
        setModelo(modelo);
        setCapacidadeTanque(capacidadeTanque);
    }

    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }


    double totalValorTanque(float valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


}



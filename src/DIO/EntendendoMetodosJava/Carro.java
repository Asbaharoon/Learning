package DIO.EntendendoMetodosJava;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    Carro(){}
    Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }
    void calcularValorTotal(float valorGasolina){
        System.out.println(this.capacidadeTanque*valorGasolina);
    }
}
